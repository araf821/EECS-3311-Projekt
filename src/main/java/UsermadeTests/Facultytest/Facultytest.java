package UsermadeTests.Facultytest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import objects.Faculty;
import objects.User.UserType;

public class Facultytest {
    private Faculty faculty;

    @Before
    public void setUp() {
        faculty = new Faculty(1, "faculty@example.com", "password", UserType.FACULTY);
    }

    @Test
    public void testGetValidationStatus() {
        assertFalse(faculty.getValidationStatus());
    }

    @Test
    public void testSetValidationStatus() {
        faculty.setValidationStatus(true);
        assertTrue(faculty.getValidationStatus());
    }

    @Test
    public void testGetCoursesTeaching() {
        assertNotNull(faculty.getCoursesTeaching());
        assertEquals(0, faculty.getCoursesTeaching().size());
    }

    @Test
    public void testGetUsedTextbooks() {
        assertNotNull(faculty.getUsedTextbooks());
        assertEquals(0, faculty.getUsedTextbooks().size());
    }

    @Test
    public void testUpdate() {
        // This method is void and does not return anything to test
    }
}
