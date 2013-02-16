package com.leansoft.nanorest.request;

import com.leansoft.nano.IWriter;
import com.leansoft.nano.NanoFactory;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.RestClient;
import com.leansoft.nanorest.client.StringBodyRestClient;
import com.leansoft.nanorest.client.BaseRestClient.RequestMethod;
import com.leansoft.nanorest.exception.MarshallException;
import com.leansoft.nanorest.logger.ALog;
import com.leansoft.nanorest.parser.NanoXmlResponseParser;

public abstract class NanoXmlRequestProcessor<T> extends BaseRequestProcessor<T>  {
	
    private final StringBodyRestClient client;

	private IWriter xmlWriter = NanoFactory.getXMLWriter();
	private Object requestObject;
	
	public NanoXmlRequestProcessor(
			Object requestObject, 
			Class<T> responseType,
			HttpCallback<T> callback) {
		super(new NanoXmlResponseParser<T>(responseType), callback);
		
		this.requestObject = requestObject;
		
        client = new StringBodyRestClient();
        client.setRequestMethod(RequestMethod.POST);
	}
	
	@Override
	protected void prepareRequest() {
      String requestXml = marshallRequestObject();
      ALog.d(TAG, "String body" + requestXml);
      client.setBody(requestXml);
	}
    
    private String marshallRequestObject() {
		String requestXml;
		try {
			requestXml = xmlWriter.write(requestObject);
		} catch (Exception e) {
			throw new MarshallException("fail to marshall request object", e);
		}
		return requestXml;
    }

    @Override
    public RestClient getRestClient() {
        return client;
    }
    
    public void addHeader(final String key, final String value) {
    	client.addHeader(key, value);
    }
}
