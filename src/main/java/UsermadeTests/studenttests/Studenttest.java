package UsermadeTests.studenttests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import objects.Course;
import objects.PaymentType;
import objects.Student;
import objects.User;
import objects.User.UserType;



public class Studenttest {
	private Student student;
	    @Before
	    public void setUp()throws Throwable {
	        student = new Student(1, "student@example.com", "password", UserType.STUDENT);
	    }

	    @Test
	    public void testValidationStatus() throws Throwable{
	    	System.out.println("HI");
	        User.UserType userType3 = null;
	        Student student4 = new objects.Student((int) '4', "hi!", "hi!", userType3);
	        int int5 = student4.getId();
	        student4.setValidationStatus(true);
	        int int8 = student4.getId();
	        PaymentType paymentType9 = null;
	        student4.addPaymentMethod(paymentType9, (double) 'a');
	        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
	        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
	    }

	    @Test
	    public void testGetCurrentCourses() throws Throwable{
	        ArrayList<Course> courses = student.getCurrentCourses();
	        assertEquals(0, courses.size()); // Initially, no courses should be present

	        Course course1 = new Course(0, "Math", 0, null, "MTH101");
	        Course course2 = new Course(0, "Physics", 0, null, "PHY101");

	        courses.add(course1);
	        courses.add(course2);

	        assertEquals(2, courses.size()); // After adding two courses, size should be 2
	        assertTrue(courses.contains(course1)); // The list should contain course1
	        assertTrue(courses.contains(course2)); // The list should contain course2
	    }
	}