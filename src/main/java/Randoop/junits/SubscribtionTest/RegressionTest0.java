package Randoop.junits.SubscribtionTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        java.lang.Class<?> wildcardClass4 = subscription3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        objects.User user0 = null;
        objects.Newsletter newsletter1 = null;
        objects.PaymentOption paymentOption2 = null;
        objects.Subscription subscription3 = new objects.Subscription(user0, newsletter1, paymentOption2);
        objects.Newsletter newsletter4 = subscription3.getNewsletter();
        objects.Newsletter newsletter5 = subscription3.getNewsletter();
        objects.Newsletter newsletter6 = subscription3.getNewsletter();
        objects.Newsletter newsletter7 = subscription3.getNewsletter();
        objects.Newsletter newsletter8 = subscription3.getNewsletter();
        org.junit.Assert.assertNull(newsletter4);
        org.junit.Assert.assertNull(newsletter5);
        org.junit.Assert.assertNull(newsletter6);
        org.junit.Assert.assertNull(newsletter7);
        org.junit.Assert.assertNull(newsletter8);
    }
}

