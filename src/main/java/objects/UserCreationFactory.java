package objects;

import objects.User.UserType;

public class UserCreationFactory {

    public static User getDetails(int id, String email, String password, UserType userType) {

        if (userType.toString().equals("STUDENT")) {
            return new Student(id, email, password, userType);
        } else if (userType.toString().equals("FACULTY")) {
            return new Faculty(id, email, password, userType);
        } else if (userType.toString().equals("NON_FACULTY_STAFF")) {
            return new NonFacultyStaff(id, email, password, userType);
        } else if (userType.toString().equals("VISITOR")) {
            return new Visitor(id, email, password, userType);
        } else if (userType.toString().equals("SYSTEM_MANAGER")) {
            return new SystemManagerUser(id, email, password, userType);
        } else {
            System.out.println("Usertype" + userType + " is not a valid usertype");
            return null;
        }

    }

}
