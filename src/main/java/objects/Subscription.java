package objects;

public class Subscription 
{
	private int userId;
	private String newsletterName;
	private double cost;
	
	public Subscription(int userId, Newsletter news) 
	{
		this.newsletterName = newsletterName;
		this.userId = userId;
	}
	
	public String getNewsLetterName() {
		return this.newsletterName;
	}
	
	public double getCost() {
		return this.cost;
	}
	
}
