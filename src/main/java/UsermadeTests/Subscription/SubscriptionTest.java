package UsermadeTests.Subscription;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import objects.Course;
import objects.PaymentType;
import objects.Student;
import objects.User;
import objects.UserCreationFactory;
import objects.User.UserType;
import userHandling.SubscriptionHandling;
import objects.Subscription;
import objects.Notification;
import objects.PaymentOption;
import objects.Newsletter;
import java.time.LocalDate;

public class SubscriptionTest {

    @Test
    public void testToCSVString() {
    	User user = UserCreationFactory.getDetails(1, "student@example.com", "password", UserType.STUDENT);;
        Newsletter newsletter = new Newsletter(Newsletter.LetterPublisher.NYTIMES, 10.0);
        PaymentOption paymentOption = new PaymentOption(user.getId(), 100.0, PaymentType.CREDIT);

        Subscription subscription = new Subscription(user, newsletter, paymentOption);
        String expectedCSVString = (SubscriptionHandling.getLastId() + 1) + "," + user.getId() + ","
                + newsletter.getName() + "," + newsletter.getCost() + "," + paymentOption.getPaymentType();

        assertEquals(expectedCSVString, subscription.toCSVString());
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testPayWithSufficientBalance() throws Throwable{
    	User user = UserCreationFactory.getDetails(1, "student@example.com", "password", UserType.STUDENT);;
        Newsletter newsletter = new Newsletter(Newsletter.LetterPublisher.NYTIMES, 10.0);
        PaymentOption paymentOption = new PaymentOption(user.getId(), 100.0, PaymentType.CREDIT);

        Subscription subscription = new Subscription(user, newsletter, paymentOption);

        subscription.pay();

        assertEquals(90.0, paymentOption.getBalance());
        // Test notification creation
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testPayWithInsufficientBalance() {
    	User user = UserCreationFactory.getDetails(1, "student@example.com", "password", UserType.STUDENT);;
        Newsletter newsletter = new Newsletter(Newsletter.LetterPublisher.NYTIMES, 100.0);
        PaymentOption paymentOption = new PaymentOption(user.getId(), 50.0, PaymentType.CREDIT);

        Subscription subscription = new Subscription(user, newsletter, paymentOption);

        subscription.pay();

        assertEquals(50.0, paymentOption.getBalance());
        // Test notification creation
    }
}


