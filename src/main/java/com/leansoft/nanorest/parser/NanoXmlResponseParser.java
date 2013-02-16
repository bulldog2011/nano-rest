package com.leansoft.nanorest.parser;

import com.leansoft.nano.IReader;
import com.leansoft.nano.NanoFactory;
import com.leansoft.nanorest.exception.ParseException;

/**
 * A response parser implementation using Nano xml binding framework.
 * 
 * @author bulldog
 *
 * @param <T>
 */
public class NanoXmlResponseParser<T> implements HttpResponseParser<T> {
	
	private final IReader xmlReader = NanoFactory.getXMLReader();
	
	private final Class<T> responseType;
	
	public NanoXmlResponseParser(Class<T> responseType) {
		this.responseType = responseType;
	}

	@Override
	public T parse(String responseBody) throws ParseException {
		T t;
		try {
			t = xmlReader.read(responseType, responseBody);
		} catch (Exception e) {
			throw new ParseException("fail to unmarshall response into object of type " + responseType, e);
		}
		return t;
	}

}
