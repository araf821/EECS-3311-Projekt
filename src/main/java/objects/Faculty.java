package objects;

import java.util.ArrayList;

public class Faculty extends User {
	private boolean validationStatus;
	private ArrayList<Course> coursesTeaching;
	private ArrayList<Book> UsedTextbooks;

	public Faculty(int id, String email, String password, UserType userType) {
		super(id, email, password, userType);
		coursesTeaching = new ArrayList<Course>();
		UsedTextbooks = new ArrayList<Book>();
		this.validationStatus = false;
	}

	public boolean getValidationStatus() {
		return validationStatus;
	}

	public void setValidationStatus(boolean validationStatus) {
		this.validationStatus = validationStatus;
	}

	public ArrayList<Course> getCoursesTeaching() {
		return coursesTeaching;
	}

	public ArrayList<Book> getUsedTextbooks() {
		return UsedTextbooks;
	}

	public void update() {
		// Receive notification when a new text book is available
	}

}
