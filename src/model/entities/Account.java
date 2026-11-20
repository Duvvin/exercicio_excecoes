package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	private double limitWithdraw;
	public Account(int number, String holder, double balance, double limitWithdraw) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.limitWithdraw = limitWithdraw;
	}
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double withdraw) throws DomainException {
		if(withdraw > this.limitWithdraw) throw new DomainException("Você não pode sacar esse valor pois passa do limite de saque ( " + this.getLimitWithdraw() + " )");
		if(withdraw > this.getBalance()) throw new DomainException("Saldo insuficiente.");
		
		this.balance = this.balance - withdraw;
	}
	public double getLimitWithdraw() {
		return limitWithdraw;
	}
	public void setLimitWithdraw(double limitWithdraw) {
		this.limitWithdraw = limitWithdraw;
	}
	@Override
	public String toString() {
		return "Account [number= " + number + ", holder= " + holder + ", balance= " + balance + ", limitWithdraw= "
				+ limitWithdraw + "]";
	}
	
	
}
