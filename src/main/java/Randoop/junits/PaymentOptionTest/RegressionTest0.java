package Randoop.junits.PaymentOptionTest;

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
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass7 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass7 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass7 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.withdraw(0.0d);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((-1.0d));
        double double10 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-109.0d) + "'", double10 == (-109.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.deposit((double) 0.0f);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 100.0d, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        int int9 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.deposit((double) 0.0f);
        double double8 = paymentOption3.getBalance();
        double double9 = paymentOption3.getBalance();
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 100, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        int int9 = paymentOption3.getUserId();
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        paymentOption3.deposit((double) (byte) -1);
        paymentOption3.withdraw((double) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 1.0d, paymentType2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        double double6 = paymentOption3.getBalance();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 100.0d, paymentType2);
        int int4 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((double) (byte) 0);
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        int int10 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = paymentType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 10.0f);
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', (double) 0.0f, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        paymentOption3.deposit(0.0d);
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.deposit((double) 0.0f);
        double double8 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', (-10.0d), paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.withdraw((double) 0L);
        double double8 = paymentOption3.getBalance();
        double double9 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 0, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        int int14 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass15 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 1.0f, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
        java.lang.Class<?> wildcardClass14 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        paymentOption3.withdraw((-10.0d));
        paymentOption3.deposit(100.0d);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 1, paymentType2);
        paymentOption3.withdraw((double) 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) 1L);
        paymentOption3.deposit((double) (short) -1);
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) (short) -1, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        double double8 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-110.0d) + "'", double8 == (-110.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.deposit((double) (byte) -1);
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        int int12 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) 0);
        paymentOption3.deposit((double) (short) -1);
        int int8 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        int int11 = paymentOption3.getUserId();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 100L);
        java.lang.Class<?> wildcardClass15 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(paymentType12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 100.0d, paymentType2);
        int int4 = paymentOption3.getUserId();
        int int5 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        double double8 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        paymentOption3.withdraw(0.0d);
        paymentOption3.withdraw(0.0d);
        objects.PaymentType paymentType15 = paymentOption3.getPaymentType();
        double double16 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-131.0d) + "'", double16 == (-131.0d));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        int int10 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        double double8 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 88.0d + "'", double8 == 88.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        double double6 = paymentOption3.getBalance();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        double double8 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        paymentOption3.withdraw(0.0d);
        double double13 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-131.0d) + "'", double13 == (-131.0d));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.withdraw(0.0d);
        int int8 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        paymentOption3.withdraw((double) 100L);
        paymentOption3.withdraw((double) 100L);
        int int13 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        int int7 = paymentOption3.getUserId();
        double double8 = paymentOption3.getBalance();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) (byte) 10, paymentType2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 100, paymentType2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((-100.0d));
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(97, (double) (short) 100, paymentType2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (-109.0d), paymentType2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) ' ', paymentType2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) 100.0f);
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, (double) 1.0f, paymentType2);
        int int4 = paymentOption3.getUserId();
        double double5 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        double double9 = paymentOption3.getBalance();
        paymentOption3.deposit((double) 1);
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = paymentType12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
        org.junit.Assert.assertNull(paymentType12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 10.0f);
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        int int10 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (-110.0d), paymentType2);
        paymentOption3.deposit(52.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit(0.0d);
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 10, 88.0d, paymentType2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNull(paymentType12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10.0f);
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        int int13 = paymentOption3.getUserId();
        paymentOption3.deposit(10.0d);
        paymentOption3.deposit((double) 52);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.deposit((double) 0.0f);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        java.lang.Class<?> wildcardClass15 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.deposit((double) 0.0f);
        double double8 = paymentOption3.getBalance();
        paymentOption3.withdraw(100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) 0, paymentType2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (byte) 10, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 100, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) 100, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.deposit(100.0d);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        paymentOption3.withdraw((double) (-1.0f));
        paymentOption3.withdraw((double) (-1L));
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((-1.0d));
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 1, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) (short) 10, paymentType2);
        paymentOption3.deposit(1.0d);
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) (short) 10, paymentType2);
        paymentOption3.deposit(1.0d);
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        paymentOption3.withdraw((-31.0d));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        paymentOption3.withdraw(0.0d);
        paymentOption3.withdraw(0.0d);
        int int15 = paymentOption3.getUserId();
        int int16 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) (short) -1, paymentType2);
        paymentOption3.deposit((double) (-1.0f));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        paymentOption3.deposit((double) 1L);
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10L);
        double double9 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-110.0d) + "'", double9 == (-110.0d));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) 0);
        paymentOption3.deposit((double) (short) -1);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((double) (byte) 0);
        int int10 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 'a');
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) (short) 100, paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.deposit((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) 10, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, (double) 1.0f, paymentType2);
        int int4 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) 100L, paymentType2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        paymentOption3.withdraw(20.0d);
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 10, (-131.0d), paymentType2);
        paymentOption3.withdraw((double) (-1.0f));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        paymentOption3.deposit(1.0d);
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        paymentOption3.withdraw((double) '4');
        paymentOption3.deposit((double) (short) 100);
        java.lang.Class<?> wildcardClass18 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.withdraw((double) 0L);
        double double8 = paymentOption3.getBalance();
        int int9 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 100L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit(10.0d);
        int int14 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        paymentOption3.withdraw((double) 100L);
        paymentOption3.withdraw((double) 100L);
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        paymentOption3.deposit(1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        double double8 = paymentOption3.getBalance();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        double double10 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 88.0d + "'", double8 == 88.0d);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 88.0d + "'", double10 == 88.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        paymentOption3.withdraw((double) 100L);
        paymentOption3.withdraw((double) 100L);
        double double13 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-210.0d) + "'", double13 == (-210.0d));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        int int13 = paymentOption3.getUserId();
        objects.PaymentType paymentType14 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(paymentType14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 100.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10);
        paymentOption3.deposit(100.0d);
        paymentOption3.deposit((double) 35);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) '4', paymentType2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) (byte) 10);
        paymentOption3.deposit((-110.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) (short) 1);
        int int7 = paymentOption3.getUserId();
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) (short) -1, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (-100.0d), paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        paymentOption3.withdraw(1.0d);
        double double6 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass7 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) (-1));
        paymentOption3.withdraw((-100.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        double double7 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 1, paymentType2);
        int int4 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) ' ', paymentType2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw(88.0d);
        double double14 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) ' ', paymentType2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        int int11 = paymentOption3.getUserId();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 100L);
        double double15 = paymentOption3.getBalance();
        double double16 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(paymentType12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-31.0d) + "'", double15 == (-31.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-31.0d) + "'", double16 == (-31.0d));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) 10, paymentType2);
        paymentOption3.withdraw((double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) (short) 1);
        paymentOption3.deposit((double) '4');
        paymentOption3.deposit((double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) 100.0f, paymentType2);
        paymentOption3.deposit((double) (short) -1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.withdraw((double) 0L);
        double double8 = paymentOption3.getBalance();
        int int9 = paymentOption3.getUserId();
        int int10 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10L);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        int int10 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 10);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        int int10 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (byte) 1);
        objects.PaymentType paymentType14 = paymentOption3.getPaymentType();
        double double15 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNull(paymentType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-11.0d) + "'", double15 == (-11.0d));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(97, (double) (short) 0, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.deposit((double) (byte) -1);
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.deposit(1.0d);
        paymentOption3.deposit((-109.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        int int7 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        int int7 = paymentOption3.getUserId();
        int int8 = paymentOption3.getUserId();
        paymentOption3.withdraw(52.0d);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) (-1));
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 0);
        double double16 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass17 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 87.0d + "'", double16 == 87.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.deposit((double) (byte) -1);
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.deposit(1.0d);
        paymentOption3.deposit((-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((-100.0d));
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.deposit((double) (byte) -1);
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, (double) 10, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, (double) 10, paymentType2);
        int int4 = paymentOption3.getUserId();
        int int5 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        double double4 = paymentOption3.getBalance();
        double double5 = paymentOption3.getBalance();
        paymentOption3.deposit(20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 10, (-190.0d), paymentType2);
        double double4 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-190.0d) + "'", double4 == (-190.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 10, (-190.0d), paymentType2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.withdraw((double) 0L);
        double double8 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 0, paymentType2);
        paymentOption3.deposit(87.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (-100.0d), paymentType2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        double double6 = paymentOption3.getBalance();
        int int7 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (short) 100);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, 87.0d, paymentType2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, (-10.0d), paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-10.0d) + "'", double4 == (-10.0d));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) ' ');
        java.lang.Class<?> wildcardClass14 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.deposit((double) (byte) -1);
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = paymentType11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) (-1));
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType14 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertNull(paymentType14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, 52.0d, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) (-1));
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        double double14 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 87.0d + "'", double14 == 87.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass14 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) (-1.0f), paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.deposit((-131.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) 52);
        double double15 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-183.0d) + "'", double15 == (-183.0d));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 0L);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', (-100.0d), paymentType2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        int int9 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (byte) 10, paymentType2);
        paymentOption3.deposit((double) 10.0f);
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 0.0f);
        paymentOption3.withdraw((-190.0d));
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 10.0f);
        int int11 = paymentOption3.getUserId();
        paymentOption3.deposit(53.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        paymentOption3.withdraw(1.0d);
        double double6 = paymentOption3.getBalance();
        double double7 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((-101.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        int int11 = paymentOption3.getUserId();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        double double13 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(paymentType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-131.0d) + "'", double13 == (-131.0d));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', 1.0d, paymentType2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) ' ', paymentType2);
        double double4 = paymentOption3.getBalance();
        int int5 = paymentOption3.getUserId();
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        paymentOption3.withdraw((-10.0d));
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.deposit(10.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) 100.0f);
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        paymentOption3.deposit(0.0d);
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) 10, paymentType2);
        paymentOption3.withdraw((double) (byte) 0);
        paymentOption3.deposit((double) (short) 100);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, (double) (-1.0f), paymentType2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (-110.0d), paymentType2);
        paymentOption3.withdraw((double) 1L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) (short) 10);
        paymentOption3.deposit((double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) ' ', paymentType2);
        double double4 = paymentOption3.getBalance();
        int int5 = paymentOption3.getUserId();
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        int int9 = paymentOption3.getUserId();
        int int10 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        int int11 = paymentOption3.getUserId();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 100L);
        double double15 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass16 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(paymentType12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-31.0d) + "'", double15 == (-31.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) 100L);
        paymentOption3.deposit((-10.0d));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        int int13 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        int int5 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        paymentOption3.withdraw((double) (short) 0);
        java.lang.Class<?> wildcardClass19 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-190.0d) + "'", double13 == (-190.0d));
        org.junit.Assert.assertNull(paymentType14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((-1.0d));
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = paymentType10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        paymentOption3.deposit((double) (short) 10);
        int int15 = paymentOption3.getUserId();
        int int16 = paymentOption3.getUserId();
        int int17 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 10.0f);
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNull(paymentType12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 0L);
        paymentOption3.deposit((double) (-1));
        paymentOption3.withdraw((double) 1);
        objects.PaymentType paymentType16 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass17 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) '#', paymentType2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) 100L);
        paymentOption3.deposit((-210.0d));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((-110.0d));
        paymentOption3.withdraw((double) (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 10, (double) 97, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, (-10.0d), paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) '#', paymentType2);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.withdraw((double) 0L);
        double double8 = paymentOption3.getBalance();
        int int9 = paymentOption3.getUserId();
        int int10 = paymentOption3.getUserId();
        paymentOption3.withdraw((-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 0L);
        int int12 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) 1L);
        paymentOption3.deposit((double) (short) -1);
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        int int14 = paymentOption3.getUserId();
        double double15 = paymentOption3.getBalance();
        double double16 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-101.0d) + "'", double15 == (-101.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-101.0d) + "'", double16 == (-101.0d));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, (double) 1L, paymentType2);
        paymentOption3.deposit((double) 1.0f);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        paymentOption3.deposit((double) (short) 10);
        int int15 = paymentOption3.getUserId();
        paymentOption3.deposit((-210.0d));
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 100);
        paymentOption3.deposit((double) 0.0f);
        int int13 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass14 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) (byte) 10);
        int int13 = paymentOption3.getUserId();
        int int14 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) 100, paymentType2);
        paymentOption3.deposit(0.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((double) (byte) 0);
        paymentOption3.deposit(0.0d);
        int int12 = paymentOption3.getUserId();
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.deposit((double) (byte) -1);
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.deposit(1.0d);
        java.lang.Class<?> wildcardClass14 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, 52.0d, paymentType2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', (double) 0.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) (short) 1);
        double double7 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) (short) 100, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        paymentOption3.deposit((double) 0);
        paymentOption3.deposit(52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        int int6 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass7 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        paymentOption3.deposit((double) 0);
        objects.PaymentType paymentType15 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
        org.junit.Assert.assertNull(paymentType15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        int int4 = paymentOption3.getUserId();
        int int5 = paymentOption3.getUserId();
        paymentOption3.deposit(32.0d);
        double double8 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), (double) '#', paymentType2);
        int int4 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 1);
        java.lang.Class<?> wildcardClass7 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        double double5 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 100);
        int int11 = paymentOption3.getUserId();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(paymentType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) ' ', paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 0, paymentType2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) 100L);
        paymentOption3.withdraw((double) 10L);
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        paymentOption3.deposit((double) 0.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((-110.0d));
        int int7 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', 10.0d, paymentType2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        double double9 = paymentOption3.getBalance();
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNull(paymentType12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 10, (-190.0d), paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw(0.0d);
        int int7 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-190.0d) + "'", double4 == (-190.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        int int7 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 52);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, (double) ' ', paymentType2);
        paymentOption3.deposit((double) (-1.0f));
        paymentOption3.withdraw(10.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 100);
        paymentOption3.deposit((double) 0.0f);
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, 76.0d, paymentType2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        int int6 = paymentOption3.getUserId();
        int int7 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 0, paymentType2);
        paymentOption3.withdraw((double) '4');
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, (double) 10.0f, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        double double4 = paymentOption3.getBalance();
        int int5 = paymentOption3.getUserId();
        paymentOption3.withdraw(76.0d);
        paymentOption3.withdraw((-110.0d));
        paymentOption3.withdraw((-11.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((double) (byte) 0);
        int int10 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 'a');
        double double13 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-207.0d) + "'", double13 == (-207.0d));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        int int4 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) 100.0f);
        paymentOption3.deposit((double) '4');
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, (double) 1.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        double double5 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 10, paymentType2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 100, (double) 52, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) (byte) 100, paymentType2);
        paymentOption3.deposit((double) 10.0f);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 100.0d, paymentType2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        double double5 = paymentOption3.getBalance();
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) 1L);
        paymentOption3.deposit((double) (short) -1);
        paymentOption3.deposit((double) 100);
        objects.PaymentType paymentType15 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType15);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        paymentOption3.withdraw(32.0d);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10);
        paymentOption3.deposit(100.0d);
        int int10 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(97, (-210.0d), paymentType2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) 10, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) (-1.0f), paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 100.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        double double5 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(97, 32.0d, paymentType2);
        paymentOption3.deposit((double) 10L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 10, (double) 1.0f, paymentType2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, (double) 10.0f, paymentType2);
        paymentOption3.withdraw((double) '#');
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        paymentOption3.deposit(1.0d);
        paymentOption3.withdraw((double) 100);
        paymentOption3.withdraw(53.0d);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        paymentOption3.withdraw(0.0d);
        paymentOption3.withdraw(0.0d);
        int int15 = paymentOption3.getUserId();
        paymentOption3.deposit((-110.0d));
        objects.PaymentType paymentType18 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(paymentType18);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        paymentOption3.deposit((double) 1L);
        paymentOption3.deposit(20.0d);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 10, paymentType2);
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        double double4 = paymentOption3.getBalance();
        double double5 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) (short) 10);
        double double7 = paymentOption3.getBalance();
        paymentOption3.withdraw(0.0d);
        int int10 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        int int13 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 0.0f);
        objects.PaymentType paymentType16 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 1L);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(paymentType16);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), (double) 10, paymentType2);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', 88.0d, paymentType2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        int int7 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (short) 10);
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 100);
        int int11 = paymentOption3.getUserId();
        int int12 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((double) (byte) 0);
        paymentOption3.deposit(0.0d);
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        paymentOption3.deposit((double) (short) 10);
        paymentOption3.withdraw((double) (byte) 10);
        double double17 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-190.0d) + "'", double17 == (-190.0d));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 1.0f, paymentType2);
        paymentOption3.withdraw((double) 0L);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        int int9 = paymentOption3.getUserId();
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 0L);
        paymentOption3.deposit((double) (-1));
        paymentOption3.withdraw((double) 1);
        objects.PaymentType paymentType16 = paymentOption3.getPaymentType();
        int int17 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        int int7 = paymentOption3.getUserId();
        double double8 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 53.0d + "'", double8 == 53.0d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        int int4 = paymentOption3.getUserId();
        int int5 = paymentOption3.getUserId();
        paymentOption3.deposit(32.0d);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', 0.0d, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        int int5 = paymentOption3.getUserId();
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        int int9 = paymentOption3.getUserId();
        double double10 = paymentOption3.getBalance();
        paymentOption3.deposit((-131.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        paymentOption3.withdraw(1.0d);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((-110.0d));
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, 88.0d, paymentType2);
        paymentOption3.withdraw((-100.0d));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, (double) (byte) 1, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        double double5 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) 97, paymentType2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 0L);
        paymentOption3.deposit((double) (-1));
        int int14 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) ' ');
        paymentOption3.withdraw(0.0d);
        double double15 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (-110.0d), paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) 100.0f, paymentType2);
        paymentOption3.deposit(10.0d);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 10);
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        double double6 = paymentOption3.getBalance();
        double double7 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) ' ');
        paymentOption3.withdraw(101.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        int int9 = paymentOption3.getUserId();
        int int10 = paymentOption3.getUserId();
        double double11 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit((-101.0d));
        double double7 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-101.0d) + "'", double7 == (-101.0d));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 10, (-190.0d), paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw(0.0d);
        java.lang.Class<?> wildcardClass7 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-190.0d) + "'", double4 == (-190.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) (short) 1);
        int int7 = paymentOption3.getUserId();
        paymentOption3.deposit((double) '#');
        paymentOption3.deposit(52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, (double) (byte) 1, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) (byte) -1);
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((-131.0d));
        paymentOption3.withdraw(87.0d);
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, 10.0d, paymentType2);
        paymentOption3.deposit(184.0d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) (short) 10);
        double double7 = paymentOption3.getBalance();
        paymentOption3.withdraw(0.0d);
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) 1L);
        paymentOption3.deposit((double) (short) -1);
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        int int14 = paymentOption3.getUserId();
        int int15 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, 10.0d, paymentType2);
        paymentOption3.deposit((double) (short) 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.withdraw((double) 0L);
        int int8 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.deposit((double) 0.0f);
        double double8 = paymentOption3.getBalance();
        int int9 = paymentOption3.getUserId();
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        paymentOption3.deposit((double) (short) 10);
        int int15 = paymentOption3.getUserId();
        int int16 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass17 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        paymentOption3.deposit((double) 10L);
        paymentOption3.deposit(20.0d);
        paymentOption3.deposit((-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 10.0d, paymentType2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        paymentOption3.deposit(0.0d);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-190.0d) + "'", double13 == (-190.0d));
        org.junit.Assert.assertNull(paymentType14);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((-183.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) 52, paymentType2);
        paymentOption3.withdraw((-190.0d));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 100, (-122.0d), paymentType2);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) '4');
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) 0.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, (double) 10.0f, paymentType2);
        paymentOption3.deposit((double) 100.0f);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) 1L);
        paymentOption3.deposit((double) (short) -1);
        paymentOption3.deposit((double) 100);
        int int15 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (-109.0d), paymentType2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (-1.0d), paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), (double) 0L, paymentType2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) (short) 1);
        int int7 = paymentOption3.getUserId();
        paymentOption3.deposit((double) '#');
        double double10 = paymentOption3.getBalance();
        int int11 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 34.0d + "'", double10 == 34.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, (-11.0d), paymentType2);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw(0.0d);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        paymentOption3.deposit(20.0d);
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) (short) 10);
        double double7 = paymentOption3.getBalance();
        paymentOption3.deposit(52.0d);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        paymentOption3.deposit(20.0d);
        int int12 = paymentOption3.getUserId();
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.withdraw((double) ' ');
        paymentOption3.withdraw((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        int int9 = paymentOption3.getUserId();
        double double10 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        double double10 = paymentOption3.getBalance();
        paymentOption3.deposit((double) (short) 10);
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10L);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((-1.0d));
        double double10 = paymentOption3.getBalance();
        double double11 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-109.0d) + "'", double10 == (-109.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-109.0d) + "'", double11 == (-109.0d));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 10, (double) '#', paymentType2);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (byte) 10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) 100.0f);
        double double13 = paymentOption3.getBalance();
        objects.PaymentType paymentType14 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass15 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-190.0d) + "'", double13 == (-190.0d));
        org.junit.Assert.assertNull(paymentType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, (double) 10, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        double double9 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (-131.0d), paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) (-1.0f), paymentType2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        double double6 = paymentOption3.getBalance();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (byte) 0);
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        double double11 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertNull(paymentType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        paymentOption3.deposit((double) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(paymentType14);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        int int11 = paymentOption3.getUserId();
        paymentOption3.deposit((double) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.withdraw((double) (short) 0);
        double double15 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) ' ', paymentType2);
        double double4 = paymentOption3.getBalance();
        int int5 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass6 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        paymentOption3.withdraw((double) (byte) 0);
        int int10 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass11 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, (double) (byte) 0, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((-100.0d));
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        int int12 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        paymentOption3.deposit((double) (short) 10);
        int int15 = paymentOption3.getUserId();
        objects.PaymentType paymentType16 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass17 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(paymentType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.deposit((double) 0.0f);
        double double8 = paymentOption3.getBalance();
        double double9 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) 0);
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.withdraw(10.0d);
        double double8 = paymentOption3.getBalance();
        double double9 = paymentOption3.getBalance();
        paymentOption3.withdraw(0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-110.0d) + "'", double8 == (-110.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-110.0d) + "'", double9 == (-110.0d));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        paymentOption3.deposit(0.0d);
        double double12 = paymentOption3.getBalance();
        int int13 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        int int9 = paymentOption3.getUserId();
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.withdraw((double) ' ');
        java.lang.Class<?> wildcardClass17 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', (-11.0d), paymentType2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        paymentOption3.withdraw((double) (-1.0f));
        double double6 = paymentOption3.getBalance();
        int int7 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.0d + "'", double6 == 101.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1L));
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) ' ', paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.deposit((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw(88.0d);
        paymentOption3.withdraw((double) 1);
        paymentOption3.deposit((-11.0d));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, 20.0d, paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        int int7 = paymentOption3.getUserId();
        int int8 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        int int9 = paymentOption3.getUserId();
        paymentOption3.deposit((-109.0d));
        paymentOption3.withdraw((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 10);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        int int11 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertNull(paymentType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 10, (-183.0d), paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-183.0d) + "'", double4 == (-183.0d));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 1L, paymentType2);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.deposit(100.0d);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        int int9 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass10 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) 10, paymentType2);
        paymentOption3.withdraw((-190.0d));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, (double) (byte) 1, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        paymentOption3.deposit(34.0d);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        double double4 = paymentOption3.getBalance();
        int int5 = paymentOption3.getUserId();
        paymentOption3.withdraw(76.0d);
        paymentOption3.withdraw(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) (-1));
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 0);
        double double16 = paymentOption3.getBalance();
        int int17 = paymentOption3.getUserId();
        paymentOption3.deposit((-210.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 87.0d + "'", double16 == 87.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 10.0f);
        int int11 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (-1L));
        objects.PaymentType paymentType14 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(paymentType14);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, 10.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((-100.0d));
        int int11 = paymentOption3.getUserId();
        int int12 = paymentOption3.getUserId();
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, 1.0d, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 100, paymentType2);
        paymentOption3.deposit(100.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.deposit((-122.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        double double12 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) 52);
        java.lang.Class<?> wildcardClass15 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-131.0d) + "'", double12 == (-131.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        double double6 = paymentOption3.getBalance();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        int int8 = paymentOption3.getUserId();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        int int10 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '#', (double) 100, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((-100.0d));
        paymentOption3.withdraw((double) 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw(88.0d);
        paymentOption3.withdraw((double) 1);
        int int16 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        paymentOption3.deposit(20.0d);
        paymentOption3.deposit((double) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((-110.0d));
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        int int8 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        paymentOption3.withdraw(1.0d);
        double double6 = paymentOption3.getBalance();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        java.lang.Class<?> wildcardClass4 = paymentOption3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        paymentOption3.deposit((double) 10L);
        paymentOption3.deposit(20.0d);
        paymentOption3.withdraw(10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 100.0f, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        int int5 = paymentOption3.getUserId();
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(10, (double) '4', paymentType2);
        paymentOption3.withdraw((-10.0d));
        paymentOption3.deposit(100.0d);
        int int8 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 10, (-131.0d), paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        double double5 = paymentOption3.getBalance();
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-131.0d) + "'", double5 == (-131.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-131.0d) + "'", double6 == (-131.0d));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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
        java.lang.Class<?> wildcardClass15 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw((double) 10.0f);
        java.lang.Class<?> wildcardClass7 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, 10.0d, paymentType2);
        paymentOption3.deposit((double) (-1L));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        double double10 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        paymentOption3.deposit((double) (short) 10);
        int int15 = paymentOption3.getUserId();
        objects.PaymentType paymentType16 = paymentOption3.getPaymentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = paymentType16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(paymentType16);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        double double20 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(paymentType15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (-122.0d), paymentType2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 0L, paymentType2);
        int int4 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 10, (-131.0d), paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) (byte) 1);
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(35, 101.0d, paymentType2);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        double double9 = paymentOption3.getBalance();
        double double10 = paymentOption3.getBalance();
        paymentOption3.deposit((double) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        double double9 = paymentOption3.getBalance();
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        int int11 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass12 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 10);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        double double10 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((-110.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
        java.lang.Class<?> wildcardClass17 = paymentOption3.getClass();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        double double6 = paymentOption3.getBalance();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        int int8 = paymentOption3.getUserId();
        int int9 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) (short) 100);
        paymentOption3.deposit((double) (short) 10);
        int int15 = paymentOption3.getUserId();
        int int16 = paymentOption3.getUserId();
        paymentOption3.deposit((double) 100);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 10, (-131.0d), paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10);
        paymentOption3.deposit((-109.0d));
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, 0.0d, paymentType2);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) (byte) 0);
        int int12 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, 1.0d, paymentType2);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) (short) 0);
        int int11 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 100);
        paymentOption3.deposit((double) 0.0f);
        paymentOption3.deposit(184.0d);
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 0, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        paymentOption3.deposit(35.0d);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 1.0f, paymentType2);
        paymentOption3.withdraw(1.0d);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        double double7 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        double double10 = paymentOption3.getBalance();
        paymentOption3.deposit((double) (short) 10);
        paymentOption3.withdraw((double) 'a');
        paymentOption3.deposit((double) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 0, paymentType2);
        paymentOption3.deposit((double) (-1));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        double double15 = paymentOption3.getBalance();
        objects.PaymentType paymentType16 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(paymentType16);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 0L, paymentType2);
        double double4 = paymentOption3.getBalance();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10);
        int int8 = paymentOption3.getUserId();
        int int9 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10);
        int int8 = paymentOption3.getUserId();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 100, paymentType2);
        int int4 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 0L);
        paymentOption3.deposit((double) (-1));
        paymentOption3.withdraw((double) 1);
        double double16 = paymentOption3.getBalance();
        paymentOption3.deposit(100.0d);
        java.lang.Class<?> wildcardClass19 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 76.0d + "'", double16 == 76.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(97, (double) (byte) 10, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.deposit(10.0d);
        paymentOption3.deposit((-10.0d));
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 10, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (byte) -1);
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, 10.0d, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', (-10.0d), paymentType2);
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((-110.0d));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) 10.0f);
        int int11 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) ' ');
        double double12 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass13 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-122.0d) + "'", double12 == (-122.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (-1.0f));
        paymentOption3.withdraw((-131.0d));
        double double9 = paymentOption3.getBalance();
        double double10 = paymentOption3.getBalance();
        int int11 = paymentOption3.getUserId();
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 184.0d + "'", double9 == 184.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 184.0d + "'", double10 == 184.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(paymentType12);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 10, (-190.0d), paymentType2);
        double double4 = paymentOption3.getBalance();
        paymentOption3.withdraw(0.0d);
        objects.PaymentType paymentType7 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-190.0d) + "'", double4 == (-190.0d));
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', 20.0d, paymentType2);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, 0.0d, paymentType2);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (-207.0d), paymentType2);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 0, (double) (-1L), paymentType2);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        paymentOption3.withdraw((double) (short) 10);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw(88.0d);
        objects.PaymentType paymentType14 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType14);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(52, (-101.0d), paymentType2);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) ' ', (-100.0d), paymentType2);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) ' ', (double) (-1), paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 53.0d, paymentType2);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, 1.0d, paymentType2);
        paymentOption3.deposit((-31.0d));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        paymentOption3.deposit((double) (short) 100);
        int int8 = paymentOption3.getUserId();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        double double10 = paymentOption3.getBalance();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) -1, (double) 'a', paymentType2);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) -1, (double) (short) 10, paymentType2);
        paymentOption3.withdraw((-210.0d));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 100.0d, paymentType2);
        double double4 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        paymentOption3.deposit((double) (byte) 0);
        paymentOption3.deposit((double) (byte) 0);
        objects.PaymentType paymentType13 = paymentOption3.getPaymentType();
        paymentOption3.deposit((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        int int10 = paymentOption3.getUserId();
        objects.PaymentType paymentType11 = paymentOption3.getPaymentType();
        paymentOption3.withdraw((double) (byte) 1);
        int int14 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (-110.0d), paymentType2);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (-100.0d), paymentType2);
        paymentOption3.withdraw((-10.0d));
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        int int4 = paymentOption3.getUserId();
        objects.PaymentType paymentType5 = paymentOption3.getPaymentType();
        paymentOption3.deposit(100.0d);
        int int8 = paymentOption3.getUserId();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(paymentType5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType9);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) 10, paymentType2);
        paymentOption3.deposit((double) 100L);
        int int6 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        paymentOption3.deposit((double) 0.0f);
        int int8 = paymentOption3.getUserId();
        java.lang.Class<?> wildcardClass9 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) 'a', (double) 0.0f, paymentType2);
        paymentOption3.deposit((double) 1);
        paymentOption3.withdraw((double) (byte) 1);
        paymentOption3.withdraw((double) 100L);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        paymentOption3.withdraw(0.0d);
        paymentOption3.deposit((double) 10L);
        paymentOption3.withdraw((double) 100.0f);
        double double13 = paymentOption3.getBalance();
        int int14 = paymentOption3.getUserId();
        double double15 = paymentOption3.getBalance();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-190.0d) + "'", double13 == (-190.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-190.0d) + "'", double15 == (-190.0d));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) (-1));
        paymentOption3.withdraw((double) ' ');
        paymentOption3.withdraw(0.0d);
        paymentOption3.withdraw(0.0d);
        objects.PaymentType paymentType15 = paymentOption3.getPaymentType();
        java.lang.Class<?> wildcardClass16 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(paymentType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) '4', (double) 10, paymentType2);
        double double4 = paymentOption3.getBalance();
        java.lang.Class<?> wildcardClass5 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((-1), 0.0d, paymentType2);
        int int4 = paymentOption3.getUserId();
        int int5 = paymentOption3.getUserId();
        paymentOption3.deposit(101.0d);
        java.lang.Class<?> wildcardClass8 = paymentOption3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        paymentOption3.deposit(20.0d);
        objects.PaymentType paymentType12 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertNull(paymentType12);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(1, 0.0d, paymentType2);
        int int4 = paymentOption3.getUserId();
        double double5 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 1, (double) 0, paymentType2);
        paymentOption3.withdraw((double) (byte) 100);
        objects.PaymentType paymentType6 = paymentOption3.getPaymentType();
        int int7 = paymentOption3.getUserId();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        int int4 = paymentOption3.getUserId();
        double double5 = paymentOption3.getBalance();
        double double6 = paymentOption3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 0, (double) 'a', paymentType2);
        paymentOption3.withdraw((double) (byte) 10);
        paymentOption3.deposit((double) 1L);
        double double8 = paymentOption3.getBalance();
        int int9 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 88.0d + "'", double8 == 88.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(100, (-190.0d), paymentType2);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        double double7 = paymentOption3.getBalance();
        int int8 = paymentOption3.getUserId();
        objects.PaymentType paymentType9 = paymentOption3.getPaymentType();
        objects.PaymentType paymentType10 = paymentOption3.getPaymentType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) (-1), paymentType2);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 100, (double) 52, paymentType2);
        paymentOption3.withdraw((-122.0d));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, (double) 100.0f, paymentType2);
        int int4 = paymentOption3.getUserId();
        int int5 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (short) 1, 0.0d, paymentType2);
        paymentOption3.withdraw((double) (short) 0);
        int int6 = paymentOption3.getUserId();
        paymentOption3.withdraw((double) 10.0f);
        double double9 = paymentOption3.getBalance();
        int int10 = paymentOption3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption(0, (double) 10L, paymentType2);
        objects.PaymentType paymentType4 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType4);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        objects.PaymentType paymentType2 = null;
        objects.PaymentOption paymentOption3 = new objects.PaymentOption((int) (byte) 100, (double) '4', paymentType2);
        paymentOption3.deposit(0.0d);
        paymentOption3.deposit((double) 100L);
        objects.PaymentType paymentType8 = paymentOption3.getPaymentType();
        org.junit.Assert.assertNull(paymentType8);
    }
}

