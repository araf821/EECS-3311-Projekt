package UsermadeTests.Textbook;

import static org.junit.Assert.*;

import objects.observer;
import org.junit.Before;
import org.junit.Test;

public class Textbook {

  private objects.Textbook textbook;

  @Before
  public void setUp() {
    textbook = new objects.Textbook(1, "CS101", "First Edition");
  }

  @Test
  public void testTextbookInitialization() {
    assertEquals(1, textbook.getId());
    assertEquals("CS101", textbook.getCourseId());
    assertEquals("First Edition", textbook.getEdition());
  }

  @Test
  public void testObserverRegistrationAndNotification() {
    MockObserver observer = new MockObserver();
    textbook.attachObserver(observer);
    for (observer obs : textbook.observers) {
      obs.notify();
    }
    assertTrue(observer.wasNotified());
  }

  @Test
  public void testMultipleObservers() {
    MockObserver firstObserver = new MockObserver();
    MockObserver secondObserver = new MockObserver();
    textbook.attachObserver(firstObserver);
    textbook.attachObserver(secondObserver);
    for (objects.observer observer : textbook.observers) {
      observer.notify();
    }
    assertTrue(firstObserver.wasNotified() && secondObserver.wasNotified());
  }
}

class MockObserver extends objects.observer {

  boolean notified = false;

  @Override
  public void update() {
    notified = true;
  }

  public boolean wasNotified() {
    return notified;
  }
}
