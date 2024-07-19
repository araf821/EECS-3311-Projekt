package UsermadeTests.LatePenaltyStrategy;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.Test;

public class LatePenaltyStrategy {

  private objects.LatePenaltyStrategy strategy = new objects.LatePenaltyStrategy();

  private Date addDaysToDate(Date date, int days) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.DAY_OF_MONTH, days);
    return cal.getTime();
  }

  @Test
  public void testReturnOnDueDate() {
    Date dueDate = new Date();
    Date returnDate = dueDate; // same as due date
    assertEquals(0.0, strategy.calculate(dueDate, returnDate), 0.0);
  }

  @Test
  public void testReturnOneDayLate() {
    Date dueDate = new Date();
    Date returnDate = addDaysToDate(dueDate, 1); // one day late
    assertEquals(0.5, strategy.calculate(dueDate, returnDate), 0.0);
  }

  @Test
  public void testReturnMultipleDaysLate() {
    Date dueDate = new Date();
    Date returnDate = addDaysToDate(dueDate, 5); // five days late
    assertEquals(2.5, strategy.calculate(dueDate, returnDate), 0.0);
  }

  @Test
  public void testReturnBeforeDueDate() {
    Date dueDate = new Date();
    Date returnDate = addDaysToDate(dueDate, -1); // returned one day early
    assertEquals(0.0, strategy.calculate(dueDate, returnDate), 0.0);
  }

  @Test
  public void testLargeNumberOfDaysLate() {
    Date dueDate = new Date();
    Date returnDate = addDaysToDate(dueDate, 365); // one year late
    assertEquals(182.5, strategy.calculate(dueDate, returnDate), 0.0);
  }
}
