package Randoop.junits.CD;

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
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = cD6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        boolean boolean11 = cD6.isCanRent();
        java.lang.Class<?> wildcardClass12 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = cD6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,CD,,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,CD,,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        double double14 = cD6.getValue();
        java.lang.Class<?> wildcardClass15 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        int int14 = cD6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        int int11 = cD6.getRemainingCopies();
        int int12 = cD6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setCanRent(true);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setArtist("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,CD,,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.Class<?> wildcardClass7 = cD6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = cD6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setRemainingCopies((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setCanRent(false);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = cD6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        cD6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,CD,,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getArtist();
        cD6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((double) (short) -1);
        java.lang.Class<?> wildcardClass10 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setRemainingCopies((int) (byte) 100);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,-1,100.0,", "", (int) (byte) 1, (double) (short) 1, "35,CD,,,0,100.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        double double14 = cD6.getValue();
        cD6.setLocation("");
        cD6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        boolean boolean9 = cD6.isCanPurchase();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = cD6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        cD6.setArtist("35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        boolean boolean11 = cD6.isCanPurchase();
        boolean boolean12 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        boolean boolean11 = cD6.isCanRent();
        cD6.setCanRent(false);
        java.lang.String str14 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        java.lang.String str13 = cD6.getArtist();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = cD6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getArtist();
        java.lang.Class<?> wildcardClass8 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        java.lang.String str11 = cD6.toCSVString();
        java.lang.Class<?> wildcardClass12 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,CD,,,0,-1.0," + "'", str11, "35,CD,,,0,-1.0,");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        boolean boolean11 = cD6.isCanPurchase();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = cD6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,CD,,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setCanRent(true);
        java.lang.Class<?> wildcardClass14 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        cD6.setArtist("hi!");
        java.lang.String str18 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        int int9 = cD6.getId();
        java.lang.Class<?> wildcardClass10 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        cD6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.CD cD6 = new objects.CD((int) '#', "35,CD,,,-1,100.0,", "hi!", 1, (double) (short) 0, "35,CD,,,0,-1.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        boolean boolean11 = cD6.isCanRent();
        java.lang.String str12 = cD6.getTitle();
        java.lang.Class<?> wildcardClass13 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((double) (short) -1);
        java.lang.String str10 = cD6.getArtist();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = cD6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        int int13 = cD6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((double) (short) -1);
        java.lang.String str10 = cD6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getArtist();
        cD6.setCanPurchase(false);
        java.lang.String str16 = cD6.getArtist();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = cD6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        cD6.setRemainingCopies(35);
        java.lang.String str13 = cD6.getTitle();
        boolean boolean14 = cD6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        boolean boolean11 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setRemainingCopies((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = cD6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        java.lang.String str13 = cD6.getTitle();
        cD6.setRemainingCopies(10);
        boolean boolean16 = cD6.isCanPurchase();
        java.lang.Class<?> wildcardClass17 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CD\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setArtist("");
        double double10 = cD6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setCanRent(false);
        int int19 = cD6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        objects.CD cD6 = new objects.CD(0, "", "35,CD,,,0,100.0,", (int) 'a', (double) 0, "hi!");
        java.lang.String str7 = cD6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,CD,,35,CD,,,0,100.0,,97,0.0,hi!" + "'", str7, "0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        java.lang.String str11 = cD6.toCSVString();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,CD,,,0,-1.0," + "'", str11, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CD\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        cD6.setRemainingCopies(35);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = cD6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        cD6.setArtist("hi!");
        cD6.setCanPurchase(true);
        int int20 = cD6.getId();
        java.lang.Class<?> wildcardClass21 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setArtist("hi!");
        cD6.setRemainingCopies(10);
        cD6.setRemainingCopies((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        boolean boolean11 = cD6.isCanRent();
        cD6.setCanRent(false);
        double double14 = cD6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        java.lang.String str7 = cD6.getArtist();
        java.lang.Class<?> wildcardClass8 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CD\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        java.lang.String str13 = cD6.getArtist();
        boolean boolean14 = cD6.isCanPurchase();
        java.lang.Class<?> wildcardClass15 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        int int14 = cD6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        boolean boolean9 = cD6.isCanPurchase();
        java.lang.String str10 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        int int11 = cD6.getRemainingCopies();
        java.lang.Class<?> wildcardClass12 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        boolean boolean11 = cD6.isCanRent();
        cD6.setLocation("35,CD,,,0,-1.0,");
        boolean boolean14 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setCanRent(false);
        java.lang.String str13 = cD6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        cD6.setRemainingCopies(35);
        cD6.setRemainingCopies((-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,-1,100.0,", "", (int) (byte) 1, (double) (short) 1, "35,CD,,,0,100.0,");
        cD6.setValue((double) (-1.0f));
        cD6.setCanPurchase(false);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        cD6.setValue((-1.0d));
        int int9 = cD6.getId();
        java.lang.String str10 = cD6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str10, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CD\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 100, (double) (short) 100, "35,CD,,,0,-1.0,");
        cD6.setValue((double) (byte) 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        boolean boolean13 = cD6.isCanPurchase();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = cD6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = cD6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        int int11 = cD6.getRemainingCopies();
        java.lang.String str12 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        java.lang.String str7 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        int int12 = cD6.getRemainingCopies();
        java.lang.String str13 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        cD6.setArtist("hi!");
        cD6.setCanPurchase(true);
        int int20 = cD6.getId();
        cD6.setValue((double) (byte) 100);
        objects.User user23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        cD6.setRemainingCopies(35);
        java.lang.Class<?> wildcardClass13 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        int int8 = cD6.getRemainingCopies();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.CD cD6 = new objects.CD((int) (short) 1, "35,CD,,,0,100.0,", "35,CD,,,0,100.0,", 0, (double) 10.0f, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getLocation();
        java.lang.String str14 = cD6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        objects.CD cD6 = new objects.CD(100, "hi!", "hi!", (-1), (double) 10, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        java.lang.Class<?> wildcardClass7 = cD6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        int int8 = cD6.getRemainingCopies();
        boolean boolean9 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        java.lang.String str11 = cD6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,CD,,,0,100.0," + "'", str11, "35,CD,,,0,100.0,");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        int int9 = cD6.getId();
        cD6.setRemainingCopies((-1));
        java.lang.String str12 = cD6.getLocation();
        java.lang.String str13 = cD6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        cD6.setValue((double) (byte) 1);
        java.lang.String str15 = cD6.getLocation();
        int int16 = cD6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(true);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        objects.CD cD6 = new objects.CD(0, "", "35,CD,,,0,100.0,", (int) 'a', (double) 0, "hi!");
        cD6.setArtist("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        java.lang.String str9 = cD6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,CD,,,0,100.0," + "'", str9, "35,CD,,,0,100.0,");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setCanRent(true);
        cD6.setRemainingCopies(10);
        cD6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(true);
        int int11 = cD6.getRemainingCopies();
        java.lang.String str12 = cD6.getLocation();
        java.lang.Class<?> wildcardClass13 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        cD6.setValue((double) 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        java.lang.Class<?> wildcardClass10 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((double) (short) -1);
        java.lang.String str10 = cD6.getArtist();
        cD6.setLocation("");
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setRemainingCopies(0);
        boolean boolean17 = cD6.isCanPurchase();
        int int18 = cD6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getArtist();
        cD6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.CD cD6 = new objects.CD((int) '#', "35,CD,,,-1,100.0,", "hi!", 1, (double) (short) 0, "35,CD,,,0,-1.0,");
        cD6.setArtist("35,CD,,,0,-1.0,");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        objects.CD cD6 = new objects.CD(0, "", "35,CD,,,0,100.0,", (int) 'a', (double) 0, "hi!");
        cD6.setArtist("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        java.lang.String str9 = cD6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str9, "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        int int7 = cD6.getId();
        cD6.setRemainingCopies((int) (byte) -1);
        double double10 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getArtist();
        cD6.setCanPurchase(false);
        boolean boolean16 = cD6.isCanRent();
        cD6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        boolean boolean17 = cD6.isCanPurchase();
        cD6.setArtist("35,CD,,,0,-1.0,");
        java.lang.String str20 = cD6.getLocation();
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord22 = cD6.borrow(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35,CD,,,0,-1.0," + "'", str20, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        int int14 = cD6.getId();
        cD6.setCanRent(false);
        double double17 = cD6.getValue();
        cD6.setArtist("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setCanRent(true);
        boolean boolean14 = cD6.isCanPurchase();
        cD6.setArtist("hi!");
        java.lang.String str17 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.CD cD6 = new objects.CD((int) '#', "35,CD,,,-1,100.0,", "hi!", 1, (double) (short) 0, "35,CD,,,0,-1.0,");
        double double7 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        java.lang.String str17 = cD6.getLocation();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = cD6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35,CD,,,0,-1.0," + "'", str17, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        objects.CD cD6 = new objects.CD(0, "0,CD,,35,CD,,,0,100.0,,97,0.0,hi!", "35,CD,,,0,100.0,", 0, (double) (byte) 1, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        boolean boolean11 = cD6.isCanPurchase();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        java.lang.String str13 = cD6.getArtist();
        boolean boolean14 = cD6.isCanPurchase();
        cD6.setArtist("hi!");
        cD6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        cD6.setCanRent(true);
        boolean boolean9 = cD6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.Class<?> wildcardClass10 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        int int12 = cD6.getRemainingCopies();
        double double13 = cD6.getValue();
        cD6.setValue((double) (byte) -1);
        cD6.setLocation("35,CD,,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", 0, (double) (short) 0, "");
        int int7 = cD6.getId();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = cD6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        cD6.setArtist("hi!");
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        int int11 = cD6.getId();
        java.lang.String str12 = cD6.getArtist();
        java.lang.String str13 = cD6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        int int11 = cD6.getRemainingCopies();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = cD6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,-1,100.0,", "", (int) (byte) 1, (double) (short) 1, "35,CD,,,0,100.0,");
        boolean boolean7 = cD6.isCanRent();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = cD6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        int int11 = cD6.getId();
        cD6.setLocation("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        cD6.setCanRent(true);
        cD6.setValue((double) 1.0f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        int int7 = cD6.getRemainingCopies();
        double double8 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        boolean boolean11 = cD6.isCanRent();
        cD6.setCanRent(false);
        java.lang.String str14 = cD6.getArtist();
        boolean boolean15 = cD6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getLocation();
        boolean boolean14 = cD6.isCanRent();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "100,CD,,35,CD,,,0,100.0,,0,-1.0,", "35,CD,,,-1,100.0,", (-1), 0.0d, "");
        boolean boolean7 = cD6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        java.lang.String str8 = cD6.getLocation();
        java.lang.String str9 = cD6.toCSVString();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,CD,,,0,100.0," + "'", str9, "35,CD,,,0,100.0,");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        java.lang.String str11 = cD6.getTitle();
        java.lang.String str12 = cD6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35,CD,,,0,100.0," + "'", str12, "35,CD,,,0,100.0,");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        java.lang.String str13 = cD6.getArtist();
        cD6.setLocation("");
        boolean boolean16 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,0,100.0," + "'", str13, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setArtist("hi!");
        cD6.setRemainingCopies((int) (byte) -1);
        cD6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        objects.CD cD6 = new objects.CD(100, "hi!", "hi!", (-1), (double) 10, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        java.lang.String str7 = cD6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setValue((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        objects.CD cD6 = new objects.CD((int) (short) 10, "", "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", (int) '#', (double) (byte) 1, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        objects.CD cD6 = new objects.CD((int) (byte) -1, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 10, (-1.0d), "");
        cD6.setCanPurchase(false);
        java.lang.String str9 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        objects.CD cD6 = new objects.CD((int) 'a', "", "", 10, (double) '4', "35,CD,,,0,-1.0,");
        cD6.setCanRent(false);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        java.lang.String str11 = cD6.getArtist();
        int int12 = cD6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setRemainingCopies((int) ' ');
        boolean boolean10 = cD6.isCanPurchase();
        boolean boolean11 = cD6.isCanPurchase();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        objects.CD cD6 = new objects.CD((int) (short) 0, "35,CD,,,0,-1.0,", "hi!", 10, (double) (-1.0f), "35,CD,,,0,-1.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = cD6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        int int13 = cD6.getRemainingCopies();
        java.lang.String str14 = cD6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.CD cD6 = new objects.CD((int) (byte) 1, "35,CD,,,0,97.0,hi!", "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", (int) (short) -1, (double) (short) 100, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        java.lang.String str14 = cD6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        double double11 = cD6.getValue();
        cD6.setRemainingCopies((int) (short) 0);
        java.lang.String str14 = cD6.getLocation();
        cD6.setArtist("35,CD,,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        boolean boolean11 = cD6.isCanPurchase();
        java.lang.String str12 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,0,100.0,", "", (int) (short) 100, (-1.0d), "35,CD,,,0,-1.0,");
        cD6.setCanRent(false);
        java.lang.Class<?> wildcardClass9 = cD6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,CD,,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        objects.CD cD6 = new objects.CD((int) (short) 1, "", "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", (int) (short) 10, (double) (-1L), "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 100, (double) (short) 100, "35,CD,,,0,-1.0,");
        boolean boolean7 = cD6.isCanPurchase();
        boolean boolean8 = cD6.isCanPurchase();
        java.lang.String str9 = cD6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,CD,35,CD,,,0,-1.0,,35,CD,,,0,-1.0,,100,100.0,35,CD,,,0,-1.0," + "'", str9, "100,CD,35,CD,,,0,-1.0,,35,CD,,,0,-1.0,,100,100.0,35,CD,,,0,-1.0,");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((double) (short) -1);
        java.lang.String str10 = cD6.getArtist();
        int int11 = cD6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        double double7 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        cD6.setArtist("");
        cD6.setRemainingCopies((int) (byte) 0);
        cD6.setLocation("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        cD6.setCanRent(false);
        cD6.setLocation("35,CD,,,-1,100.0,");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        boolean boolean17 = cD6.isCanPurchase();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        int int15 = cD6.getId();
        cD6.setValue((double) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        cD6.setValue((-1.0d));
        java.lang.String str9 = cD6.toCSVString();
        cD6.setArtist("");
        java.lang.String str12 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str9, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,CD,,,0,97.0,hi!");
        org.junit.Assert.assertNotNull(physicalItem1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "100,CD,,35,CD,,,0,100.0,,0,-1.0,", "35,CD,,,-1,100.0,", (-1), 0.0d, "");
        java.lang.String str7 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CD\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getArtist();
        cD6.setCanPurchase(false);
        cD6.setValue((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        int int11 = cD6.getRemainingCopies();
        cD6.setCanRent(false);
        java.lang.String str14 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,CD,,,0,100.0," + "'", str14, "35,CD,,,0,100.0,");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 100, (double) (short) 100, "35,CD,,,0,-1.0,");
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        boolean boolean9 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        java.lang.String str11 = cD6.getArtist();
        boolean boolean12 = cD6.isCanRent();
        cD6.setArtist("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        boolean boolean11 = cD6.isCanPurchase();
        java.lang.String str12 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setRemainingCopies((int) '#');
        java.lang.String str13 = cD6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        cD6.setValue((double) (byte) 1);
        java.lang.String str15 = cD6.getLocation();
        boolean boolean16 = cD6.isCanRent();
        cD6.setValue((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        java.lang.String str16 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        cD6.setRemainingCopies((-1));
        cD6.setLocation("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        boolean boolean11 = cD6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        double double11 = cD6.getValue();
        cD6.setRemainingCopies((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        int int12 = cD6.getRemainingCopies();
        double double13 = cD6.getValue();
        cD6.setValue((double) (byte) -1);
        cD6.setValue((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "", "0,CD,,35,CD,,,0,100.0,,97,0.0,hi!", (int) (byte) 1, (double) (-1L), "0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        double double7 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setRemainingCopies((int) ' ');
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        java.lang.String str12 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        cD6.setCanRent(true);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        cD6.setRemainingCopies(35);
        java.lang.String str13 = cD6.getTitle();
        cD6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        boolean boolean11 = cD6.isCanRent();
        cD6.setLocation("");
        java.lang.String str14 = cD6.getArtist();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        boolean boolean7 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        objects.CD cD6 = new objects.CD((int) (short) 10, "35,CD,,,0,97.0,hi!", "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", (int) (byte) -1, (double) 0L, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        java.lang.String str7 = cD6.getArtist();
        java.lang.String str8 = cD6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str7, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str8, "10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        int int11 = cD6.getRemainingCopies();
        java.lang.String str12 = cD6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        cD6.setArtist("");
        cD6.setRemainingCopies((int) (byte) 0);
        java.lang.String str11 = cD6.getLocation();
        boolean boolean12 = cD6.isCanRent();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getTitle();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = cD6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setLocation("35,CD,,,0,100.0,");
        int int14 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        objects.CD cD6 = new objects.CD(0, "", "35,CD,,,0,100.0,", (int) 'a', (double) 0, "hi!");
        cD6.setArtist("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        double double9 = cD6.getValue();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        int int13 = cD6.getRemainingCopies();
        cD6.setArtist("35,CD,,,0,97.0,hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        int int11 = cD6.getId();
        java.lang.String str12 = cD6.getArtist();
        int int13 = cD6.getRemainingCopies();
        int int14 = cD6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        int int14 = cD6.getId();
        cD6.setCanRent(false);
        cD6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        boolean boolean13 = cD6.isCanPurchase();
        java.lang.String str14 = cD6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,-1,100.0,", "35,CD,,,0,-1.0,", 1, 100.0d, "100,CD,35,CD,,,0,-1.0,,35,CD,,,0,-1.0,,100,100.0,35,CD,,,0,-1.0,");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        int int15 = cD6.getId();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        boolean boolean11 = cD6.isCanRent();
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setLocation("10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("100,CD,35,CD,,,0,-1.0,,35,CD,,,0,-1.0,,100,100.0,35,CD,,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getArtist();
        cD6.setRemainingCopies((int) (byte) 1);
        cD6.setValue(0.0d);
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        cD6.setValue((double) (byte) 1);
        java.lang.String str15 = cD6.getLocation();
        cD6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", 0, (double) (short) 0, "");
        int int7 = cD6.getId();
        cD6.setValue((double) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        cD6.setRemainingCopies((int) '4');
        java.lang.String str9 = cD6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,CD,,,0,-1.0," + "'", str9, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        cD6.setRemainingCopies(10);
        java.lang.Class<?> wildcardClass14 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        java.lang.String str11 = cD6.getTitle();
        double double12 = cD6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.CD cD6 = new objects.CD((int) (short) 100, "", "100,CD,,35,CD,,,0,100.0,,0,-1.0,", (int) '#', (double) 35, "10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        int int8 = cD6.getRemainingCopies();
        java.lang.String str9 = cD6.toCSVString();
        cD6.setCanPurchase(false);
        int int12 = cD6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,CD,,,0,100.0," + "'", str9, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        boolean boolean11 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setArtist("hi!");
        cD6.setRemainingCopies((int) (byte) -1);
        double double21 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        java.lang.String str11 = cD6.getArtist();
        cD6.setLocation("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setCanRent(true);
        boolean boolean14 = cD6.isCanPurchase();
        int int15 = cD6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        cD6.setArtist("");
        cD6.setRemainingCopies((int) (byte) 0);
        cD6.setCanPurchase(true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        objects.CD cD6 = new objects.CD((int) (short) 1, "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", "35,CD,,,0,-1.0,", 1, (double) 10, "35,CD,,,0,100.0,");
        java.lang.Class<?> wildcardClass7 = cD6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", 0, (double) (short) 0, "");
        cD6.setCanRent(true);
        boolean boolean9 = cD6.isCanRent();
        cD6.setRemainingCopies(10);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = cD6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        objects.CD cD6 = new objects.CD((int) 'a', "", "", 10, (double) '4', "35,CD,,,0,-1.0,");
        boolean boolean7 = cD6.isCanPurchase();
        int int8 = cD6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        int int7 = cD6.getId();
        java.lang.String str8 = cD6.getLocation();
        cD6.setRemainingCopies((int) (byte) -1);
        cD6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,CD,,,0,100.0," + "'", str8, "35,CD,,,0,100.0,");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        cD6.setArtist("35,CD,,,0,-1.0,");
        cD6.setRemainingCopies((int) '#');
        int int18 = cD6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        objects.CD cD6 = new objects.CD((int) 'a', "", "", 10, (double) '4', "35,CD,,,0,-1.0,");
        int int7 = cD6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        boolean boolean9 = cD6.isCanPurchase();
        cD6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        objects.CD cD6 = new objects.CD(0, "", "35,CD,,,0,100.0,", (int) 'a', (double) 0, "hi!");
        cD6.setArtist("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        double double9 = cD6.getValue();
        cD6.setArtist("0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        int int12 = cD6.getId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        java.lang.String str13 = cD6.toCSVString();
        java.lang.String str14 = cD6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,0,100.0," + "'", str13, "35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,CD,,,0,100.0," + "'", str14, "35,CD,,,0,100.0,");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 100, (double) (short) 100, "35,CD,,,0,-1.0,");
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        double double9 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        objects.CD cD6 = new objects.CD(0, "", "35,CD,,,0,100.0,", (int) 'a', (double) 0, "hi!");
        cD6.setArtist("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        double double9 = cD6.getValue();
        cD6.setLocation("hi!");
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = cD6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        java.lang.String str13 = cD6.getTitle();
        cD6.setRemainingCopies(10);
        boolean boolean16 = cD6.isCanPurchase();
        cD6.setLocation("35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setValue((-1.0d));
        boolean boolean15 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        java.lang.String str12 = cD6.getArtist();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        java.lang.String str11 = cD6.toCSVString();
        java.lang.String str12 = cD6.toCSVString();
        cD6.setArtist("10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,CD,,,0,-1.0," + "'", str11, "35,CD,,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35,CD,,,0,-1.0," + "'", str12, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        int int14 = cD6.getId();
        cD6.setCanRent(false);
        double double17 = cD6.getValue();
        cD6.setLocation("10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        cD6.setValue((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        int int12 = cD6.getRemainingCopies();
        double double13 = cD6.getValue();
        cD6.setRemainingCopies((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        int int15 = cD6.getId();
        boolean boolean16 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,-1,100.0,", "0,CD,,35,CD,,,0,100.0,,97,0.0,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", (int) '4', (double) (byte) -1, "10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        boolean boolean11 = cD6.isCanRent();
        cD6.setLocation("");
        cD6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        java.lang.String str13 = cD6.getArtist();
        cD6.setRemainingCopies(10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,-1,100.0,", "", (int) (byte) 1, (double) (short) 1, "35,CD,,,0,100.0,");
        cD6.setValue(0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setRemainingCopies(100);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        int int14 = cD6.getId();
        java.lang.String str15 = cD6.getLocation();
        int int16 = cD6.getRemainingCopies();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        java.lang.String str11 = cD6.getArtist();
        cD6.setCanPurchase(false);
        cD6.setValue((double) '#');
        java.lang.String str16 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setLocation("35,CD,,,0,100.0,");
        int int14 = cD6.getRemainingCopies();
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setLocation("");
        java.lang.String str16 = cD6.getArtist();
        java.lang.String str17 = cD6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35,CD,,,0,100.0," + "'", str17, "35,CD,,,0,100.0,");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setRemainingCopies(0);
        boolean boolean17 = cD6.isCanPurchase();
        cD6.setArtist("hi!");
        java.lang.String str20 = cD6.toCSVString();
        java.lang.String str21 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35,CD,,,0,97.0,hi!" + "'", str20, "35,CD,,,0,97.0,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setCanRent(true);
        boolean boolean14 = cD6.isCanPurchase();
        boolean boolean15 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(true);
        java.lang.String str11 = cD6.getLocation();
        cD6.setArtist("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        int int9 = cD6.getRemainingCopies();
        cD6.setValue((double) 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setRemainingCopies((int) '#');
        int int13 = cD6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((double) (short) -1);
        java.lang.String str10 = cD6.getArtist();
        cD6.setCanRent(false);
        double double13 = cD6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setCanPurchase(true);
        cD6.setArtist("35,CD,,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        double double11 = cD6.getValue();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = cD6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass13 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        double double13 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setCanRent(false);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,CD,,35,CD,,,0,100.0,,97,0.0,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CD\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        objects.CD cD6 = new objects.CD((int) (byte) -1, "", "35,CD,,,0,97.0,hi!", 10, 0.0d, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setCanRent(false);
        java.lang.String str19 = cD6.getLocation();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = cD6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35,CD,,,0,-1.0," + "'", str19, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setRemainingCopies((int) (byte) 100);
        int int17 = cD6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setRemainingCopies(0);
        boolean boolean17 = cD6.isCanPurchase();
        java.lang.String str18 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        java.lang.String str11 = cD6.getArtist();
        java.lang.String str12 = cD6.getLocation();
        cD6.setLocation("35,CD,,,0,100.0,");
        java.lang.String str15 = cD6.getLocation();
        boolean boolean16 = cD6.isCanPurchase();
        cD6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,CD,,,0,100.0," + "'", str15, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        java.lang.String str8 = cD6.getLocation();
        cD6.setArtist("");
        cD6.setRemainingCopies((int) (byte) 10);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = cD6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        cD6.setCanRent(true);
        cD6.setRemainingCopies(10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        cD6.setRemainingCopies((-1));
        cD6.setLocation("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        cD6.setValue((double) 0);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        int int11 = cD6.getId();
        cD6.setRemainingCopies(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        int int11 = cD6.getId();
        boolean boolean12 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        java.lang.String str11 = cD6.getTitle();
        cD6.setCanRent(true);
        java.lang.String str14 = cD6.toCSVString();
        double double15 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,CD,,,0,100.0," + "'", str14, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,-1,100.0,", "", (int) (byte) 1, (double) (short) 1, "35,CD,,,0,100.0,");
        cD6.setRemainingCopies(100);
        int int9 = cD6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.toCSVString();
        cD6.setLocation("35,CD,,,0,100.0,");
        java.lang.String str12 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,CD,,,0,100.0," + "'", str9, "35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        double double14 = cD6.getValue();
        cD6.setCanRent(false);
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        objects.CD cD6 = new objects.CD((int) (short) 0, "35,CD,,,0,-1.0,", "hi!", 10, (double) (-1.0f), "35,CD,,,0,-1.0,");
        int int7 = cD6.getId();
        java.lang.String str8 = cD6.toCSVString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,CD,35,CD,,,0,-1.0,,hi!,10,-1.0,35,CD,,,0,-1.0," + "'", str8, "0,CD,35,CD,,,0,-1.0,,hi!,10,-1.0,35,CD,,,0,-1.0,");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        java.lang.String str13 = cD6.getArtist();
        boolean boolean14 = cD6.isCanPurchase();
        cD6.setArtist("hi!");
        java.lang.String str17 = cD6.getArtist();
        java.lang.String str18 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        objects.CD cD6 = new objects.CD(10, "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", 1, (double) (byte) -1, "35,CD,,,0,-1.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = cD6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        int int11 = cD6.getRemainingCopies();
        cD6.setCanRent(false);
        java.lang.String str14 = cD6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,CD,,,0,100.0,35,CD,,,0,100.0," + "'", str14, "35,CD,,,0,100.0,35,CD,,,0,100.0,");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        objects.CD cD6 = new objects.CD((int) (short) 10, "35,CD,,,0,-1.0,", "35,CD,,,-1,100.0,", 0, (double) 100.0f, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        cD6.setValue((-1.0d));
        java.lang.String str9 = cD6.toCSVString();
        cD6.setArtist("");
        boolean boolean12 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str9, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        cD6.setValue((double) (byte) 100);
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setCanPurchase(true);
        cD6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "100,CD,35,CD,,,0,-1.0,,35,CD,,,0,-1.0,,100,100.0,35,CD,,,0,-1.0,", "0,CD,,35,CD,,,0,100.0,,97,0.0,hi!", (int) (byte) 1, (double) 'a', "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 100, (double) (short) 100, "35,CD,,,0,-1.0,");
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        cD6.setArtist("35,CD,,,0,97.0,hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        cD6.setCanPurchase(false);
        cD6.setRemainingCopies(1);
        boolean boolean17 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        int int9 = cD6.getId();
        cD6.setArtist("35,CD,,,0,100.0,");
        boolean boolean12 = cD6.isCanPurchase();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = cD6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        int int11 = cD6.getRemainingCopies();
        int int12 = cD6.getId();
        double double13 = cD6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 100, (double) (short) 100, "35,CD,,,0,-1.0,");
        int int7 = cD6.getRemainingCopies();
        cD6.setRemainingCopies(97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        int int11 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        cD6.setCanPurchase(false);
        cD6.setRemainingCopies(1);
        double double17 = cD6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setRemainingCopies((int) (byte) 100);
        boolean boolean17 = cD6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass16 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        java.lang.String str14 = cD6.toCSVString();
        java.lang.String str15 = cD6.toCSVString();
        java.lang.String str16 = cD6.getTitle();
        boolean boolean17 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,CD,,,-1,100.0," + "'", str14, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,CD,,,-1,100.0," + "'", str15, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        boolean boolean11 = cD6.isCanRent();
        cD6.setLocation("");
        java.lang.String str14 = cD6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,CD,,,0,100.0," + "'", str14, "35,CD,,,0,100.0,");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        int int12 = cD6.getRemainingCopies();
        boolean boolean13 = cD6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setRemainingCopies((int) ' ');
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        int int12 = cD6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,35,CD,,,0,100.0,");
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = cD6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        int int12 = cD6.getRemainingCopies();
        double double13 = cD6.getValue();
        java.lang.String str14 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,0,100.0,35,CD,,,0,100.0,", "35,CD,,,0,-1.0,", 97, (double) 0.0f, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = cD6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getArtist();
        cD6.setCanPurchase(false);
        boolean boolean16 = cD6.isCanRent();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = cD6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        java.lang.String str13 = cD6.getArtist();
        boolean boolean14 = cD6.isCanPurchase();
        cD6.setArtist("hi!");
        java.lang.String str17 = cD6.getArtist();
        cD6.setRemainingCopies(1);
        int int20 = cD6.getId();
        cD6.setRemainingCopies(35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        int int8 = cD6.getRemainingCopies();
        java.lang.String str9 = cD6.toCSVString();
        cD6.setCanPurchase(false);
        cD6.setCanRent(false);
        java.lang.String str14 = cD6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,CD,,,0,100.0," + "'", str9, "35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,CD,,,0,100.0," + "'", str14, "35,CD,,,0,100.0,");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        java.lang.String str13 = cD6.getTitle();
        cD6.setCanRent(false);
        boolean boolean16 = cD6.isCanRent();
        cD6.setRemainingCopies((int) 'a');
        cD6.setRemainingCopies((int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = cD6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", 0, (double) (short) 0, "");
        int int7 = cD6.getId();
        cD6.setValue((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        java.lang.String str11 = cD6.getArtist();
        java.lang.String str12 = cD6.getLocation();
        cD6.setLocation("35,CD,,,0,100.0,");
        double double15 = cD6.getValue();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = cD6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        boolean boolean9 = cD6.isCanPurchase();
        cD6.setRemainingCopies((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        java.lang.String str11 = cD6.getLocation();
        boolean boolean12 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        cD6.setRemainingCopies(10);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((double) (short) -1);
        cD6.setRemainingCopies((int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        cD6.setRemainingCopies((-1));
        cD6.setLocation("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        int int11 = cD6.getId();
        cD6.setCanRent(false);
        int int14 = cD6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        boolean boolean19 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.CD cD6 = new objects.CD((int) (byte) 10, "", "35,CD,,,0,-1.0,", (int) (byte) 0, 100.0d, "hi!");
        cD6.setRemainingCopies((-1));
        cD6.setLocation("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        int int11 = cD6.getId();
        cD6.setCanRent(false);
        java.lang.String str14 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str14, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        objects.CD cD6 = new objects.CD((int) (short) 10, "35,CD,,,0,-1.0,", "35,CD,,,-1,100.0,", 0, (double) 100.0f, "");
        cD6.setCanPurchase(true);
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,CD,,,0,-1.0," + "'", str9, "35,CD,,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,-1.0," + "'", str10, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        int int7 = cD6.getId();
        java.lang.String str8 = cD6.getLocation();
        cD6.setRemainingCopies((int) (byte) -1);
        cD6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,CD,,,0,100.0," + "'", str8, "35,CD,,,0,100.0,");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        cD6.setValue((double) (byte) 1);
        int int15 = cD6.getRemainingCopies();
        cD6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        boolean boolean10 = cD6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        objects.CD cD6 = new objects.CD(0, "", "35,CD,,,0,100.0,", (int) 'a', (double) 0, "hi!");
        cD6.setArtist("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        double double9 = cD6.getValue();
        cD6.setArtist("0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        cD6.setCanPurchase(false);
        java.lang.String str14 = cD6.toCSVString();
        java.lang.String str15 = cD6.getArtist();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,CD,,35,CD,,,0,100.0,,97,0.0,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str14, "0,CD,,35,CD,,,0,100.0,,97,0.0,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str15, "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        cD6.setValue((-1.0d));
        java.lang.String str9 = cD6.toCSVString();
        java.lang.String str10 = cD6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str9, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        java.lang.String str14 = cD6.toCSVString();
        java.lang.String str15 = cD6.toCSVString();
        java.lang.String str16 = cD6.getTitle();
        int int17 = cD6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,CD,,,-1,100.0," + "'", str14, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,CD,,,-1,100.0," + "'", str15, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        double double11 = cD6.getValue();
        int int12 = cD6.getRemainingCopies();
        double double13 = cD6.getValue();
        int int14 = cD6.getId();
        cD6.setArtist("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        int int11 = cD6.getId();
        java.lang.String str12 = cD6.getArtist();
        boolean boolean13 = cD6.isCanRent();
        java.lang.Class<?> wildcardClass14 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        objects.CD cD6 = new objects.CD((int) (short) -1, "35,CD,,,0,-1.0,", "35,CD,,,0,100.0,", (-1), (double) 'a', "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        java.lang.String str13 = cD6.getArtist();
        cD6.setLocation("");
        java.lang.String str16 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,0,100.0," + "'", str13, "35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        objects.CD cD6 = new objects.CD((int) (short) 0, "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", "hi!", (int) (byte) -1, (double) (short) 0, "100,CD,35,CD,,,0,-1.0,,35,CD,,,0,-1.0,,100,100.0,35,CD,,,0,-1.0,");
        cD6.setValue((double) (byte) 100);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setRemainingCopies(0);
        boolean boolean17 = cD6.isCanPurchase();
        cD6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass20 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        cD6.setValue((double) (byte) 1);
        java.lang.String str15 = cD6.getLocation();
        cD6.setLocation("100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        java.lang.Class<?> wildcardClass18 = cD6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        int int14 = cD6.getId();
        cD6.setValue((double) (short) 10);
        boolean boolean17 = cD6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        int int9 = cD6.getId();
        cD6.setRemainingCopies((-1));
        int int12 = cD6.getRemainingCopies();
        java.lang.String str13 = cD6.getTitle();
        cD6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        objects.CD cD6 = new objects.CD((int) (byte) -1, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 10, (-1.0d), "");
        int int7 = cD6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        java.lang.String str13 = cD6.getArtist();
        cD6.setLocation("35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        java.lang.String str11 = cD6.getArtist();
        java.lang.String str12 = cD6.getLocation();
        java.lang.String str13 = cD6.getArtist();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,CD,,,0,100.0,35,CD,,,0,100.0,");
        org.junit.Assert.assertNotNull(physicalItem1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        objects.CD cD6 = new objects.CD((int) (short) 0, "35,CD,,,0,-1.0,", "hi!", 10, (double) (-1.0f), "35,CD,,,0,-1.0,");
        cD6.setValue((double) 0);
        cD6.setCanRent(true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setLocation("35,CD,,,0,100.0,");
        double double14 = cD6.getValue();
        java.lang.String str15 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,-1,100.0,", "", (int) (byte) 1, (double) (short) 1, "35,CD,,,0,100.0,");
        cD6.setRemainingCopies(100);
        java.lang.String str9 = cD6.getLocation();
        cD6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        cD6.setValue((double) (byte) 1);
        java.lang.String str15 = cD6.getLocation();
        boolean boolean16 = cD6.isCanRent();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        java.lang.String str11 = cD6.getTitle();
        boolean boolean12 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,CD,35,CD,,,0,-1.0,,hi!,10,-1.0,35,CD,,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        objects.CD cD6 = new objects.CD((int) (short) 1, "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", "35,CD,,,0,-1.0,", 1, (double) 10, "35,CD,,,0,100.0,");
        java.lang.String str7 = cD6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,CD,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,35,CD,,,0,-1.0,,1,10.0,35,CD,,,0,100.0," + "'", str7, "1,CD,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,35,CD,,,0,-1.0,,1,10.0,35,CD,,,0,100.0,");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "100,CD,,35,CD,,,0,100.0,,0,-1.0,", "35,CD,,,-1,100.0,", (-1), 0.0d, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("1,CD,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,35,CD,,,0,-1.0,,1,10.0,35,CD,,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setArtist("hi!");
        java.lang.String str10 = cD6.getArtist();
        java.lang.String str11 = cD6.getTitle();
        cD6.setLocation("35,CD,,,0,100.0,35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        java.lang.String str11 = cD6.getTitle();
        cD6.setCanRent(true);
        int int14 = cD6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        objects.CD cD6 = new objects.CD((int) (short) -1, "10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", "35,CD,,,0,100.0,35,CD,,,0,100.0,", 0, (double) (byte) 10, "35,CD,,,0,100.0,");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        int int11 = cD6.getId();
        java.lang.String str12 = cD6.getArtist();
        int int13 = cD6.getRemainingCopies();
        cD6.setCanRent(false);
        java.lang.String str16 = cD6.getLocation();
        int int17 = cD6.getId();
        cD6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        cD6.setRemainingCopies((int) (byte) 10);
        cD6.setCanRent(true);
        cD6.setRemainingCopies(10);
        cD6.setRemainingCopies(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", 0, (double) (short) 0, "");
        cD6.setCanRent(true);
        boolean boolean9 = cD6.isCanRent();
        java.lang.Class<?> wildcardClass10 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        cD6.setValue((double) (byte) 1);
        cD6.setValue((double) '4');
        boolean boolean17 = cD6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getLocation();
        java.lang.String str11 = cD6.getArtist();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        cD6.setArtist("");
        cD6.setRemainingCopies((int) (byte) 0);
        java.lang.String str11 = cD6.getLocation();
        cD6.setArtist("35,CD,,,0,-1.0,");
        java.lang.String str14 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        objects.CD cD6 = new objects.CD((-1), "0,CD,,35,CD,,,0,100.0,,97,0.0,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", "0,CD,35,CD,,,0,-1.0,,hi!,10,-1.0,35,CD,,,0,-1.0,", (-1), (double) (short) 10, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        java.lang.String str7 = cD6.getArtist();
        cD6.setArtist("35,CD,,,0,100.0,");
        cD6.setCanRent(false);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = cD6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        java.lang.String str11 = cD6.getArtist();
        java.lang.String str12 = cD6.getLocation();
        cD6.setLocation("35,CD,,,0,100.0,");
        java.lang.String str15 = cD6.getLocation();
        boolean boolean16 = cD6.isCanPurchase();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = cD6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,CD,,,0,100.0," + "'", str15, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        int int9 = cD6.getId();
        cD6.setRemainingCopies((-1));
        cD6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        int int9 = cD6.getId();
        java.lang.String str10 = cD6.toCSVString();
        int int11 = cD6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setArtist("");
        boolean boolean10 = cD6.isCanRent();
        double double11 = cD6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setCanRent(false);
        cD6.setCanPurchase(false);
        java.lang.String str13 = cD6.getTitle();
        cD6.setCanRent(false);
        boolean boolean16 = cD6.isCanRent();
        boolean boolean17 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        cD6.setArtist("");
        cD6.setRemainingCopies((int) (byte) 0);
        cD6.setValue((double) 1);
        java.lang.String str13 = cD6.getArtist();
        java.lang.String str14 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        objects.CD cD6 = new objects.CD(0, "hi!", "35,CD,,,0,100.0,", 0, (double) (short) 0, "");
        cD6.setCanRent(true);
        boolean boolean9 = cD6.isCanRent();
        cD6.setRemainingCopies(10);
        int int12 = cD6.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        int int13 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        cD6.setArtist("hi!");
        cD6.setCanPurchase(true);
        int int20 = cD6.getId();
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setArtist("35,CD,,,0,100.0,35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        cD6.setCanPurchase(false);
        boolean boolean15 = cD6.isCanRent();
        boolean boolean16 = cD6.isCanRent();
        cD6.setRemainingCopies((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        cD6.setCanPurchase(false);
        java.lang.String str15 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        objects.CD cD6 = new objects.CD(100, "hi!", "100,CD,35,CD,,,0,-1.0,,35,CD,,,0,-1.0,,100,100.0,35,CD,,,0,-1.0,", (int) (byte) 10, (double) 0.0f, "1,CD,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,35,CD,,,0,-1.0,,1,10.0,35,CD,,,0,100.0,");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        int int11 = cD6.getId();
        boolean boolean12 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,0,100.0,", "", (int) (short) 100, (-1.0d), "35,CD,,,0,-1.0,");
        cD6.setCanRent(false);
        cD6.setRemainingCopies((int) (byte) 100);
        double double11 = cD6.getValue();
        java.lang.Class<?> wildcardClass12 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        double double10 = cD6.getValue();
        int int11 = cD6.getId();
        java.lang.String str12 = cD6.getArtist();
        int int13 = cD6.getRemainingCopies();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        objects.CD cD6 = new objects.CD((int) (short) 10, "35,CD,,,0,97.0,hi!", "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", (int) (byte) -1, (double) 0L, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        java.lang.String str7 = cD6.getArtist();
        java.lang.String str8 = cD6.getArtist();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str7, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str8, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setCanPurchase(true);
        cD6.setCanRent(true);
        cD6.setArtist("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        boolean boolean11 = cD6.isCanPurchase();
        cD6.setRemainingCopies((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setLocation("35,CD,,,-1,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        java.lang.String str17 = cD6.getTitle();
        java.lang.String str18 = cD6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        boolean boolean11 = cD6.isCanPurchase();
        int int12 = cD6.getRemainingCopies();
        boolean boolean13 = cD6.isCanPurchase();
        cD6.setCanPurchase(true);
        cD6.setRemainingCopies((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        objects.CD cD6 = new objects.CD((int) 'a', "", "", 10, (double) '4', "35,CD,,,0,-1.0,");
        cD6.setCanRent(false);
        cD6.setCanRent(true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,CD,35,CD,,,0,-1.0,,hi!,10,-1.0,35,CD,,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        objects.CD cD6 = new objects.CD((int) (byte) 100, "35,CD,,,0,-1.0,", "35,CD,,,0,-1.0,", (int) (byte) 100, (double) (short) 100, "35,CD,,,0,-1.0,");
        int int7 = cD6.getRemainingCopies();
        java.lang.String str8 = cD6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,CD,,,0,-1.0," + "'", str8, "35,CD,,,0,-1.0,");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        objects.CD cD6 = new objects.CD(35, "35,CD,,,-1,100.0,", "", (int) (byte) 1, (double) (short) 1, "35,CD,,,0,100.0,");
        boolean boolean7 = cD6.isCanRent();
        java.lang.String str8 = cD6.getTitle();
        cD6.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,CD,,,-1,100.0," + "'", str8, "35,CD,,,-1,100.0,");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        int int8 = cD6.getRemainingCopies();
        java.lang.String str9 = cD6.toCSVString();
        cD6.setCanPurchase(false);
        java.lang.String str12 = cD6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,CD,,,0,100.0," + "'", str9, "35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35,CD,,,0,100.0," + "'", str12, "35,CD,,,0,100.0,");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        objects.CD cD6 = new objects.CD((int) (byte) -1, "0,CD,,35,CD,,,0,100.0,,97,0.0,hi!", "10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", 1, (double) (short) -1, "100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        java.lang.String str7 = cD6.getArtist();
        cD6.setArtist("35,CD,,,0,100.0,");
        double double10 = cD6.getValue();
        java.lang.String str11 = cD6.getArtist();
        cD6.setArtist("35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,CD,,,0,100.0," + "'", str11, "35,CD,,,0,100.0,");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setArtist("");
        java.lang.String str13 = cD6.getArtist();
        java.lang.String str14 = cD6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        boolean boolean11 = cD6.isCanPurchase();
        int int12 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getId();
        cD6.setLocation("35,CD,,,0,-1.0,");
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = cD6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.getTitle();
        cD6.setRemainingCopies(10);
        cD6.setCanPurchase(true);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        objects.CD cD6 = new objects.CD(0, "10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,", "", (-1), (double) 10L, "10,CD,35,CD,,,0,97.0,hi!,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,,-1,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        cD6.setArtist("35,CD,,,0,100.0,");
        cD6.setLocation("35,CD,,,0,-1.0,");
        java.lang.String str13 = cD6.getArtist();
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,hi!");
        cD6.setCanPurchase(false);
        boolean boolean18 = cD6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,0,100.0," + "'", str13, "35,CD,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((-1.0d));
        boolean boolean10 = cD6.isCanPurchase();
        cD6.setValue(10.0d);
        java.lang.String str13 = cD6.getArtist();
        cD6.setLocation("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        cD6.setValue((double) 'a');
        cD6.setLocation("0,CD,,35,CD,,,0,100.0,,97,0.0,0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        objects.CD cD6 = new objects.CD((int) 'a', "", "", 10, (double) '4', "35,CD,,,0,-1.0,");
        cD6.setCanRent(false);
        java.lang.String str9 = cD6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        cD6.setValue((-1.0d));
        int int9 = cD6.getId();
        cD6.setArtist("0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        cD6.setRemainingCopies(100);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = cD6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        boolean boolean8 = cD6.isCanRent();
        java.lang.String str9 = cD6.getTitle();
        java.lang.String str10 = cD6.toCSVString();
        java.lang.String str11 = cD6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,CD,,,0,100.0," + "'", str10, "35,CD,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,CD,,,0,100.0," + "'", str11, "35,CD,,,0,100.0,");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = cD6.getValue();
        cD6.setLocation("");
        int int10 = cD6.getRemainingCopies();
        cD6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = cD6.toCSVString();
        double double14 = cD6.getValue();
        cD6.setLocation("");
        java.lang.Class<?> wildcardClass17 = cD6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,CD,,,-1,100.0," + "'", str13, "35,CD,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        objects.CD cD6 = new objects.CD(100, "", "35,CD,,,0,100.0,", (int) (short) 0, (double) (byte) 0, "");
        cD6.setValue((-1.0d));
        int int9 = cD6.getId();
        cD6.setArtist("0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        java.lang.String str12 = cD6.getArtist();
        int int13 = cD6.getId();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0," + "'", str12, "0,CD,,35,CD,,,0,100.0,,97,0.0,100,CD,,35,CD,,,0,100.0,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        objects.CD cD6 = new objects.CD((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = cD6.getTitle();
        cD6.setValue((double) (short) -1);
        java.lang.String str10 = cD6.getArtist();
        boolean boolean11 = cD6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

