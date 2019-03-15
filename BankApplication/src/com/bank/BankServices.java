package com.bank;

import java.util.LinkedList;

import com.account.Account;
import com.exception.InsufficientBalanceException;
import com.exception.InsufficientOpeningBalanceException;
import com.exception.InvalidAccountNumberException;

public class BankServices {
	LinkedList <Account> accounts = new LinkedList<>();

	public String createAccount(int accNum, int amount) throws InsufficientOpeningBalanceException
	{
		Account account=new Account(accNum,amount);
		if(account.getAmount()>500)
		{
			accounts.add(account);
		return "Account opened successfully";
		}
		throw new InsufficientOpeningBalanceException();
	}

	private Account searchAccount(int accNum) throws InvalidAccountNumberException
	{
		for(Account account:accounts)
		{
			if(account.getAccNum()==accNum)
				return account;
		}
		throw new InvalidAccountNumberException();
	}
	public synchronized String withdraw(int accNum, int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		// TODO Auto-generated method stub
		Account account=searchAccount(accNum);
		if(account.getAmount()-amount>=0)
		{
			account.setAmount(account.getAmount()-amount);
			return "After withdrwal from account number"+" "+ account.getAccNum()+" "+"Total amount is: "+account.getAmount();		}
		throw new InsufficientBalanceException();
	}
	public String deposit(int accNum, int amount) throws InvalidAccountNumberException
	{
		Account account=searchAccount(accNum);
		account.setAmount(account.getAmount()+amount);
		return "After deposit in account number"+ " "+ account.getAccNum()+" "+ "Total amount is: "+account.getAmount();
	}

	public String fundTransfer(int accNum1, int accNum2, int amount) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		Account account=searchAccount(accNum1);
		account.setAmount(account.getAmount()-amount);
		Account account1=searchAccount(accNum2);
		account1.setAmount(account1.getAmount()+amount);
		return amount+" "+ "transfered from account"+" "+ account.getAccNum()+" "+"to account"+" "+ account1.getAccNum()+" "+account.getAmount()+" "+"Final balance in"+" "+account.getAccNum()+" "+" and final balance in"+" " + account1.getAccNum()+" "+"is"+ account1.getAmount() ;
	}

	public char[] printReceipt(int accNum) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
