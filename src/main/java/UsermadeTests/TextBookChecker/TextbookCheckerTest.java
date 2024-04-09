package UsermadeTests.TextBookChecker;

import static org.junit.Assert.*;

import objects.Textbook;
import objects.TextbookChecker;
import org.junit.Before;
import org.junit.Test;

public class TextbookCheckerTest {

  private Textbook textbook;
  private TextbookChecker textbookChecker;

  @Before
  public void setUp() {
    textbook = new Textbook(1, "EECS2011", "1st Edition");
    textbookChecker = new TextbookChecker(textbook);
  }

  @Test
  public void testTextbookCheckerIsAttachedToTextbook() {
    assertTrue(textbook.getObservers().contains(textbookChecker));
  }
}
