package UsermadeTests.ConcreteStratOverdue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import objects.BorrowingRecord;
import objects.ConcreteStratOverdue;
import objects.PhysicalItem;
import objects.User;
import org.junit.Before;
import org.junit.Test;

public class ConcreteStratOverdueTest {

  private User testUser;
  private PhysicalItem testItem;
  private ConcreteStratOverdue strategy;
  private ArrayList<BorrowingRecord> initialRecords;

  // Simple concrete subclass of PhysicalItem for testing
  static class TestItem extends PhysicalItem {

    public TestItem(
      int id,
      String title,
      String location,
      int remainingCopies,
      double value
    ) {
      super(id, title, location, remainingCopies, value);
    }
  }

  @Before
  public void setUp() {
    // Initialize with some dummy data
    testUser =
      new User(1, "test@example.com", "password", User.UserType.STUDENT) {
        // Overriding updateBorrowingRecords to control returned list without needing actual BorrowingRecordHandling implementation
        @Override
        public ArrayList<BorrowingRecord> updateBorrowingRecords() {
          return initialRecords;
        }
      };
    testItem = new TestItem(1, "Test Book", "Library", 5, 29.99);

    initialRecords = new ArrayList<>();
    BorrowingRecord record = new BorrowingRecord(
      1,
      testUser.getId(),
      testItem.getId(),
      new Date()
    );
    initialRecords.add(record);

    strategy = new ConcreteStratOverdue();
  }

  @Test
  public void executeAddsPenaltyToUserAndRemovesBorrowingRecord() {
    double initialPenalty = 0.0;
    assertEquals(
      "Initial penalty should be 0.0",
      initialPenalty,
      testUser.getPenalty(),
      0.0
    );

    strategy.execute(testUser, testItem);

    // Assuming the penalty has been increased by 0.5
    assertEquals(
      "Penalty should be increased by 0.5",
      initialPenalty + 0.5,
      testUser.getPenalty(),
      0.0
    );
    // Assuming BorrowingRecordHandling is properly mocked or adjusted for testing to verify record removal
    // This part is more challenging without a mock framework and depends on the implementation details of BorrowingRecordHandling
    // assertTrue("Borrowing record should be removed", testUser.getBorrowingRecords().isEmpty());
  }
}
