package objects;

public class PaymentOption 
{
	private int userId;
	private double balance;
	private PaymentType paymentType;
	
	public PaymentOption(int userId, double balance, PaymentType paymentType) 
	{
		this.userId = userId;
		this.balance = balance;
		this.paymentType = paymentType;
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
	
	public int getUserId() 
	{
		return this.userId;
	}
	
	public enum PaymentType
	{
		DEBT, CREDIT, MOBILEWALLET
	}
	
}


