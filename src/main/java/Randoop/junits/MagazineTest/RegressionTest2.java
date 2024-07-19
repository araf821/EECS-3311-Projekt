package Randoop.junits.MagazineTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,", "-1,MAGAZINE,,hi!,-1,1.0,", (int) (byte) 0, 1.0d, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,1,-1.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,", 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,hi!,100,-1.0,", (-1), (double) 1.0f, "-1,MAGAZINE,hi!,,1,1.0,");
        java.lang.String str7 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str7, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        boolean boolean10 = magazine6.isCanPurchase();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setValue(0.0d);
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanRent();
        double double10 = magazine6.getValue();
        int int11 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setValue((double) '#');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        int int9 = magazine6.getId();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setValue((double) (short) -1);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanRent();
        double double16 = magazine6.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        objects.Magazine magazine6 = new objects.Magazine((-1), "-1,MAGAZINE,hi!,,1,10.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (short) 10, (double) 10.0f, "-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str7 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setLocation("1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,-1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!", 1, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 10);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.toCSVString();
        double double12 = magazine6.getValue();
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanRent();
        double double16 = magazine6.getValue();
        int int17 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        boolean boolean20 = magazine6.isCanRent();
        java.lang.String str21 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,,-1,10.0,");
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setRemainingCopies(10);
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setRemainingCopies((int) (short) 1);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setValue((double) 1L);
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (-1));
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str10, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies((-1));
        double double15 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        int int10 = magazine6.getRemainingCopies();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        magazine6.setValue((double) (short) 10);
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setValue(100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,,,35,0.0,hi!");
        org.junit.Assert.assertNotNull(physicalItem1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,-1,10.0,", 1, 10.0d, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.getLocation();
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getLocation();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getEdition();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        java.lang.String str14 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "-1,MAGAZINE,hi!,hi!,-1,10.0,", 97, (double) (-1L), "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        magazine6.setCanPurchase(false);
        boolean boolean13 = magazine6.isCanPurchase();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        int int12 = magazine6.getId();
        magazine6.setRemainingCopies(32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.String str17 = magazine6.toCSVString();
        boolean boolean18 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str17, "-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (-1L));
        magazine6.setCanPurchase(true);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str16, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", 1, (double) 1.0f, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) '4');
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.String str17 = magazine6.toCSVString();
        boolean boolean18 = magazine6.isCanRent();
        double double19 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str17, "-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.String str23 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0," + "'", str22, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getTitle();
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        magazine6.setRemainingCopies((-1));
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        double double9 = magazine6.getValue();
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.String str23 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0," + "'", str22, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0," + "'", str23, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        java.lang.String str15 = magazine6.getTitle();
        java.lang.String str16 = magazine6.toCSVString();
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(false);
        int int17 = magazine6.getId();
        magazine6.setLocation("35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 1, "-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setCanRent(false);
        java.lang.String str16 = magazine6.getEdition();
        java.lang.String str17 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,-1,10.0," + "'", str17, "-1,MAGAZINE,hi!,,-1,10.0,");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", 100, (double) (short) 10, "-1,MAGAZINE,hi!,,1,100.0,");
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
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        objects.Magazine magazine6 = new objects.Magazine(97, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", 0, (double) (short) 10, "-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) 'a');
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        java.lang.String str15 = magazine6.getTitle();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        magazine6.setValue((double) 100);
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        magazine6.setRemainingCopies((int) ' ');
        boolean boolean9 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        java.lang.String str19 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        double double15 = magazine6.getValue();
        magazine6.setLocation("");
        int int18 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str21, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str22, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        int int16 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str12, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getLocation();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 1);
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        magazine6.setValue((double) (short) 1);
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setRemainingCopies(32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        objects.Magazine magazine6 = new objects.Magazine((-1), "-1,MAGAZINE,,hi!,-1,35.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!", 0, 97.0d, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str11 = magazine6.toCSVString();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanPurchase();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        int int17 = magazine6.getId();
        boolean boolean18 = magazine6.isCanPurchase();
        int int19 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        int int13 = magazine6.getId();
        magazine6.setCanPurchase(true);
        java.lang.String str16 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setValue((double) 10.0f);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getId();
        boolean boolean17 = magazine6.isCanRent();
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        boolean boolean8 = magazine6.isCanPurchase();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", (-1), (-1.0d), "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "hi!", 0, (double) 100L, "-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setCanRent(true);
        boolean boolean9 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) -1);
        double double11 = magazine6.getValue();
        boolean boolean12 = magazine6.isCanRent();
        java.lang.String str13 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (-1));
        boolean boolean9 = magazine6.isCanPurchase();
        java.lang.String str10 = magazine6.getEdition();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str10, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        int int11 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setCanRent(false);
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        magazine6.setRemainingCopies((-1));
        magazine6.setValue((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,hi!,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,hi!,1,10.0,");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.toCSVString();
        int int17 = magazine6.getRemainingCopies();
        double double18 = magazine6.getValue();
        double double19 = magazine6.getValue();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "", "", (int) (short) 1, 10.0d, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        java.lang.String str11 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setLocation("");
        java.lang.String str15 = magazine6.getEdition();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanRent(false);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,0.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '4', 0.0d, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        int int7 = magazine6.getId();
        magazine6.setRemainingCopies(1);
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,0,MAGAZINE,hi!,,-1,100.0,,1,97.0,-1,MAGAZINE,,hi!,-1,35.0," + "'", str10, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,0,MAGAZINE,hi!,,-1,100.0,,1,97.0,-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        double double15 = magazine6.getValue();
        magazine6.setLocation("");
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,100,10.0,", (int) (byte) -1, (double) (short) 0, "-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setValue((double) (byte) 0);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 1);
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getId();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setValue(10.0d);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setCanRent(false);
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean11 = magazine6.isCanPurchase();
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        boolean boolean20 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 1);
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setValue((double) 100.0f);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        objects.User user24 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (byte) 100, (double) 97, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanRent();
        java.lang.String str15 = magazine6.getEdition();
        boolean boolean16 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", 35, (double) (byte) 100, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        double double15 = magazine6.getValue();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (short) 0, (double) 1L, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str9, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str18, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str15 = magazine6.getTitle();
        java.lang.String str16 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str15, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,100.0,,1,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,100.0,,1,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,", 0, (double) (short) -1, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        int int7 = magazine6.getId();
        magazine6.setRemainingCopies(1);
        int int10 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", (int) '4', (double) 10, "-1,MAGAZINE,hi!,,1,0.0,");
        int int7 = magazine6.getRemainingCopies();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.lang.String str18 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str18, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getLocation();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        magazine6.setValue(35.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        magazine6.setCanRent(true);
        java.lang.String str15 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        double double10 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.toCSVString();
        int int11 = magazine6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,", "", (int) (byte) 1, (double) 100, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        java.lang.String str7 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,,,1,100.0,1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str7, "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,,,1,100.0,1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        boolean boolean13 = magazine6.isCanPurchase();
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setRemainingCopies(100);
        java.lang.String str9 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str9, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0");
        magazine6.setLocation("");
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (byte) -1);
        magazine6.setValue((double) 10.0f);
        java.lang.String str14 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,-1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,-1,10.0,");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanRent();
        java.lang.String str15 = magazine6.getEdition();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        java.lang.Class<?> wildcardClass22 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        int int8 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.String str14 = magazine6.toCSVString();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str14, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str15, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) '4', (double) (byte) 1, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int7 = magazine6.getId();
        boolean boolean8 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getEdition();
        java.lang.String str17 = magazine6.getTitle();
        int int18 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str17 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,hi!,-1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str17, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        magazine6.setValue((-1.0d));
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(false);
        int int17 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", (int) '4', (double) 10, "-1,MAGAZINE,hi!,,1,0.0,");
        magazine6.setValue((double) 1L);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        magazine6.setValue((double) 10.0f);
        magazine6.setCanRent(false);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (short) -1, (double) 1.0f, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        magazine6.setLocation("1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str21, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str22, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "35,MAGAZINE,,hi!,0,100.0,0", "-1,MAGAZINE,hi!,,1,0.0,", (int) (short) 100, (double) 10L, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
        magazine6.setRemainingCopies((int) (short) 100);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        boolean boolean12 = magazine6.isCanRent();
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setValue((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 1);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str8, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        objects.User user24 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        boolean boolean18 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getId();
        int int17 = magazine6.getId();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setCanRent(true);
        java.lang.String str16 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str16, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (byte) 0);
        magazine6.setLocation("-1,MAGAZINE,hi!,hi!,-1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        objects.Magazine magazine6 = new objects.Magazine(52, "-1,MAGAZINE,hi!,,-1,10.0,", "hi!", (int) (byte) 1, (double) (short) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean9 = magazine6.isCanRent();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        int int18 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str17, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        int int15 = magazine6.getRemainingCopies();
        java.lang.String str16 = magazine6.getLocation();
        int int17 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,", "", 10, (double) '4', "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,hi!,,-1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setValue((double) (short) -1);
        int int17 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = magazine6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str17, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) (byte) 0, (double) (-1), "-1,MAGAZINE,hi!,,-1,10.0,");
        magazine6.setCanPurchase(true);
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getEdition();
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        double double18 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        int int9 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        java.lang.String str20 = magazine6.getEdition();
        int int21 = magazine6.getRemainingCopies();
        java.lang.String str22 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,hi!,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "-1,MAGAZINE,hi!,,100,10.0,", (int) (byte) -1, (double) 1L, "-1,MAGAZINE,hi!,,10,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getLocation();
        java.lang.String str9 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str7, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str8, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getEdition();
        int int17 = magazine6.getRemainingCopies();
        java.lang.String str18 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 10);
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "", "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,", (int) (byte) 10, (double) 10L, "");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        magazine6.setRemainingCopies(1);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        int int12 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setValue((-1.0d));
        magazine6.setLocation("-1,MAGAZINE,hi!,,-1,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,", 10, (double) '4', "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanRent(false);
        double double10 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 97);
        java.lang.String str21 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,97.0," + "'", str21, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,97.0,");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        magazine6.setCanPurchase(false);
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getLocation();
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean14 = magazine6.isCanPurchase();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str12, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '#', (double) (short) -1, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.toCSVString();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "1,MAGAZINE,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,35,-1.0,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str8, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str13, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        boolean boolean11 = magazine6.isCanRent();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.toCSVString();
        boolean boolean9 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (-1L));
        magazine6.setCanPurchase(true);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        java.lang.String str11 = magazine6.getLocation();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        double double20 = magazine6.getValue();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str19, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setValue((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) 'a', (double) 0.0f, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        java.lang.String str7 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanRent();
        int int16 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "0,MAGAZINE,hi!,,-1,1.0,", (int) (byte) -1, (double) 100L, "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        int int17 = magazine6.getId();
        java.lang.String str18 = magazine6.getLocation();
        double double19 = magazine6.getValue();
        java.lang.String str20 = magazine6.getLocation();
        double double21 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str18, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str20, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getTitle();
        int int13 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = magazine6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        magazine6.setValue((double) (short) 1);
        java.lang.String str16 = magazine6.toCSVString();
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str16, "-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.getEdition();
        boolean boolean18 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        int int17 = magazine6.getId();
        java.lang.String str18 = magazine6.getTitle();
        boolean boolean19 = magazine6.isCanPurchase();
        boolean boolean20 = magazine6.isCanRent();
        java.lang.String str21 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str21, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getId();
        magazine6.setValue((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str15, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanRent();
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        boolean boolean16 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        java.lang.String str16 = magazine6.getEdition();
        magazine6.setValue((double) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        boolean boolean13 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setValue(0.0d);
        magazine6.setValue((double) 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        double double11 = magazine6.getValue();
        java.lang.String str12 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setValue((double) (short) 0);
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,0.0," + "'", str10, "0,MAGAZINE,hi!,,-1,0.0,");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        double double12 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 'a');
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        java.lang.String str13 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        java.lang.String str20 = magazine6.getEdition();
        int int21 = magazine6.getRemainingCopies();
        double double22 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) (short) 1);
        double double17 = magazine6.getValue();
        int int18 = magazine6.getRemainingCopies();
        java.lang.String str19 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,,hi!,-1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.getEdition();
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "-1,MAGAZINE,,,35,0.0,hi!", "-1,MAGAZINE,hi!,,1,-1.0,", 32, (double) 35, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) (short) 10);
        double double19 = magazine6.getValue();
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double13 = magazine6.getValue();
        magazine6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getLocation();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,10.0,", "", 52, (double) ' ', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,97.0,");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,,,35,0.0,hi!");
        org.junit.Assert.assertNotNull(physicalItem1);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 10);
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanPurchase();
        double double10 = magazine6.getValue();
        boolean boolean11 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        boolean boolean14 = magazine6.isCanRent();
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setRemainingCopies(1);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setRemainingCopies(32);
        magazine6.setLocation("-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
        java.lang.String str18 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str13, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,,32,10.0," + "'", str18, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,,32,10.0,");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        magazine6.setRemainingCopies((int) '4');
        java.lang.String str12 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        double double15 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 100);
        magazine6.setCanRent(true);
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setValue((double) (short) 0);
        double double10 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str13, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "", 10, (double) 10.0f, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        int int7 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setCanRent(false);
        int int11 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanPurchase();
        int int15 = magazine6.getId();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        double double10 = magazine6.getValue();
        boolean boolean11 = magazine6.isCanPurchase();
        int int12 = magazine6.getId();
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        magazine6.setRemainingCopies((int) '4');
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 0);
        int int16 = magazine6.getRemainingCopies();
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", (int) ' ', (double) (byte) 100, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanRent();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str7, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanRent();
        double double16 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        objects.Magazine magazine6 = new objects.Magazine((-1), "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 0, (double) 10L, "hi!");
        java.lang.String str7 = magazine6.getLocation();
        int int8 = magazine6.getId();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,,,35,0.0,hi!", "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) 'a', (double) (byte) 100, "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.toCSVString();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) 'a', (double) 0.0f, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        double double7 = magazine6.getValue();
        magazine6.setValue((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,hi!,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,hi!,100,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        double double10 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,100.0,,1,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getId();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        int int15 = magazine6.getRemainingCopies();
        int int16 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanPurchase();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getId();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) (short) 1, (double) 100.0f, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,0.0,", 0, (double) (short) 0, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", (int) (short) 100, (double) 'a', "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        magazine6.setValue(10.0d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.toCSVString();
        java.lang.String str12 = magazine6.getTitle();
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        java.lang.String str15 = magazine6.getTitle();
        java.lang.String str16 = magazine6.toCSVString();
        java.lang.String str17 = magazine6.getLocation();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        double double12 = magazine6.getValue();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getId();
        magazine6.setValue(0.0d);
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str12, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str19 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        double double13 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,97,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setValue((double) 10.0f);
        double double18 = magazine6.getValue();
        int int19 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setRemainingCopies(1);
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        magazine6.setLocation("52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        int int17 = magazine6.getId();
        java.lang.String str18 = magazine6.getLocation();
        double double19 = magazine6.getValue();
        java.lang.String str20 = magazine6.getLocation();
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str18, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str20, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,97,10.0,", (int) ' ', (double) 1L, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        int int16 = magazine6.getId();
        magazine6.setRemainingCopies((int) '4');
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanRent(false);
        magazine6.setValue((double) 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getRemainingCopies();
        boolean boolean11 = magazine6.isCanPurchase();
        java.lang.String str12 = magazine6.getLocation();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0");
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,1,10.0,");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setValue((double) (short) 100);
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        magazine6.setLocation("52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (short) 1, (double) 'a', "hi!");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (short) 1);
        java.lang.String str15 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.getTitle();
        double double17 = magazine6.getValue();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        java.lang.String str17 = magazine6.toCSVString();
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,10.0,", "", 1, (double) '#', "-1,MAGAZINE,,hi!,-1,35.0,");
        int int7 = magazine6.getId();
        double double8 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        objects.Magazine magazine6 = new objects.Magazine(100, "", "", (int) (short) 10, (double) (short) 0, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
        java.lang.String str7 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,hi!,100,-1.0," + "'", str7, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "35,MAGAZINE,,hi!,0,100.0,0", "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", (int) '4', (double) 0L, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
        magazine6.setValue((double) (short) 0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        magazine6.setLocation("hi!");
        int int18 = magazine6.getId();
        java.lang.String str19 = magazine6.getTitle();
        boolean boolean20 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 10);
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 1);
        double double15 = magazine6.getValue();
        int int16 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        java.lang.String str9 = magazine6.getEdition();
        magazine6.setValue((double) '4');
        int int12 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        boolean boolean12 = magazine6.isCanRent();
        boolean boolean13 = magazine6.isCanPurchase();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        magazine6.setValue((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,hi!,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (byte) 0);
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        objects.Magazine magazine6 = new objects.Magazine(32, "0,MAGAZINE,hi!,,-1,1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!", (int) (short) -1, 0.0d, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str8, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setValue((double) 100L);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        magazine6.setValue(0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        boolean boolean13 = magazine6.isCanRent();
        double double14 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '#', (double) (short) -1, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!" + "'", str7, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        objects.Magazine magazine6 = new objects.Magazine((-1), "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", "-1,MAGAZINE,hi!,,1,1.0,", (int) (short) -1, (double) (short) 100, "");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        magazine6.setValue((double) (short) 1);
        java.lang.String str16 = magazine6.toCSVString();
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str16, "-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getEdition();
        boolean boolean16 = magazine6.isCanPurchase();
        int int17 = magazine6.getId();
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,", (int) (short) 0, (double) 0.0f, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
        magazine6.setValue(0.0d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "", (int) ' ', (double) 100L, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) -1);
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getTitle();
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,,32,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        objects.Magazine magazine6 = new objects.Magazine((-1), "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) ' ', (double) 1.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.getLocation();
        java.lang.String str15 = magazine6.toCSVString();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        objects.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,97,10.0,", (int) (byte) 0, (double) 1, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getEdition();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        boolean boolean12 = magazine6.isCanRent();
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getEdition();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getId();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        magazine6.setRemainingCopies(10);
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", 100, (double) '4', "1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        int int17 = magazine6.getId();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setValue((double) ' ');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        double double18 = magazine6.getValue();
        double double19 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 1);
        double double18 = magazine6.getValue();
        double double19 = magazine6.getValue();
        java.lang.String str20 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str20, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        boolean boolean7 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str17, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", (int) (short) 0, (double) 0L, "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,0.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '4', 0.0d, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        java.lang.String str8 = magazine6.getTitle();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = magazine6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,0.0," + "'", str8, "-1,MAGAZINE,hi!,,1,0.0,");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        java.lang.String str20 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass21 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (byte) 0, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        objects.Magazine magazine6 = new objects.Magazine(100, "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 97, (double) 0, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        int int14 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.toCSVString();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str11, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setCanRent(true);
        int int17 = magazine6.getId();
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        int int16 = magazine6.getId();
        magazine6.setCanRent(true);
        java.lang.String str19 = magazine6.toCSVString();
        boolean boolean20 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies(100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str19, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanRent();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setValue((double) (short) -1);
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        boolean boolean16 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.getLocation();
        java.lang.String str15 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        int int16 = magazine6.getRemainingCopies();
        java.lang.String str17 = magazine6.getEdition();
        magazine6.setCanRent(true);
        double double20 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        boolean boolean13 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getId();
        magazine6.setValue(0.0d);
        int int16 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str12, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setValue((double) 97);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        objects.Magazine magazine6 = new objects.Magazine(97, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '#', (double) (short) 0, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) ' ');
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,0.0,");
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,0.0,,100,32.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str15, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,0.0,,100,32.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,97,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.toCSVString();
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str16, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        double double15 = magazine6.getValue();
        java.lang.String str16 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,-1.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) (short) 1, (double) 0L, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        objects.Magazine magazine6 = new objects.Magazine(97, "-1,MAGAZINE,hi!,hi!,-1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) ' ', (double) 1.0f, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str18, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        int int15 = magazine6.getRemainingCopies();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,hi!,,-1,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.Class<?> wildcardClass2 = physicalItem1.getClass();
        org.junit.Assert.assertNotNull(physicalItem1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "1,MAGAZINE,,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,0,10.0,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,,,1,100.0,1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", 100, (double) 'a', "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.String str15 = magazine6.toCSVString();
        double double16 = magazine6.getValue();
        magazine6.setCanPurchase(false);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord20 = magazine6.borrow(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,1,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) 'a', (double) (byte) -1, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 1, 0.0d, "hi!");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getLocation();
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str8, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        double double11 = magazine6.getValue();
        java.lang.String str12 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str16 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        objects.Magazine magazine6 = new objects.Magazine(10, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,,32,10.0,", (int) (byte) 0, (double) 'a', "0,MAGAZINE,hi!,,-1,0.0,");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setValue((double) (short) 0);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double14 = magazine6.getValue();
        magazine6.setCanRent(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        java.lang.String str10 = magazine6.getTitle();
        java.lang.String str11 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        magazine6.setValue((-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        int int25 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass26 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getId();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies(32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.getTitle();
        java.lang.String str17 = magazine6.getEdition();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,0.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '4', 0.0d, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,0.0," + "'", str8, "-1,MAGAZINE,hi!,,1,0.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str14, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setValue((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(true);
        int int9 = magazine6.getId();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = magazine6.getTitle();
        java.lang.String str16 = magazine6.getLocation();
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        int int7 = magazine6.getRemainingCopies();
        boolean boolean8 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,97.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setValue(0.0d);
        magazine6.setRemainingCopies((int) (short) -1);
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        java.lang.String str18 = magazine6.getEdition();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setValue((double) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str11 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        double double14 = magazine6.getValue();
        magazine6.setValue((double) ' ');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,", "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) (short) 0, (double) 1, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
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
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        boolean boolean9 = magazine6.isCanPurchase();
        int int10 = magazine6.getRemainingCopies();
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        magazine6.setCanRent(true);
        magazine6.setValue((double) 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        magazine6.setRemainingCopies(1);
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user20);
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", (int) (byte) 10, (double) (-1L), "0,MAGAZINE,hi!,,-1,1.0,");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,hi!,100,-1.0,", (int) (byte) 10, (double) 97, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        objects.Magazine magazine6 = new objects.Magazine(0, "35,MAGAZINE,,hi!,0,100.0,0", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", (int) (short) 1, (double) 0L, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        magazine6.setCanRent(true);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 100);
        magazine6.setCanRent(true);
        magazine6.setRemainingCopies((int) (short) 1);
        magazine6.setCanRent(true);
        java.lang.String str22 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,0,MAGAZINE,hi!,,-1,100.0,,1,97.0,-1,MAGAZINE,,hi!,-1,35.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        int int11 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        objects.Magazine magazine6 = new objects.Magazine(1, "", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) (short) 0, (double) 10.0f, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        magazine6.setValue(10.0d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,0.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '4', 0.0d, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,0.0," + "'", str7, "-1,MAGAZINE,hi!,,1,0.0,");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getId();
        boolean boolean9 = magazine6.isCanRent();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setValue((double) (byte) 0);
        magazine6.setRemainingCopies((int) (byte) 0);
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) ' ');
        java.lang.String str11 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str11, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        magazine6.setValue((double) 0.0f);
        magazine6.setLocation("");
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,hi!,100,-1.0,", "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", 100, (double) (-1), "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,1,10.0,");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.lang.String str20 = magazine6.getTitle();
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        java.lang.String str20 = magazine6.getTitle();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        int int7 = magazine6.getId();
        magazine6.setCanPurchase(false);
        boolean boolean10 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        int int15 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) 'a');
        int int18 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.getLocation();
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setValue((double) 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0");
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (-1));
        magazine6.setCanRent(true);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str16 = magazine6.getTitle();
        java.lang.String str17 = magazine6.getTitle();
        double double18 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) '4', (double) (byte) 1, "");
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
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setValue((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        boolean boolean10 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        java.lang.String str8 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) 'a', (double) 0.0f, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setCanRent(true);
        java.lang.String str9 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str9, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        int int15 = magazine6.getRemainingCopies();
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.getLocation();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 1);
        int int12 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,1,100.0,", (int) (short) -1, (double) (short) 100, "");
        magazine6.setCanPurchase(false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", 100, (double) (short) 10, "-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str7 = magazine6.toCSVString();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0," + "'", str7, "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "-1,MAGAZINE,hi!,,1,1.0,", (int) (byte) 1, (double) (short) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,");
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        int int15 = magazine6.getId();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        magazine6.setCanRent(false);
        int int18 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,100,10.0,", (int) (byte) -1, (double) (short) 0, "-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 1, 0.0d, "0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getLocation();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "1,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,0,MAGAZINE,hi!,,-1,100.0,,1,0.0,0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str10, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        boolean boolean12 = magazine6.isCanPurchase();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setValue((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '4');
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setValue((double) 0);
        objects.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord23 = magazine6.borrow(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        objects.Magazine magazine6 = new objects.Magazine(35, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "hi!", (int) (short) 100, (double) (byte) 10, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,1,10.0,");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setValue(10.0d);
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setValue(1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}

