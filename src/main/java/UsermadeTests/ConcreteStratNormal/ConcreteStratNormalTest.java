package UsermadeTests.ConcreteStratNormal;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import objects.BorrowingRecord;
import objects.ConcreteStratNormal;
import objects.PhysicalItem;
import objects.User;
import org.junit.Before;
import org.junit.Test;

public class ConcreteStratNormalTest {

  private User testUser;
  private PhysicalItem testItem;
  private ConcreteStratNormal strategy;
  private ArrayList<BorrowingRecord> initialRecords;

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

    strategy = new ConcreteStratNormal();
  }

  @Test
  public void executeRemovesBorrowingRecord() {
    assertEquals(
      "There should be 1 borrowing record before execution",
      1,
      testUser.updateBorrowingRecords().size()
    );

    strategy.execute(testUser, testItem);
  }
}
