package UsermadeTests.Physicalitemhandling;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import objects.Book;
import objects.PhysicalItem;
import objects.User;
import userHandling.PhysicalItemHandling;

import java.util.List;

public class PhysicalitemHandling {
    private PhysicalItemHandling physicalItemHandling;
    private PhysicalItem book;

    @Before
    public void setUp() {
        physicalItemHandling = new PhysicalItemHandling();
        book = new Book(1, "Introduction to Java", "Library", 5, 29.99, "978-0135166307");
    }

    @Test
    public void testWritePhysicalItem() {
        physicalItemHandling.writePhysicalItem(book);
        PhysicalItem retrievedBook = PhysicalItemHandling.getPhysicalItemById(book.getId());
        assertNotNull(retrievedBook);
        assertEquals(book.getId(), retrievedBook.getId());
        assertEquals(book.getTitle(), retrievedBook.getTitle());
        assertEquals(book.getLocation(), retrievedBook.getLocation());
        assertEquals(book.getRemainingCopies(), retrievedBook.getRemainingCopies());
        assertEquals(book.getValue(), retrievedBook.getValue(), 0.001);
    }

    @Test
    public void testGetPhysicalItemById() {
        physicalItemHandling.writePhysicalItem(book);
        PhysicalItem retrievedBook = PhysicalItemHandling.getPhysicalItemById(book.getId());
        assertNotNull(retrievedBook);
        assertEquals(book.getId(), retrievedBook.getId());
        assertEquals(book.getTitle(), retrievedBook.getTitle());
        assertEquals(book.getLocation(), retrievedBook.getLocation());
        assertEquals(book.getRemainingCopies(), retrievedBook.getRemainingCopies());
        assertEquals(book.getValue(), retrievedBook.getValue(), 0.001);
    }

    @Test
    public void testDecreaseStockOfItem() {
        physicalItemHandling.writePhysicalItem(book);
        int initialRemainingCopies = book.getRemainingCopies();
        PhysicalItemHandling.decreaseStockOfItem(book.getId());
        PhysicalItem updatedBook = PhysicalItemHandling.getPhysicalItemById(book.getId());
        assertNotNull(updatedBook);
        assertEquals(initialRemainingCopies - 1, updatedBook.getRemainingCopies());
    }

    @Test
    public void testIncreaseStockOfItem() {
        physicalItemHandling.writePhysicalItem(book);
        int initialRemainingCopies = book.getRemainingCopies();
        PhysicalItemHandling.increaseStockOfItem(book.getId());
        PhysicalItem updatedBook = PhysicalItemHandling.getPhysicalItemById(book.getId());
        assertNotNull(updatedBook);
        assertEquals(initialRemainingCopies + 1, updatedBook.getRemainingCopies());
    }

    @Test
    public void testGetAllItems() {
        List<PhysicalItem> items = PhysicalItemHandling.Getallitems();
        assertNotNull(items);
        assertEquals(1, items.size());
    }
}
