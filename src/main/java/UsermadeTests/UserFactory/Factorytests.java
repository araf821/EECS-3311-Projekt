package UsermadeTests.UserFactory;

import static org.junit.Assert.*;
import org.junit.Test;

import objects.Faculty;
import objects.NonFacultyStaff;
import objects.Student;
import objects.SystemManagerUser;
import objects.User;
import objects.User.UserType;
import objects.UserCreationFactory;
import objects.Visitor;

public class Factorytests {

    @Test
    public void testGetDetails() {
        // Test creating a student
        User student = UserCreationFactory.getDetails(1, "student@example.com", "password", UserType.STUDENT);
        assertTrue(student instanceof Student);

        // Test creating a faculty
        User faculty = UserCreationFactory.getDetails(2, "faculty@example.com", "password", UserType.FACULTY);
        assertTrue(faculty instanceof Faculty);

        // Test creating a non-faculty staff
        User nonFacultyStaff = UserCreationFactory.getDetails(3, "staff@example.com", "password", UserType.NON_FACULTY_STAFF);
        assertTrue(nonFacultyStaff instanceof NonFacultyStaff);

        // Test creating a visitor
        User visitor = UserCreationFactory.getDetails(4, "visitor@example.com", "password", UserType.VISITOR);
        assertTrue(visitor instanceof Visitor);

        // Test creating a system manager user
        User systemManager = UserCreationFactory.getDetails(5, "manager@example.com", "password", UserType.SYSTEM_MANAGER);
        assertTrue(systemManager instanceof SystemManagerUser);
    }
}
