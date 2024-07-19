package UsermadeTests.Request;

import static org.junit.Assert.*;

import objects.Book;
import objects.NonFacultyStaff;
import objects.User;
import org.junit.Before;
import org.junit.Test;

public class Request {

  private Book exampleBook;
  private User exampleUser;
  private objects.Request teachingRequest;
  private objects.Request nonTeachingRequest;

  @Before
  public void setUp() {
    // Assuming these constructors based on the class contents viewed
    // You might need to replace these with actual valid constructor parameters based on your class definitions
    exampleBook = new Book(1, "Example Book", "Library", 5, 9.99, "1234567890");
    exampleUser =
      new NonFacultyStaff(
        1,
        "user@example.com",
        "password123",
        User.UserType.NON_FACULTY_STAFF
      );

    teachingRequest = new objects.Request(exampleBook, exampleUser, true);
    nonTeachingRequest = new objects.Request(exampleBook, exampleUser, false);
  }

  @Test
  public void testRequestInitialization() {
    assertSame(
      "Book should match the one provided at initialization.",
      exampleBook,
      teachingRequest.getBook()
    );
    assertTrue(
      "Teaching flag should be true for teachingRequest.",
      teachingRequest.isTeaching()
    );
    assertFalse(
      "Teaching flag should be false for nonTeachingRequest.",
      nonTeachingRequest.isTeaching()
    );
  }

  @Test
  public void testPrioritySetAndGet() {
    int priorityLevel = 5;
    teachingRequest.setPriority(priorityLevel);
    assertEquals(
      "Priority should be set and retrieved correctly.",
      priorityLevel,
      teachingRequest.getPriority()
    );
  }

  @Test
  public void testTeachingRequestVerification() {
    assertTrue(
      "isTeaching should return true for teaching requests.",
      teachingRequest.isTeaching()
    );
    assertFalse(
      "isTeaching should return false for non-teaching requests.",
      nonTeachingRequest.isTeaching()
    );
  }
}
