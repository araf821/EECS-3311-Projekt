package objects;

public class SystemManagerUser extends User {
    private int employeenumber;
    private String secret;

    public SystemManagerUser(int id, String email, String password, UserType userType, int employeenumber,
            String answer) {
        super(id, email, password, userType);
        this.employeenumber = employeenumber;
        this.secret = answer;
    }

    public String getAnswer() {
        return secret;
    }

}
