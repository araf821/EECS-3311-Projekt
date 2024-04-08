package Randoop.junits.NotificationTest;

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
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (-1), "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:04 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:04 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:04 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:05 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:06 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:06 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:06 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:06 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:07 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:07 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:07 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:07 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:07 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:07 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (-1), "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:08 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:08 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:08 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:08 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:08 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) -1, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        java.lang.Class<?> wildcardClass12 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:09 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:10 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:10 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:10 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (-1), "", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:10 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:10 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:11 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:11 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:11 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:11 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) '#', "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:11 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 1, "", localDate3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) ' ', "hi!", localDate3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:11 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) '#', "", localDate3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) '4', "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', 0, "hi!", localDate3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:12 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) ' ', "hi!", localDate3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) '#', "hi!", localDate3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, (int) (byte) 100, "", localDate3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 35, "hi!", localDate3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) ' ', "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        java.lang.Class<?> wildcardClass11 = date10.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) '4', "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        int int13 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:13 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 52, "", localDate3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, 35, "hi!", localDate3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:14 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 0, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) (short) 0, "", localDate3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = date7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:14 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (short) 100, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, 10, "", localDate3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:14 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:14 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (byte) -1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:14 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:14 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:14 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, 97, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:14 EDT 2024");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        int int10 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (-1), "", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', 1, "hi!", localDate3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = date7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, 97, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, 97, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:15 EDT 2024");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) '4', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) '4', "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getUserID();
        int int12 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass13 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) (short) 1, "", localDate3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, (int) (byte) -1, "", localDate3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:15 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) '4', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:15 EDT 2024");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '#', (int) (byte) -1, "", localDate3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:16 EDT 2024");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        java.util.Date date13 = notification4.getDate();
        java.lang.Class<?> wildcardClass14 = date13.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) '4', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) ' ', "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', 100, "", localDate3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 0, "", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:16 EDT 2024");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 0, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:16 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:16 EDT 2024");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getUserID();
        int int13 = notification4.getNotificationID();
        int int14 = notification4.getNotificationID();
        int int15 = notification4.getNotificationID();
        java.util.Date date16 = notification4.getDate();
        java.lang.Class<?> wildcardClass17 = date16.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getUserID();
        int int13 = notification4.getNotificationID();
        int int14 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass15 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 100, "hi!", localDate3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:17 EDT 2024");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, 35, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:17 EDT 2024");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:17 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '#', 97, "", localDate3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, (int) (byte) 0, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (byte) -1, "", localDate3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) (byte) 10, "", localDate3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        int int10 = notification4.getNotificationID();
        int int11 = notification4.getUserID();
        int int12 = notification4.getNotificationID();
        int int13 = notification4.getUserID();
        java.util.Date date14 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 08 12:53:18 EDT 2024");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (short) 100, "hi!", localDate3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, (int) (short) 0, "hi!", localDate3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        int int11 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, (int) (short) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 0, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        int int10 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 32, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) '4', "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getUserID();
        int int12 = notification4.getNotificationID();
        int int13 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:18 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) '4', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, 35, "", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getUserID();
        java.util.Date date12 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Apr 08 12:53:19 EDT 2024");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (short) 100, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (short) 0, "hi!", localDate3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (-1), "", localDate3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) 100, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getUserID();
        java.lang.Class<?> wildcardClass12 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', 100, "hi!", localDate3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:19 EDT 2024");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '#', (int) '#', "hi!", localDate3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 10, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, 0, "", localDate3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 10, "", localDate3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:19 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:20 EDT 2024");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, 52, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) 0, "", localDate3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:20 EDT 2024");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (short) 100, "", localDate3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (-1), "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:20 EDT 2024");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) 'a', "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), 32, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 0, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        int int10 = notification4.getNotificationID();
        int int11 = notification4.getUserID();
        int int12 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getUserID();
        int int12 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:20 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) -1, "hi!", localDate3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) -1, "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) (byte) 0, "", localDate3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, 1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) ' ', "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 35, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:21 EDT 2024");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:21 EDT 2024");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (-1), "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) -1, "", localDate3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (byte) -1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 10, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) -1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        int int11 = notification4.getUserID();
        java.util.Date date12 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Apr 08 12:53:21 EDT 2024");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, (int) (short) 1, "hi!", localDate3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:21 EDT 2024");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '#', (int) ' ', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, 0, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:21 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) ' ', "", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:22 EDT 2024");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 32, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, (-1), "", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 32, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        int int11 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        java.util.Date date13 = notification4.getDate();
        int int14 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (short) 1, "", localDate3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', 32, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (byte) 100, "", localDate3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 0, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        java.util.Date date13 = notification4.getDate();
        java.lang.Class<?> wildcardClass14 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) 1, "", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (byte) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) -1, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, 100, "", localDate3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getUserID();
        java.util.Date date12 = notification4.getDate();
        int int13 = notification4.getNotificationID();
        int int14 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        int int10 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:22 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', 0, "", localDate3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 100, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) (short) 1, "", localDate3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) (byte) 0, "", localDate3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 35, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) ' ', "", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:23 EDT 2024");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        int int11 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) (byte) 1, "", localDate3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (byte) 1, "", localDate3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, 10, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:23 EDT 2024");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, 1, "", localDate3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, 10, "hi!", localDate3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) ' ', "", localDate3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '#', (int) '4', "", localDate3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 0, "", localDate3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 0, "hi!", localDate3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) (short) 100, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, (int) ' ', "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (short) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (short) 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:23 EDT 2024");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, (-1), "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:23 EDT 2024");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) ' ', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, 35, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getUserID();
        int int13 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass14 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:23 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) '4', "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:23 EDT 2024");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        java.util.Date date13 = notification4.getDate();
        int int14 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 100, "hi!", localDate3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, 35, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:24 EDT 2024");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), 35, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        java.util.Date date11 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:24 EDT 2024");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, 32, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, 35, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (short) 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, (int) '4', "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) 'a', "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        int int11 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 10, "", localDate3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getUserID();
        int int12 = notification4.getUserID();
        int int13 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, (int) (short) 10, "", localDate3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) '4', "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), 52, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) (byte) -1, "", localDate3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass13 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:24 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (byte) -1, "hi!", localDate3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, 10, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        java.lang.Class<?> wildcardClass11 = date10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, 10, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) '4', "", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        int int10 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) (short) 0, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 35, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = date7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, (-1), "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (short) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = date7.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (short) 1, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) 100, "hi!", localDate3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, (int) (byte) -1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (short) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:25 EDT 2024");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (short) -1, "hi!", localDate3);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getUserID();
        int int13 = notification4.getNotificationID();
        int int14 = notification4.getNotificationID();
        int int15 = notification4.getNotificationID();
        int int16 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getUserID();
        int int13 = notification4.getNotificationID();
        int int14 = notification4.getNotificationID();
        java.util.Date date15 = notification4.getDate();
        int int16 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, 52, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, 32, "", localDate3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, 10, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        int int9 = notification4.getUserID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 35, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:25 EDT 2024");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) (short) 100, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:25 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) 0, "hi!", localDate3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, 100, "hi!", localDate3);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        int int10 = notification4.getNotificationID();
        java.util.Date date11 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', 32, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (-1), "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) '4', "", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, 52, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) ' ', "", localDate3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, 0, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getUserID();
        int int13 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '4', "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) (short) 100, "", localDate3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, (-1), "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) '4', "hi!", localDate3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getUserID();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) 'a', "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:26 EDT 2024");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 97, "hi!", localDate3);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:26 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) (byte) 100, "hi!", localDate3);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (short) 100, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) ' ', "", localDate3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, 10, "hi!", localDate3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, 1, "", localDate3);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:27 EDT 2024");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        int int13 = notification4.getNotificationID();
        int int14 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:27 EDT 2024");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 0, "", localDate3);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', 10, "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) ' ', "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, (int) (byte) 0, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, (int) (short) 1, "", localDate3);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, 97, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (byte) 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 100, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, (int) '#', "", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (byte) -1, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) -1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 0, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) 100, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, 10, "hi!", localDate3);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) (byte) 0, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) '4', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:27 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, 100, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:27 EDT 2024");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        java.lang.Class<?> wildcardClass13 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getUserID();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '#', (-1), "hi!", localDate3);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, 0, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) (short) 0, "hi!", localDate3);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        int int13 = notification4.getNotificationID();
        java.util.Date date14 = notification4.getDate();
        java.util.Date date15 = notification4.getDate();
        int int16 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) -1, "", localDate3);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 0, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) (short) 0, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        java.util.Date date11 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) 'a', "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) (byte) -1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) ' ', "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, 32, "hi!", localDate3);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, 35, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) ' ', "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', 10, "hi!", localDate3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (byte) 0, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 0, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, 0, "", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (byte) 10, "hi!", localDate3);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        java.util.Date date11 = notification4.getDate();
        int int12 = notification4.getUserID();
        java.util.Date date13 = notification4.getDate();
        int int14 = notification4.getNotificationID();
        java.util.Date date15 = notification4.getDate();
        java.lang.Class<?> wildcardClass16 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, (int) '4', "", localDate3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) '4', "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:28 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, 1, "", localDate3);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) '4', "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, 32, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', 32, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, 10, "", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) (byte) 0, "", localDate3);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) '4', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) ' ', "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        int int10 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, (int) (byte) 100, "hi!", localDate3);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) 10, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (short) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        int int10 = notification4.getNotificationID();
        int int11 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        int int12 = notification4.getUserID();
        java.util.Date date13 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 08 12:53:29 EDT 2024");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, 35, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), 52, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), 32, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, (int) '4', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        int int10 = notification4.getUserID();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:29 EDT 2024");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.lang.Class<?> wildcardClass10 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 10, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        java.util.Date date11 = notification4.getDate();
        java.util.Date date12 = notification4.getDate();
        java.util.Date date13 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 08 12:53:29 EDT 2024");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getNotificationID();
        int int11 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, (-1), "", localDate3);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (short) 100, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, 52, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) '#', "", localDate3);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (-1), "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:29 EDT 2024");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (short) 1, "hi!", localDate3);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, 10, "", localDate3);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', 10, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (byte) 0, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', 1, "", localDate3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:29 EDT 2024");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 0, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, 35, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = date7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) 'a', "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        int int10 = notification4.getNotificationID();
        int int11 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:29 EDT 2024");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 32, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(52, (int) (short) 0, "hi!", localDate3);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) (short) 10, "", localDate3);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        int int10 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass11 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, (int) (byte) 10, "hi!", localDate3);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (-1), "hi!", localDate3);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, (int) ' ', "", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (-1), "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (byte) 100, "hi!", localDate3);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 0, (int) (byte) 100, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) (byte) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        java.util.Date date9 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:30 EDT 2024");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }
}
