package objects;

public class Request 
{
	Book book;
	User user;
	boolean teaching;
	int priority;
	
	
	public Request(Book book, User user, boolean teaching) 
	{
		this.book = book;
		this.user = user;
		this.teaching = teaching;
		if(teaching) 
		{
			this.priority = 100;
		}
		else 
		{
			this.priority = 10;
		}
	}
	
	public Book getBook() 
	{
		return this.book;
	}
	
	public boolean isTeaching() 
	{
		return teaching;
	}
	
	public int getPriority() 
	{
		return this.priority;
	}
}
