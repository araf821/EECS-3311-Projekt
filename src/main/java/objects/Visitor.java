package objects;

public class Visitor extends User {
    private boolean validationStatus;

    public Visitor(int id, String email, String password, UserType userType) {
        super(id, email, password, userType);
        this.validationStatus = false;
    }

    public boolean getValidationStatus() {
        return validationStatus;
    }
}
