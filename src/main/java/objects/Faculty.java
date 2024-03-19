package objects;

import java.util.ArrayList;

public class Faculty extends User
{
	private boolean validationStatus;
	private ArrayList<Course> CurrentCourses;
	private ArrayList<Book> UsedTextbooks;
	
	public Faculty(String id, String email, String password, UserType userType, boolean validationStatus) {
		super(id, email, password, userType);
		CurrentCourses = new ArrayList<Course>();
		UsedTextbooks = new ArrayList<Book>();
		this.validationStatus = validationStatus;
	}
	
	public boolean getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(boolean validationStatus) {
        this.validationStatus = validationStatus;
    }
	
	public ArrayList<Course> getCurrentCourses()
	{
		return CurrentCourses;
	}
	
	public ArrayList<Book> getUsedTextbooks()
	{
		return UsedTextbooks;
	}
	
	public void update() 
	{
		//Receive notification when a new text book is available
	}

}
