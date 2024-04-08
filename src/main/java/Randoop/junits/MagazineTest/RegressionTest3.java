package Randoop.junits.MagazineTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double14 = magazine6.getValue();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 100);
        int int18 = magazine6.getRemainingCopies();
        java.lang.String str19 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.String str14 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str14, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanRent();
        int int9 = magazine6.getId();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getTitle();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        double double11 = magazine6.getValue();
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        java.lang.String str14 = magazine6.getLocation();
        int int15 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getLocation();
        boolean boolean12 = magazine6.isCanPurchase();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str13, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(false);
        magazine6.setCanPurchase(true);
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.getTitle();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        magazine6.setCanRent(true);
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!" + "'", str13, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setValue((double) 10.0f);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setValue((double) ' ');
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "-1,MAGAZINE,hi!,,-1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,", (int) '#', (double) 1, "-1,MAGAZINE,,hi!,10,-1.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.toCSVString();
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str8, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str19 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,100,100.0," + "'", str19, "-1,MAGAZINE,hi!,,100,100.0,");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!", "-1,MAGAZINE,,,35,0.0,hi!", (int) 'a', (double) 1L, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        objects.Magazine magazine6 = new objects.Magazine((-1), "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) ' ', (double) 1.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str14, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.toCSVString();
        int int9 = magazine6.getRemainingCopies();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setValue((double) (short) -1);
        boolean boolean18 = magazine6.isCanPurchase();
        java.lang.String str19 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) 'a', (double) (byte) 10, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) -1);
        double double11 = magazine6.getValue();
        boolean boolean12 = magazine6.isCanRent();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(97);
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(false);
        int int17 = magazine6.getId();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanRent();
        double double10 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.toCSVString();
        int int16 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getId();
        java.lang.String str9 = magazine6.getEdition();
        boolean boolean10 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", (int) '4', (double) 10, "-1,MAGAZINE,hi!,,1,0.0,");
        magazine6.setCanRent(false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        double double11 = magazine6.getValue();
        java.lang.String str12 = magazine6.getTitle();
        int int13 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setValue((double) (short) 1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setValue((double) 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,MAGAZINE,hi!,,-1,1.0," + "'", str12, "0,MAGAZINE,hi!,,-1,1.0,");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        objects.Magazine magazine6 = new objects.Magazine(35, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,,,1,100.0,1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (byte) 10, (double) (-1), "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,,,1,100.0,1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,", "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", (int) (short) -1, (double) 100L, "-1,MAGAZINE,hi!,,1,1.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        boolean boolean10 = magazine6.isCanPurchase();
        boolean boolean11 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (short) 1);
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        objects.Magazine magazine6 = new objects.Magazine(10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 100, (double) '#', "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        int int17 = magazine6.getId();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,,hi!,-1,35.0,", "", (int) '4', (double) (short) 10, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        java.lang.String str7 = magazine6.getTitle();
        double double8 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "35,MAGAZINE,,hi!,0,100.0,0", "-1,MAGAZINE,hi!,,1,0.0,", (int) (short) 100, (double) 10L, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,97.0,");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        magazine6.setRemainingCopies((int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) ' ');
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,0.0,");
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.toCSVString();
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str9 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        double double7 = magazine6.getValue();
        magazine6.setValue((double) 100L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setValue((double) 10L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanRent(false);
        boolean boolean17 = magazine6.isCanRent();
        boolean boolean18 = magazine6.isCanRent();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str13 = magazine6.getTitle();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (byte) -1);
        int int12 = magazine6.getId();
        int int13 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (byte) -1);
        java.lang.String str12 = magazine6.getLocation();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 'a');
        double double11 = magazine6.getValue();
        magazine6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        double double14 = magazine6.getValue();
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '#');
        double double17 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        magazine6.setValue(10.0d);
        magazine6.setCanPurchase(true);
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "-1,MAGAZINE,hi!,,1,1.0,", (int) (byte) 1, (double) (short) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str7, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '4');
        java.lang.String str19 = magazine6.getLocation();
        int int20 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str19, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.toCSVString();
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str8, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '#');
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        magazine6.setLocation("hi!");
        int int18 = magazine6.getId();
        java.lang.String str19 = magazine6.getTitle();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,100,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.toCSVString();
        java.lang.String str16 = magazine6.getTitle();
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean19 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str22 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) ' ');
        int int25 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0," + "'", str22, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (byte) 0);
        java.lang.String str18 = magazine6.toCSVString();
        java.lang.String str19 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0," + "'", str18, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0," + "'", str19, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0");
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) 'a');
        boolean boolean15 = magazine6.isCanRent();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int13 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
        magazine6.setValue((double) 0.0f);
        double double19 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str14, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        double double12 = magazine6.getValue();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "hi!", "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, 0.0d, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!" + "'", str7, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str8, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getTitle();
        boolean boolean17 = magazine6.isCanPurchase();
        boolean boolean18 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanRent();
        boolean boolean16 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str19 = magazine6.getEdition();
        java.lang.String str20 = magazine6.getLocation();
        boolean boolean21 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str20, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,", 10, (double) 32, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
        java.lang.String str7 = magazine6.getLocation();
        boolean boolean8 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 0L);
        magazine6.setCanRent(false);
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "-1,MAGAZINE,hi!,hi!,-1,10.0,", "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,", (int) 'a', (double) 1, "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setValue(10.0d);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getLocation();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setValue((double) 1);
        double double18 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str15 = magazine6.getTitle();
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str15, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setValue((double) (short) 0);
        magazine6.setValue(1.0d);
        java.lang.String str19 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setCanRent(false);
        java.lang.String str24 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,MAGAZINE,hi!,,35,1.0," + "'", str24, "-1,MAGAZINE,hi!,,35,1.0,");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (short) 0, (double) 1L, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setValue((double) '#');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str9, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str10, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        int int9 = magazine6.getId();
        magazine6.setValue((double) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies((int) (short) -1);
        boolean boolean21 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setValue(0.0d);
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "-1,MAGAZINE,hi!,,35,1.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", 97, (double) (short) 10, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        magazine6.setLocation("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setLocation("");
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        int int9 = magazine6.getRemainingCopies();
        int int10 = magazine6.getId();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", (int) '4', (double) 10, "-1,MAGAZINE,hi!,,1,0.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 100);
        int int18 = magazine6.getRemainingCopies();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        boolean boolean12 = magazine6.isCanRent();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.toCSVString();
        java.lang.String str16 = magazine6.getTitle();
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,hi!,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,hi!,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        int int7 = magazine6.getId();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanPurchase();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        magazine6.setLocation("1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        objects.Magazine magazine6 = new objects.Magazine(32, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,1.0,", (int) (byte) -1, (double) (byte) -1, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = magazine6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,0.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '4', 0.0d, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,0.0," + "'", str8, "-1,MAGAZINE,hi!,,1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.String str14 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str14, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str10, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getEdition();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setLocation("-1,MAGAZINE,hi!,,32,0.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setValue((double) (short) -1);
        int int18 = magazine6.getRemainingCopies();
        java.lang.String str19 = magazine6.getLocation();
        boolean boolean20 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies(100);
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getLocation();
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setValue((double) (short) 1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,MAGAZINE,hi!,,-1,1.0," + "'", str12, "0,MAGAZINE,hi!,,-1,1.0,");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        double double12 = magazine6.getValue();
        magazine6.setRemainingCopies((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        objects.Magazine magazine6 = new objects.Magazine(32, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", (int) '4', (double) (short) -1, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        int int15 = magazine6.getId();
        boolean boolean16 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getEdition();
        int int16 = magazine6.getId();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        objects.Magazine magazine6 = new objects.Magazine(52, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!", "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,,,1,100.0,1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (short) 0, 100.0d, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean11 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str8, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        int int18 = magazine6.getId();
        java.lang.String str19 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str24 = magazine6.getTitle();
        boolean boolean25 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (byte) -1);
        boolean boolean19 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) '4');
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanRent();
        double double10 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        magazine6.setValue((-1.0d));
        magazine6.setCanPurchase(false);
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        double double14 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        objects.Magazine magazine6 = new objects.Magazine(100, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "35,MAGAZINE,,hi!,0,100.0,0", (int) (byte) 10, (double) (-1L), "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(false);
        int int17 = magazine6.getId();
        int int18 = magazine6.getRemainingCopies();
        java.lang.String str19 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str19, "-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        magazine6.setRemainingCopies((int) (byte) 10);
        boolean boolean20 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        double double20 = magazine6.getValue();
        java.lang.String str21 = magazine6.toCSVString();
        java.lang.String str22 = magazine6.toCSVString();
        double double23 = magazine6.getValue();
        magazine6.setLocation("-1,MAGAZINE,hi!,hi!,100,-1.0,");
        magazine6.setCanPurchase(true);
        int int28 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str21, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str22, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        int int14 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setValue((double) 1L);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getId();
        int int15 = magazine6.getRemainingCopies();
        int int16 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        magazine6.setValue((double) 10.0f);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        int int13 = magazine6.getId();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getLocation();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 1);
        boolean boolean18 = magazine6.isCanRent();
        java.lang.String str19 = magazine6.getTitle();
        java.lang.String str20 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.toCSVString();
        int int17 = magazine6.getRemainingCopies();
        double double18 = magazine6.getValue();
        boolean boolean19 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(false);
        boolean boolean14 = magazine6.isCanRent();
        java.lang.String str15 = magazine6.toCSVString();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        boolean boolean15 = magazine6.isCanRent();
        boolean boolean16 = magazine6.isCanPurchase();
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue((double) (-1));
        java.lang.String str15 = magazine6.getLocation();
        magazine6.setValue((double) '4');
        boolean boolean18 = magazine6.isCanPurchase();
        double double19 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.String str14 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str14, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies(100);
        boolean boolean19 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        int int7 = magazine6.getId();
        int int8 = magazine6.getId();
        java.lang.String str9 = magazine6.getEdition();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) 'a', (double) 0.0f, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.toCSVString();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str8, "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanRent(false);
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) (short) 1);
        double double17 = magazine6.getValue();
        boolean boolean18 = magazine6.isCanRent();
        java.lang.String str19 = magazine6.getEdition();
        magazine6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setValue((double) (-1L));
        magazine6.setCanPurchase(false);
        magazine6.setCanRent(true);
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        java.lang.String str16 = magazine6.getEdition();
        magazine6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        java.lang.String str7 = magazine6.toCSVString();
        boolean boolean8 = magazine6.isCanRent();
        boolean boolean9 = magazine6.isCanRent();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str7, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,97.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 1, (double) ' ', "-1,MAGAZINE,,,35,0.0,hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        java.lang.String str19 = magazine6.getEdition();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!", "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (byte) 0, (double) 10L, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        objects.Magazine magazine6 = new objects.Magazine(0, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) 97, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str8, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        boolean boolean10 = magazine6.isCanRent();
        java.lang.String str11 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getId();
        magazine6.setValue(1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str12, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(97);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        java.lang.String str13 = magazine6.getEdition();
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getId();
        int int14 = magazine6.getRemainingCopies();
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        int int9 = magazine6.getId();
        boolean boolean10 = magazine6.isCanPurchase();
        double double11 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setValue((double) 1L);
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str15, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", 0, (double) (byte) 100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        int int7 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getId();
        int int15 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        magazine6.setRemainingCopies((int) (byte) 100);
        magazine6.setCanPurchase(false);
        magazine6.setCanPurchase(false);
        java.lang.String str13 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str15 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.String str15 = magazine6.toCSVString();
        double double16 = magazine6.getValue();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        int int15 = magazine6.getId();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        double double12 = magazine6.getValue();
        magazine6.setCanPurchase(false);
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        int int11 = magazine6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.toCSVString();
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        double double8 = magazine6.getValue();
        int int9 = magazine6.getId();
        magazine6.setValue(35.0d);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(0);
        magazine6.setRemainingCopies((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0");
        magazine6.setLocation("");
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setLocation("");
        java.lang.String str15 = magazine6.toCSVString();
        java.lang.String str16 = magazine6.getEdition();
        int int17 = magazine6.getRemainingCopies();
        double double18 = magazine6.getValue();
        magazine6.setCanRent(true);
        java.lang.String str21 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str21, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        double double11 = magazine6.getValue();
        magazine6.setRemainingCopies(52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.toCSVString();
        java.lang.String str12 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str11, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str12, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.getEdition();
        int int18 = magazine6.getId();
        boolean boolean19 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int16 = magazine6.getRemainingCopies();
        double double17 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        int int15 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str8, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str9, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        java.lang.String str14 = magazine6.getLocation();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str14, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,-1.0,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,-1.0,,1,10.0,");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) '4');
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,,1,52.0," + "'", str13, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,,1,52.0,");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 100L);
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        double double8 = magazine6.getValue();
        magazine6.setRemainingCopies(97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "-1,MAGAZINE,,hi!,-1,1.0,", "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,1,10.0,", (int) (short) 1, (double) 35, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setCanRent(true);
        magazine6.setRemainingCopies((int) '4');
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setRemainingCopies((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        boolean boolean17 = magazine6.isCanRent();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str11, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        objects.Magazine magazine6 = new objects.Magazine(52, "-1,MAGAZINE,hi!,,32,0.0,", "-1,MAGAZINE,hi!,,100,10.0,", 10, (double) (byte) 100, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,100.0,,1,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies(52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str10, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        double double14 = magazine6.getValue();
        double double15 = magazine6.getValue();
        java.lang.String str16 = magazine6.getLocation();
        int int17 = magazine6.getId();
        java.lang.String str18 = magazine6.toCSVString();
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str18, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        int int16 = magazine6.getId();
        magazine6.setRemainingCopies((int) '4');
        java.lang.String str19 = magazine6.getLocation();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (byte) -1);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        boolean boolean16 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,1,1.0,", "-1,MAGAZINE,hi!,hi!,-1,10.0,", (int) (short) 100, 52.0d, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 1, 0.0d, "hi!");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str8, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setCanRent(false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.String str14 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str14, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        objects.Magazine magazine6 = new objects.Magazine(1, "", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) (short) 0, (double) 10.0f, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        int int7 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.getTitle();
        magazine6.setValue((double) 'a');
        boolean boolean19 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) 'a');
        magazine6.setValue((double) 52);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (-1L));
        magazine6.setCanPurchase(true);
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 1, 0.0d, "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        java.lang.String str9 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        objects.Magazine magazine6 = new objects.Magazine(52, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,-1.0,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (byte) 10, (double) (short) 0, "-1,MAGAZINE,hi!,,-1,10.0,");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        int int9 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", 100, (double) (short) 10, "-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str7 = magazine6.toCSVString();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0," + "'", str7, "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        double double13 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        magazine6.setCanPurchase(false);
        magazine6.setValue((double) 'a');
        magazine6.setValue((double) (short) -1);
        java.lang.String str16 = magazine6.toCSVString();
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,,hi!,10,-1.0," + "'", str16, "-1,MAGAZINE,,hi!,10,-1.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setRemainingCopies((int) 'a');
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 10.0f);
        boolean boolean13 = magazine6.isCanPurchase();
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        magazine6.setCanPurchase(false);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        java.lang.String str17 = magazine6.toCSVString();
        magazine6.setCanPurchase(false);
        java.lang.String str20 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str12, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) 'a');
        java.lang.Class<?> wildcardClass21 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies(100);
        int int19 = magazine6.getId();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = magazine6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        boolean boolean12 = magazine6.isCanPurchase();
        magazine6.setLocation("");
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getLocation();
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(true);
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        magazine6.setValue((double) 'a');
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,-1,MAGAZINE,hi!,,1,-1.0,,-1,0.0,-1,MAGAZINE,hi!,,100,10.0," + "'", str10, "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,-1,MAGAZINE,hi!,,1,-1.0,,-1,0.0,-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) (byte) 10, (double) 10, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
        java.lang.String str7 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10,MAGAZINE,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,10,10.0,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str7, "10,MAGAZINE,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,10,10.0,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str16 = magazine6.toCSVString();
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str12 = magazine6.getLocation();
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 1);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setValue((double) (short) 100);
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getLocation();
        boolean boolean12 = magazine6.isCanPurchase();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        boolean boolean16 = magazine6.isCanRent();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str12 = magazine6.getLocation();
        magazine6.setCanRent(false);
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getLocation();
        int int14 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        objects.Magazine magazine6 = new objects.Magazine((-1), "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,100,100.0,", 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,,32,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,-1.0,,1,10.0,", (int) (short) 100, (double) '#', "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        objects.Magazine magazine6 = new objects.Magazine(35, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 100, (double) 0.0f, "-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setCanPurchase(false);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = magazine6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str9, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = magazine6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 97);
        java.lang.String str21 = magazine6.getTitle();
        java.lang.String str22 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str11 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        magazine6.setCanRent(true);
        java.lang.String str15 = magazine6.getLocation();
        boolean boolean16 = magazine6.isCanPurchase();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", "", (int) (byte) 100, (double) 97, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanRent();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 100);
        magazine6.setCanRent(true);
        magazine6.setRemainingCopies((int) (short) 1);
        magazine6.setCanRent(true);
        boolean boolean22 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(97);
        java.lang.String str17 = magazine6.toCSVString();
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str20 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,97,10.0," + "'", str17, "-1,MAGAZINE,hi!,,97,10.0,");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,,97,10.0," + "'", str20, "-1,MAGAZINE,hi!,0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,,97,10.0,");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        int int7 = magazine6.getId();
        double double8 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setLocation("1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        java.lang.String str18 = magazine6.getEdition();
        boolean boolean19 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '#', (double) 'a', "");
        int int7 = magazine6.getId();
        int int8 = magazine6.getId();
        magazine6.setValue((double) 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "-1,MAGAZINE,hi!,,1,1.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,", (int) '4', (double) (byte) -1, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) '#');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.toCSVString();
        java.lang.String str11 = magazine6.toCSVString();
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,0,-1.0," + "'", str17, "-1,MAGAZINE,hi!,,0,-1.0,");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        double double12 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        magazine6.setValue((double) 100);
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,100.0," + "'", str16, "-1,MAGAZINE,hi!,,10,100.0,");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        double double10 = magazine6.getValue();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        magazine6.setLocation("hi!");
        magazine6.setRemainingCopies(100);
        java.lang.String str20 = magazine6.toCSVString();
        java.lang.String str21 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,hi!,100,-1.0," + "'", str20, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        magazine6.setCanRent(false);
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) 'a');
        magazine6.setValue((double) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanPurchase();
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.getTitle();
        int int12 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str9, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,hi!,,1,100.0,", 1, 35.0d, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str7, "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,,1,52.0,", "35,MAGAZINE,,hi!,0,100.0,0", (int) (short) 1, (double) (short) 0, "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        int int16 = magazine6.getId();
        magazine6.setCanRent(true);
        java.lang.String str19 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getId();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str10, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.toCSVString();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        magazine6.setValue((double) 100);
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        boolean boolean10 = magazine6.isCanPurchase();
        java.lang.String str11 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,,hi!,-1,35.0,", "", (int) '4', (double) (short) 10, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        magazine6.setLocation("");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        objects.Magazine magazine6 = new objects.Magazine(10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,-1.0,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", 0, (double) (byte) 1, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        int int17 = magazine6.getId();
        magazine6.setValue((double) 10);
        int int20 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getEdition();
        int int9 = magazine6.getId();
        java.lang.String str10 = magazine6.getTitle();
        java.lang.String str11 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str10, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        objects.Magazine magazine6 = new objects.Magazine((-1), "-1,MAGAZINE,hi!,,1,10.0,", "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100.0f, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 0L);
        magazine6.setCanRent(false);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) -1);
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str15 = magazine6.toCSVString();
        int int16 = magazine6.getId();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str15, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        magazine6.setValue((double) 100);
        double double15 = magazine6.getValue();
        java.lang.String str16 = magazine6.getTitle();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setLocation("");
        java.lang.String str16 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanRent();
        boolean boolean10 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getEdition();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setValue((double) (short) 1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setValue((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,MAGAZINE,hi!,,-1,1.0," + "'", str12, "0,MAGAZINE,hi!,,-1,1.0,");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 32, (double) 10, "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(false);
        magazine6.setCanRent(false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str15 = magazine6.getTitle();
        int int16 = magazine6.getRemainingCopies();
        int int17 = magazine6.getId();
        int int18 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str15, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,100.0,");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        magazine6.setLocation("-1,MAGAZINE,hi!,hi!,1,10.0,");
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.toCSVString();
        int int9 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str8, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setValue((double) 10.0f);
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str9, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        objects.Magazine magazine6 = new objects.Magazine(97, "-1,MAGAZINE,hi!,,0,-1.0,", "-1,MAGAZINE,hi!,,1,0.0,", 10, (double) (short) 0, "-1,MAGAZINE,hi!,hi!,-1,10.0,");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        magazine6.setCanPurchase(true);
        boolean boolean16 = magazine6.isCanRent();
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        objects.Magazine magazine6 = new objects.Magazine(97, "1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0,", "", 52, (double) 35, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.toCSVString();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) -1);
        java.lang.String str18 = magazine6.getEdition();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord20 = magazine6.borrow(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (-1L));
        magazine6.setCanPurchase(true);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        objects.Magazine magazine6 = new objects.Magazine(97, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) ' ', (double) (byte) 1, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        objects.Magazine magazine6 = new objects.Magazine(10, "", "-1,MAGAZINE,hi!,,10,100.0,", (int) '#', 0.0d, "35,MAGAZINE,,hi!,0,100.0,0");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        magazine6.setValue((double) (short) 1);
        double double16 = magazine6.getValue();
        java.lang.String str17 = magazine6.getEdition();
        int int18 = magazine6.getRemainingCopies();
        boolean boolean19 = magazine6.isCanPurchase();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = magazine6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "0,MAGAZINE,hi!,,-1,0.0,", "-1,MAGAZINE,hi!,,10,10.0,", 1, (double) (byte) 0, "-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        java.lang.String str9 = magazine6.toCSVString();
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str9, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!", "-1,MAGAZINE,hi!,,100,100.0,", (int) (short) 0, (double) 0L, "-1,MAGAZINE,,hi!,10,-1.0,");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 1);
        java.lang.String str12 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,,1,52.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) 0, (double) 10.0f, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        boolean boolean9 = magazine6.isCanPurchase();
        int int10 = magazine6.getRemainingCopies();
        double double11 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setRemainingCopies(1);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getEdition();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str10, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getTitle();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        boolean boolean9 = magazine6.isCanPurchase();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setValue((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        magazine6.setCanRent(false);
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,,hi!,10,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies((-1));
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        magazine6.setCanRent(true);
        java.lang.Class<?> wildcardClass23 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getId();
        int int14 = magazine6.getId();
        java.lang.String str15 = magazine6.getLocation();
        boolean boolean16 = magazine6.isCanPurchase();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '#', (double) 'a', "");
        magazine6.setRemainingCopies((int) (byte) 100);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanRent();
        boolean boolean9 = magazine6.isCanPurchase();
        int int10 = magazine6.getRemainingCopies();
        double double11 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getLocation();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        boolean boolean12 = magazine6.isCanRent();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.toCSVString();
        java.lang.String str16 = magazine6.getEdition();
        int int17 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,hi!,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,hi!,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,1,10.0,");
        magazine6.setValue(10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        int int13 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "-1,MAGAZINE,hi!,,10,100.0,", (int) (short) 10, (double) 32, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        double double18 = magazine6.getValue();
        double double19 = magazine6.getValue();
        magazine6.setRemainingCopies(100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 100);
        magazine6.setCanRent(true);
        magazine6.setRemainingCopies((int) (short) 1);
        magazine6.setCanRent(true);
        objects.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord23 = magazine6.borrow(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        java.lang.String str9 = magazine6.toCSVString();
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies(32);
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str9, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        magazine6.setCanRent(false);
        magazine6.setCanRent(false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,,hi!,10,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (short) -1, (double) 1.0f, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        double double15 = magazine6.getValue();
        magazine6.setRemainingCopies((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setLocation("1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "-1,MAGAZINE,hi!,,1,100.0,", (int) (byte) 10, (double) (short) 0, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        magazine6.setValue(0.0d);
        java.lang.String str9 = magazine6.getEdition();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setValue((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str9, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getEdition();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        magazine6.setValue((double) 100);
        double double15 = magazine6.getValue();
        java.lang.String str16 = magazine6.getTitle();
        int int17 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (byte) 100, (double) 97, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        int int7 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        boolean boolean17 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean11 = magazine6.isCanPurchase();
        int int12 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getTitle();
        java.lang.String str17 = magazine6.toCSVString();
        java.lang.String str18 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        java.lang.String str17 = magazine6.toCSVString();
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str17, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        int int13 = magazine6.getId();
        magazine6.setCanPurchase(true);
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.toCSVString();
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setRemainingCopies((int) (short) -1);
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setRemainingCopies((-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,10.0,", "", 1, (double) '#', "-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setRemainingCopies((int) (short) 100);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanRent(false);
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 1);
        java.lang.String str13 = magazine6.getLocation();
        int int14 = magazine6.getId();
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (byte) 10);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        java.lang.String str12 = magazine6.getTitle();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        boolean boolean7 = magazine6.isCanRent();
        double double8 = magazine6.getValue();
        boolean boolean9 = magazine6.isCanRent();
        double double10 = magazine6.getValue();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.toCSVString();
        double double12 = magazine6.getValue();
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str11, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        double double12 = magazine6.getValue();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean19 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        double double22 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        int int16 = magazine6.getId();
        magazine6.setRemainingCopies((int) '4');
        java.lang.String str19 = magazine6.getLocation();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(false);
        magazine6.setCanRent(false);
        java.lang.String str26 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str26, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getEdition();
        int int9 = magazine6.getId();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str10, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        objects.Magazine magazine6 = new objects.Magazine(97, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!", "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,", (int) (short) 10, (double) 10, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getTitle();
        java.lang.String str17 = magazine6.toCSVString();
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanRent(false);
        boolean boolean10 = magazine6.isCanRent();
        boolean boolean11 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies(100);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.String str14 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        magazine6.setLocation("hi!");
        boolean boolean19 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str14, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setValue((double) (short) 100);
        double double12 = magazine6.getValue();
        magazine6.setLocation("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        magazine6.setValue((double) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 1);
        boolean boolean18 = magazine6.isCanRent();
        java.lang.String str19 = magazine6.getTitle();
        magazine6.setValue((double) (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 1);
        magazine6.setValue((double) (short) 1);
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,1.0,hi!" + "'", str17, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,1.0,hi!");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str19 = magazine6.toCSVString();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0," + "'", str19, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        int int17 = magazine6.getId();
        magazine6.setValue((double) 10);
        magazine6.setValue((double) (byte) -1);
        objects.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord23 = magazine6.borrow(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        magazine6.setValue((-1.0d));
        magazine6.setCanPurchase(false);
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!");
        boolean boolean20 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        java.lang.String str11 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 1, 0.0d, "hi!");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getLocation();
        int int9 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str8, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,0,MAGAZINE,hi!,,-1,100.0,,1,97.0,-1,MAGAZINE,,hi!,-1,35.0,", 0, (double) 1L, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 100L);
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 100);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "", "", (int) '4', (double) 10.0f, "-1,MAGAZINE,hi!,,1,-1.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,,0,-1.0,");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        boolean boolean17 = magazine6.isCanRent();
        java.lang.String str18 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double18 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str8, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        objects.Magazine magazine6 = new objects.Magazine(97, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,", (int) (byte) 0, 97.0d, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        objects.Magazine magazine6 = new objects.Magazine((-1), "-1,MAGAZINE,hi!,,1,10.0,", "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100.0f, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        magazine6.setCanRent(false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,100.0,", 0, 0.0d, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 0);
        int int15 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        int int10 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(false);
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        int int16 = magazine6.getId();
        magazine6.setCanRent(true);
        magazine6.setRemainingCopies((int) (byte) 0);
        magazine6.setRemainingCopies((int) (short) 1);
        int int23 = magazine6.getRemainingCopies();
        int int24 = magazine6.getId();
        magazine6.setValue((double) (byte) 1);
        boolean boolean27 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,,97,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        boolean boolean15 = magazine6.isCanPurchase();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setRemainingCopies((-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        int int16 = magazine6.getId();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str19 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,,35,10.0," + "'", str19, "-1,MAGAZINE,hi!,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,,35,10.0,");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.toCSVString();
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.toCSVString();
        double double13 = magazine6.getValue();
        double double14 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.toCSVString();
        java.lang.String str12 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str11, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanRent();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        magazine6.setValue((double) (byte) -1);
        magazine6.setRemainingCopies(32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(false);
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str12 = magazine6.getLocation();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str17 = magazine6.getLocation();
        double double18 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str17, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        int int18 = magazine6.getRemainingCopies();
        java.lang.String str19 = magazine6.getTitle();
        magazine6.setRemainingCopies((-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 10.0f);
        boolean boolean13 = magazine6.isCanPurchase();
        double double14 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 10.0f);
        boolean boolean13 = magazine6.isCanPurchase();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,hi!,100,-1.0,", (int) (byte) 10, (double) 97, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setCanPurchase(true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!", (int) '4', (double) (byte) 1, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        java.lang.String str17 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        magazine6.setRemainingCopies((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setRemainingCopies((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        magazine6.setCanRent(false);
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '#');
        int int17 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        int int7 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        int int18 = magazine6.getRemainingCopies();
        java.lang.String str19 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getEdition();
        double double9 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getEdition();
        int int17 = magazine6.getRemainingCopies();
        int int18 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        int int15 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,hi!,1,10.0,");
        magazine6.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        objects.Magazine magazine6 = new objects.Magazine(35, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 100, (double) 0.0f, "-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        magazine6.setValue((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str16 = magazine6.getTitle();
        java.lang.String str17 = magazine6.getTitle();
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "-1,MAGAZINE,hi!,,32,0.0,", "-1,MAGAZINE,hi!,,1,0.0,", (int) (byte) -1, (double) '#', "-1,MAGAZINE,,,35,0.0,hi!");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        magazine6.setCanPurchase(true);
        boolean boolean16 = magazine6.isCanRent();
        int int17 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        magazine6.setValue((double) (-1L));
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setValue(100.0d);
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setLocation("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        boolean boolean12 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((-1));
        magazine6.setRemainingCopies((int) (short) 100);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanPurchase();
        int int15 = magazine6.getId();
        boolean boolean16 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) '#', "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = magazine6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        java.lang.String str16 = magazine6.getEdition();
        double double17 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanRent(false);
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) 'a');
        int int15 = magazine6.getId();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        int int18 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean21 = magazine6.isCanRent();
        boolean boolean22 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 100);
        int int18 = magazine6.getRemainingCopies();
        boolean boolean19 = magazine6.isCanRent();
        double double20 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        objects.Magazine magazine6 = new objects.Magazine((-1), "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) ' ', (double) 1.0f, "");
        int int7 = magazine6.getId();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setValue((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (-1.0f));
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        boolean boolean12 = magazine6.isCanRent();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setValue((double) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,hi!,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,hi!,1,10.0,");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }
}

