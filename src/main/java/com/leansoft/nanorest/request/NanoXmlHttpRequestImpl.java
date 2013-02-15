package com.leansoft.nanorest.request;

import com.leansoft.nano.IWriter;
import com.leansoft.nano.NanoFactory;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.Rest;
import com.leansoft.nanorest.client.StringBodyRestClient;
import com.leansoft.nanorest.client.BaseRestClient.RequestMethod;
import com.leansoft.nanorest.exception.HttpException;
import com.leansoft.nanorest.exception.MarshallException;
import com.leansoft.nanorest.logger.ALog;
import com.leansoft.nanorest.parser.NanoXmlResponseParser;

public abstract class NanoXmlHttpRequestImpl<T> extends BaseHttpRequestImpl<T>  {
	
    private final StringBodyRestClient client;

	private IWriter xmlWriter = NanoFactory.getXMLWriter();
	private Object requestObject;
	
	public NanoXmlHttpRequestImpl(
			Object requestObject, 
			Class<T> responseType,
			HttpCallback<T> callback) {
		super(new NanoXmlResponseParser<T>(responseType), callback);
		
		this.requestObject = requestObject;
		
        client = new StringBodyRestClient();
        client.setRequestMethod(RequestMethod.POST);
	}
	
    @Override
    protected void prepareAndExecuteRequest() throws HttpException {
        prepareParams();
        
        String requestXml = marshallRequestObject();
        ALog.d(TAG, "String body" + requestXml);
        client.setBody(requestXml);
        
        client.execute();
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
    public Rest getClient() {
        return client;
    }
    
    public void addHeader(final String key, final String value) {
    	client.addHeader(key, value);
    }
}
