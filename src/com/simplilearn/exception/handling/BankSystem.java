package com.simplilearn.exception.handling;


public class BankSystem {

	public static void main(String[] args) throws Exception {
			Account account = new Account(100, "John Smith", 400000);
			try {
				showBalance(account);
				deposit(account, 1000);
				withdrawl(account, 10000);
			} catch (AccountNotFoundException e) {
				e.printStackTrace();
				System.out.println("Error Name:"+e.getClass());
				System.out.println("Error Name:"+e.getMessage());
			} catch(TransationException e) {
				e.printStackTrace();
				System.out.println("Error Name:"+e.getClass());
				System.out.println("Error Name:"+e.getMessage());
			}catch(BalanceNotAvailable e) {
				e.printStackTrace();
				System.out.println("Error Name:"+e.getClass());
				System.out.println("Error Name:"+e.getMessage());
			}
	}

	private static void deposit(Account account, double amount) throws TransationException {
		if(amount>0) {
			account.balance=account.balance+amount;
			System.out.println("The current balance is ::"+account.balance);
		}else {
			throw new TransationException("The amount cannot be zero!!");
		}
	}
	
	private static void showBalance(Account account) throws Exception {
		if(account.accNo ==100) {
			System.out.println("The Account Name::"+account.accName+
					" with Balance"+account.balance);
		}else {
			throw new AccountNotFoundException("Account does not exist!!!!"+account.accNo);
		}
	}
	private static void withdrawl(Account account, double amount) throws BalanceNotAvailable {
		if(amount>0) {
			account.balance = account.balance - amount;
			System.out.println("the available balane is ::"+account.balance);
		}else {
			throw new BalanceNotAvailable("The required amount not exist!!");
		}
		
	}
}
