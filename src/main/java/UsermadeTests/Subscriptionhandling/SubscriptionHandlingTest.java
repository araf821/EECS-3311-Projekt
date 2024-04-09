package UsermadeTests.Subscriptionhandling;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import objects.Newsletter;
import objects.PaymentOption;
import objects.PaymentType;
import objects.Student;
import objects.Subscription;
import objects.User.UserType;
import userHandling.SubscriptionHandling;

public class SubscriptionHandlingTest {
    private Student testUser;
    private Newsletter testNewsletter;
    private PaymentOption testPaymentOption;
    private Subscription testSubscription;

    @Before
    public void setUp() {
        testUser = new Student(1, "John", "Doe", UserType.STUDENT);
        testPaymentOption = new PaymentOption(1, 100.0, PaymentType.CREDIT);
        testSubscription = new Subscription(testUser, testNewsletter, testPaymentOption);
    }

    @Test
    public void testWriteSubscription() {
        // Writing a subscription to CSV file and checking if it's successful
        SubscriptionHandling.writeSubscription(testSubscription);
        assertTrue("Subscription should be written successfully.", SubscriptionHandling.isSubscribed(testUser, testNewsletter));
    }

    @Test
    public void testCancelSubscription() {
        // Writing a subscription first
        SubscriptionHandling.writeSubscription(testSubscription);
        // Canceling the subscription and checking if it's canceled successfully
        SubscriptionHandling.cancelSubscription(testUser.getId(), testNewsletter.getName());
        assertFalse("Subscription should be canceled successfully.", SubscriptionHandling.isSubscribed(testUser, testNewsletter));
    }

    // Additional test cases can be added for other methods if necessary
}
