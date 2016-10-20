package ch05.bank;

public class Account{
	protected double balance;
	public Account(){

	}
	public Account(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public boolean deposit(double amount){
		if(amount<0)
			return false;
		balance=balance+amount;
		return true;
	}
	public boolean withdraw(double amount){
		if(amount>balance)
			return false;
		balance=balance-amount;
		return true;
	}
}