package Randoop.junits.RequestTest;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = request3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        java.lang.Class<?> wildcardClass5 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = request3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority(1);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        java.lang.Class<?> wildcardClass7 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        java.lang.Class<?> wildcardClass5 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) 100);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        java.lang.Class<?> wildcardClass7 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        java.lang.Class<?> wildcardClass6 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        java.lang.Class<?> wildcardClass4 = request3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = book9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) 'a');
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        objects.Book book10 = request3.getBook();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        int int5 = request3.getPriority();
        java.lang.Class<?> wildcardClass6 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority((int) '#');
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        request3.setPriority((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        request3.setPriority((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        int int16 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        int int8 = request3.getPriority();
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        boolean boolean18 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        boolean boolean5 = request3.isTeaching();
        objects.Book book6 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority(10);
        request3.setPriority(52);
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        boolean boolean5 = request3.isTeaching();
        java.lang.Class<?> wildcardClass6 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        java.lang.Class<?> wildcardClass7 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        objects.Book book6 = request3.getBook();
        boolean boolean7 = request3.isTeaching();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = book7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        boolean boolean7 = request3.isTeaching();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        boolean boolean4 = request3.isTeaching();
        java.lang.Class<?> wildcardClass5 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        boolean boolean5 = request3.isTeaching();
        objects.Book book6 = request3.getBook();
        objects.Book book7 = request3.getBook();
        int int8 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        objects.Book book13 = request3.getBook();
        boolean boolean14 = request3.isTeaching();
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(10);
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority(10);
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (short) -1);
        request3.setPriority(10);
        request3.setPriority((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        boolean boolean16 = request3.isTeaching();
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        int int6 = request3.getPriority();
        request3.setPriority((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        request3.setPriority((int) ' ');
        int int15 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        request3.setPriority((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        objects.Book book10 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        request3.setPriority((int) '#');
        request3.setPriority(32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        boolean boolean7 = request3.isTeaching();
        boolean boolean8 = request3.isTeaching();
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        boolean boolean17 = request3.isTeaching();
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        int int9 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority(0);
        request3.setPriority((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book15 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        objects.Book book18 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        boolean boolean7 = request3.isTeaching();
        objects.Book book8 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        objects.Book book15 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        boolean boolean7 = request3.isTeaching();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority(1);
        objects.Book book13 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        request3.setPriority(100);
        int int11 = request3.getPriority();
        request3.setPriority((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        boolean boolean12 = request3.isTeaching();
        boolean boolean13 = request3.isTeaching();
        int int14 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        objects.Book book9 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        objects.Book book14 = request3.getBook();
        request3.setPriority(52);
        int int17 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        boolean boolean17 = request3.isTeaching();
        boolean boolean18 = request3.isTeaching();
        int int19 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        request3.setPriority((int) '#');
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        int int9 = request3.getPriority();
        request3.setPriority(0);
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) 'a');
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (short) -1);
        request3.setPriority(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        boolean boolean17 = request3.isTeaching();
        boolean boolean18 = request3.isTeaching();
        java.lang.Class<?> wildcardClass19 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        int int11 = request3.getPriority();
        objects.Book book12 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        objects.Book book10 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) (short) -1);
        boolean boolean10 = request3.isTeaching();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) '#');
        int int15 = request3.getPriority();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        int int9 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book12 = request3.getBook();
        request3.setPriority(52);
        request3.setPriority((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        boolean boolean13 = request3.isTeaching();
        request3.setPriority((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        int int9 = request3.getPriority();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        boolean boolean5 = request3.isTeaching();
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        boolean boolean12 = request3.isTeaching();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        request3.setPriority((int) (short) 0);
        int int19 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        boolean boolean12 = request3.isTeaching();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority(52);
        objects.Book book16 = request3.getBook();
        objects.Book book17 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        request3.setPriority(100);
        int int11 = request3.getPriority();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book16 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        boolean boolean13 = request3.isTeaching();
        request3.setPriority(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        objects.Book book14 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        boolean boolean13 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        objects.Book book14 = request3.getBook();
        request3.setPriority(52);
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        int int16 = request3.getPriority();
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        int int16 = request3.getPriority();
        int int17 = request3.getPriority();
        int int18 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        request3.setPriority(32);
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        int int9 = request3.getPriority();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        int int14 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        objects.Book book13 = request3.getBook();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        int int16 = request3.getPriority();
        int int17 = request3.getPriority();
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) '#');
        int int15 = request3.getPriority();
        request3.setPriority(100);
        boolean boolean18 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        boolean boolean12 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority(52);
        int int11 = request3.getPriority();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (short) 100);
        objects.Book book11 = request3.getBook();
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        request3.setPriority((int) (byte) 1);
        objects.Book book12 = request3.getBook();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority(0);
        boolean boolean13 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        objects.Book book13 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        request3.setPriority((int) '#');
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        request3.setPriority((int) (short) 1);
        int int11 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        request3.setPriority(0);
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        int int6 = request3.getPriority();
        java.lang.Class<?> wildcardClass7 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        objects.Book book15 = request3.getBook();
        objects.Book book16 = request3.getBook();
        int int17 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        boolean boolean16 = request3.isTeaching();
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        objects.Book book17 = request3.getBook();
        boolean boolean18 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        request3.setPriority((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        request3.setPriority((int) (byte) -1);
        boolean boolean13 = request3.isTeaching();
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        int int9 = request3.getPriority();
        request3.setPriority(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        request3.setPriority(52);
        boolean boolean9 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (byte) 10);
        request3.setPriority(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        request3.setPriority(35);
        int int18 = request3.getPriority();
        request3.setPriority(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(52);
        objects.Book book10 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        request3.setPriority(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        request3.setPriority((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        request3.setPriority((int) ' ');
        int int14 = request3.getPriority();
        boolean boolean15 = request3.isTeaching();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) '#');
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        request3.setPriority((int) ' ');
        request3.setPriority((-1));
        request3.setPriority((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        request3.setPriority(0);
        request3.setPriority(32);
        int int16 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        objects.Book book13 = request3.getBook();
        objects.Book book14 = request3.getBook();
        boolean boolean15 = request3.isTeaching();
        int int16 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        int int9 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book12 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        boolean boolean15 = request3.isTeaching();
        int int16 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        int int7 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book10 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        boolean boolean17 = request3.isTeaching();
        boolean boolean18 = request3.isTeaching();
        boolean boolean19 = request3.isTeaching();
        boolean boolean20 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        request3.setPriority(10);
        boolean boolean13 = request3.isTeaching();
        request3.setPriority((int) ' ');
        boolean boolean16 = request3.isTeaching();
        objects.Book book17 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        int int5 = request3.getPriority();
        objects.Book book6 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        int int8 = request3.getPriority();
        int int9 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        request3.setPriority(35);
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) ' ');
        request3.setPriority((int) '4');
        request3.setPriority((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        request3.setPriority(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        objects.Book book4 = request3.getBook();
        request3.setPriority((-1));
        int int7 = request3.getPriority();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        objects.Book book15 = request3.getBook();
        int int16 = request3.getPriority();
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (short) -1);
        request3.setPriority(10);
        int int15 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        boolean boolean7 = request3.isTeaching();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        request3.setPriority((int) '#');
        objects.Book book11 = request3.getBook();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        request3.setPriority((int) ' ');
        request3.setPriority((-1));
        objects.Book book17 = request3.getBook();
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) 'a');
        boolean boolean13 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        int int14 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        objects.Book book17 = request3.getBook();
        int int18 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        objects.Book book17 = request3.getBook();
        boolean boolean18 = request3.isTeaching();
        java.lang.Class<?> wildcardClass19 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        boolean boolean16 = request3.isTeaching();
        request3.setPriority((int) (byte) -1);
        boolean boolean19 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) '#');
        int int15 = request3.getPriority();
        boolean boolean16 = request3.isTeaching();
        int int17 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        request3.setPriority((int) ' ');
        boolean boolean15 = request3.isTeaching();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) 'a');
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (byte) 0);
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        boolean boolean17 = request3.isTeaching();
        boolean boolean18 = request3.isTeaching();
        boolean boolean19 = request3.isTeaching();
        int int20 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        java.lang.Class<?> wildcardClass6 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(52);
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        request3.setPriority((int) '#');
        boolean boolean15 = request3.isTeaching();
        objects.Book book16 = request3.getBook();
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        boolean boolean4 = request3.isTeaching();
        request3.setPriority(10);
        java.lang.Class<?> wildcardClass7 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        request3.setPriority((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority((int) (byte) 10);
        int int16 = request3.getPriority();
        int int17 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority(52);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        int int14 = request3.getPriority();
        boolean boolean15 = request3.isTeaching();
        int int16 = request3.getPriority();
        request3.setPriority((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        objects.Book book14 = request3.getBook();
        objects.Book book15 = request3.getBook();
        int int16 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(10);
        int int17 = request3.getPriority();
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        request3.setPriority(35);
        int int18 = request3.getPriority();
        boolean boolean19 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        request3.setPriority((int) '4');
        int int14 = request3.getPriority();
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (byte) 10);
        objects.Book book13 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        java.lang.Class<?> wildcardClass7 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        boolean boolean12 = request3.isTeaching();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        boolean boolean16 = request3.isTeaching();
        boolean boolean17 = request3.isTeaching();
        objects.Book book18 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        boolean boolean13 = request3.isTeaching();
        request3.setPriority((int) (short) -1);
        request3.setPriority((int) (short) -1);
        int int18 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        int int13 = request3.getPriority();
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority(97);
        objects.Book book9 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        int int7 = request3.getPriority();
        objects.Book book8 = request3.getBook();
        int int9 = request3.getPriority();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        boolean boolean7 = request3.isTeaching();
        boolean boolean8 = request3.isTeaching();
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        boolean boolean9 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        boolean boolean12 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 10);
        int int13 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        objects.Book book14 = request3.getBook();
        objects.Book book15 = request3.getBook();
        request3.setPriority((int) (byte) 0);
        objects.Book book18 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        int int7 = request3.getPriority();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        boolean boolean12 = request3.isTeaching();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        int int8 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        request3.setPriority((int) (byte) -1);
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) (short) -1);
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        objects.Book book11 = request3.getBook();
        boolean boolean12 = request3.isTeaching();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(100);
        boolean boolean17 = request3.isTeaching();
        objects.Book book18 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        objects.Book book13 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (byte) 0);
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        request3.setPriority((int) '4');
        boolean boolean15 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (short) -1);
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (byte) 10);
        boolean boolean18 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) ' ');
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        int int5 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        request3.setPriority(0);
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        int int7 = request3.getPriority();
        boolean boolean8 = request3.isTeaching();
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        objects.Book book5 = request3.getBook();
        boolean boolean6 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        request3.setPriority((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        objects.Book book17 = request3.getBook();
        int int18 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 10);
        request3.setPriority(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) '#');
        boolean boolean15 = request3.isTeaching();
        objects.Book book16 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        boolean boolean11 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        boolean boolean12 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        request3.setPriority(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) (short) -1);
        objects.Book book10 = request3.getBook();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        request3.setPriority((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        request3.setPriority((int) ' ');
        int int14 = request3.getPriority();
        boolean boolean15 = request3.isTeaching();
        request3.setPriority(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        boolean boolean4 = request3.isTeaching();
        request3.setPriority((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        int int8 = request3.getPriority();
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        request3.setPriority((-1));
        request3.setPriority((int) (short) 1);
        int int14 = request3.getPriority();
        int int15 = request3.getPriority();
        objects.Book book16 = request3.getBook();
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority(0);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        request3.setPriority((int) ' ');
        int int14 = request3.getPriority();
        boolean boolean15 = request3.isTeaching();
        objects.Book book16 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        request3.setPriority((int) '#');
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        request3.setPriority(10);
        boolean boolean13 = request3.isTeaching();
        request3.setPriority((int) ' ');
        boolean boolean16 = request3.isTeaching();
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        objects.Book book17 = request3.getBook();
        objects.Book book18 = request3.getBook();
        request3.setPriority(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        objects.Book book13 = request3.getBook();
        int int14 = request3.getPriority();
        objects.Book book15 = request3.getBook();
        objects.Book book16 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        objects.Book book6 = request3.getBook();
        request3.setPriority(10);
        request3.setPriority((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        objects.Book book14 = request3.getBook();
        boolean boolean15 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        objects.Book book18 = request3.getBook();
        objects.Book book19 = request3.getBook();
        objects.Book book20 = request3.getBook();
        request3.setPriority((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) 'a');
        request3.setPriority((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) 'a');
        boolean boolean12 = request3.isTeaching();
        boolean boolean13 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        objects.Book book13 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        boolean boolean7 = request3.isTeaching();
        boolean boolean8 = request3.isTeaching();
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        request3.setPriority((int) '#');
        int int16 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        boolean boolean5 = request3.isTeaching();
        objects.Book book6 = request3.getBook();
        int int7 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        objects.Book book18 = request3.getBook();
        objects.Book book19 = request3.getBook();
        int int20 = request3.getPriority();
        boolean boolean21 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        request3.setPriority(0);
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        objects.Book book16 = request3.getBook();
        objects.Book book17 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        objects.Book book11 = request3.getBook();
        request3.setPriority(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        int int8 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        int int14 = request3.getPriority();
        objects.Book book15 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = book15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        request3.setPriority(32);
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        request3.setPriority((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority(10);
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (byte) 1);
        request3.setPriority((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        request3.setPriority(0);
        int int14 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority(10);
        request3.setPriority(52);
        boolean boolean8 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        request3.setPriority(32);
        request3.setPriority(97);
        boolean boolean16 = request3.isTeaching();
        int int17 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        int int10 = request3.getPriority();
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority(1);
        objects.Book book13 = request3.getBook();
        int int14 = request3.getPriority();
        request3.setPriority(10);
        objects.Book book17 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(1);
        int int9 = request3.getPriority();
        request3.setPriority(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        objects.Book book17 = request3.getBook();
        objects.Book book18 = request3.getBook();
        boolean boolean19 = request3.isTeaching();
        request3.setPriority((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        int int9 = request3.getPriority();
        request3.setPriority((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        int int9 = request3.getPriority();
        request3.setPriority(52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        objects.Book book11 = request3.getBook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        objects.Book book13 = request3.getBook();
        request3.setPriority(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        int int7 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 0);
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) '#');
        int int15 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        request3.setPriority((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (byte) 10);
        request3.setPriority(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) 'a');
        objects.Book book12 = request3.getBook();
        boolean boolean13 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority((int) '#');
        request3.setPriority((-1));
        java.lang.Class<?> wildcardClass15 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        request3.setPriority(32);
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority(1);
        objects.Book book13 = request3.getBook();
        int int14 = request3.getPriority();
        request3.setPriority(10);
        int int17 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        objects.Book book15 = request3.getBook();
        int int16 = request3.getPriority();
        objects.Book book17 = request3.getBook();
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        request3.setPriority(52);
        boolean boolean17 = request3.isTeaching();
        int int18 = request3.getPriority();
        java.lang.Class<?> wildcardClass19 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        int int5 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        int int8 = request3.getPriority();
        int int9 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        boolean boolean8 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        boolean boolean16 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) 'a');
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        objects.Book book13 = request3.getBook();
        objects.Book book14 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        request3.setPriority((-1));
        request3.setPriority((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (short) -1);
        objects.Book book13 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        boolean boolean12 = request3.isTeaching();
        request3.setPriority(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        objects.Book book13 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(10);
        request3.setPriority((int) 'a');
        boolean boolean19 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        objects.Book book11 = request3.getBook();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        int int6 = request3.getPriority();
        boolean boolean7 = request3.isTeaching();
        request3.setPriority((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        int int13 = request3.getPriority();
        request3.setPriority(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        int int7 = request3.getPriority();
        boolean boolean8 = request3.isTeaching();
        objects.Book book9 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority(10);
        objects.Book book6 = request3.getBook();
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        request3.setPriority((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        boolean boolean9 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        objects.Book book14 = request3.getBook();
        request3.setPriority(52);
        request3.setPriority((int) ' ');
        objects.Book book19 = request3.getBook();
        request3.setPriority((-1));
        java.lang.Class<?> wildcardClass22 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (short) -1);
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        int int15 = request3.getPriority();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        objects.Book book13 = request3.getBook();
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        objects.Book book4 = request3.getBook();
        request3.setPriority((-1));
        objects.Book book7 = request3.getBook();
        int int8 = request3.getPriority();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        objects.Book book11 = request3.getBook();
        int int12 = request3.getPriority();
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        request3.setPriority((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        request3.setPriority(32);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        request3.setPriority(10);
        request3.setPriority((-1));
        objects.Book book19 = request3.getBook();
        int int20 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (byte) 0);
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority(1);
        objects.Book book13 = request3.getBook();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        request3.setPriority((int) (byte) 100);
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority(52);
        objects.Book book16 = request3.getBook();
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        int int7 = request3.getPriority();
        objects.Book book8 = request3.getBook();
        request3.setPriority((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        objects.Book book6 = request3.getBook();
        request3.setPriority(10);
        request3.setPriority((int) (short) 100);
        request3.setPriority((int) (byte) 10);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        objects.Book book13 = request3.getBook();
        objects.Book book14 = request3.getBook();
        boolean boolean15 = request3.isTeaching();
        objects.Book book16 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        objects.Book book14 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (byte) 0);
        int int11 = request3.getPriority();
        request3.setPriority(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        int int8 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (byte) 0);
        int int11 = request3.getPriority();
        objects.Book book12 = request3.getBook();
        boolean boolean13 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        request3.setPriority((int) (byte) 1);
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        boolean boolean5 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        request3.setPriority((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        boolean boolean15 = request3.isTeaching();
        request3.setPriority((int) '4');
        int int18 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        boolean boolean13 = request3.isTeaching();
        int int14 = request3.getPriority();
        objects.Book book15 = request3.getBook();
        objects.Book book16 = request3.getBook();
        request3.setPriority((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        request3.setPriority((int) (byte) 100);
        int int13 = request3.getPriority();
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        request3.setPriority(100);
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        request3.setPriority((int) ' ');
        int int14 = request3.getPriority();
        boolean boolean15 = request3.isTeaching();
        int int16 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        objects.Book book17 = request3.getBook();
        objects.Book book18 = request3.getBook();
        boolean boolean19 = request3.isTeaching();
        boolean boolean20 = request3.isTeaching();
        objects.Book book21 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        request3.setPriority((-1));
        request3.setPriority((int) (short) 1);
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        request3.setPriority(100);
        int int9 = request3.getPriority();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        int int8 = request3.getPriority();
        boolean boolean9 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority(1);
        objects.Book book13 = request3.getBook();
        objects.Book book14 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        int int13 = request3.getPriority();
        int int14 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority((int) '#');
        request3.setPriority((-1));
        objects.Book book15 = request3.getBook();
        objects.Book book16 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        request3.setPriority(52);
        request3.setPriority((int) (byte) 10);
        int int19 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        request3.setPriority(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        boolean boolean16 = request3.isTeaching();
        boolean boolean17 = request3.isTeaching();
        objects.Book book18 = request3.getBook();
        int int19 = request3.getPriority();
        boolean boolean20 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        request3.setPriority((-1));
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        request3.setPriority((int) 'a');
        int int16 = request3.getPriority();
        boolean boolean17 = request3.isTeaching();
        boolean boolean18 = request3.isTeaching();
        java.lang.Class<?> wildcardClass19 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        objects.Book book13 = request3.getBook();
        int int14 = request3.getPriority();
        boolean boolean15 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority((int) '#');
        request3.setPriority((-1));
        request3.setPriority((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        request3.setPriority((int) ' ');
        int int14 = request3.getPriority();
        boolean boolean15 = request3.isTeaching();
        request3.setPriority((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        objects.Book book6 = request3.getBook();
        request3.setPriority((int) 'a');
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (short) 100);
        int int11 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        boolean boolean13 = request3.isTeaching();
        request3.setPriority((-1));
        boolean boolean16 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority(52);
        objects.Book book16 = request3.getBook();
        int int17 = request3.getPriority();
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        int int11 = request3.getPriority();
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        boolean boolean16 = request3.isTeaching();
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority(10);
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        request3.setPriority(52);
        int int9 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        objects.Book book17 = request3.getBook();
        objects.Book book18 = request3.getBook();
        int int19 = request3.getPriority();
        java.lang.Class<?> wildcardClass20 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        objects.Book book18 = request3.getBook();
        objects.Book book19 = request3.getBook();
        request3.setPriority(0);
        boolean boolean22 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        objects.Book book13 = request3.getBook();
        request3.setPriority(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        request3.setPriority((-1));
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        boolean boolean5 = request3.isTeaching();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (short) 100);
        objects.Book book11 = request3.getBook();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        request3.setPriority(32);
        java.lang.Class<?> wildcardClass14 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        int int9 = request3.getPriority();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        boolean boolean7 = request3.isTeaching();
        boolean boolean8 = request3.isTeaching();
        objects.Book book9 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = book9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        objects.Book book18 = request3.getBook();
        objects.Book book19 = request3.getBook();
        int int20 = request3.getPriority();
        boolean boolean21 = request3.isTeaching();
        objects.Book book22 = request3.getBook();
        request3.setPriority((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(52);
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        boolean boolean16 = request3.isTeaching();
        boolean boolean17 = request3.isTeaching();
        objects.Book book18 = request3.getBook();
        request3.setPriority((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority((int) (short) 100);
        boolean boolean16 = request3.isTeaching();
        int int17 = request3.getPriority();
        int int18 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        int int11 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        objects.Book book15 = request3.getBook();
        objects.Book book16 = request3.getBook();
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        int int7 = request3.getPriority();
        objects.Book book8 = request3.getBook();
        int int9 = request3.getPriority();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        request3.setPriority((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        int int7 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 0);
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        int int9 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book12 = request3.getBook();
        objects.Book book13 = request3.getBook();
        objects.Book book14 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        int int13 = request3.getPriority();
        int int14 = request3.getPriority();
        objects.Book book15 = request3.getBook();
        request3.setPriority((int) ' ');
        request3.setPriority((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        objects.Book book14 = request3.getBook();
        objects.Book book15 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        java.lang.Class<?> wildcardClass7 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        objects.Book book13 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        request3.setPriority(10);
        boolean boolean17 = request3.isTeaching();
        java.lang.Class<?> wildcardClass18 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        int int6 = request3.getPriority();
        boolean boolean7 = request3.isTeaching();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (byte) 1);
        request3.setPriority((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) (byte) 1);
        request3.setPriority((int) ' ');
        int int14 = request3.getPriority();
        int int15 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        request3.setPriority(0);
        request3.setPriority(100);
        int int16 = request3.getPriority();
        objects.Book book17 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(0);
        int int7 = request3.getPriority();
        objects.Book book8 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        objects.Book book13 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        request3.setPriority(35);
        objects.Book book11 = request3.getBook();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        objects.Book book11 = request3.getBook();
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        boolean boolean5 = request3.isTeaching();
        int int6 = request3.getPriority();
        request3.setPriority((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = request3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        java.lang.Class<?> wildcardClass10 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        boolean boolean9 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        request3.setPriority((int) (short) 0);
        request3.setPriority(100);
        int int17 = request3.getPriority();
        objects.Book book18 = request3.getBook();
        objects.Book book19 = request3.getBook();
        int int20 = request3.getPriority();
        boolean boolean21 = request3.isTeaching();
        objects.Book book22 = request3.getBook();
        request3.setPriority(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        int int10 = request3.getPriority();
        objects.Book book11 = request3.getBook();
        request3.setPriority(32);
        boolean boolean14 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        int int8 = request3.getPriority();
        objects.Book book9 = request3.getBook();
        request3.setPriority((int) 'a');
        int int12 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        boolean boolean6 = request3.isTeaching();
        request3.setPriority((int) (byte) 100);
        objects.Book book9 = request3.getBook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        request3.setPriority((int) (byte) 100);
        request3.setPriority((int) (byte) -1);
        objects.Book book13 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        request3.setPriority(0);
        request3.setPriority(100);
        boolean boolean16 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        request3.setPriority(32);
        request3.setPriority(100);
        objects.Book book14 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        request3.setPriority((int) '#');
        objects.Book book9 = request3.getBook();
        boolean boolean10 = request3.isTeaching();
        boolean boolean11 = request3.isTeaching();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        boolean boolean10 = request3.isTeaching();
        request3.setPriority((int) (byte) -1);
        objects.Book book13 = request3.getBook();
        boolean boolean14 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        request3.setPriority((int) '#');
        objects.Book book16 = request3.getBook();
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        request3.setPriority((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        request3.setPriority((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        objects.Book book10 = request3.getBook();
        request3.setPriority(10);
        request3.setPriority((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) '#');
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        request3.setPriority((int) (byte) 0);
        boolean boolean11 = request3.isTeaching();
        request3.setPriority(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        request3.setPriority((int) (short) 1);
        request3.setPriority((int) (byte) 1);
        objects.Book book13 = request3.getBook();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        int int17 = request3.getPriority();
        boolean boolean18 = request3.isTeaching();
        request3.setPriority(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        int int9 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book12 = request3.getBook();
        request3.setPriority(52);
        int int15 = request3.getPriority();
        request3.setPriority(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, true);
        request3.setPriority((int) (byte) -1);
        int int6 = request3.getPriority();
        boolean boolean7 = request3.isTeaching();
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        request3.setPriority((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        int int7 = request3.getPriority();
        int int8 = request3.getPriority();
        request3.setPriority((int) '#');
        java.lang.Class<?> wildcardClass11 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        int int11 = request3.getPriority();
        objects.Book book12 = request3.getBook();
        request3.setPriority((int) ' ');
        request3.setPriority((int) (short) -1);
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        boolean boolean16 = request3.isTeaching();
        boolean boolean17 = request3.isTeaching();
        objects.Book book18 = request3.getBook();
        request3.setPriority(35);
        boolean boolean21 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(10);
        int int17 = request3.getPriority();
        boolean boolean18 = request3.isTeaching();
        java.lang.Class<?> wildcardClass19 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        request3.setPriority((int) (byte) 1);
        boolean boolean12 = request3.isTeaching();
        request3.setPriority((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        objects.Book book6 = request3.getBook();
        objects.Book book7 = request3.getBook();
        objects.Book book8 = request3.getBook();
        boolean boolean9 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) '4');
        objects.Book book9 = request3.getBook();
        request3.setPriority((-1));
        boolean boolean12 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        java.lang.Class<?> wildcardClass12 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority((int) '#');
        request3.setPriority((-1));
        objects.Book book15 = request3.getBook();
        boolean boolean16 = request3.isTeaching();
        boolean boolean17 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        objects.Book book5 = request3.getBook();
        objects.Book book6 = request3.getBook();
        int int7 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        boolean boolean10 = request3.isTeaching();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        request3.setPriority((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        int int8 = request3.getPriority();
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        request3.setPriority(10);
        boolean boolean17 = request3.isTeaching();
        boolean boolean18 = request3.isTeaching();
        java.lang.Class<?> wildcardClass19 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        int int12 = request3.getPriority();
        boolean boolean13 = request3.isTeaching();
        boolean boolean14 = request3.isTeaching();
        request3.setPriority(0);
        objects.Book book17 = request3.getBook();
        objects.Book book18 = request3.getBook();
        int int19 = request3.getPriority();
        boolean boolean20 = request3.isTeaching();
        objects.Book book21 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = book21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority(0);
        int int9 = request3.getPriority();
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        boolean boolean12 = request3.isTeaching();
        objects.Book book13 = request3.getBook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        request3.setPriority((int) (byte) -1);
        boolean boolean9 = request3.isTeaching();
        int int10 = request3.getPriority();
        boolean boolean11 = request3.isTeaching();
        boolean boolean12 = request3.isTeaching();
        int int13 = request3.getPriority();
        boolean boolean14 = request3.isTeaching();
        boolean boolean15 = request3.isTeaching();
        boolean boolean16 = request3.isTeaching();
        boolean boolean17 = request3.isTeaching();
        request3.setPriority(10);
        objects.Book book20 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(book20);
    }
}

