package Randoop.junits.SubscriptionTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        java.lang.Class<?> wildcardClass16 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = user18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass19 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass20 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass17 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass19 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = newsletter17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = newsletter12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        java.lang.Class<?> wildcardClass8 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = user13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        objects.Newsletter newsletter22 = subscription3.getNewsletter();
        objects.User user23 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = user23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(newsletter22);
        org.junit.Assert.assertNull(user23);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = user15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = newsletter16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass8 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = user13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass21 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = newsletter17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.Newsletter newsletter21 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(newsletter21);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = user21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass16 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass19 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        objects.Newsletter newsletter22 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass23 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(newsletter22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = newsletter17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass17 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = newsletter12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = user17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        java.lang.Class<?> wildcardClass18 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        java.lang.Class<?> wildcardClass18 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.Newsletter newsletter21 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(newsletter21);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        objects.Newsletter newsletter22 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(newsletter22);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = user17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = newsletter10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = newsletter8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        java.lang.Class<?> wildcardClass20 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = newsletter10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.Newsletter newsletter21 = subscription3.getNewsletter();
        objects.User user22 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = newsletter11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.Newsletter newsletter21 = subscription3.getNewsletter();
        objects.User user22 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = user22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        objects.User user22 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass16 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = newsletter11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = user21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.User user20 = subscription3.getUser();
        objects.Newsletter newsletter21 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(newsletter21);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = newsletter8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        objects.Newsletter newsletter22 = subscription3.getNewsletter();
        objects.User user23 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(newsletter22);
        org.junit.Assert.assertNull(user23);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.User user20 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.User user16 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        java.lang.Class<?> wildcardClass18 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = user12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        objects.User user22 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        objects.Newsletter newsletter22 = subscription3.getNewsletter();
        objects.User user23 = subscription3.getUser();
        objects.Newsletter newsletter24 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(newsletter22);
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertNull(newsletter24);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = user9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass18 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        objects.User user18 = subscription3.getUser();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        objects.User user22 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.User user16 = subscription3.getUser();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.User user20 = subscription3.getUser();
        objects.User user21 = subscription3.getUser();
        objects.Newsletter newsletter22 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(newsletter22);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.Newsletter newsletter17 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.User user10 = subscription3.getUser();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = newsletter11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        objects.User user17 = subscription3.getUser();
        objects.Newsletter newsletter18 = subscription3.getNewsletter();
        objects.User user19 = subscription3.getUser();
        objects.Newsletter newsletter20 = subscription3.getNewsletter();
        objects.User user21 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = newsletter12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.User user12 = subscription3.getUser();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        objects.User user15 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.User user9 = subscription3.getUser();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        objects.User user12 = subscription3.getUser();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
        objects.Newsletter newsletter15 = subscription3.getNewsletter();
        objects.Newsletter newsletter16 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.User user13 = subscription3.getUser();
        objects.User user14 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.Newsletter newsletter10 = subscription3.getNewsletter();
        objects.User user11 = subscription3.getUser();
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

