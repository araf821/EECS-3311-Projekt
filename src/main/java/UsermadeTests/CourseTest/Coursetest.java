package UsermadeTests.CourseTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import objects.Course;
import objects.Textbook;

public class Coursetest {
    private Course course;
    private Textbook textbook;

    @Before
    public void setUp() {
        textbook = new Textbook(1, "C101", "2nd Edition");
        course = new Course(1, "Introduction to Computer Science", 101, textbook, "Spring 2024");
    }

    @Test
    public void testGetId() {
        assertEquals(1, course.getId());
    }

    @Test
    public void testGetCourseName() {
        assertEquals("Introduction to Computer Science", course.getCourseName());
    }

    @Test
    public void testGetFacultyId() {
        assertEquals(101, course.getFacultyId());
    }

    @Test
    public void testGetTextbook() {
        assertEquals(textbook, course.getTextbook());
    }

    @Test
    public void testGetTerm() {
        assertEquals("Spring 2024", course.getTerm());
    }
}
