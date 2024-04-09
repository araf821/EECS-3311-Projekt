package UsermadeTests.Book;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import objects.Book;
import objects.PhysicalItem;

public class BookTest {
    private Book book;

    @Before
    public void setUp() {
        book = new Book(1, "Introduction to Java", "Library", 5, 29.99, "978-0135166307");
    }

    @Test
    public void testGetIsbn() {
        assertEquals("978-0135166307", book.getIsbn());
    }

    @Test
    public void testSetIsbn() {
        book.setIsbn("123-4567890123");
        assertEquals("123-4567890123", book.getIsbn());
    }

    @Test
    public void testGetId() {
        assertEquals(1, book.getId());
    }

    @Test
    public void testGetTitle() {
        assertEquals("Introduction to Java", book.getTitle());
    }

    @Test
    public void testGetLocation() {
        assertEquals("Library", book.getLocation());
    }

    @Test
    public void testGetRemainingCopies() {
        assertEquals(5, book.getRemainingCopies());
    }

    @Test
    public void testSetRemainingCopies() {
        book.setRemainingCopies(3);
        assertEquals(3, book.getRemainingCopies());
    }

    @Test
    public void testIsCanPurchase() {
        assertTrue(book.isCanPurchase());
    }

    @Test
    public void testSetCanPurchase() {
        book.setCanPurchase(false);
        assertFalse(book.isCanPurchase());
    }

    @Test
    public void testIsCanRent() {
        assertTrue(book.isCanRent());
    }

    @Test
    public void testSetCanRent() {
        book.setCanRent(false);
        assertFalse(book.isCanRent());
    }

    @Test
    public void testGetValue() {
        assertEquals(29.99, book.getValue(), 0.001);
    }

    @Test
    public void testSetValue() {
        book.setValue(39.99);
        assertEquals(39.99, book.getValue(), 0.001);
    }

    @Test
    public void testBorrow() {
        // Implement this test according to the borrow method logic
    }

    @Test
    public void testReturnObject() {
        // Implement this test according to the returnObject method logic
    }

    @Test
    public void testToCSVString() {
        String expected = "1,BOOK,Introduction to Java,Library,5,29.99,978-0135166307";
        assertEquals(expected, book.toCSVString());
    }

    @Test
    public void testFromCSVString() {
        String csvLine = "1,BOOK,Introduction to Java,Library,5,29.99,978-0135166307";
        Book parsedBook = (Book) PhysicalItem.fromCSVString(csvLine);
        assertEquals(book.getId(), parsedBook.getId());
        assertEquals(book.getTitle(), parsedBook.getTitle());
        assertEquals(book.getLocation(), parsedBook.getLocation());
        assertEquals(book.getRemainingCopies(), parsedBook.getRemainingCopies());
        assertEquals(book.getValue(), parsedBook.getValue(), 0.001);
        assertEquals(book.getIsbn(), parsedBook.getIsbn());
    }

    @Test
    public void testFromCSVLine() {
        String csvLine = "1,BOOK,Introduction to Java,Library,5,29.99,978-0135166307";
        Book parsedBook = (Book) PhysicalItem.fromCSVLine(csvLine);
        assertEquals(book.getId(), parsedBook.getId());
        assertEquals(book.getTitle(), parsedBook.getTitle());
        assertEquals(book.getLocation(), parsedBook.getLocation());
        assertEquals(book.getRemainingCopies(), parsedBook.getRemainingCopies());
        assertEquals(book.getValue(), parsedBook.getValue(), 0.001);
        assertEquals(book.getIsbn(), parsedBook.getIsbn());
    }
}
