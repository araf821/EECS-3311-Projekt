package Randoop.junits.PaymentOptionTest;

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
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 0, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentType10);
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        paymentOption3.withdraw((double) 100L);
        paymentOption3.withdraw((double) 100L);
        paymentOption3.withdraw((double) 0);
        paymentOption3.withdraw(1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 0, paymentType2);
        paymentOption3.withdraw((-110.0d));
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 110.0d + "'", double7 == 110.0d);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', (double) 10.0f, paymentType2);
        paymentOption3.deposit((-131.0d));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        paymentOption3.deposit((double) (short) 10);
        int int15 = paymentOption3.getUserId();
        paymentOption3.withdraw(184.0d);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        paymentOption3.deposit(20.0d);
        int int12 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        paymentOption3.withdraw((double) 10);
        double double6 = paymentOption3.getBalance();
        int int7 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        double double8 = paymentOption3.getBalance();
        int int9 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 53.0d + "'", double8 == 53.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 100, (double) 97, paymentType2);
        paymentOption3.withdraw(52.0d);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        paymentOption3.withdraw((-10.0d));
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((-10.0d));
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw(32.0d);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        int int9 = paymentOption3.getUserId();
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) 1.0f);
        int int15 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        int int9 = paymentOption3.getUserId();
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = paymentType13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((double) (byte) 0);
        int int10 = paymentOption3.getUserId();
        double double11 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-110.0d) + "'", double11 == (-110.0d));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 100, 52.0d, paymentType2);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) (short) -1, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 0.0f);
        paymentOption3.deposit((double) (short) 100);
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(35, (double) 0.0f, paymentType2);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) (byte) 100, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        int int13 = paymentOption3.getUserId();
        paymentOption3.withdraw((-190.0d));
        double double16 = paymentOption3.getBalance();
        int int17 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        paymentOption3.withdraw((-10.0d));
        paymentOption3.deposit(100.0d);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(35, 20.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 10, (double) '#', paymentType2);
        double double4 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        double double9 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, 88.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = paymentType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 0.0f, paymentType2);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 100, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (-110.0d), paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-110.0d) + "'", double6 == (-110.0d));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) 100.0f);
        double double13 = paymentOption3.getBalance();
        objects.PaymentType paymentType14 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (short) 10);
        objects.PaymentType paymentType17 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-190.0d) + "'", double13 == (-190.0d));
        org.junit.Assert.assertNull(paymentType14);
        org.junit.Assert.assertNull(paymentType17);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        paymentOption3.deposit((double) 10L);
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((-31.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(97, (double) 100, paymentType2);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        double double8 = paymentOption3.getBalance();
        int int9 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) 1.0f, paymentType2);
        paymentOption3.deposit((double) 1.0f);
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, 0.0d, paymentType2);
        paymentOption3.withdraw((-207.0d));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) 100.0f);
        paymentOption3.withdraw((double) (byte) -1);
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        int int7 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (-1.0f));
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        int int9 = paymentOption3.getUserId();
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        int int13 = paymentOption3.getUserId();
        objects.PaymentType paymentType14 = paymentOption3.getPaymentType();
        int int15 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(paymentType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) 100L, paymentType2);
        paymentOption3.deposit(32.0d);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) (byte) 1, paymentType2);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 10, 100.0d, paymentType2);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) ' ');
        double double13 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        double double8 = paymentOption3.getBalance();
        paymentOption3.deposit((double) 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 88.0d + "'", double8 == 88.0d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        int int5 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        paymentOption3.withdraw((double) 100L);
        double double11 = paymentOption3.getBalance();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-110.0d) + "'", double11 == (-110.0d));
        org.junit.Assert.assertNull(paymentType12);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 1, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit(101.0d);
        double double7 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        int int11 = paymentOption3.getUserId();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(paymentType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 0, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, (double) 1.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw(10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, 1.0d, paymentType2);
        paymentOption3.deposit((-109.0d));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, 1.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 1);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        double double8 = paymentOption3.getBalance();
        double double9 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) 35);
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 88.0d + "'", double8 == 88.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 88.0d + "'", double9 == 88.0d);
        org.junit.Assert.assertNull(paymentType12);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        double double6 = paymentOption3.getBalance();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        double double10 = paymentOption3.getBalance();
        int int11 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) (byte) 0);
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        int int14 = paymentOption3.getUserId();
        objects.PaymentType paymentType15 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (byte) -1);
        int int18 = paymentOption3.getUserId();
        int int19 = paymentOption3.getUserId();
        int int20 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(paymentType15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) ' ');
        int int13 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        int int9 = paymentOption3.getUserId();
        paymentOption3.deposit((-131.0d));
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, 1.0d, paymentType2);
        paymentOption3.withdraw((double) 35);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) (short) -1, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) (short) 1);
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 0, paymentType2);
        paymentOption3.withdraw((-110.0d));
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 100.0f, paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (-1.0d), paymentType2);
        paymentOption3.deposit((-100.0d));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.deposit(100.0d);
        int int8 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (byte) -1);
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        double double10 = paymentOption3.getBalance();
        paymentOption3.deposit((double) (short) 10);
        paymentOption3.withdraw((double) 'a');
        paymentOption3.withdraw((-183.0d));
        objects.PaymentType paymentType17 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(paymentType17);
    }
}

