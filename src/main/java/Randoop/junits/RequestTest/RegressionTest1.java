package Randoop.junits.RequestTest;

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
        int int14 = request3.getPriority();
        objects.Book book15 = request3.getBook();
        objects.Book book16 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        request3.setPriority((int) '#');
        java.lang.Class<?> wildcardClass17 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        java.lang.Class<?> wildcardClass20 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        boolean boolean9 = request3.isTeaching();
        request3.setPriority((int) (short) 1);
        int int12 = request3.getPriority();
        request3.setPriority((int) 'a');
        boolean boolean15 = request3.isTeaching();
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) (short) -1);
        int int10 = request3.getPriority();
        int int11 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (short) 0);
        request3.setPriority(1);
        boolean boolean13 = request3.isTeaching();
        objects.Book book14 = request3.getBook();
        objects.Book book15 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        boolean boolean16 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        java.lang.Class<?> wildcardClass16 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        boolean boolean8 = request3.isTeaching();
        request3.setPriority((int) (byte) 1);
        boolean boolean11 = request3.isTeaching();
        request3.setPriority((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        objects.Book book17 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        request3.setPriority(10);
        request3.setPriority(100);
        objects.Book book9 = request3.getBook();
        int int10 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        request3.setPriority((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        objects.Book book14 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) (short) -1);
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        objects.Book book12 = request3.getBook();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        request3.setPriority(52);
        request3.setPriority((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        boolean boolean4 = request3.isTeaching();
        int int5 = request3.getPriority();
        boolean boolean6 = request3.isTeaching();
        boolean boolean7 = request3.isTeaching();
        objects.Book book8 = request3.getBook();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        request3.setPriority((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = request3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        objects.Book book6 = request3.getBook();
        int int7 = request3.getPriority();
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        request3.setPriority((int) (byte) 10);
        int int6 = request3.getPriority();
        objects.Book book7 = request3.getBook();
        request3.setPriority(1);
        objects.Book book10 = request3.getBook();
        boolean boolean11 = request3.isTeaching();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        objects.Book book0 = null;
        objects.User user1 = null;
        objects.Request request3 = new objects.Request(book0, user1, false);
        int int4 = request3.getPriority();
        boolean boolean5 = request3.isTeaching();
        boolean boolean6 = request3.isTeaching();
        objects.Book book7 = request3.getBook();
        request3.setPriority((int) (short) -1);
        objects.Book book10 = request3.getBook();
        int int11 = request3.getPriority();
        int int12 = request3.getPriority();
        int int13 = request3.getPriority();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }
}

