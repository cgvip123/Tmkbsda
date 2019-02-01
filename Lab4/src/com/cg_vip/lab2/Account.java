package com.cg_vip.lab2;

public class Account 
{
	static long no = 1;
   
	Account()
	{
		no += 1;
		
	}
	
	private long accNum = no;
	private double balance=500;
	private Person accHolder;
	private String actype;
	
	public String getActype() {
		return actype;
	}
	public void setActype(String actype) {
		this.actype = actype;
	}
	public long getAccNum() {
		return accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double a)
	{
		balance+=a;
	}
	public void withdraw(double a)
	{
		
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + ", actype=" + actype+ "]";
	}
	
}
