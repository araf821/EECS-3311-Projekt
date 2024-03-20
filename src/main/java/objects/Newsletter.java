package objects;

public class Newsletter 
{
	private String name;
	private double cost;
	
	public Newsletter(String name, double cost) 
	{
		this.name = name;
		this.cost = cost;
	}
	
	public double getCost() 
	{
		return cost;
	}
	
	public void setCost(int cost) 
	{
		this.cost = cost;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void accept(User user) 
	{
		user.visit(this);
	}
	
	public void displayNews() 
	{	
		//implementation
	}
	

}


