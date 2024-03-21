package objects;

import java.time.LocalDate;
import java.util.Date;

public class Subscription 
{
	private User user;
	private Newsletter newsletter;
	private PaymentOption paymentOption;
	
	public Subscription(User user, Newsletter news, PaymentOption paymentOption) 
	{
		this.user = user;
		this.newsletter = news;
		this.paymentOption = paymentOption;
	}
	
	public User getUser() 
	{
		return this.user;
	}
	
	public Newsletter getNewsletter() 
	{
		return this.newsletter;
	}
	
	public void pay() 
	{
		paymentOption.withdraw(newsletter.getCost());
		
		String message = "Your subscribtion has been renewed; withdrew "+newsletter.getCost();
		LocalDate date = LocalDate.now();
		Notification SubRenewal = new Notification(101, this.getUser().getId(), message, date);
		
	}
	
}
