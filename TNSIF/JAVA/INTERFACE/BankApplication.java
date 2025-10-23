package com.tnsif.Interfaceex;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank = new BankImpl();
		
		  // Create an Account
	     Account account = new Account(123456, "kiran", 15000, bank);
	     
	     account.deposit(2000);
	     System.out.println(account);
	     
	     account.withdraw(1000);
	     System.out.println(account);
	     
	}

}