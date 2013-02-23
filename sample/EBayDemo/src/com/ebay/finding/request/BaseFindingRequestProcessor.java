package com.ebay.finding.request;

import android.text.TextUtils;

import com.ebay.finding.FindingConfig;
import com.ebay.finding.FindingConstants;
import com.ebay.finding.auth.AppNameAuthenticationProvider;
import com.ebay.marketplace.search.v1.services.AckValue;
import com.ebay.marketplace.search.v1.services.BaseServiceResponse;
import com.ebay.marketplace.search.v1.services.ErrorMessage;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.RestClient;
import com.leansoft.nanorest.domain.ResponseStatus;
import com.leansoft.nanorest.logger.ALog;
import com.leansoft.nanorest.parser.NanoXmlResponseParser;
import com.leansoft.nanorest.request.NanoXmlRequestProcessor;

public class BaseFindingRequestProcessor<T> extends NanoXmlRequestProcessor<T> {
	
	private final Class<T> responseType;
	
	private NanoXmlResponseParser<ErrorMessage> errorMessageParser = 
			new NanoXmlResponseParser<ErrorMessage>(ErrorMessage.class);
	
	public BaseFindingRequestProcessor(Object requestObject, String opName, Class<T> responseType, 
			HttpCallback<T> callback, FindingConfig config) {
		
		super(requestObject,
			  responseType,
		      callback);
		
		validateConfig(config);
		
		this.responseType = responseType;
		
		
		RestClient client = getRestClient();
		client.setUrl(config.getServerUrl());
		client.setAuthentication(new AppNameAuthenticationProvider(config.getAppName()));
		if (!TextUtils.isEmpty(config.getGlobalId())) {
			client.addHeader(FindingConstants.X_EBAY_SOA_GLOBAL_ID_HEADER,  config.getGlobalId());
		}
		if (!TextUtils.isEmpty(config.getServiceVersion())) {
			client.addHeader(FindingConstants.X_EBAY_SOA_SERVICE_VERSION_HEADER,  config.getServiceVersion());
		}
		
		client.addHeader(FindingConstants.X_EBAY_SOA_OPERATION_NAME_HEADER,  opName);
	}
	
	private void validateConfig(FindingConfig config) {
		if (TextUtils.isEmpty(config.getAppName())) {
			throw new IllegalArgumentException("App name is missing in config");
		}
		if (TextUtils.isEmpty(config.getServerUrl())) {
			throw new IllegalArgumentException("Server url is missing in config");
		}
	}
	
	@Override
    protected void handleResponse() {
    	
        final RestClient client = getRestClient();
        final ResponseStatus status = client.getResponseStatus();
        String response = client.getResponse();
        ALog.d(TAG, status.toString());
        if (status.getStatusCode() < 200 || status.getStatusCode() >= 300) {
        	if (isXmlResponse(response)) {
        		parseErrorMessage(response);
        	} else {
        		getResponseHandler().handleError(status);
        	}
        } else {
        	parseHttpResponse(response);
        }
    	
    }
	
	private void parseErrorMessage(String response) {
        try {
            final ErrorMessage errorMessage = errorMessageParser.parse(response);
            
            T responeData = responseType.newInstance();
            BaseServiceResponse baseServiceResponse = (BaseServiceResponse)responeData;
            baseServiceResponse.setAck(AckValue.FAILURE);
            baseServiceResponse.setErrorMessage(errorMessage);
            
            getResponseHandler().handleSuccess(responeData);
        } catch (final Exception e) {
            ResponseStatus responseStatus = ResponseStatus.getParseErrorStatus();
            ALog.d(TAG, responseStatus.toString(), e);
            getResponseHandler().handleError(responseStatus);
        }
	}
	
	private boolean isXmlResponse(String response) {
		if (response == null) return false;
		return response.startsWith("<?xml");
	}
}
