package com.account;

public class Account {
	private int accNum;
	private int amount;
	public Account(int accNum, int amount) {
		super();
		this.accNum = accNum;
		this.amount = amount;
	}
	public int getAccNum() {
		return  accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}	
}
	
