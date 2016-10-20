package ch05.bank;

public class CheckingAccount extends Account{
	private double overdraft;
	public CheckingAccount(double balance,double overdraft){
		this.balance = balance;
		this.overdraft=overdraft;


	}
	// public CheckingAccount(double balance){
	// 	this.overdraft=0;
	// 	this.balance=balance;
	// }
	public boolean withdraw(double amount){
		if(amount>balance+overdraft)
			return false;
		else{
			return true;
		}
	}
	public double getOverdraft(){
		return overdraft;
	}
}