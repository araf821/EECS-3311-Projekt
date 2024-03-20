package objects;

import java.util.ArrayList;

public class Student extends User {
    private boolean validationStatus;
    private ArrayList<Course> currentCourses;

    public Student(int id, String email, String password, UserType userType, boolean validationStatus) {
        super(id, email, password, userType);
        this.validationStatus = validationStatus;
        this.currentCourses = new ArrayList<Course>();
    }

    public boolean getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(boolean validationStatus) {
        this.validationStatus = validationStatus;
    }

    public ArrayList<Course> getCurrentCourses() {
        return currentCourses;
    }
}
