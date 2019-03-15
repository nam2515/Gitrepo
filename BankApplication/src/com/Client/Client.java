package com.Client;

import com.account.Account;
import com.bank.BankServices;
import com.exception.InsufficientBalanceException;
import com.exception.InsufficientOpeningBalanceException;
import com.exception.InvalidAccountNumberException;

public class Client {

	public static void main(String[] args) throws InvalidAccountNumberException, InsufficientBalanceException   {
		// TODO Auto-generated method stub
		BankServices bs=new BankServices();
		
		try {
		System.out.println( bs.createAccount(101, 1000));
		System.out.println( bs.createAccount(102,2000));
		System.out.println(bs.withdraw(102,200));
		System.out.println(bs.deposit(101, 5000));
		System.out.println(bs.fundTransfer(101, 102, 500));
		System.out.println(bs.printReceipt(101));
		}
		catch(InsufficientOpeningBalanceException oe)
		{
			System.out.println(oe.getMessage());
		}
	}

}
