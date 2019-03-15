package com.exception;

public class InsufficientBalanceException extends Exception {
	public String getMessage()
	{
		return "Insufficient Balance";
	}

}
