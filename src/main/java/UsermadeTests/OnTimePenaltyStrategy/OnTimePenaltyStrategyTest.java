package UsermadeTests.OnTimePenaltyStrategy;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import objects.OnTimePenaltyStrategy;
import org.junit.Test;

public class OnTimePenaltyStrategyTest {

  private OnTimePenaltyStrategy penaltyStrategy = new OnTimePenaltyStrategy();

  @Test
  public void testPenaltyForOnTimeReturn() {
    Calendar cal = Calendar.getInstance();
    Date dueDate = cal.getTime(); // now
    Date returnDate = cal.getTime(); // same as due date

    double penalty = penaltyStrategy.calculate(dueDate, returnDate);
    assertEquals(
      "Penalty should be 0.0 for on-time return",
      0.0,
      penalty,
      0.001
    );
  }

  @Test
  public void testPenaltyForEarlyReturn() {
    Calendar cal = Calendar.getInstance();
    Date dueDate = cal.getTime();
    cal.add(Calendar.DAY_OF_YEAR, -1);
    Date returnDate = cal.getTime();

    double penalty = penaltyStrategy.calculate(dueDate, returnDate);
    assertEquals("Penalty should be 0.0 for early return", 0.0, penalty, 0.001);
  }

  @Test
  public void testPenaltyForLateReturn() {
    Calendar cal = Calendar.getInstance();
    Date dueDate = cal.getTime();
    cal.add(Calendar.DAY_OF_YEAR, 1);
    Date returnDate = cal.getTime();

    double expectedPenalty = 10.0; // Placeholder for the expected penalty
    double penalty = penaltyStrategy.calculate(dueDate, returnDate);
    assertEquals(
      "Penalty should be greater than 0.0 for late return",
      expectedPenalty,
      penalty,
      0.001
    );
  }
}
