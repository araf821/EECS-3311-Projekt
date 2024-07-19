package UsermadeTests.OnlineBook;

import org.junit.Before;
import org.junit.Test;

import objects.Onlinebook;

import static org.junit.Assert.*;

public class OnlineBookTest {

    private Onlinebook onlinebook;
    private static final int ID = 1;
    private static final String TITLE = "Sample Title";
    private static final String LOCATION = "Digital";
    private static final int REMAINING_COPIES = 5;
    private static final double VALUE = 9.99;
    private static final String AUTHOR = "Sample Author";

    @Before
    public void setUp() {
        onlinebook = new Onlinebook(ID, TITLE, LOCATION, REMAINING_COPIES, VALUE, AUTHOR);
    }

    @Test
    public void testOnlinebookConstructorAndAttributes() {
        assertEquals(ID, onlinebook.getId());
        assertEquals(TITLE, onlinebook.getTitle());
        assertEquals(LOCATION, onlinebook.getLocation());
        assertEquals(REMAINING_COPIES, onlinebook.getRemainingCopies());
        assertEquals(VALUE, onlinebook.getValue(), 0.001);
    }
}