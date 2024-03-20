package objects;

public class Subscription 
{
	private User user;
	private Newsletter newsletter;
	
	public Subscription(User user, Newsletter news) 
	{
		this.user = user;
		this.newsletter = news;
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
		
	}
	
	
}
