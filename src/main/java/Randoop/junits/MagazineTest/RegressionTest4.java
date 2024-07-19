package Randoop.junits.MagazineTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setLocation("-1,MAGAZINE,hi!,,97,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        java.lang.String str9 = magazine6.getEdition();
        boolean boolean10 = magazine6.isCanRent();
        java.lang.String str11 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,,,35,0.0,hi!" + "'", str11, "-1,MAGAZINE,,,35,0.0,hi!");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setCanRent(false);
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(false);
        int int17 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies(0);
        java.lang.String str22 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str22, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,,hi!,10,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        double double7 = magazine6.getValue();
        int int8 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (byte) 0);
        boolean boolean18 = magazine6.isCanPurchase();
        int int19 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        objects.Magazine magazine6 = new objects.Magazine(10, "0,MAGAZINE,hi!,,-1,100.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) -1, (double) (short) 100, "hi!");
        java.lang.String str7 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,-1,100.0,hi!" + "'", str7, "10,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,-1,100.0,hi!");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanRent(false);
        int int15 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        objects.Magazine magazine6 = new objects.Magazine((-1), "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,", "-1,MAGAZINE,hi!,,0,-1.0,", (int) 'a', (double) (byte) 100, "-1,MAGAZINE,,hi!,-1,1.0,");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        int int19 = magazine6.getId();
        java.lang.String str20 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str20, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean14 = magazine6.isCanRent();
        int int15 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(true);
        double double9 = magazine6.getValue();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        int int18 = magazine6.getRemainingCopies();
        magazine6.setValue((double) '4');
        magazine6.setLocation("-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        boolean boolean7 = magazine6.isCanRent();
        double double8 = magazine6.getValue();
        boolean boolean9 = magazine6.isCanRent();
        double double10 = magazine6.getValue();
        magazine6.setRemainingCopies((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        java.lang.String str20 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,,1,1.0," + "'", str20, "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (-1));
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setLocation("1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        java.lang.String str18 = magazine6.getEdition();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,,97,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setRemainingCopies((int) 'a');
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) '#');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str11 = magazine6.getLocation();
        magazine6.setValue((double) 'a');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setValue(100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        magazine6.setValue((double) (byte) -1);
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) '4', (double) (byte) 1, "");
        magazine6.setCanPurchase(false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(97);
        magazine6.setRemainingCopies(0);
        double double19 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.getLocation();
        int int17 = magazine6.getId();
        double double18 = magazine6.getValue();
        int int19 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str22 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.toCSVString();
        java.lang.String str15 = magazine6.getTitle();
        double double16 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0," + "'", str14, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        double double11 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) 'a');
        magazine6.setValue((double) (-1.0f));
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str19 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,-1,-1.0," + "'", str19, "-1,MAGAZINE,hi!,,-1,-1.0,");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.getTitle();
        magazine6.setValue((double) ' ');
        java.lang.String str19 = magazine6.getEdition();
        int int20 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (byte) 10);
        int int15 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 10);
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        objects.Magazine magazine6 = new objects.Magazine(97, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", 0, (double) (short) 10, "-1,MAGAZINE,,hi!,-1,35.0,");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,,,1,100.0,1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (short) -1, (double) 32, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        java.lang.String str10 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str10, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        java.lang.String str17 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        int int10 = magazine6.getRemainingCopies();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 1);
        double double15 = magazine6.getValue();
        magazine6.setValue((double) 1);
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean11 = magazine6.isCanPurchase();
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setValue(10.0d);
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setValue((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getTitle();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
            magazine6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str14, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        boolean boolean18 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        magazine6.setRemainingCopies(100);
        java.lang.String str11 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,MAGAZINE,hi!,,100,100.0," + "'", str11, "0,MAGAZINE,hi!,,100,100.0,");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setValue((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        int int15 = magazine6.getId();
        magazine6.setValue((double) 1.0f);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '4', 35.0d, "0,MAGAZINE,hi!,,100,100.0,");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setValue(0.0d);
        magazine6.setRemainingCopies((int) (byte) -1);
        magazine6.setRemainingCopies((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        magazine6.setCanRent(true);
        java.lang.String str12 = magazine6.toCSVString();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str12, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        boolean boolean19 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies(97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        boolean boolean19 = magazine6.isCanRent();
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        int int22 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setLocation("");
        double double16 = magazine6.getValue();
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setValue((double) (short) 0);
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        objects.Magazine magazine6 = new objects.Magazine(0, "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "35,MAGAZINE,,hi!,0,100.0,0", (-1), (double) 10, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
        magazine6.setCanPurchase(true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        double double13 = magazine6.getValue();
        magazine6.setValue((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        int int9 = magazine6.getId();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setValue((double) (short) -1);
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) 'a', (double) 0.0f, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        double double7 = magazine6.getValue();
        boolean boolean8 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (-1));
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) '4', (double) (byte) 1, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "-1,MAGAZINE,hi!,,1,1.0,", "-1,MAGAZINE,hi!,,1,0.0,", (int) (short) 100, (double) 100.0f, "-1,MAGAZINE,hi!,,10,100.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanRent(false);
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        objects.Magazine magazine6 = new objects.Magazine((-1), "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 0, (double) 1, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        magazine6.setCanPurchase(false);
        boolean boolean9 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,100.0,-1,MAGAZINE,hi!,,100,10.0," + "'", str7, "32,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,100.0,-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        int int8 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(false);
        int int17 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int20 = magazine6.getId();
        java.lang.String str21 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str21, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setValue((double) (short) 100);
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getId();
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        int int8 = magazine6.getRemainingCopies();
        boolean boolean9 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setValue(0.0d);
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.toCSVString();
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,32,0.0," + "'", str16, "-1,MAGAZINE,hi!,,32,0.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str9, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 1);
        double double15 = magazine6.getValue();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.lang.String str21 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str19, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str21, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        objects.Magazine magazine6 = new objects.Magazine((-1), "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 0, (double) 10L, "hi!");
        java.lang.String str7 = magazine6.getLocation();
        double double8 = magazine6.getValue();
        java.lang.String str9 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("10,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,-1,100.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 0, (double) (short) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setValue((double) 100L);
        boolean boolean9 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        java.lang.String str14 = magazine6.getTitle();
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.toCSVString();
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str16, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str17, "-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "-1,MAGAZINE,hi!,hi!,1,10.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", 32, 97.0d, "-1,MAGAZINE,hi!,hi!,1,10.0,");
        magazine6.setRemainingCopies((int) (short) 10);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", (int) '4', (double) 10, "-1,MAGAZINE,hi!,,1,0.0,");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getEdition();
        int int9 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,0.0," + "'", str8, "-1,MAGAZINE,hi!,,1,0.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        double double18 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        double double16 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 100L);
        java.lang.String str14 = magazine6.getTitle();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str15, "-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str17 = magazine6.toCSVString();
        int int18 = magazine6.getId();
        java.lang.String str19 = magazine6.getEdition();
        boolean boolean20 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str17, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,,32,10.0,", (-1), (double) 10L, "-1,MAGAZINE,hi!,hi!,-1,10.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,-1,0.0,hi!", (int) (byte) 10, (double) 1, "0,MAGAZINE,hi!,,100,100.0,");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setCanRent(true);
        magazine6.setLocation("-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
        int int11 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) (byte) 0, (double) (-1), "-1,MAGAZINE,hi!,,-1,10.0,");
        magazine6.setRemainingCopies((int) (byte) 1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) (byte) -1);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "35,MAGAZINE,,hi!,0,100.0,0", "0,MAGAZINE,hi!,,-1,0.0,", (-1), (double) 0.0f, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,", 10, (double) 32, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass8 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        boolean boolean11 = magazine6.isCanRent();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        int int12 = magazine6.getRemainingCopies();
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        java.lang.String str18 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str15, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.String str15 = magazine6.getTitle();
        int int16 = magazine6.getRemainingCopies();
        int int17 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str15, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str11 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getLocation();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        int int15 = magazine6.getRemainingCopies();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setCanRent(false);
        java.lang.String str19 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "", "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", (int) '4', (double) (-1), "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        double double8 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setValue(100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setCanRent(true);
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setValue(0.0d);
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanPurchase();
        java.lang.String str10 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        double double9 = magazine6.getValue();
        boolean boolean10 = magazine6.isCanRent();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean11 = magazine6.isCanPurchase();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setValue((double) (short) 10);
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", 35, (double) 52, "-1,MAGAZINE,hi!,,-1,10.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.String str15 = magazine6.getLocation();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,0.0,,100,32.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean14 = magazine6.isCanRent();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,-1,10.0,", "", 100, 97.0d, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,97,10.0,", 52, (double) (byte) 1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,0,MAGAZINE,hi!,,-1,100.0,,100,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '4', (double) 0.0f, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
        magazine6.setCanPurchase(false);
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        magazine6.setRemainingCopies((int) (byte) 100);
        magazine6.setLocation("1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        magazine6.setCanRent(true);
        int int13 = magazine6.getRemainingCopies();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) '#');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        int int20 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0," + "'", str19, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        int int8 = magazine6.getId();
        int int9 = magazine6.getId();
        java.lang.String str10 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setValue(10.0d);
        int int9 = magazine6.getRemainingCopies();
        int int10 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.getLocation();
        magazine6.setValue((double) (-1.0f));
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", (-1), (double) '#', "-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setValue((double) 100.0f);
        double double9 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.toCSVString();
        int int17 = magazine6.getRemainingCopies();
        double double18 = magazine6.getValue();
        int int19 = magazine6.getRemainingCopies();
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "-1,MAGAZINE,hi!,,100,10.0,", (int) '4', (double) 1L, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.getTitle();
        boolean boolean10 = magazine6.isCanPurchase();
        double double11 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setValue((double) (-1L));
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.getEdition();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str14 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str19, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        boolean boolean9 = magazine6.isCanRent();
        double double10 = magazine6.getValue();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,0,MAGAZINE,hi!,,-1,100.0,,1,97.0,-1,MAGAZINE,,hi!,-1,35.0,", "-1,MAGAZINE,hi!,,-1,10.0,", 0, (double) 32, "");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,1,100.0,", (int) (short) -1, (double) (short) 100, "");
        java.lang.String str7 = magazine6.getEdition();
        boolean boolean8 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setValue((double) 0L);
        magazine6.setCanRent(false);
        java.lang.String str13 = magazine6.getTitle();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        magazine6.setRemainingCopies((int) '#');
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
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,,1,10.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,", 35, (double) (short) 0, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,10,10.0,");
        magazine6.setCanPurchase(true);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setValue((double) 0);
        boolean boolean15 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,32,0.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 1);
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setValue((double) 100.0f);
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) '4');
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        int int8 = magazine6.getId();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 1);
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str10, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,1,0.0,hi!" + "'", str13, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,1,0.0,hi!");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        objects.Magazine magazine6 = new objects.Magazine(52, "-1,MAGAZINE,hi!,,1,-1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,0,MAGAZINE,hi!,,-1,100.0,,1,97.0,-1,MAGAZINE,,hi!,-1,35.0,", (int) (short) 1, 97.0d, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,-1,MAGAZINE,,hi!,-1,35.0,,10,10.0,", "-1,MAGAZINE,hi!,hi!,100,-1.0,", 97, (double) (-1.0f), "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '4', 100.0d, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,97.0,");
        java.lang.String str7 = magazine6.getTitle();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,35,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "hi!", 0, (double) 100L, "-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str12, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.getTitle();
        java.lang.String str18 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        boolean boolean10 = magazine6.isCanRent();
        java.lang.String str11 = magazine6.getTitle();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) (short) 0, 1.0d, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
        magazine6.setValue((double) 97);
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
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '4');
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        int int20 = magazine6.getRemainingCopies();
        double double21 = magazine6.getValue();
        objects.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str20 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        boolean boolean13 = magazine6.isCanRent();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 100);
        magazine6.setCanRent(true);
        magazine6.setRemainingCopies((int) (short) 1);
        magazine6.setCanRent(true);
        double double22 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        int int19 = magazine6.getRemainingCopies();
        boolean boolean20 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        magazine6.setLocation("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "-1,MAGAZINE,hi!,,35,1.0,", "32,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,100.0,-1,MAGAZINE,hi!,,100,10.0,", (int) (short) -1, (double) 97, "");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        double double8 = magazine6.getValue();
        double double9 = magazine6.getValue();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setValue((double) 10.0f);
        magazine6.setRemainingCopies((int) ' ');
        java.lang.String str18 = magazine6.getTitle();
        boolean boolean19 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setValue((double) (short) 0);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "0,MAGAZINE,hi!,,-1,1.0,", "-1,MAGAZINE,hi!,hi!,-1,10.0,", (int) ' ', (double) 97, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,100.0,,1,-1.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
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
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        objects.Magazine magazine6 = new objects.Magazine(52, "hi!", "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,", 97, (double) 1, "-1,MAGAZINE,hi!,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,,35,10.0,");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setLocation("");
        java.lang.String str15 = magazine6.toCSVString();
        java.lang.String str16 = magazine6.getEdition();
        magazine6.setLocation("10,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,-1,100.0,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        int int16 = magazine6.getRemainingCopies();
        java.lang.String str17 = magazine6.getEdition();
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) -1);
        boolean boolean16 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        objects.Magazine magazine6 = new objects.Magazine(35, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 100, (double) 0.0f, "-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        magazine6.setLocation("35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        objects.Magazine magazine6 = new objects.Magazine(100, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", "-1,MAGAZINE,hi!,0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,,97,10.0,", (int) (short) 1, (double) 100.0f, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setLocation("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,1.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        boolean boolean10 = magazine6.isCanPurchase();
        magazine6.setLocation("100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setCanRent(false);
        java.lang.String str19 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (-1L));
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        magazine6.setRemainingCopies((int) (byte) 100);
        java.lang.String str11 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies(97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,0.0,,100,32.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        boolean boolean17 = magazine6.isCanRent();
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getEdition();
        int int9 = magazine6.getId();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        objects.Magazine magazine6 = new objects.Magazine(100, "0,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,,1,0.0,,100,32.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,", (int) '#', (double) 10.0f, "-1,MAGAZINE,hi!,,97,10.0,");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanRent();
        double double10 = magazine6.getValue();
        magazine6.setRemainingCopies(35);
        magazine6.setRemainingCopies(97);
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str9, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        magazine6.setCanRent(true);
        double double12 = magazine6.getValue();
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,35,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setValue((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getEdition();
        java.lang.String str9 = magazine6.getLocation();
        java.lang.String str10 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str10, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        double double11 = magazine6.getValue();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        boolean boolean13 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int14 = magazine6.getRemainingCopies();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,10,10.0,");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str12, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        boolean boolean16 = magazine6.isCanRent();
        int int17 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        magazine6.setValue((double) (byte) -1);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        int int11 = magazine6.getId();
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        boolean boolean10 = magazine6.isCanPurchase();
        int int11 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
        boolean boolean17 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,hi!,1,10.0,");
        java.lang.String str20 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanPurchase();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        objects.Magazine magazine6 = new objects.Magazine(35, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", 1, (-1.0d), "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setRemainingCopies((int) 'a');
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str9, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,0.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) '4', 0.0d, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,,1,52.0,", (int) '4', 35.0d, "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        objects.Magazine magazine6 = new objects.Magazine(97, "-1,MAGAZINE,hi!,,1,100.0,", "-1,MAGAZINE,hi!,hi!,1,10.0,", (int) (byte) 10, (double) 10.0f, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,");
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        double double18 = magazine6.getValue();
        java.lang.String str19 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str19, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("10,MAGAZINE,32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,10,10.0,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        magazine6.setValue((double) (-1L));
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setLocation("-1,MAGAZINE,hi!,,-1,-1.0,");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        int int15 = magazine6.getId();
        magazine6.setLocation("100,MAGAZINE,-1,MAGAZINE,hi!,,1,0.0,,0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!,52,0.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean12 = magazine6.isCanRent();
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies(35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setCanRent(false);
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        objects.Magazine magazine6 = new objects.Magazine(32, "-1,MAGAZINE,hi!,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,", "35,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,-1,MAGAZINE,hi!,,1,10.0,,97,0.0,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", 32, (double) ' ', "-1,MAGAZINE,hi!,,100,100.0,");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str11, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getTitle();
        int int16 = magazine6.getRemainingCopies();
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        java.lang.String str16 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str16, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str18 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,-1,10.0,", (int) (short) 0, (double) 0.0f, "-1,MAGAZINE,,-1,MAGAZINE,hi!,,1,100.0,,35,0.0,hi!");
        magazine6.setCanRent(true);
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setValue((double) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanRent(false);
        int int16 = magazine6.getRemainingCopies();
        magazine6.setLocation("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,10,10.0,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getTitle();
        java.lang.String str15 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str13, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setCanRent(true);
        int int9 = magazine6.getId();
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0");
        java.lang.String str12 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35,MAGAZINE,,hi!,0,100.0,0" + "'", str12, "35,MAGAZINE,,hi!,0,100.0,0");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        boolean boolean13 = magazine6.isCanPurchase();
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        int int11 = magazine6.getRemainingCopies();
        java.lang.String str12 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        magazine6.setRemainingCopies(10);
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str18, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        int int7 = magazine6.getRemainingCopies();
        boolean boolean8 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        int int8 = magazine6.getId();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 1);
        int int13 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str10, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "-1,MAGAZINE,hi!,,100,10.0,", (int) (byte) -1, (double) 1L, "-1,MAGAZINE,hi!,,10,10.0,");
        double double7 = magazine6.getValue();
        boolean boolean8 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "1,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,,,1,100.0,1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "-1,MAGAZINE,hi!,,100,10.0,", (int) (short) 0, (double) 0L, "0,MAGAZINE,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,,100,10.0,-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        int int13 = magazine6.getId();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        objects.Magazine magazine6 = new objects.Magazine((-1), "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) (short) 10, (double) (-1), "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        java.lang.String str9 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,10,-1.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,10,-1.0,100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,0,100.0,-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setValue((double) 10L);
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(0);
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        double double9 = magazine6.getValue();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(false);
        int int10 = magazine6.getId();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean9 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "0,MAGAZINE,hi!,,100,100.0,", "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) ' ', 0.0d, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        java.lang.String str18 = magazine6.getLocation();
        double double19 = magazine6.getValue();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0," + "'", str18, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) (byte) 10, (double) 10, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
        boolean boolean7 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '4');
        magazine6.setLocation("-1,MAGAZINE,hi!,,32,0.0,");
        magazine6.setValue((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        boolean boolean14 = magazine6.isCanRent();
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setValue((double) '#');
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        int int15 = magazine6.getRemainingCopies();
        magazine6.setValue((double) 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "0,MAGAZINE,hi!,,-1,1.0,", "-1,MAGAZINE,hi!,,0,-1.0,", (int) (byte) 10, (double) (byte) 100, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getEdition();
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setRemainingCopies((int) 'a');
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        magazine6.setRemainingCopies((int) (byte) 1);
        objects.User user26 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord27 = magazine6.borrow(user26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
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
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        int int11 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        boolean boolean10 = magazine6.isCanPurchase();
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        java.lang.String str14 = magazine6.getLocation();
        int int15 = magazine6.getId();
        magazine6.setValue((double) 35);
        double double18 = magazine6.getValue();
        int int19 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setValue(0.0d);
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        java.lang.String str13 = magazine6.getEdition();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getId();
        magazine6.setValue((double) (-1));
        double double16 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str12, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        java.lang.String str21 = magazine6.getTitle();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str18, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str20, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setCanPurchase(true);
        java.lang.String str9 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        double double13 = magazine6.getValue();
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,", "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", (int) (byte) 100, (double) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,0,10.0,");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        boolean boolean10 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        boolean boolean10 = magazine6.isCanRent();
        boolean boolean11 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setCanRent(true);
        java.lang.String str16 = magazine6.getLocation();
        java.lang.String str17 = magazine6.getLocation();
        java.lang.String str18 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str16, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str17, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str18, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setCanPurchase(true);
        java.lang.String str15 = magazine6.getTitle();
        magazine6.setCanRent(false);
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        magazine6.setLocation("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.setValue((double) (-1));
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }
}

