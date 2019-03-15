package com.exception;

public class InsufficientOpeningBalanceException extends Exception {

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Minimum balance of Rs. 500 is required to open an account";
	}

}
