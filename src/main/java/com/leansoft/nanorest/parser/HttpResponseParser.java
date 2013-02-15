package com.leansoft.nanorest.parser;

/**
 * The {@link HttpResponseParser} interface has the responsibility to parse XML or JSON responses from the
 * server.
 * 
 * @param <T> Parameter that indicates which object the parser returns. It can be of any type.
 */
public interface HttpResponseParser<T> {

    /**
     * This method is used for parsing XML or JSON response from server. Given an XML or JSON string, returns
     * response data which can be of a specific type.
     * 
     * @param responseBody The XML or JSON string needed for parsing.
     * @return instance of type T returned by the parser.
     * @throws ParserException Thrown when various XML or JSON errors occur, such as missing attribute.
     */
    public T parse(final String responseBody) throws Exception;
}
