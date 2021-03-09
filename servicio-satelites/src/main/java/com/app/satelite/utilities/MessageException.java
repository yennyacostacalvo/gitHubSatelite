package com.app.satelite.utilities;

public class MessageException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MessageException(String errorMessage){
        super(errorMessage);
    }
}
