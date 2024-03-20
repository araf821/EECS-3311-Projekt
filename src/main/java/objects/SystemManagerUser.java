package objects;

public class SystemManagerUser extends User {
    private int employeenumber;

    public SystemManagerUser(int id, String email, String password, UserType userType, int employeenumber) {
        super(id, email, password, userType);
        this.employeenumber = employeenumber;
        // TODO Auto-generated constructor stub
    }

}
