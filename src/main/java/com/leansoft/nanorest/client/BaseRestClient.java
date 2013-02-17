package com.leansoft.nanorest.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

import com.leansoft.nanorest.auth.AuthenticationProvider;
import com.leansoft.nanorest.domain.ResponseStatus;
import com.leansoft.nanorest.logger.ALog;

import android.text.TextUtils;
import android.util.Log;

public abstract class BaseRestClient implements RestClient {

	public enum RequestMethod {
		GET, POST, PUT, DELETE
	}

	private static final String TAG = BaseRestClient.class
			.getSimpleName();


	private static DefaultHttpClient innerHttpClient;
	private RequestMethod requestMethod = RequestMethod.GET;
	
	private final ArrayList<NameValuePair> headers;
	private final ArrayList<NameValuePair> params;

	private String url;

	private ResponseStatus responseStatus = new ResponseStatus();
	private String response;

	private int connectionTimeout = 8000;
	private int socketTimeout = 12000;

	private AuthenticationProvider authProvider;
	private static AuthenticationProvider defaultAuthProvider;

	public BaseRestClient() {
		headers = new ArrayList<NameValuePair>();
		params = new ArrayList<NameValuePair>();
	}

	@Override
	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	@Override
	public void setUrl(final String url) {
		this.url = url;
	}

	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public void setConnectionTimeout(final int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	@Override
	public int getSocketTimeout() {
		return socketTimeout;
	}

	@Override
	public void setSocketTimeout(final int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	@Override
	public String getResponse() {
		return response;
	}

	@Override
	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	@Override
	public ArrayList<NameValuePair> getHeaders() {
		return headers;
	}

	@Override
	public ArrayList<NameValuePair> getParams() {
		return params;
	}

	@Override
	public void addHeader(final String name, final String value) {
		if (TextUtils.isEmpty(value) == false) {
			headers.add(new BasicNameValuePair(name, value));
		}
	}

	@Override
	public void addParam(final String name, final String value) {
		if (TextUtils.isEmpty(value) == false) {
			params.add(new BasicNameValuePair(name, value));
		}
	}

	@Override
	public void setAuthentication(AuthenticationProvider authProvider) {
		this.authProvider = authProvider;
	}
	
	@Override
	public void setRequestMethod(RequestMethod requestMethod) {
		this.requestMethod = requestMethod;
	}

	@Override
	public RequestMethod getRequestMethod() {
		return requestMethod;
	}

	public static void setDefaultAuthenticationProvider(
			AuthenticationProvider provider) {
		BaseRestClient.defaultAuthProvider = provider;
	}

	private void authenticateRequest() {
		if (authProvider != null) {
			authProvider.authenticateRequest(this);
			return;
		}
		if (defaultAuthProvider != null) {
			defaultAuthProvider.authenticateRequest(this);
			return;
		}
		//TokenAuthenticationProvider.getInstance().authenticateRequest(this);
	}

	@Override
	public void executeRequest(final HttpUriRequest request) throws IOException {
		authenticateRequest();

		// add headers
		for (NameValuePair h : getHeaders()) {
			request.addHeader(h.getName(), h.getValue());
		}

		final HttpParams httpParameters = new BasicHttpParams();
		// Set the timeout in milliseconds until a connection is established.
		HttpConnectionParams.setConnectionTimeout(httpParameters,
				connectionTimeout);
		// Set the default socket timeout (SO_TIMEOUT)
		// in milliseconds which is the timeout for waiting for data.
		HttpConnectionParams.setSoTimeout(httpParameters, socketTimeout);

		getInnerHttpClient().setParams(httpParameters);
		HttpResponse httpResponse;
		InputStream instream = null;
		try {

			httpResponse = getInnerHttpClient().execute(request);

			responseStatus.setStatusCode(httpResponse.getStatusLine()
					.getStatusCode());
			responseStatus.setStatusMessage(httpResponse.getStatusLine()
					.getReasonPhrase());

			final HttpEntity entity = httpResponse.getEntity();

			if (entity != null) {
				instream = entity.getContent();
				response = StreamUtil.convertStreamToString(instream);
				ALog.d(TAG, "URL: " + url);
				ALog.d(TAG, "RESPONSE:");
				ALog.debugLongMessage(TAG, response);
			}

		} catch (final IOException e) {
			throw e;
		} catch (final RuntimeException ex) {
			// In case of an unexpected exception you may want to abort
			// the HTTP request in order to shut down the underlying
			// connection immediately.
			request.abort();
			throw ex;
		} finally {
			if (instream != null) {
				// Closing the input stream will trigger connection release
				StreamUtil.silentClose(instream);
			}
		}
	}

	public static DefaultHttpClient getInnerHttpClient() {
		if (innerHttpClient == null) {
			innerHttpClient = buildHttpClient();
		}
		return innerHttpClient;
	}
	

    private static DefaultHttpClient buildHttpClient() {
        final HttpParams params = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(params, 20 * 1000);
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);

        // Create and initialize scheme registry
        final SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));

        // Create a HttpClient with the ThreadSafeClientConnManager.
        // This connection manager must be used if more than one thread will
        // be using the HttpClient.
        final ThreadSafeClientConnManager cm = new ThreadSafeClientConnManager(params, schemeRegistry);
        final DefaultHttpClient httpClient = new DefaultHttpClient(cm, params);
        return httpClient;
    }

	static String generateParametersString(
			final ArrayList<NameValuePair> params)
			throws UnsupportedEncodingException {
		// add parameters
		String combinedParams = "";
		if (params != null && !params.isEmpty()) {
			combinedParams += "?";
			for (final NameValuePair p : params) {
				final String paramString = p.getName() + "="
						+ URLEncoder.encode(p.getValue(), "UTF-8");
				if (combinedParams.length() > 1) {
					combinedParams += "&" + paramString;
				} else {
					combinedParams += paramString;
				}
			}
		}
		return combinedParams;
	}

}
