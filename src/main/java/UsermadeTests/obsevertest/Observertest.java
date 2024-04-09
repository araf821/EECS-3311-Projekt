package UsermadeTests.obsevertest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import objects.Textbook;
import objects.observer;

public class Observertest {
    private boolean updateCalled;

    // Concrete implementation of the observer class for testing
    class TestObserver extends observer {
        public TestObserver(Textbook subject) {
            this.subject = subject;
        }

        @Override
        public void update() {
            // Set the updateCalled flag to true when update method is called
            updateCalled = true;
        }
    }

    @Before
    public void setUp() {
        updateCalled = false; // Reset the flag before each test
    }

    @Test
    public void testObserverUpdate() {
        // Create a mock textbook object
        Textbook textbook = new Textbook(1, "CS101", "1st Edition");

        // Create an instance of the TestObserver with the mock textbook
        TestObserver observer = new TestObserver(textbook);

        // Call the update method of the observer
        observer.update();

        // Check if the update method was called
        assertTrue("Update method should be called", updateCalled);
    }
}
