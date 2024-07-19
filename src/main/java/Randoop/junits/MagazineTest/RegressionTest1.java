package Randoop.junits.MagazineTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        double double15 = magazine6.getValue();
        magazine6.setLocation("");
        magazine6.setValue((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        objects.Magazine magazine6 = new objects.Magazine((-1), "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 0, (double) 10L, "hi!");
        int int7 = magazine6.getRemainingCopies();
        double double8 = magazine6.getValue();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (byte) 0);
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.toCSVString();
        double double15 = magazine6.getValue();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str14, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        magazine6.setValue((double) (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        int int12 = magazine6.getRemainingCopies();
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanRent();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setValue((double) 100L);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,,1,1.0,", "-1,MAGAZINE,hi!,,100,10.0,", 1, (double) (short) 10, "-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str2 = physicalItem1.toCSVString();
        org.junit.Assert.assertNotNull(physicalItem1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35,MAGAZINE,,hi!,0,100.0,0" + "'", str2, "35,MAGAZINE,,hi!,0,100.0,0");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.getTitle();
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str7, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str8, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,0.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        boolean boolean10 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        java.lang.String str13 = magazine6.getEdition();
        magazine6.setValue((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "", "-1,MAGAZINE,hi!,,-1,10.0,", (int) ' ', (double) 10.0f, "-1,MAGAZINE,hi!,,1,0.0,");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        double double14 = magazine6.getValue();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) '#', 0.0d, "");
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getId();
        magazine6.setValue((double) 10.0f);
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getEdition();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies((int) (short) 100);
        double double9 = magazine6.getValue();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,0.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '4', 0.0d, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "-1,MAGAZINE,hi!,,1,100.0,", (int) (byte) 10, (double) (short) 0, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        objects.Magazine magazine6 = new objects.Magazine(10, "0,MAGAZINE,hi!,,-1,100.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) -1, (double) (short) 100, "hi!");
        magazine6.setRemainingCopies((int) (short) 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (-1L));
        magazine6.setCanPurchase(true);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        boolean boolean16 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setRemainingCopies((int) '#');
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        int int15 = magazine6.getRemainingCopies();
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        java.lang.String str19 = magazine6.getLocation();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        magazine6.setValue((double) (short) 1);
        double double16 = magazine6.getValue();
        java.lang.String str17 = magazine6.getTitle();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setCanPurchase(false);
        boolean boolean12 = magazine6.isCanRent();
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        java.lang.String str9 = magazine6.toCSVString();
        boolean boolean10 = magazine6.isCanPurchase();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str9, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "-1,MAGAZINE,hi!,,1,100.0,", (int) (byte) 10, (double) (short) 0, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        magazine6.setCanPurchase(true);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getId();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getTitle();
        double double12 = magazine6.getValue();
        magazine6.setValue((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getLocation();
        magazine6.setValue((double) 'a');
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanRent();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        boolean boolean11 = magazine6.isCanPurchase();
        boolean boolean12 = magazine6.isCanRent();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        int int18 = magazine6.getId();
        java.lang.String str19 = magazine6.getLocation();
        java.lang.String str20 = magazine6.getTitle();
        java.lang.String str21 = magazine6.getEdition();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        int int24 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass25 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        java.lang.String str9 = magazine6.getLocation();
        int int10 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.toCSVString();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,100,10.0,", (int) (short) 100, (double) 'a', "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 0L);
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "-1,MAGAZINE,hi!,,1,1.0,", "-1,MAGAZINE,hi!,,10,10.0,", 97, (double) 10L, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        int int16 = magazine6.getId();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        double double9 = magazine6.getValue();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,0.0,", (int) ' ', (double) 35, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (short) -1);
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int17 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,1,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int13 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        boolean boolean16 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getTitle();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        objects.Magazine magazine6 = new objects.Magazine(35, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", 1, (-1.0d), "-1,MAGAZINE,hi!,,100,10.0,");
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 0);
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        int int11 = magazine6.getRemainingCopies();
        java.lang.String str12 = magazine6.toCSVString();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int13 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        java.lang.String str20 = magazine6.getLocation();
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,hi!,100,-1.0,", (-1), (double) 1.0f, "-1,MAGAZINE,hi!,,1,1.0,");
        int int7 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        boolean boolean16 = magazine6.isCanRent();
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        int int11 = magazine6.getRemainingCopies();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        java.lang.String str10 = magazine6.getLocation();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setLocation("");
        double double16 = magazine6.getValue();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue((double) (-1));
        java.lang.String str15 = magazine6.getLocation();
        double double16 = magazine6.getValue();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        int int16 = magazine6.getRemainingCopies();
        java.lang.String str17 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (-1), 0.0d, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str10, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getLocation();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanPurchase();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        int int11 = magazine6.getRemainingCopies();
        java.lang.String str12 = magazine6.toCSVString();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        int int15 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getId();
        double double15 = magazine6.getValue();
        boolean boolean16 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(true);
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str18, "-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        java.lang.String str15 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.String str17 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        boolean boolean20 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str17, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) 'a');
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setLocation("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        boolean boolean8 = magazine6.isCanPurchase();
        int int9 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        int int9 = magazine6.getRemainingCopies();
        boolean boolean10 = magazine6.isCanPurchase();
        int int11 = magazine6.getRemainingCopies();
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        boolean boolean19 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int7 = magazine6.getId();
        magazine6.setRemainingCopies((-1));
        magazine6.setRemainingCopies((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (short) -1);
        magazine6.setCanPurchase(false);
        boolean boolean19 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        java.lang.String str24 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setValue((double) (byte) 10);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getId();
        magazine6.setCanPurchase(true);
        java.lang.String str16 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setValue((double) (byte) 10);
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setRemainingCopies((int) (short) -1);
        magazine6.setCanRent(true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        boolean boolean9 = magazine6.isCanPurchase();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getLocation();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "-1,MAGAZINE,hi!,,1,1.0,", "-1,MAGAZINE,hi!,,10,10.0,", 97, (double) 10L, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getTitle();
        boolean boolean17 = magazine6.isCanPurchase();
        magazine6.setValue((double) 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        magazine6.setLocation("hi!");
        magazine6.setValue((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        java.lang.String str18 = magazine6.getLocation();
        boolean boolean19 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        double double19 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanRent();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        magazine6.setCanPurchase(true);
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "hi!", (int) ' ', (double) 97, "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        boolean boolean7 = magazine6.isCanRent();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.getTitle();
        magazine6.setValue((double) ' ');
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord20 = magazine6.borrow(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        int int17 = magazine6.getId();
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanRent();
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        int int15 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        objects.Magazine magazine6 = new objects.Magazine(97, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", 52, (double) 1L, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord20 = magazine6.borrow(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies((-1));
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getLocation();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setValue((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        magazine6.setCanPurchase(false);
        boolean boolean20 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        magazine6.setCanRent(true);
        java.lang.String str12 = magazine6.toCSVString();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str12, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setValue((double) (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) (byte) -1);
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        java.lang.String str20 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str20, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setCanRent(false);
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "-1,MAGAZINE,hi!,,100,10.0,", (int) (byte) -1, (double) 1L, "-1,MAGAZINE,hi!,,10,10.0,");
        double double7 = magazine6.getValue();
        boolean boolean8 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (byte) 10);
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getLocation();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        boolean boolean16 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        int int8 = magazine6.getId();
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getLocation();
        magazine6.setLocation("1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,MAGAZINE,,hi!,0,100.0,0");
        org.junit.Assert.assertNotNull(physicalItem1);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        java.lang.String str9 = magazine6.getEdition();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        boolean boolean10 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        java.lang.String str9 = magazine6.getLocation();
        java.lang.String str10 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str10, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        int int11 = magazine6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) '4');
        magazine6.setLocation("hi!");
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        magazine6.setCanRent(true);
        int int15 = magazine6.getRemainingCopies();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        java.lang.String str18 = magazine6.getLocation();
        int int19 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getEdition();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        magazine6.setValue((double) (-1L));
        java.lang.String str15 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,MAGAZINE,,hi!,0,100.0,0");
        org.junit.Assert.assertNotNull(physicalItem1);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        java.lang.String str12 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        double double11 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        magazine6.setRemainingCopies((int) (byte) 100);
        magazine6.setLocation("1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        magazine6.setCanRent(true);
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setLocation("");
        boolean boolean15 = magazine6.isCanRent();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        objects.Magazine magazine6 = new objects.Magazine((-1), "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) ' ', (double) 1.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setLocation("-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean9 = magazine6.isCanRent();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setRemainingCopies(0);
        java.lang.String str14 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies((-1));
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,", "35,MAGAZINE,,hi!,0,100.0,0", (int) (short) 100, (double) 1L, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        java.lang.String str8 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str8, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setValue(10.0d);
        double double9 = magazine6.getValue();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,", 0, (double) '4', "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        magazine6.setCanPurchase(false);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        java.lang.String str9 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getEdition();
        int int9 = magazine6.getId();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (byte) -1);
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str10, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "-1,MAGAZINE,hi!,,1,1.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,", 97, (double) (byte) 100, "-1,MAGAZINE,hi!,,1,1.0,");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        boolean boolean18 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(false);
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        java.lang.String str11 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.String str15 = magazine6.toCSVString();
        double double16 = magazine6.getValue();
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str17, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0," + "'", str14, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int7 = magazine6.getId();
        magazine6.setRemainingCopies((-1));
        magazine6.setValue((double) (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        boolean boolean8 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str7, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getId();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        int int15 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) 'a');
        boolean boolean18 = magazine6.isCanRent();
        int int19 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 1, 0.0d, "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setValue(0.0d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.toCSVString();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '4');
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        boolean boolean20 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '#', (double) (short) 10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str16 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanRent();
        double double15 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        double double15 = magazine6.getValue();
        magazine6.setLocation("");
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        double double12 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.lang.Class<?> wildcardClass22 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        objects.Magazine magazine6 = new objects.Magazine(97, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", 35, 0.0d, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.String str17 = magazine6.getTitle();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 0L);
        magazine6.setCanRent(false);
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setRemainingCopies((int) 'a');
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        int int11 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,hi!,-1,10.0," + "'", str13, "-1,MAGAZINE,hi!,hi!,-1,10.0,");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) -1);
        double double13 = magazine6.getValue();
        double double14 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setRemainingCopies((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) (byte) -1);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int16 = magazine6.getRemainingCopies();
        java.lang.String str17 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        boolean boolean11 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 0L);
        magazine6.setCanRent(false);
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "-1,MAGAZINE,hi!,hi!,100,-1.0,", (int) (short) -1, 10.0d, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,hi!,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        int int19 = magazine6.getId();
        int int20 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0");
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getTitle();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        magazine6.setValue((double) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        java.lang.String str22 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str22, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getId();
        java.lang.String str9 = magazine6.getEdition();
        magazine6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 100);
        double double18 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        boolean boolean13 = magazine6.isCanRent();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        int int12 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanRent();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 'a');
        java.lang.String str11 = magazine6.getLocation();
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanRent();
        double double16 = magazine6.getValue();
        java.lang.String str17 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,hi!,100,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setCanPurchase(false);
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 0);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 1);
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setCanRent(true);
        double double18 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getTitle();
        magazine6.setValue((double) 10.0f);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(97);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,,1,-1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) ' ', (double) 0.0f, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanPurchase(false);
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        objects.Magazine magazine6 = new objects.Magazine(97, "-1,MAGAZINE,hi!,,1,1.0,", "", (int) (byte) -1, (double) 100.0f, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 0L);
        java.lang.String str11 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,0.0," + "'", str11, "-1,MAGAZINE,hi!,,1,0.0,");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        int int13 = magazine6.getId();
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        magazine6.setRemainingCopies((int) (byte) 100);
        int int9 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        int int18 = magazine6.getId();
        java.lang.String str19 = magazine6.getLocation();
        java.lang.String str20 = magazine6.getTitle();
        java.lang.String str21 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str21, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.getTitle();
        double double14 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies(100);
        double double19 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean18 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 10);
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 0);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setRemainingCopies(100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean11 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.String str17 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str17, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 0);
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setValue((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getRemainingCopies();
        magazine6.setValue((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        int int8 = magazine6.getId();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        objects.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            physicalItem1.returnObject(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItem1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "", (int) (byte) 100, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        magazine6.setValue((double) (byte) -1);
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", (int) (short) 0, (double) 'a', "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setCanPurchase(false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setValue((double) 100);
        boolean boolean11 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanRent();
        java.lang.String str13 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        boolean boolean19 = magazine6.isCanPurchase();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = magazine6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        boolean boolean12 = magazine6.isCanPurchase();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setValue((double) 'a');
        java.lang.String str13 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setValue(10.0d);
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setRemainingCopies((int) '4');
        magazine6.setRemainingCopies((int) (byte) 0);
        java.lang.String str16 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", 10, 10.0d, "-1,MAGAZINE,hi!,,1,1.0,");
        magazine6.setCanPurchase(true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        int int7 = magazine6.getId();
        magazine6.setValue((double) (short) 1);
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,,hi!,-1,1.0," + "'", str10, "-1,MAGAZINE,,hi!,-1,1.0,");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setValue((double) (short) 0);
        magazine6.setRemainingCopies(35);
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) ' ');
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        magazine6.setRemainingCopies((int) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        int int10 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str8, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        double double10 = magazine6.getValue();
        boolean boolean11 = magazine6.isCanPurchase();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        boolean boolean16 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.getEdition();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getTitle();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setLocation("");
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        objects.Magazine magazine6 = new objects.Magazine(35, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 100, (double) 0.0f, "-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        double double15 = magazine6.getValue();
        magazine6.setCanRent(false);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        boolean boolean19 = magazine6.isCanPurchase();
        int int20 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.toCSVString();
        boolean boolean18 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str17, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getEdition();
        boolean boolean16 = magazine6.isCanPurchase();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        double double15 = magazine6.getValue();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        objects.Magazine magazine6 = new objects.Magazine(1, "", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) (short) 0, (double) 10.0f, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        java.lang.String str7 = magazine6.toCSVString();
        java.lang.String str8 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str7, "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str8, "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "-1,MAGAZINE,hi!,,1,1.0,", 0, (-1.0d), "-1,MAGAZINE,hi!,hi!,100,-1.0,");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (short) -1);
        int int13 = magazine6.getId();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "-1,MAGAZINE,,hi!,-1,35.0,", "", (int) 'a', (double) 100, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        magazine6.setCanPurchase(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getId();
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,hi!,,-1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getTitle();
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        objects.Magazine magazine6 = new objects.Magazine((-1), "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) ' ', (double) 1.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (short) -1);
        magazine6.setCanPurchase(false);
        boolean boolean19 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '4');
        int int18 = magazine6.getId();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.toCSVString();
        java.lang.String str17 = magazine6.getEdition();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        int int11 = magazine6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        magazine6.setCanRent(false);
        magazine6.setCanRent(false);
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getId();
        magazine6.setCanRent(false);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        magazine6.setValue((double) (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str13, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", (int) (short) 1, (double) (-1L), "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,hi!,100,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) '#', 0.0d, "");
        magazine6.setValue((double) (short) 0);
        boolean boolean9 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        double double13 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str12, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setValue(10.0d);
        magazine6.setCanRent(true);
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "-1,MAGAZINE,,hi!,-1,1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) (short) 1, (double) 100L, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getId();
        java.lang.String str15 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str13, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,,hi!,-1,1.0,", 10, (double) ' ', "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        int int8 = magazine6.getId();
        int int9 = magazine6.getRemainingCopies();
        magazine6.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setValue(0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setValue((double) (short) 0);
        int int10 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (short) 10, (double) 10, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        magazine6.setCanPurchase(false);
        int int24 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        double double18 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        magazine6.setLocation("hi!");
        magazine6.setRemainingCopies(100);
        magazine6.setValue((double) 0L);
        objects.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord23 = magazine6.borrow(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        objects.Magazine magazine6 = new objects.Magazine(10, "-1,MAGAZINE,hi!,,1,100.0,", "hi!", (int) (byte) 10, (double) 100L, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "-1,MAGAZINE,,hi!,-1,35.0,", "", (int) 'a', (double) 100, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        int int15 = magazine6.getRemainingCopies();
        java.lang.String str16 = magazine6.getLocation();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean19 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.getLocation();
        int int17 = magazine6.getId();
        java.lang.String str18 = magazine6.getEdition();
        magazine6.setValue(10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setValue((double) (byte) 0);
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(1);
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,0.0," + "'", str11, "-1,MAGAZINE,hi!,,1,0.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setValue((double) 'a');
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        objects.Magazine magazine6 = new objects.Magazine((-1), "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) ' ', (double) 1.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        magazine6.setLocation("hi!");
        int int18 = magazine6.getId();
        java.lang.String str19 = magazine6.getTitle();
        double double20 = magazine6.getValue();
        java.lang.Class<?> wildcardClass21 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.getLocation();
        double double17 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (-1L));
        double double12 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.toCSVString();
        boolean boolean11 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,,,35,0.0,hi!" + "'", str10, "-1,MAGAZINE,,,35,0.0,hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        java.lang.String str13 = magazine6.getTitle();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.toCSVString();
        int int11 = magazine6.getId();
        double double12 = magazine6.getValue();
        magazine6.setRemainingCopies((int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        double double16 = magazine6.getValue();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", (int) 'a', (double) 52, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str17 = magazine6.toCSVString();
        double double18 = magazine6.getValue();
        magazine6.setValue((double) (-1.0f));
        int int21 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str17, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        int int11 = magazine6.getRemainingCopies();
        int int12 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (short) -1);
        magazine6.setCanPurchase(false);
        boolean boolean19 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setValue((double) 35);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setValue((double) 100L);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,,1,1.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) (short) -1, (double) 100L, "");
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getTitle();
        double double15 = magazine6.getValue();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,,1,1.0,", "-1,MAGAZINE,hi!,,100,10.0,", 1, (double) (short) 10, "-1,MAGAZINE,hi!,,1,10.0,");
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        int int17 = magazine6.getRemainingCopies();
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (-1));
        int int9 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) (byte) 100);
        java.lang.String str12 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setCanPurchase(true);
        int int13 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getEdition();
        int int16 = magazine6.getId();
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        boolean boolean11 = magazine6.isCanPurchase();
        boolean boolean12 = magazine6.isCanRent();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(97);
        double double17 = magazine6.getValue();
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getLocation();
        magazine6.setValue((double) 'a');
        int int18 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", 10, (double) '#', "");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "", (int) (byte) -1, 35.0d, "-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str7 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        java.lang.String str14 = magazine6.getLocation();
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str17 = magazine6.getLocation();
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str17, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str18, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        java.lang.String str18 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        int int13 = magazine6.getId();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!" + "'", str9, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setValue((double) 10.0f);
        magazine6.setRemainingCopies((int) (byte) -1);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        java.lang.String str22 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0," + "'", str22, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getLocation();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanPurchase();
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (short) -1);
        double double18 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        boolean boolean9 = magazine6.isCanPurchase();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        int int12 = magazine6.getId();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        boolean boolean9 = magazine6.isCanPurchase();
        java.lang.String str10 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        magazine6.setValue((double) (short) 10);
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        double double11 = magazine6.getValue();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        magazine6.setValue((double) (short) 1);
        java.lang.String str16 = magazine6.toCSVString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str16, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setCanRent(true);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", 100, (double) (short) 10, "-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setCanPurchase(false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        java.lang.String str10 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str8, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str10, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean18 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        boolean boolean21 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,100,10.0,", (int) (byte) -1, (double) (short) 0, "-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass8 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setValue((double) 10.0f);
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!", 1, (double) 0.0f, "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        boolean boolean7 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        int int13 = magazine6.getId();
        magazine6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setRemainingCopies((int) (short) -1);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getRemainingCopies();
        magazine6.setValue((double) 0.0f);
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str8, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str8, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (-1.0f));
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        int int13 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        int int15 = magazine6.getRemainingCopies();
        int int16 = magazine6.getId();
        double double17 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getId();
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getId();
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        java.lang.String str15 = magazine6.getTitle();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setValue(1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        int int9 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.getTitle();
        magazine6.setValue((double) ' ');
        magazine6.setValue((double) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (short) -1, 0.0d, "0,MAGAZINE,hi!,,-1,1.0,");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,-1,10.0," + "'", str17, "-1,MAGAZINE,hi!,,-1,10.0,");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        boolean boolean14 = magazine6.isCanRent();
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getId();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,", "-1,MAGAZINE,hi!,,1,100.0,", 0, (double) 1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 10);
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        int int18 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setLocation("");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getEdition();
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str17, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        double double11 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setValue((double) (short) 100);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        boolean boolean13 = magazine6.isCanRent();
        double double14 = magazine6.getValue();
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.toCSVString();
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.toCSVString();
        double double13 = magazine6.getValue();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies(1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        physicalItem1.setCanRent(true);
        org.junit.Assert.assertNotNull(physicalItem1);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (short) -1, (double) 1.0f, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(true);
        int int9 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str16 = magazine6.getTitle();
        java.lang.String str17 = magazine6.getTitle();
        magazine6.setCanRent(true);
        java.lang.String str20 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str20, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        int int15 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) 'a');
        magazine6.setLocation("-1,MAGAZINE,,,35,0.0,hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        boolean boolean12 = magazine6.isCanRent();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        objects.Magazine magazine6 = new objects.Magazine(32, "", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) 100, (double) 100L, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        double double14 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.toCSVString();
        java.lang.String str9 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str8, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str9, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        double double15 = magazine6.getValue();
        magazine6.setLocation("");
        java.lang.String str18 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str18, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        magazine6.setCanPurchase(false);
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        double double16 = magazine6.getValue();
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str17, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

