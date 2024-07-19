package Randoop.junits.NotificationTest;

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
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, (int) (short) 1, "hi!", localDate3);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 0, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) -1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        java.util.Date date9 = notification4.getDate();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:30 EDT 2024");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 100, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, (int) (byte) -1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) ' ', "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 0, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (-1), "", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) '#', "", localDate3);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        int int11 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) ' ', (int) (byte) 10, "", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:30 EDT 2024");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 100, "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 10, (int) (short) 100, "", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = date8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', 32, "", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) ' ', "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 10, (int) (byte) -1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) -1, "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 10, "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, 10, "", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        java.util.Date date13 = notification4.getDate();
        java.util.Date date14 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 08 12:53:30 EDT 2024");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 08 12:53:30 EDT 2024");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (byte) -1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        java.util.Date date9 = notification4.getDate();
        int int10 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, 0, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, 100, "", localDate3);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) (short) 100, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 100, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getNotificationID();
        int int10 = notification4.getUserID();
        int int11 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, 10, "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, (int) '4', "", localDate3);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        java.util.Date date12 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Apr 08 12:53:31 EDT 2024");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, 35, "hi!", localDate3);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (byte) 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getUserID();
        int int9 = notification4.getUserID();
        int int10 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        int int10 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) -1, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, 35, "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) (short) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (byte) 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getUserID();
        int int8 = notification4.getUserID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        java.util.Date date7 = notification4.getDate();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, (int) '4', "hi!", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 0, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, (int) (short) 100, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, 32, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) '4', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:31 EDT 2024");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) (byte) -1, "hi!", localDate3);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        java.util.Date date8 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:31 EDT 2024");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) -1, "", localDate3);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(32, (int) (short) -1, "", localDate3);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) ' ', "", localDate3);
        int int5 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, 0, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.lang.Class<?> wildcardClass7 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "", localDate3);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, 10, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (-1), "hi!", localDate3);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (byte) 10, "", localDate3);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) 'a', "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 0, "", localDate3);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (byte) 0, "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '#', (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        java.lang.Class<?> wildcardClass8 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, 0, "", localDate3);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) (byte) 100, "", localDate3);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getUserID();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, 0, "hi!", localDate3);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '4', (int) (byte) 100, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getNotificationID();
        int int8 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(1, 0, "hi!", localDate3);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) (byte) 10, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (int) (short) 1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getUserID();
        int int9 = notification4.getUserID();
        int int10 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:31 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (-1), "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(97, (int) (short) 10, "hi!", localDate3);
        java.lang.Class<?> wildcardClass5 = notification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        java.lang.Class<?> wildcardClass16 = date15.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(10, 10, "", localDate3);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        java.lang.Class<?> wildcardClass9 = notification4.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) -1, (int) '#', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getUserID();
        int int7 = notification4.getUserID();
        java.util.Date date8 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:32 EDT 2024");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 0, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 100, 100, "", localDate3);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(0, (int) (short) 1, "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getUserID();
        int int9 = notification4.getNotificationID();
        java.util.Date date10 = notification4.getDate();
        int int11 = notification4.getUserID();
        java.util.Date date12 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Apr 08 12:53:32 EDT 2024");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 100, (int) (byte) 1, "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) -1, (int) (short) 1, "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:32 EDT 2024");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) 'a', (-1), "", localDate3);
        int int5 = notification4.getUserID();
        int int6 = notification4.getNotificationID();
        int int7 = notification4.getNotificationID();
        java.util.Date date8 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 08 12:53:32 EDT 2024");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (short) -1, "hi!", localDate3);
        int int5 = notification4.getUserID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getUserID();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:32 EDT 2024");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (-1), "", localDate3);
        java.util.Date date5 = notification4.getDate();
        int int6 = notification4.getNotificationID();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (short) 1, 100, "", localDate3);
        int int5 = notification4.getUserID();
        java.lang.Class<?> wildcardClass6 = notification4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) '#', 10, "", localDate3);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((-1), (int) (byte) -1, "", localDate3);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) '#', "hi!", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.util.Date date6 = notification4.getDate();
        java.util.Date date7 = notification4.getDate();
        int int8 = notification4.getNotificationID();
        int int9 = notification4.getUserID();
        java.util.Date date10 = notification4.getDate();
        java.util.Date date11 = notification4.getDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 08 12:53:32 EDT 2024");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(35, (int) 'a', "", localDate3);
        java.util.Date date5 = notification4.getDate();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification(100, (int) '4', "hi!", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:32 EDT 2024");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.time.LocalDate localDate3 = null;
        objects.Notification notification4 = new objects.Notification((int) (byte) 1, (int) (byte) -1, "", localDate3);
        int int5 = notification4.getNotificationID();
        java.util.Date date6 = notification4.getDate();
        int int7 = notification4.getNotificationID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 08 12:53:32 EDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }
}
