package objects;

public class NonFacultyStaff extends User {
    private boolean validationStatus;

    public NonFacultyStaff(int id, String email, String password, UserType userType) {
        super(id, email, password, userType);
        this.validationStatus = false;
    }

    public boolean getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(boolean validationStatus) {
        this.validationStatus = validationStatus;
    }
}