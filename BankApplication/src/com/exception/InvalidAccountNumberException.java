package com.exception;

public class InvalidAccountNumberException extends Exception {
	public String getMessage()
	{
		return "Account Number does not exist";
	}

}
