package com.tnsif.Interfaceex;

public class BankImpl implements Bank
{

@Override
public void deposit(Account account, double amount) {
	
		 if (amount > DEPOSIT_LIMIT)//5000>25000
				System.err.println("Deposit not possible.. exceeds Deposit Limit");
			else
				account.setBalance(account.getBalance()+amount);
	     System.out.println("Deposited " + amount + " into account: " + account.getAccNo());
	 }
@Override
public void withdraw(Account account, double amount) {
	 if (account.getBalance() - amount >= MIN_BALANCE)//1000-1000
	 {
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdrawn " + amount + " from account: " + account.getAccNo());
	 }
	 else
		 System.out.println("Insufficient balance in account: " + account.getAccNo());
 }
	

}