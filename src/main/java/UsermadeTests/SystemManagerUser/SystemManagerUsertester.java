package UsermadeTests.SystemManagerUser;

import static org.junit.Assert.*;	
import org.junit.Before;
import org.junit.Test;

import objects.Book;
import objects.CD;
import objects.Magazine;
import objects.PhysicalItem;
import objects.SystemManagerUser;
import objects.User;
import objects.UserCreationFactory;
import objects.User.UserType;
import userHandling.AccountHandling;
import userHandling.PhysicalItemHandling;

public class SystemManagerUsertester {
    private SystemManagerUser systemManager;

    @Before
    public void setUp() {
        systemManager = new SystemManagerUser(1, "GOOGLE@GMAIL.COM", "POGPASSWORD", UserType.SYSTEM_MANAGER);
    }

    @Test
    public void testAddPhysicalItem() {
        // Add a book
        String bookTitle = "Introduction to Algorithms";
        double bookValue = 50.0;
        String bookExtraInfo = "ISBN: 9780262531962";
        systemManager.addPhysicalItem(bookTitle, PhysicalItem.ItemType.BOOK, "Library", bookValue, bookExtraInfo);

        // Verify if the book was added
        PhysicalItem book = PhysicalItemHandling.getPhysicalItemById(1);
        assertNotNull("Book should not be null", book);
        assertEquals("Title should match", bookTitle, book.getTitle());
        assertEquals("Value should match", bookValue, book.getValue(), 0.001);
        assertEquals("Extra info should match", bookExtraInfo, ((Book) book).getIsbn());

        // Add a CD
        String cdTitle = "Abbey Road";
        double cdValue = 15.0;
        String cdExtraInfo = "The Beatles";
        systemManager.addPhysicalItem(cdTitle, PhysicalItem.ItemType.CD, "Music Room", cdValue, cdExtraInfo);

        // Verify if the CD was added
        PhysicalItem cd = PhysicalItemHandling.getPhysicalItemById(2);
        assertNotNull("CD should not be null", cd);
        assertEquals("Title should match", cdTitle, cd.getTitle());
        assertEquals("Value should match", cdValue, cd.getValue(), 0.001);
        assertEquals("Extra info should match", cdExtraInfo, ((CD) cd).getArtist());
     // Add a magazine
        String magazineTitle = "National Geographic";
        double magazineValue = 10.0;
        String magazineExtraInfo = "April 2024";
        systemManager.addPhysicalItem(magazineTitle, PhysicalItem.ItemType.MAGAZINE, "Reading Room", magazineValue, magazineExtraInfo);

        // Verify if the magazine was added
        PhysicalItem magazine = PhysicalItemHandling.getPhysicalItemById(3);
        assertNotNull("Magazine should not be null", magazine);
        assertEquals("Title should match", magazineTitle, magazine.getTitle());
        assertEquals("Value should match", magazineValue, magazine.getValue(), 0.001);
        assertEquals("Extra info should match", magazineExtraInfo, ((Magazine) magazine).getEdition());

        // Add an unknown item type
        String unknownTitle = "Unknown Item";
        double unknownValue = 5.0;
        String unknownExtraInfo = "No information";
        try {
            systemManager.addPhysicalItem(unknownTitle, null, "Unknown Location", unknownValue, unknownExtraInfo);
            fail("Expected IllegalArgumentException for unknown item type");
        } catch (IllegalArgumentException e) {
            // Test passed, exception caught as expected
            assertTrue(true);
        }
    }
    @Test
    public void testValidateUser() {
    	User user = UserCreationFactory.getDetails(1, "student@example.com", "password", UserType.STUDENT);;
        assertFalse(user.getValidationStatus());
        systemManager.validateUser("testuser@example.com");
        assertTrue(user.getValidationStatus());
    }
}
