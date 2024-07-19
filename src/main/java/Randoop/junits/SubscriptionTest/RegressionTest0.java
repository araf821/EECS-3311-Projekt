package Randoop.junits.SubscriptionTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.Subscription subscription2 = new objects.Subscription(user0, newsletter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = newsletter4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass5 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        java.lang.Class<?> wildcardClass4 = subscription3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass7 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass7 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
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
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = newsletter5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = user5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        java.lang.Class<?> wildcardClass6 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass8 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = user9.getClass();
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
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass7 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
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
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
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
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
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
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = newsletter6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = newsletter9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = newsletter7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = newsletter6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = user6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = user10.getClass();
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
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = user7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = newsletter13.getClass();
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
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = newsletter10.getClass();
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
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
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
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass6 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = newsletter7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
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
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
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
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = newsletter10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass8 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        java.lang.Class<?> wildcardClass5 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = newsletter10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
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
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = user6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = newsletter10.getClass();
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
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
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
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
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
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
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
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = subscription3.toCSVString();
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
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
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
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
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
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = user8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
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
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
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
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = subscription3.toCSVString();
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
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
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
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
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
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass8 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
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
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
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
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = newsletter12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
            java.lang.Class<?> wildcardClass10 = user9.getClass();
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
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
            java.lang.String str11 = subscription3.toCSVString();
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
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = user7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = newsletter9.getClass();
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
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = subscription3.toCSVString();
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
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
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
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = newsletter14.getClass();
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
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        java.lang.Class<?> wildcardClass17 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
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
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = newsletter15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
            java.lang.String str9 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = user9.getClass();
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
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
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
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
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
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = user8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = user10.getClass();
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
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
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
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
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
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        java.lang.Class<?> wildcardClass8 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
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
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
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
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = user7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
            java.lang.Class<?> wildcardClass15 = user14.getClass();
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
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = newsletter13.getClass();
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
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = user7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
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
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = newsletter14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        java.lang.Class<?> wildcardClass8 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
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
        objects.User user20 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
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
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
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
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
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
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
            java.lang.Class<?> wildcardClass8 = user7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = user9.getClass();
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
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = subscription3.toCSVString();
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
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = newsletter9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
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
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
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
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass6 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
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
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
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
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
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
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
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
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        java.lang.Class<?> wildcardClass16 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
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
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
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
            java.lang.String str11 = subscription3.toCSVString();
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
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
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
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        objects.User user18 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
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
        java.lang.Class<?> wildcardClass13 = subscription3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
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
        objects.User user18 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
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
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = newsletter19.getClass();
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
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = newsletter18.getClass();
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
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
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
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = user16.getClass();
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
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = user4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
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
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
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
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
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
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
            java.lang.Class<?> wildcardClass15 = newsletter14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = newsletter14.getClass();
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
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = user14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = user13.getClass();
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
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
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
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = user14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
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
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
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
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
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
        objects.User user11 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = newsletter7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = newsletter15.getClass();
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
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        objects.User user11 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
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
        objects.User user17 = subscription3.getUser();
        objects.User user18 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
            java.lang.String str9 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
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
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
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
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
        objects.User user14 = subscription3.getUser();
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
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
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
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
        objects.User user10 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
        objects.User user8 = subscription3.getUser();
        objects.Newsletter newsletter9 = subscription3.getNewsletter();
        objects.User user10 = subscription3.getUser();
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = subscription3.toCSVString();
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
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
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
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
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
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = user6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = user10.getClass();
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
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
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
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
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
        objects.User user12 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
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
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
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
            java.lang.String str12 = subscription3.toCSVString();
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
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
            java.lang.Class<?> wildcardClass19 = newsletter18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
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
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(newsletter20);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
            java.lang.String str9 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
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
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = subscription3.toCSVString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.getId()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
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
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
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
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
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
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = user6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        objects.User user17 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
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
            java.lang.Class<?> wildcardClass13 = user12.getClass();
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
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = user8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = newsletter18.getClass();
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
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = newsletter20.getClass();
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
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
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
        objects.Newsletter newsletter12 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
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
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.User user7 = subscription3.getUser();
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
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        objects.User user13 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
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
        objects.User user10 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = user10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
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
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
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
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
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
        objects.User user18 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.User user20 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(newsletter21);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
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
        objects.Newsletter newsletter13 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        objects.Newsletter newsletter11 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass12 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
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
        java.lang.Class<?> wildcardClass15 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = user5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
        java.lang.Class<?> wildcardClass16 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
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
        java.lang.Class<?> wildcardClass11 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
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
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = user20.getClass();
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
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = user9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
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
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        objects.User user12 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
            java.lang.Class<?> wildcardClass13 = user12.getClass();
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
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
            java.lang.String str10 = subscription3.toCSVString();
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
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass8 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
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
        objects.Newsletter newsletter19 = subscription3.getNewsletter();
        objects.User user20 = subscription3.getUser();
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
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        objects.User user13 = subscription3.getUser();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
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
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
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
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
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
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = subscription3.toCSVString();
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.User user6 = subscription3.getUser();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.User user8 = subscription3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            subscription3.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PaymentOption.getBalance()\" because \"this.paymentOption\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
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
        java.lang.Class<?> wildcardClass17 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
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
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
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
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(newsletter20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
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
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        objects.User user20 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
            java.lang.Class<?> wildcardClass15 = user14.getClass();
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
        java.lang.Class<?> wildcardClass14 = subscription3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = newsletter15.getClass();
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
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = user14.getClass();
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = newsletter21.getClass();
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
        org.junit.Assert.assertNull(newsletter21);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        java.lang.Class<?> wildcardClass10 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        objects.User user15 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
        objects.User user11 = subscription3.getUser();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(newsletter16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.User user4 = subscription3.getUser();
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
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
        objects.Newsletter newsletter14 = subscription3.getNewsletter();
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
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.User user5 = subscription3.getUser();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        java.lang.Class<?> wildcardClass9 = subscription3.getClass();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

