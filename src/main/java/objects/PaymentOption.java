package objects;

public abstract class PaymentOption 
{
	private int userId;
	private double balance;
	
	public PaymentOption(int userId, double balance) 
	{
		this.userId = userId;
		this.balance = balance;
	}
	
	public void deposit(double amount) 
	{
		balance += amount;
	}
	
	public void withdraw(double amount) 
	{
		balance -= amount;
	}
	
	public double getBalance() 
	{
		return this.balance;
	}
}
