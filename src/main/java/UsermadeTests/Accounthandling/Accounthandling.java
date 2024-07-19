package UsermadeTests.Accounthandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objects.User;
import objects.User.UserType;
import userHandling.AccountHandling;

public class Accounthandling {

    private static final String TEST_CSV_FILE = "./test_users.csv";

    @Before
    public void setUp() {
        // Create a test CSV file
        try {
            FileWriter writer = new FileWriter(TEST_CSV_FILE);
            writer.write("1,test@example.com,password,STUDENT,false\n");
            writer.write("2,faculty@example.com,password,FACULTY,false\n");
            writer.write("3,staff@example.com,password,NON_FACULTY_STAFF,false\n");
            writer.write("4,visitor@example.com,password,VISITOR,false\n");
            writer.write("5,manager@example.com,password,SYSTEM_MANAGER,true\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        // Delete the test CSV file
        File file = new File(TEST_CSV_FILE);
        file.delete();
    }

    @Test
    public void testValidatePassword() {
        assertTrue(AccountHandling.validatePassword("Test123!"));
        assertFalse(AccountHandling.validatePassword("weak"));
    }

    @Test
    public void testUpdateValidation() {
        assertEquals(AccountHandling.ValidationStatus.SUCCESS, AccountHandling.updateValidation("newuser@example.com"));
        assertEquals(AccountHandling.ValidationStatus.FAILURE, AccountHandling.updateValidation("invalid@example.com"));
    }

    @Test
    public void testCreateAccount() {
        AccountHandling.createAccount("newuser@example.com", "password", UserType.STUDENT);
        assertTrue(AccountHandling.isEmailTaken("newuser@example.com"));
    }

    @Test
    public void testSignIn() {
        User student = AccountHandling.signIn("test@example.com", "password");
        assertTrue(student instanceof objects.Student);

        User faculty = AccountHandling.signIn("faculty@example.com", "password");
        assertTrue(faculty instanceof objects.Faculty);

        User nonFacultyStaff = AccountHandling.signIn("staff@example.com", "password");
     
        assertTrue(nonFacultyStaff instanceof objects.NonFacultyStaff);

        User visitor = AccountHandling.signIn("visitor@example.com", "password");
      
        assertTrue(visitor instanceof objects.Visitor);

        User systemManager = AccountHandling.signIn("manager@example.com", "password");
    
        assertTrue(systemManager instanceof objects.SystemManagerUser);

        assertNull(AccountHandling.signIn("invalid@example.com", "password"));
    }

    @Test
    public void testGetLastId() {
        assertEquals(22, AccountHandling.getLastId());
    }

    @Test
    public void testIsEmailTaken() {
        assertTrue(AccountHandling.isEmailTaken("newuser@example.com"));
        assertFalse(AccountHandling.isEmailTaken("POGG@example.com"));
    }

    @Test
    public void testValidateEmail() {
        assertTrue(AccountHandling.validateEmail("test@example.com"));
        assertFalse(AccountHandling.validateEmail("invalidemail"));
    }
}
