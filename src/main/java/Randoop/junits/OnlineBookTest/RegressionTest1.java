package Randoop.junits.OnlineBookTest;

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
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        int int12 = onlinebook6.getRemainingCopies();
        int int13 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("97,,0,hi!,hi!,10,52.0,,0,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        int int14 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass15 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) (byte) 100);
        onlinebook6.setCanPurchase(false);
        int int19 = onlinebook6.getId();
        boolean boolean20 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies((int) (byte) -1);
        java.lang.String str20 = onlinebook6.getLocation();
        double double21 = onlinebook6.getValue();
        int int22 = onlinebook6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setCanPurchase(false);
        boolean boolean9 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        double double14 = onlinebook6.getValue();
        boolean boolean15 = onlinebook6.isCanPurchase();
        int int16 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass17 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 1, "hi!", "", (int) (short) -1, (double) 10L, "97,,hi!,10,100.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = onlinebook6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "hi!", "0,hi!,hi!,10,100.0,", (int) (byte) 100, (double) (-1), "0,hi!,hi!,10,52.0,");
        onlinebook6.setCanRent(false);
        java.lang.String str9 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str9, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setValue((double) 100L);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        java.lang.String str14 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str14, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "97,,0,hi!,hi!,10,52.0,,0,10.0,", "97,,hi!,0,10.0,", 1, (double) (short) 0, "97,97,hi!,hi!,97,10.0,,,10,-1.0,");
        onlinebook6.setRemainingCopies((int) (byte) -1);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        boolean boolean8 = onlinebook6.isCanRent();
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
        int int11 = onlinebook6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 10L);
        onlinebook6.setValue((double) 1.0f);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = onlinebook6.isCanPurchase();
        java.lang.String str15 = onlinebook6.getLocation();
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", 0, (double) 97, "");
        onlinebook6.setCanRent(true);
        java.lang.Class<?> wildcardClass9 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        java.lang.String str20 = onlinebook6.getLocation();
        java.lang.String str21 = onlinebook6.toCSVString();
        int int22 = onlinebook6.getId();
        boolean boolean23 = onlinebook6.isCanRent();
        objects.User user24 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord25 = onlinebook6.borrow(user24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str20, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97,,0,hi!,hi!,10,52.0,,1,10.0," + "'", str21, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "97,,0,hi!,hi!,10,52.0,,1,10.0,", "1,,0,hi!,hi!,0,100.0,,0,100.0,", (int) (short) 10, 52.0d, "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        java.lang.String str14 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,hi!,100,100.0," + "'", str14, "0,hi!,hi!,100,100.0,");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setCanRent(true);
        onlinebook6.setCanPurchase(true);
        int int14 = onlinebook6.getId();
        onlinebook6.setLocation("97,97,hi!,hi!,97,10.0,,,10,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 0, "0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0,", "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,", (int) (byte) 100, (-1.0d), "");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", 0, (double) 97, "");
        boolean boolean7 = onlinebook6.isCanRent();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(1, "", "0,hi!,hi!,0,100.0,", (int) (byte) 0, (double) (short) 100, "0,hi!,hi!,10,52.0,");
        onlinebook6.setLocation("97,97,hi!,hi!,97,10.0,,,10,-1.0,");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (short) 1);
        int int11 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", 97, (double) (short) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        boolean boolean8 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) -1);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str7, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "hi!", "97,,hi!,-1,0.0,", (int) (byte) 100, (double) 'a', "97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies((int) '4');
        onlinebook6.setLocation("");
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = onlinebook6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        java.lang.Class<?> wildcardClass8 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        onlinebook6.setLocation("97,hi!,hi!,97,10.0,");
        onlinebook6.setCanPurchase(false);
        java.lang.String str14 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str14, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,", "97,,hi!,10,100.0,", (int) (byte) -1, 0.0d, "hi!");
        onlinebook6.setCanPurchase(true);
        java.lang.String str9 = onlinebook6.getTitle();
        int int10 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0," + "'", str9, "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("97,,hi!,10,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        boolean boolean10 = onlinebook6.isCanPurchase();
        boolean boolean11 = onlinebook6.isCanRent();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,hi!,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        java.lang.String str15 = onlinebook6.toCSVString();
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        java.lang.String str18 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        int int17 = onlinebook6.getId();
        double double18 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        java.lang.String str9 = onlinebook6.getLocation();
        int int10 = onlinebook6.getRemainingCopies();
        double double11 = onlinebook6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        boolean boolean13 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "0,hi!,hi!,0,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", (int) (byte) 0, (double) 100L, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("1,,0,hi!,hi!,0,100.0,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        java.lang.String str10 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '4', "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "hi!", (int) (short) -1, (double) (byte) -1, "hi!");
        onlinebook6.setLocation("0,hi!,97,,hi!,10,100.0,,10,100.0,");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "0,hi!,hi!,0,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", (int) (byte) 0, (double) 100L, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
        double double7 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        java.lang.String str19 = onlinebook6.toCSVString();
        java.lang.String str20 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str19, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,0,hi!,hi!,10,52.0,,1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        int int7 = onlinebook6.getRemainingCopies();
        java.lang.String str8 = onlinebook6.getTitle();
        java.lang.String str9 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str8, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str9, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setCanPurchase(false);
        boolean boolean21 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        int int15 = onlinebook6.getId();
        int int16 = onlinebook6.getRemainingCopies();
        java.lang.Class<?> wildcardClass17 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) (byte) 100);
        boolean boolean17 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        boolean boolean20 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        boolean boolean10 = onlinebook6.isCanPurchase();
        java.lang.String str11 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        onlinebook6.setCanPurchase(false);
        boolean boolean10 = onlinebook6.isCanRent();
        onlinebook6.setRemainingCopies((int) '#');
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(true);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        java.lang.String str13 = onlinebook6.getLocation();
        java.lang.String str14 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies((int) (short) -1);
        onlinebook6.setValue((double) ' ');
        onlinebook6.setCanRent(false);
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        java.lang.String str15 = onlinebook6.toCSVString();
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        java.lang.String str18 = onlinebook6.toCSVString();
        boolean boolean19 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str18, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.getLocation();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "0,hi!,hi!,0,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", (int) (byte) 100, (double) (short) 0, "");
        int int7 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        int int15 = onlinebook6.getRemainingCopies();
        java.lang.Class<?> wildcardClass16 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        boolean boolean11 = onlinebook6.isCanPurchase();
        boolean boolean12 = onlinebook6.isCanPurchase();
        boolean boolean13 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,", "97,,hi!,0,10.0,", (-1), (double) (-1.0f), "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        boolean boolean8 = onlinebook6.isCanRent();
        java.lang.String str9 = onlinebook6.getTitle();
        int int10 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str9, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setCanRent(true);
        onlinebook6.setCanPurchase(true);
        int int14 = onlinebook6.getId();
        boolean boolean15 = onlinebook6.isCanPurchase();
        double double16 = onlinebook6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '4', "97,hi!,hi!,97,10.0,", "", (int) ' ', (double) (-1.0f), "0,hi!,hi!,100,100.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue(1.0d);
        java.lang.String str10 = onlinebook6.getTitle();
        onlinebook6.setLocation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str7, "97,hi!,hi!,97,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str10, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '4', "97,hi!,hi!,97,10.0,", "", (int) ' ', (double) (-1.0f), "0,hi!,hi!,100,100.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue(1.0d);
        java.lang.String str10 = onlinebook6.getTitle();
        java.lang.String str11 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str7, "97,hi!,hi!,97,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str10, "97,hi!,hi!,97,10.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        java.lang.String str15 = onlinebook6.toCSVString();
        java.lang.String str16 = onlinebook6.getTitle();
        boolean boolean17 = onlinebook6.isCanRent();
        int int18 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        int int19 = onlinebook6.getRemainingCopies();
        boolean boolean20 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getId();
        java.lang.String str11 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str11, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        java.lang.String str9 = onlinebook6.getLocation();
        int int10 = onlinebook6.getRemainingCopies();
        java.lang.String str11 = onlinebook6.getLocation();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = onlinebook6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "97,,hi!,-1,0.0,", (int) (short) -1, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanRent(false);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "97,,hi!,10,100.0,", "0,hi!,hi!,10,52.0,", 0, (double) 1L, "");
        java.lang.String str7 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,10,100.0," + "'", str7, "97,,hi!,10,100.0,");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        onlinebook6.setValue((double) 0);
        double double19 = onlinebook6.getValue();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = onlinebook6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        java.lang.String str19 = onlinebook6.toCSVString();
        int int20 = onlinebook6.getId();
        java.lang.String str21 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str19, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        onlinebook6.setCanPurchase(false);
        onlinebook6.setLocation("100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,");
        java.lang.Class<?> wildcardClass17 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) '4');
        double double11 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        onlinebook6.setCanRent(true);
        onlinebook6.setLocation("0,hi!,97,,hi!,10,100.0,,10,100.0,");
        double double11 = onlinebook6.getValue();
        onlinebook6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass14 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(1, "", "0,hi!,hi!,0,100.0,", (int) (byte) 0, (double) (short) 100, "0,hi!,hi!,10,52.0,");
        onlinebook6.setCanPurchase(false);
        java.lang.String str9 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setValue(0.0d);
        double double13 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        java.lang.String str20 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str20, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanPurchase(true);
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 0);
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        java.lang.String str15 = onlinebook6.toCSVString();
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        int int18 = onlinebook6.getId();
        double double19 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        onlinebook6.setValue((double) (-1));
        double double17 = onlinebook6.getValue();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        int int11 = onlinebook6.getId();
        java.lang.String str12 = onlinebook6.toCSVString();
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97,,hi!,10,0.0," + "'", str12, "97,,hi!,10,0.0,");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        boolean boolean17 = onlinebook6.isCanRent();
        java.lang.String str18 = onlinebook6.getLocation();
        java.lang.String str19 = onlinebook6.toCSVString();
        int int20 = onlinebook6.getRemainingCopies();
        java.lang.String str21 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str18, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97,,0,hi!,hi!,10,52.0,,0,10.0," + "'", str19, "97,,0,hi!,hi!,10,52.0,,0,10.0,");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str21, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        int int14 = onlinebook6.getId();
        onlinebook6.setLocation("97,,hi!,0,10.0,");
        int int17 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) (byte) 100);
        onlinebook6.setCanPurchase(false);
        java.lang.String str19 = onlinebook6.getTitle();
        java.lang.String str20 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 100, "0,hi!,hi!,100,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", 97, (double) 100, "");
        onlinebook6.setCanPurchase(false);
        double double9 = onlinebook6.getValue();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        double double11 = onlinebook6.getValue();
        int int12 = onlinebook6.getRemainingCopies();
        onlinebook6.setValue((double) (-1L));
        java.lang.String str15 = onlinebook6.getLocation();
        boolean boolean16 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setLocation("");
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        double double8 = onlinebook6.getValue();
        java.lang.String str9 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        int int9 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies(0);
        onlinebook6.setValue(0.0d);
        int int14 = onlinebook6.getId();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = onlinebook6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        java.lang.String str8 = onlinebook6.toCSVString();
        java.lang.String str9 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str8, "97,hi!,hi!,97,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str9, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        int int12 = onlinebook6.getRemainingCopies();
        double double13 = onlinebook6.getValue();
        onlinebook6.setCanRent(true);
        boolean boolean16 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '4', "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "hi!", (int) (short) -1, (double) (byte) -1, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        boolean boolean17 = onlinebook6.isCanRent();
        java.lang.String str18 = onlinebook6.toCSVString();
        boolean boolean19 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,0,hi!,hi!,10,52.0,,0,10.0," + "'", str18, "97,,0,hi!,hi!,10,52.0,,0,10.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (short) 10);
        onlinebook6.setLocation("0,hi!,0,hi!,hi!,10,100.0,,-1,100.0,");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        onlinebook6.setRemainingCopies((int) (short) 100);
        double double15 = onlinebook6.getValue();
        int int16 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        boolean boolean19 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "0,hi!,hi!,10,100.0,", "97,,hi!,-1,0.0,", (int) 'a', (double) (-1.0f), "0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0,");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        boolean boolean8 = onlinebook6.isCanRent();
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
        int int11 = onlinebook6.getId();
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        boolean boolean8 = onlinebook6.isCanRent();
        java.lang.String str9 = onlinebook6.getTitle();
        int int10 = onlinebook6.getRemainingCopies();
        java.lang.Class<?> wildcardClass11 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str9, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(1, "", "0,hi!,hi!,0,100.0,", (int) (byte) 0, (double) (short) 100, "0,hi!,hi!,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        java.lang.String str7 = onlinebook6.getLocation();
        java.lang.String str8 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,,hi!,0,-1.0," + "'", str8, "32,,hi!,0,-1.0,");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies(0);
        boolean boolean18 = onlinebook6.isCanPurchase();
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        double double8 = onlinebook6.getValue();
        onlinebook6.setValue(52.0d);
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(true);
        boolean boolean19 = onlinebook6.isCanRent();
        java.lang.String str20 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str20, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        double double13 = onlinebook6.getValue();
        double double14 = onlinebook6.getValue();
        boolean boolean15 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setLocation("97,,hi!,0,10.0,");
        int int10 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(1, "0,hi!,hi!,100,100.0,", "0,hi!,hi!,0,100.0,", (int) ' ', (double) 100, "97,hi!,hi!,97,10.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '#', "hi!", "", (int) (short) 0, (double) (byte) -1, "0,hi!,hi!,10,100.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = onlinebook6.isCanPurchase();
        java.lang.String str15 = onlinebook6.getTitle();
        int int16 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        java.lang.String str18 = onlinebook6.getLocation();
        boolean boolean19 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 10);
        int int22 = onlinebook6.getRemainingCopies();
        java.lang.String str23 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str18, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "97,,0,hi!,hi!,10,52.0,,10,10.0," + "'", str23, "97,,0,hi!,hi!,10,52.0,,10,10.0,");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        boolean boolean14 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,0,10.0,", "hi!", (int) (short) -1, (double) '#', "hi!");
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str9 = onlinebook6.getLocation();
        onlinebook6.setValue((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str9, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        onlinebook6.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        onlinebook6.setCanRent(true);
        onlinebook6.setValue((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "hi!", "0,hi!,hi!,10,100.0,", (int) (byte) 100, (double) (-1), "0,hi!,hi!,10,52.0,");
        onlinebook6.setCanRent(false);
        double double9 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) '4');
        boolean boolean11 = onlinebook6.isCanRent();
        onlinebook6.setCanRent(false);
        java.lang.String str14 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        java.lang.String str17 = onlinebook6.toCSVString();
        int int18 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str17, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        int int19 = onlinebook6.getId();
        boolean boolean20 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies((int) (byte) -1);
        java.lang.String str20 = onlinebook6.getLocation();
        onlinebook6.setLocation("97,,hi!,10,0.0,");
        double double23 = onlinebook6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(32, "0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0,", "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,", (int) '#', (double) (byte) 1, "1,,0,hi!,hi!,0,100.0,,0,100.0,");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanPurchase();
        boolean boolean10 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 10);
        java.lang.String str13 = onlinebook6.getLocation();
        java.lang.String str14 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        boolean boolean17 = onlinebook6.isCanRent();
        int int18 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        java.lang.String str7 = onlinebook6.getLocation();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        onlinebook6.setRemainingCopies(1);
        java.lang.Class<?> wildcardClass12 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        onlinebook6.setRemainingCopies(1);
        java.lang.String str12 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97,hi!,hi!,1,1.0," + "'", str12, "97,hi!,hi!,1,1.0,");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        int int7 = onlinebook6.getRemainingCopies();
        onlinebook6.setValue((double) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setCanRent(true);
        double double10 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        double double16 = onlinebook6.getValue();
        java.lang.String str17 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str17, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "0,hi!,0,hi!,hi!,10,52.0,,1,100.0,", "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,", (int) (byte) -1, (double) (-1), "97,,hi!,10,0.0,");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getId();
        java.lang.String str11 = onlinebook6.toCSVString();
        onlinebook6.setValue((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str11, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 10, "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "97,,hi!,10,100.0,", 1, (double) (short) 100, "");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str12, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (short) -1);
        int int9 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        onlinebook6.setCanRent(true);
        java.lang.String str18 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "97,,hi!,0,10.0,", (int) (short) 100, (double) (short) 1, "0,hi!,hi!,10,100.0,");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies(0);
        boolean boolean13 = onlinebook6.isCanPurchase();
        java.lang.String str14 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,hi!,0,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(1, "", "0,hi!,hi!,0,100.0,", (int) (byte) 0, (double) (short) 100, "0,hi!,hi!,10,52.0,");
        int int7 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        java.lang.String str17 = onlinebook6.toCSVString();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str17, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "hi!", "0,hi!,hi!,10,100.0,", (int) (byte) 100, (double) (-1), "0,hi!,hi!,10,52.0,");
        onlinebook6.setCanRent(false);
        onlinebook6.setLocation("97,,0,hi!,hi!,10,52.0,,10,10.0,");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        int int8 = onlinebook6.getRemainingCopies();
        int int9 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setValue(10.0d);
        onlinebook6.setValue((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        boolean boolean8 = onlinebook6.isCanRent();
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies((int) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32,0,hi!,97,,hi!,-1,0.0,,10,52.0,,0,hi!,hi!,100,100.0,,1,-1.0," + "'", str11, "32,0,hi!,97,,hi!,-1,0.0,,10,52.0,,0,hi!,hi!,100,100.0,,1,-1.0,");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        onlinebook6.setCanRent(true);
        onlinebook6.setLocation("0,hi!,97,,hi!,10,100.0,,10,100.0,");
        boolean boolean11 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies(0);
        java.lang.String str13 = onlinebook6.getLocation();
        boolean boolean14 = onlinebook6.isCanPurchase();
        int int15 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies((int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97,,hi!,-1,0.0," + "'", str13, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        boolean boolean8 = onlinebook6.isCanRent();
        int int9 = onlinebook6.getId();
        onlinebook6.setValue((double) 1);
        double double12 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        onlinebook6.setCanRent(true);
        onlinebook6.setLocation("0,hi!,97,,hi!,10,100.0,,10,100.0,");
        boolean boolean11 = onlinebook6.isCanRent();
        onlinebook6.setRemainingCopies(1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = onlinebook6.isCanPurchase();
        java.lang.String str15 = onlinebook6.toCSVString();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = onlinebook6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str15, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        onlinebook6.setCanRent(true);
        double double9 = onlinebook6.getValue();
        int int10 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "97,,hi!,-1,0.0,", (int) (short) -1, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanRent(false);
        java.lang.String str9 = onlinebook6.getTitle();
        java.lang.String str10 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97,,hi!,-1,0.0," + "'", str10, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        java.lang.String str18 = onlinebook6.getLocation();
        boolean boolean19 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str18, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "0,hi!,hi!,0,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", (int) (byte) 0, (double) 100L, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
        java.lang.String str7 = onlinebook6.getLocation();
        onlinebook6.setLocation("0,hi!,0,hi!,hi!,10,52.0,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,0,hi!,hi!,10,52.0,,1,10.0," + "'", str7, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,", (int) (byte) 100, (double) 10.0f, "0,hi!,97,,hi!,10,100.0,,10,100.0,");
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
        int int9 = onlinebook6.getRemainingCopies();
        java.lang.String str10 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97,97,hi!,hi!,97,10.0,,,10,-1.0," + "'", str10, "97,97,hi!,hi!,97,10.0,,,10,-1.0,");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        boolean boolean12 = onlinebook6.isCanPurchase();
        java.lang.String str13 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        java.lang.String str8 = onlinebook6.toCSVString();
        java.lang.String str9 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str8, "97,hi!,hi!,97,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str9, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.getLocation();
        java.lang.String str8 = onlinebook6.getLocation();
        int int9 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        boolean boolean11 = onlinebook6.isCanPurchase();
        boolean boolean12 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        int int15 = onlinebook6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "1,,0,hi!,hi!,0,100.0,,0,100.0,", "0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0,", (int) (byte) 1, 32.0d, "0,hi!,0,hi!,hi!,10,100.0,,-1,100.0,");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        int int14 = onlinebook6.getId();
        double double15 = onlinebook6.getValue();
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        boolean boolean8 = onlinebook6.isCanRent();
        int int9 = onlinebook6.getId();
        onlinebook6.setValue((double) 1);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        onlinebook6.setCanRent(true);
        java.lang.String str14 = onlinebook6.getTitle();
        int int15 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        onlinebook6.setCanPurchase(false);
        onlinebook6.setCanRent(false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) '4');
        int int11 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass12 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setCanRent(true);
        onlinebook6.setCanPurchase(true);
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        int int12 = onlinebook6.getRemainingCopies();
        java.lang.String str13 = onlinebook6.getLocation();
        onlinebook6.setValue((double) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        java.lang.String str12 = onlinebook6.getLocation();
        boolean boolean13 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        java.lang.String str15 = onlinebook6.toCSVString();
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        java.lang.String str18 = onlinebook6.toCSVString();
        java.lang.String str19 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str18, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        int int17 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass18 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        onlinebook6.setCanRent(true);
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = onlinebook6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        onlinebook6.setCanRent(true);
        int int14 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("97,,hi!,10,0.0,");
        int int19 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "0,hi!,hi!,10,100.0,", "hi!", (int) '#', 0.0d, "97,,hi!,0,10.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        java.lang.String str8 = onlinebook6.toCSVString();
        java.lang.String str9 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0," + "'", str8, "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        boolean boolean12 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(true);
        java.lang.String str15 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanRent(false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "0,hi!,0,hi!,hi!,10,52.0,,1,100.0,", "0,hi!,hi!,0,0.0,", 10, (double) 100L, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "0,hi!,97,,hi!,10,100.0,,10,100.0,", "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,", (int) (byte) 10, (double) (-1L), "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        java.lang.String str14 = onlinebook6.toCSVString();
        java.lang.String str15 = onlinebook6.getLocation();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str14, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getRemainingCopies();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        int int13 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanRent(true);
        double double10 = onlinebook6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies(0);
        java.lang.String str13 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(false);
        java.lang.String str16 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97,,hi!,-1,0.0," + "'", str13, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        boolean boolean11 = onlinebook6.isCanPurchase();
        boolean boolean12 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getId();
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies(10);
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies((int) (byte) -1);
        java.lang.String str20 = onlinebook6.getLocation();
        onlinebook6.setLocation("97,,hi!,10,0.0,");
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", 97, (double) (short) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        boolean boolean8 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) -1);
        boolean boolean11 = onlinebook6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str7, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }
}

