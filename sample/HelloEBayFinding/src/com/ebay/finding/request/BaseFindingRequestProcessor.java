package com.ebay.finding.request;

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

	public BaseFindingRequestProcessor(Object requestObject, String opName, Class<T> responseType, 
			HttpCallback<T> callback) {
		
		super(requestObject,
			  responseType,
		      callback);
		
		this.responseType = responseType;
		
		
		RestClient client = getRestClient();
		client.setUrl(FindingConstants.PRODUCTION_ENDPOINT);
		client.setAuthentication(new AppNameAuthenticationProvider());
		
		client.addHeader(FindingConstants.X_EBAY_SOA_OPERATION_NAME,  opName);
	}
	
	private NanoXmlResponseParser<ErrorMessage> errorMessageParser = 
			new NanoXmlResponseParser<ErrorMessage>(ErrorMessage.class);
	
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
