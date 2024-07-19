package Randoop.junits.BOOK;

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
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
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
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user8);
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
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = book6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = book6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = book6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = book6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = book6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = book6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        java.lang.Class<?> wildcardClass14 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,BOOK,,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = book6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,BOOK,,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setRemainingCopies(10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        int int15 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        java.lang.Class<?> wildcardClass10 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        boolean boolean7 = book6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        book6.setIsbn("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.Class<?> wildcardClass14 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = book6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = book6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        java.lang.Class<?> wildcardClass17 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setRemainingCopies((int) (short) -1);
        java.lang.String str14 = book6.toCSVString();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = book6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,BOOK,,,-1,-1.0," + "'", str14, "35,BOOK,,,-1,-1.0,");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        int int10 = book6.getRemainingCopies();
        java.lang.String str11 = book6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = book6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = book6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,BOOK,,,-1,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        int int10 = book6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        book6.setCanPurchase(false);
        book6.setLocation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        book6.setCanPurchase(true);
        book6.setLocation("");
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = book6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.toCSVString();
        java.lang.Class<?> wildcardClass17 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35,BOOK,,,10,100.0," + "'", str16, "35,BOOK,,,10,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = book6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.Class<?> wildcardClass7 = book6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setCanRent(true);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = book6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setValue(10.0d);
        java.lang.Class<?> wildcardClass13 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,BOOK,,,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        double double17 = book6.getValue();
        book6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        int int12 = book6.getRemainingCopies();
        java.lang.Class<?> wildcardClass13 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setRemainingCopies(10);
        book6.setIsbn("hi!");
        book6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.toCSVString();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,BOOK,,,0,100.0," + "'", str8, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        int int9 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setRemainingCopies((int) (short) -1);
        book6.setCanRent(false);
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = book6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setRemainingCopies((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        double double10 = book6.getValue();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = book6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getIsbn();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = book6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setValue((double) 10L);
        java.lang.Class<?> wildcardClass11 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = book6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.getLocation();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = book6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,BOOK,,,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.toCSVString();
        boolean boolean12 = book6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,0,100.0," + "'", str11, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setCanRent(false);
        int int14 = book6.getId();
        boolean boolean15 = book6.isCanRent();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setValue((double) 10L);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = book6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        int int11 = book6.getRemainingCopies();
        java.lang.String str12 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        book6.setValue((double) (short) -1);
        java.lang.Class<?> wildcardClass12 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        book6.setRemainingCopies((int) (byte) 0);
        book6.setValue((double) (byte) 100);
        boolean boolean16 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        java.lang.String str14 = book6.getLocation();
        java.lang.Class<?> wildcardClass15 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getLocation();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = book6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        double double15 = book6.getValue();
        java.lang.String str16 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35,BOOK,,,0,-1.0," + "'", str16, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        double double10 = book6.getValue();
        boolean boolean11 = book6.isCanPurchase();
        book6.setRemainingCopies(10);
        int int14 = book6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass13 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setValue((double) (byte) -1);
        book6.setLocation("35,BOOK,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getLocation();
        book6.setIsbn("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.Book book6 = new objects.Book((int) '#', "35,BOOK,,,-1,-1.0,", "hi!", 1, (double) (short) 0, "35,BOOK,,,10,100.0,");
        int int7 = book6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        objects.Book book6 = new objects.Book(35, "35,BOOK,,,0,100.0,", "35,BOOK,,,0,100.0,", (int) (byte) 1, (double) (short) 1, "35,BOOK,,,0,100.0,");
        java.lang.Class<?> wildcardClass7 = book6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        java.lang.String str10 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        book6.setCanPurchase(false);
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setValue(10.0d);
        book6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        java.lang.String str15 = book6.toCSVString();
        java.lang.String str16 = book6.getIsbn();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,BOOK,,,0,100.0," + "'", str15, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setCanPurchase(false);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = book6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        java.lang.String str14 = book6.getLocation();
        boolean boolean15 = book6.isCanRent();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = book6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        int int14 = book6.getRemainingCopies();
        java.lang.String str15 = book6.getIsbn();
        int int16 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        book6.setValue((double) (short) -1);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        java.lang.String str11 = book6.getIsbn();
        book6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        java.lang.Class<?> wildcardClass13 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.Book book6 = new objects.Book(100, "hi!", "hi!", (-1), (double) 10, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.Book book6 = new objects.Book((int) (byte) -1, "hi!", "35,BOOK,,,0,100.0,", (int) (byte) 10, (-1.0d), "35,BOOK,,,-1,-1.0,");
        java.lang.Class<?> wildcardClass7 = book6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        objects.Book book6 = new objects.Book(0, "hi!", "35,BOOK,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        book6.setValue((double) (short) 10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.toCSVString();
        book6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35,BOOK,,,10,100.0," + "'", str16, "35,BOOK,,,10,100.0,");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setCanRent(false);
        int int14 = book6.getId();
        java.lang.String str15 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,BOOK,,,0,-1.0," + "'", str15, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        double double8 = book6.getValue();
        book6.setCanRent(false);
        int int11 = book6.getRemainingCopies();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = book6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        java.lang.String str10 = book6.getIsbn();
        boolean boolean11 = book6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        book6.setCanPurchase(true);
        book6.setLocation("");
        int int17 = book6.getId();
        java.lang.String str18 = book6.getIsbn();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        double double13 = book6.getValue();
        book6.setLocation("35,BOOK,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        double double13 = book6.getValue();
        java.lang.String str14 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        book6.setCanPurchase(false);
        double double15 = book6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.getLocation();
        book6.setLocation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        book6.setCanRent(true);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord20 = book6.borrow(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        int int11 = book6.getId();
        boolean boolean12 = book6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        java.lang.String str18 = book6.toCSVString();
        int int19 = book6.getId();
        java.lang.Class<?> wildcardClass20 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35,BOOK,,,0,100.0," + "'", str18, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        int int11 = book6.getId();
        boolean boolean12 = book6.isCanPurchase();
        book6.setCanRent(false);
        int int15 = book6.getId();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        boolean boolean10 = book6.isCanPurchase();
        book6.setValue((double) 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        objects.Book book6 = new objects.Book(0, "35,BOOK,,,-1,-1.0,", "35,BOOK,,,-1,-1.0,", (int) 'a', (double) 0, "");
        double double7 = book6.getValue();
        boolean boolean8 = book6.isCanPurchase();
        java.lang.Class<?> wildcardClass9 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setValue((-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,BOOK,,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        int int10 = book6.getId();
        java.lang.String str11 = book6.getIsbn();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setRemainingCopies((int) (short) 0);
        int int15 = book6.getId();
        book6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setRemainingCopies(10);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        java.lang.String str15 = book6.getIsbn();
        int int16 = book6.getRemainingCopies();
        java.lang.String str17 = book6.getIsbn();
        book6.setRemainingCopies(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        java.lang.String str11 = book6.getIsbn();
        java.lang.String str12 = book6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35,BOOK,,,0,100.0," + "'", str12, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        book6.setLocation("");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        book6.setCanPurchase(true);
        book6.setLocation("");
        int int17 = book6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        java.lang.String str10 = book6.getIsbn();
        java.lang.Class<?> wildcardClass11 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        book6.setRemainingCopies((int) (byte) 0);
        double double14 = book6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,BOOK,,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        java.lang.String str16 = book6.getTitle();
        java.lang.String str17 = book6.getIsbn();
        book6.setValue((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        objects.Book book6 = new objects.Book((int) (byte) 100, "35,BOOK,,,0,100.0,", "35,BOOK,,,0,-1.0,", (-1), 0.0d, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        book6.setCanPurchase(true);
        book6.setRemainingCopies((int) '4');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setRemainingCopies((int) (short) -1);
        double double14 = book6.getValue();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = book6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        objects.Book book6 = new objects.Book((int) 'a', "", "", 10, (double) '4', "35,BOOK,,,10,100.0,");
        book6.setIsbn("");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setCanRent(false);
        int int14 = book6.getId();
        boolean boolean15 = book6.isCanRent();
        book6.setLocation("35,BOOK,,,-1,-1.0,");
        book6.setValue((double) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        book6.setCanPurchase(true);
        book6.setCanRent(false);
        boolean boolean20 = book6.isCanPurchase();
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        objects.Book book6 = new objects.Book(0, "35,BOOK,,,-1,-1.0,", "35,BOOK,,,-1,-1.0,", (int) 'a', (double) 0, "");
        double double7 = book6.getValue();
        boolean boolean8 = book6.isCanPurchase();
        boolean boolean9 = book6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanPurchase();
        java.lang.String str12 = book6.getTitle();
        java.lang.String str13 = book6.getTitle();
        java.lang.Class<?> wildcardClass14 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        java.lang.String str17 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getIsbn();
        book6.setCanRent(false);
        int int16 = book6.getId();
        java.lang.Class<?> wildcardClass17 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        java.lang.String str11 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,0,-1.0," + "'", str11, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        int int10 = book6.getRemainingCopies();
        double double11 = book6.getValue();
        java.lang.String str12 = book6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        objects.Book book6 = new objects.Book((int) (byte) 0, "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,", "", 35, (double) (-1.0f), "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        java.lang.String str18 = book6.getLocation();
        book6.setCanPurchase(false);
        book6.setLocation("35,BOOK,,,10,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        double double10 = book6.getValue();
        boolean boolean11 = book6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.getLocation();
        java.lang.String str9 = book6.toCSVString();
        int int10 = book6.getRemainingCopies();
        java.lang.Class<?> wildcardClass11 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,BOOK,,,0,100.0," + "'", str9, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,BOOK,,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setCanRent(false);
        int int14 = book6.getId();
        double double15 = book6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setRemainingCopies((int) (short) -1);
        double double14 = book6.getValue();
        java.lang.Class<?> wildcardClass15 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        int int12 = book6.getId();
        boolean boolean13 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        double double10 = book6.getValue();
        book6.setLocation("10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getIsbn();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        java.lang.String str14 = book6.getLocation();
        double double15 = book6.getValue();
        java.lang.Class<?> wildcardClass16 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        objects.Book book6 = new objects.Book((int) 'a', "35,BOOK,,,0,-1.0,", "35,BOOK,,,0,100.0,", 35, (double) 35, "35,BOOK,,,-1,-1.0,");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        objects.Book book6 = new objects.Book((int) (short) 1, "35,BOOK,,,0,100.0,", "35,BOOK,,,0,100.0,", (int) (byte) 10, (double) ' ', "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setValue((double) (byte) 100);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        java.lang.String str10 = book6.toCSVString();
        book6.setLocation("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,BOOK,,,0,100.0," + "'", str10, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        book6.setCanPurchase(false);
        int int13 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        objects.Book book6 = new objects.Book((int) (short) 10, "35,BOOK,,,10,100.0,", "35,BOOK,,,-1,-1.0,", 0, (double) 100.0f, "");
        java.lang.String str7 = book6.toCSVString();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = book6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0," + "'", str7, "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        book6.setCanPurchase(false);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        int int10 = book6.getId();
        java.lang.String str11 = book6.toCSVString();
        boolean boolean12 = book6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,-1,100.0," + "'", str11, "35,BOOK,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        boolean boolean13 = book6.isCanPurchase();
        int int14 = book6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getLocation();
        java.lang.String str15 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        double double8 = book6.getValue();
        boolean boolean9 = book6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanPurchase();
        java.lang.String str12 = book6.getTitle();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = book6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        int int11 = book6.getId();
        book6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = book6.isCanPurchase();
        java.lang.String str15 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        book6.setCanPurchase(true);
        book6.setLocation("");
        book6.setIsbn("35,BOOK,,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        int int11 = book6.getId();
        boolean boolean12 = book6.isCanPurchase();
        book6.setCanRent(false);
        int int15 = book6.getId();
        book6.setValue((double) ' ');
        double double18 = book6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        int int11 = book6.getRemainingCopies();
        book6.setValue((-1.0d));
        int int14 = book6.getRemainingCopies();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.toCSVString();
        java.lang.String str9 = book6.getLocation();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,BOOK,,,0,100.0," + "'", str8, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setLocation("35,BOOK,,,10,100.0,");
        boolean boolean12 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        boolean boolean10 = book6.isCanRent();
        book6.setLocation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        int int11 = book6.getId();
        book6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = book6.isCanPurchase();
        java.lang.String str15 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,BOOK,,,0,-1.0," + "'", str15, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setCanPurchase(true);
        java.lang.String str13 = book6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getIsbn();
        boolean boolean15 = book6.isCanPurchase();
        java.lang.String str16 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        double double8 = book6.getValue();
        book6.setCanRent(false);
        book6.setRemainingCopies((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        double double8 = book6.getValue();
        book6.setCanRent(false);
        int int11 = book6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        int int10 = book6.getId();
        java.lang.String str11 = book6.toCSVString();
        book6.setLocation("35,BOOK,,,0,-1.0,");
        java.lang.String str14 = book6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,-1,100.0," + "'", str11, "35,BOOK,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0," + "'", str14, "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        java.lang.String str14 = book6.getLocation();
        boolean boolean15 = book6.isCanRent();
        book6.setValue((double) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        java.lang.String str11 = book6.getIsbn();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        java.lang.String str11 = book6.toCSVString();
        book6.setRemainingCopies((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,0,100.0," + "'", str11, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setRemainingCopies(10);
        book6.setIsbn("hi!");
        boolean boolean13 = book6.isCanRent();
        book6.setValue((double) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = book6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        objects.Book book6 = new objects.Book((int) (byte) 100, "35,BOOK,,,10,100.0,", "35,BOOK,,,0,-1.0,", (int) (byte) 100, (double) (short) 100, "35,BOOK,,,10,100.0,");
        boolean boolean7 = book6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        objects.Book book6 = new objects.Book(0, "hi!", "", 0, (double) (short) 0, "");
        boolean boolean7 = book6.isCanPurchase();
        book6.setRemainingCopies((int) (byte) 10);
        book6.setIsbn("35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setCanPurchase(true);
        book6.setRemainingCopies((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.toCSVString();
        book6.setCanRent(false);
        book6.setIsbn("35,BOOK,,,0,-1.0,");
        book6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,BOOK,,,0,100.0," + "'", str9, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        double double10 = book6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean19 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        book6.setIsbn("35,BOOK,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = book6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        objects.Book book6 = new objects.Book(0, "hi!", "", 0, (double) (short) 0, "");
        book6.setRemainingCopies(100);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        objects.Book book6 = new objects.Book((int) (byte) 0, "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,", "35,BOOK,,,0,-1.0,", (int) (byte) 100, (double) 0, "");
        book6.setLocation("hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        objects.Book book6 = new objects.Book((int) (byte) -1, "hi!", "35,BOOK,,,0,100.0,", (int) (byte) 10, (-1.0d), "35,BOOK,,,-1,-1.0,");
        book6.setIsbn("hi!");
        boolean boolean9 = book6.isCanPurchase();
        java.lang.String str10 = book6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,BOOK,,,0,100.0," + "'", str10, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        objects.Book book6 = new objects.Book(0, "35,BOOK,,,10,100.0,", "", 100, (double) (byte) 0, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        java.lang.String str18 = book6.getLocation();
        book6.setCanPurchase(false);
        int int21 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        int int11 = book6.getRemainingCopies();
        book6.setCanRent(false);
        int int14 = book6.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        book6.setLocation("");
        book6.setCanRent(true);
        boolean boolean20 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getIsbn();
        book6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        int int14 = book6.getRemainingCopies();
        java.lang.String str15 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        java.lang.String str10 = book6.toCSVString();
        java.lang.Class<?> wildcardClass11 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,BOOK,,,0,100.0," + "'", str10, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        double double8 = book6.getValue();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setValue((double) (byte) 100);
        book6.setCanRent(false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,BOOK,,,-1,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        book6.setIsbn("");
        boolean boolean15 = book6.isCanPurchase();
        book6.setLocation("35,BOOK,,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        book6.setCanPurchase(false);
        java.lang.Class<?> wildcardClass14 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.toCSVString();
        book6.setIsbn("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,0,100.0," + "'", str11, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        book6.setCanPurchase(true);
        book6.setLocation("");
        boolean boolean17 = book6.isCanPurchase();
        book6.setLocation("35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getIsbn();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = book6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        boolean boolean13 = book6.isCanPurchase();
        book6.setValue((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        book6.setCanPurchase(true);
        book6.setCanRent(false);
        book6.setIsbn("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.getLocation();
        boolean boolean9 = book6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.toCSVString();
        book6.setCanRent(false);
        book6.setValue((double) 10);
        java.lang.Class<?> wildcardClass14 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,BOOK,,,0,100.0," + "'", str9, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getIsbn();
        java.lang.String str13 = book6.getIsbn();
        book6.setIsbn("35,BOOK,,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getIsbn();
        int int15 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        java.lang.String str15 = book6.getIsbn();
        int int16 = book6.getRemainingCopies();
        book6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        book6.setCanRent(true);
        book6.setCanRent(true);
        boolean boolean21 = book6.isCanRent();
        int int22 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        objects.Book book6 = new objects.Book((int) (byte) 0, "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,", "35,BOOK,,,0,-1.0,", (int) (byte) 100, (double) 0, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord8 = book6.borrow(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        book6.setIsbn("");
        book6.setRemainingCopies((int) (short) 0);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setCanRent(false);
        book6.setRemainingCopies((-1));
        int int16 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getIsbn();
        book6.setValue((double) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"BOOK\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        book6.setLocation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        int int10 = book6.getId();
        int int11 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setRemainingCopies((int) (short) 0);
        int int15 = book6.getId();
        book6.setIsbn("35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setCanRent(false);
        book6.setRemainingCopies((-1));
        boolean boolean16 = book6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        java.lang.String str18 = book6.getLocation();
        java.lang.String str19 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        int int11 = book6.getRemainingCopies();
        book6.setLocation("35,BOOK,,,10,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.toCSVString();
        java.lang.String str9 = book6.getLocation();
        book6.setRemainingCopies(1);
        java.lang.String str12 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,BOOK,,,0,100.0," + "'", str8, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35,BOOK,,,1,100.0," + "'", str12, "35,BOOK,,,1,100.0,");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        boolean boolean10 = book6.isCanRent();
        book6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.toCSVString();
        book6.setIsbn("10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,BOOK,,,0,100.0," + "'", str14, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        book6.setCanRent(true);
        book6.setCanRent(true);
        boolean boolean21 = book6.isCanRent();
        book6.setCanPurchase(false);
        boolean boolean24 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("");
        book6.setValue((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        objects.Book book6 = new objects.Book(0, "hi!", "", 0, (double) (short) 0, "");
        boolean boolean7 = book6.isCanPurchase();
        book6.setRemainingCopies((int) (byte) 10);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        boolean boolean11 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        objects.Book book6 = new objects.Book(100, "35,BOOK,,,10,100.0,", "35,BOOK,,,1,100.0,", (int) 'a', (double) (-1.0f), "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        objects.Book book6 = new objects.Book((int) (byte) -1, "hi!", "35,BOOK,,,0,100.0,", (int) (byte) 10, (-1.0d), "35,BOOK,,,-1,-1.0,");
        java.lang.String str7 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35,BOOK,,,0,100.0," + "'", str7, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        java.lang.String str15 = book6.getIsbn();
        double double16 = book6.getValue();
        java.lang.Class<?> wildcardClass17 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setRemainingCopies((int) (short) 0);
        book6.setRemainingCopies((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getLocation();
        book6.setValue((double) (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        objects.Book book6 = new objects.Book((int) (byte) 0, "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,", "35,BOOK,,,0,-1.0,", (int) (byte) -1, (double) (byte) -1, "35,BOOK,,,0,100.0,");
        book6.setCanPurchase(true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,BOOK,35,BOOK,,,0,100.0,,35,BOOK,,,0,100.0,,1,1.0,35,BOOK,,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        java.lang.String str18 = book6.getLocation();
        book6.setCanPurchase(false);
        book6.setLocation("10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        book6.setLocation("hi!");
        book6.setLocation("hi!");
        book6.setIsbn("hi!");
        java.lang.String str18 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.Book book6 = new objects.Book(0, "hi!", "35,BOOK,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        int int7 = book6.getId();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        double double10 = book6.getValue();
        java.lang.String str11 = book6.toCSVString();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,0,100.0," + "'", str11, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        double double10 = book6.getValue();
        boolean boolean11 = book6.isCanPurchase();
        java.lang.String str12 = book6.getTitle();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("35,BOOK,,,0,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        book6.setIsbn("");
        book6.setRemainingCopies((int) (short) 0);
        java.lang.String str17 = book6.getTitle();
        book6.setValue(1.0d);
        java.lang.String str20 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanPurchase();
        book6.setLocation("35,BOOK,,,0,100.0,");
        java.lang.String str14 = book6.getTitle();
        double double15 = book6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        java.lang.String str18 = book6.toCSVString();
        book6.setValue((double) 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35,BOOK,,,0,100.0," + "'", str18, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        int int11 = book6.getId();
        book6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = book6.isCanPurchase();
        java.lang.String str15 = book6.getIsbn();
        int int16 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.Book book6 = new objects.Book((int) (byte) 0, "35,BOOK,,,10,100.0,", "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,", 10, 100.0d, "35,BOOK,,,1,100.0,");
        double double7 = book6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        objects.Book book6 = new objects.Book((int) (short) 10, "35,BOOK,,,10,100.0,", "35,BOOK,,,-1,-1.0,", 0, (double) 100.0f, "");
        java.lang.String str7 = book6.toCSVString();
        java.lang.String str8 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0," + "'", str7, "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        objects.Book book6 = new objects.Book((-1), "35,BOOK,,,0,100.0,", "35,BOOK,,,0,-1.0,", (int) (short) 100, (-1.0d), "35,BOOK,,,-1,-1.0,");
        java.lang.String str7 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35,BOOK,,,0,-1.0," + "'", str7, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getLocation();
        boolean boolean9 = book6.isCanPurchase();
        book6.setRemainingCopies(10);
        int int12 = book6.getId();
        java.lang.String str13 = book6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        java.lang.String str10 = book6.toCSVString();
        java.lang.String str11 = book6.getIsbn();
        book6.setIsbn("35,BOOK,,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,BOOK,,,0,100.0," + "'", str10, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.Book book6 = new objects.Book(0, "hi!", "", 0, (double) (short) 0, "");
        book6.setCanPurchase(true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        int int11 = book6.getRemainingCopies();
        boolean boolean12 = book6.isCanRent();
        double double13 = book6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        java.lang.String str15 = book6.getIsbn();
        double double16 = book6.getValue();
        book6.setCanPurchase(false);
        java.lang.String str19 = book6.toCSVString();
        double double20 = book6.getValue();
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35,BOOK,,,0,-1.0," + "'", str19, "35,BOOK,,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.getLocation();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = book6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        boolean boolean14 = book6.isCanRent();
        java.lang.String str15 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        book6.setIsbn("");
        java.lang.String str18 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,BOOK,,,1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        java.lang.String str14 = book6.getLocation();
        book6.setLocation("hi!");
        int int17 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.Book book6 = new objects.Book(0, "35,BOOK,,,-1,-1.0,", "35,BOOK,,,-1,-1.0,", (int) 'a', (double) 0, "");
        double double7 = book6.getValue();
        book6.setValue(0.0d);
        int int10 = book6.getId();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setRemainingCopies((int) (byte) 100);
        book6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        objects.Book book6 = new objects.Book((int) (byte) 0, "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,", "35,BOOK,,,0,-1.0,", (int) (byte) -1, (double) (byte) -1, "35,BOOK,,,0,100.0,");
        java.lang.String str7 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,BOOK,35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,,35,BOOK,,,0,-1.0,,-1,-1.0,35,BOOK,,,0,100.0," + "'", str7, "0,BOOK,35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,,35,BOOK,,,0,-1.0,,-1,-1.0,35,BOOK,,,0,100.0,");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        objects.Book book6 = new objects.Book(0, "hi!", "35,BOOK,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        book6.setRemainingCopies(35);
        double double9 = book6.getValue();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.Book book6 = new objects.Book((int) '#', "35,BOOK,,,-1,-1.0,", "hi!", 1, (double) (short) 0, "35,BOOK,,,10,100.0,");
        java.lang.String str7 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        objects.Book book6 = new objects.Book(10, "hi!", "35,BOOK,,,-1,100.0,", (int) 'a', 0.0d, "35,BOOK,,,-1,-1.0,");
        book6.setValue((double) (short) 100);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        book6.setIsbn("");
        int int18 = book6.getRemainingCopies();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setRemainingCopies(10);
        java.lang.String str11 = book6.getLocation();
        book6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanPurchase();
        book6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        double double10 = book6.getValue();
        boolean boolean11 = book6.isCanPurchase();
        book6.setLocation("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        int int11 = book6.getRemainingCopies();
        int int12 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        int int10 = book6.getId();
        java.lang.String str11 = book6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        java.lang.String str18 = book6.toCSVString();
        java.lang.String str19 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35,BOOK,,,0,100.0," + "'", str18, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        book6.setRemainingCopies((int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("");
        int int10 = book6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        boolean boolean13 = book6.isCanPurchase();
        book6.setLocation("35,BOOK,,,-1,100.0,");
        java.lang.Class<?> wildcardClass16 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.toCSVString();
        java.lang.String str9 = book6.getLocation();
        book6.setRemainingCopies(1);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,BOOK,,,0,100.0," + "'", str8, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("");
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = book6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setValue((double) 10L);
        book6.setValue((double) '#');
        book6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        book6.setCanRent(false);
        java.lang.String str13 = book6.getLocation();
        book6.setRemainingCopies((int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setIsbn("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setRemainingCopies((int) (byte) 100);
        book6.setIsbn("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanPurchase();
        book6.setIsbn("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        objects.Book book6 = new objects.Book((int) ' ', "35,BOOK,,,-1,-1.0,", "35,BOOK,,,0,-1.0,", 10, (double) 0.0f, "");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        int int10 = book6.getId();
        java.lang.String str11 = book6.toCSVString();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,-1,100.0," + "'", str11, "35,BOOK,,,-1,100.0,");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        java.lang.String str15 = book6.getIsbn();
        int int16 = book6.getRemainingCopies();
        java.lang.String str17 = book6.getIsbn();
        java.lang.String str18 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        objects.Book book6 = new objects.Book(0, "hi!", "", 0, (double) (short) 0, "");
        boolean boolean7 = book6.isCanPurchase();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str10 = book6.getIsbn();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        java.lang.String str15 = book6.getIsbn();
        double double16 = book6.getValue();
        book6.setIsbn("35,BOOK,,,10,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        book6.setCanRent(true);
        book6.setCanRent(true);
        double double21 = book6.getValue();
        book6.setLocation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        java.lang.String str11 = book6.getIsbn();
        double double12 = book6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        int int12 = book6.getId();
        java.lang.String str13 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        book6.setCanPurchase(true);
        book6.setCanRent(false);
        boolean boolean20 = book6.isCanPurchase();
        java.lang.String str21 = book6.getIsbn();
        boolean boolean22 = book6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies(100);
        boolean boolean12 = book6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        boolean boolean10 = book6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        double double11 = book6.getValue();
        java.lang.String str12 = book6.toCSVString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35,BOOK,,,0,100.0," + "'", str12, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setRemainingCopies(10);
        boolean boolean11 = book6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        int int11 = book6.getRemainingCopies();
        boolean boolean12 = book6.isCanPurchase();
        boolean boolean13 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.Book book6 = new objects.Book(35, "", "0,BOOK,35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,,35,BOOK,,,0,-1.0,,-1,-1.0,35,BOOK,,,0,100.0,", (int) (short) 10, (double) (byte) 0, "35,BOOK,,,10,100.0,");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        java.lang.String str10 = book6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        book6.setCanPurchase(false);
        book6.setCanRent(true);
        int int15 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        book6.setCanRent(true);
        boolean boolean17 = book6.isCanPurchase();
        book6.setCanPurchase(false);
        java.lang.String str20 = book6.getTitle();
        book6.setCanPurchase(true);
        book6.setRemainingCopies(35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        int int11 = book6.getRemainingCopies();
        boolean boolean12 = book6.isCanRent();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        java.lang.String str15 = book6.getTitle();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        double double10 = book6.getValue();
        int int11 = book6.getRemainingCopies();
        int int12 = book6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.toCSVString();
        boolean boolean15 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,BOOK,,,0,100.0," + "'", str14, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.toCSVString();
        double double12 = book6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,0,100.0," + "'", str11, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,BOOK,10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,,35,BOOK,,,0,-1.0,,100,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"BOOK\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        int int11 = book6.getRemainingCopies();
        book6.setCanRent(false);
        int int14 = book6.getRemainingCopies();
        book6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        objects.Book book6 = new objects.Book(0, "35,BOOK,,,-1,-1.0,", "35,BOOK,,,-1,-1.0,", (int) 'a', (double) 0, "");
        double double7 = book6.getValue();
        book6.setCanRent(true);
        book6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        book6.setRemainingCopies((int) '#');
        boolean boolean11 = book6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        objects.Book book6 = new objects.Book((int) (byte) -1, "hi!", "35,BOOK,,,0,100.0,", (int) (byte) 10, (-1.0d), "35,BOOK,,,-1,-1.0,");
        book6.setIsbn("hi!");
        int int9 = book6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        int int11 = book6.getId();
        java.lang.String str12 = book6.getLocation();
        book6.setCanRent(false);
        book6.setLocation("35,BOOK,,,0,100.0,");
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = book6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        int int11 = book6.getRemainingCopies();
        boolean boolean12 = book6.isCanPurchase();
        book6.setRemainingCopies((int) '#');
        int int15 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        java.lang.String str14 = book6.getLocation();
        book6.setLocation("hi!");
        book6.setLocation("10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
        boolean boolean19 = book6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        book6.setLocation("hi!");
        java.lang.Class<?> wildcardClass14 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        java.lang.String str11 = book6.getLocation();
        int int12 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        java.lang.String str15 = book6.toCSVString();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = book6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,BOOK,,,0,100.0," + "'", str15, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        java.lang.String str10 = book6.getTitle();
        int int11 = book6.getId();
        book6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        book6.setCanRent(true);
        int int19 = book6.getRemainingCopies();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        int int11 = book6.getRemainingCopies();
        book6.setValue((-1.0d));
        int int14 = book6.getRemainingCopies();
        book6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,BOOK,35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,,35,BOOK,,,0,-1.0,,-1,-1.0,35,BOOK,,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        int int11 = book6.getRemainingCopies();
        book6.setIsbn("");
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = book6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        book6.setIsbn("0,BOOK,35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,,35,BOOK,,,0,-1.0,,-1,-1.0,35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        java.lang.String str14 = book6.getLocation();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.toCSVString();
        book6.setRemainingCopies((int) '#');
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = book6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35,BOOK,,,0,100.0," + "'", str13, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        java.lang.String str16 = book6.getIsbn();
        book6.setCanRent(true);
        book6.setCanRent(true);
        book6.setValue(0.0d);
        java.lang.String str23 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setCanRent(true);
        boolean boolean13 = book6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        int int10 = book6.getId();
        book6.setIsbn("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        boolean boolean11 = book6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        objects.Book book6 = new objects.Book(0, "hi!", "", 0, (double) (short) 0, "");
        boolean boolean7 = book6.isCanPurchase();
        book6.setRemainingCopies((int) (byte) 10);
        book6.setValue((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        int int14 = book6.getRemainingCopies();
        java.lang.String str15 = book6.getIsbn();
        java.lang.String str16 = book6.getLocation();
        book6.setValue((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        book6.setLocation("");
        int int18 = book6.getRemainingCopies();
        int int19 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        java.lang.String str11 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        objects.Book book6 = new objects.Book((int) '4', "", "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,", 0, (double) (byte) 10, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        boolean boolean13 = book6.isCanPurchase();
        int int14 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        int int11 = book6.getRemainingCopies();
        boolean boolean12 = book6.isCanRent();
        book6.setIsbn("35,BOOK,,,0,100.0,");
        int int15 = book6.getId();
        book6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        objects.Book book6 = new objects.Book((int) (byte) 0, "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,", "35,BOOK,,,0,-1.0,", (int) (byte) 100, (double) 0, "");
        java.lang.String str7 = book6.toCSVString();
        java.lang.Class<?> wildcardClass8 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,BOOK,10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,,35,BOOK,,,0,-1.0,,100,0.0," + "'", str7, "0,BOOK,10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,,35,BOOK,,,0,-1.0,,100,0.0,");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        int int10 = book6.getId();
        book6.setCanPurchase(true);
        java.lang.String str13 = book6.getLocation();
        book6.setCanRent(false);
        boolean boolean16 = book6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        boolean boolean7 = book6.isCanRent();
        int int8 = book6.getRemainingCopies();
        book6.setRemainingCopies((int) (byte) 100);
        book6.setIsbn("35,BOOK,,,-1,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        book6.setRemainingCopies(35);
        java.lang.String str14 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        java.lang.String str16 = book6.getLocation();
        double double17 = book6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setCanPurchase(true);
        int int11 = book6.getRemainingCopies();
        book6.setValue((-1.0d));
        book6.setIsbn("hi!");
        double double16 = book6.getValue();
        java.lang.Class<?> wildcardClass17 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        java.lang.String str15 = book6.getIsbn();
        double double16 = book6.getValue();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        java.lang.String str15 = book6.getIsbn();
        int int16 = book6.getRemainingCopies();
        boolean boolean17 = book6.isCanRent();
        book6.setIsbn("10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
        book6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setCanRent(false);
        book6.setRemainingCopies((-1));
        java.lang.String str16 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35,BOOK,,,-1,-1.0," + "'", str16, "35,BOOK,,,-1,-1.0,");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        book6.setIsbn("");
        book6.setRemainingCopies((int) (short) 0);
        java.lang.String str17 = book6.getTitle();
        book6.setValue(1.0d);
        java.lang.String str20 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getLocation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        double double13 = book6.getValue();
        java.lang.String str14 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        objects.Book book6 = new objects.Book(35, "35,BOOK,,,0,100.0,", "", (int) (short) 100, (-1.0d), "");
        java.lang.String str7 = book6.getLocation();
        boolean boolean8 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        int int10 = book6.getId();
        java.lang.String str11 = book6.toCSVString();
        book6.setLocation("35,BOOK,,,0,-1.0,");
        book6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,-1,100.0," + "'", str11, "35,BOOK,,,-1,100.0,");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setValue((double) 10L);
        book6.setValue((double) '#');
        boolean boolean13 = book6.isCanRent();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        int int12 = book6.getRemainingCopies();
        java.lang.String str13 = book6.getLocation();
        book6.setLocation("35,BOOK,,,0,100.0,");
        book6.setIsbn("35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isCanPurchase();
        boolean boolean15 = book6.isCanRent();
        book6.setLocation("");
        int int18 = book6.getRemainingCopies();
        java.lang.String str19 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35,BOOK,,,10,100.0," + "'", str19, "35,BOOK,,,10,100.0,");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        objects.Book book6 = new objects.Book(0, "hi!", "35,BOOK,,,0,100.0,", (int) (short) 0, 0.0d, "hi!");
        boolean boolean7 = book6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        objects.Book book6 = new objects.Book(0, "hi!", "", 0, (double) (short) 0, "");
        boolean boolean7 = book6.isCanPurchase();
        book6.setIsbn("35,BOOK,,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setValue((double) 10L);
        book6.setLocation("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getLocation();
        java.lang.String str14 = book6.toCSVString();
        java.lang.String str15 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,BOOK,,,0,100.0," + "'", str14, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        int int14 = book6.getRemainingCopies();
        book6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setCanRent(false);
        book6.setRemainingCopies((-1));
        book6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        book6.setValue((double) (short) -1);
        book6.setRemainingCopies((int) (short) 100);
        book6.setCanRent(false);
        boolean boolean16 = book6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        boolean boolean7 = book6.isCanRent();
        int int8 = book6.getRemainingCopies();
        double double9 = book6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        double double10 = book6.getValue();
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        objects.Book book6 = new objects.Book(0, "35,BOOK,,,0,-1.0,", "35,BOOK,,,0,100.0,", 100, (double) (short) -1, "hi!");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35,BOOK,,,0,-1.0," + "'", str7, "35,BOOK,,,0,-1.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,BOOK,,,0,100.0," + "'", str8, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getTitle();
        book6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        double double15 = book6.getValue();
        boolean boolean16 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setRemainingCopies((int) (short) 0);
        book6.setRemainingCopies((int) (short) 1);
        book6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass19 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        book6.setValue((double) (byte) 10);
        double double13 = book6.getValue();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies(100);
        int int12 = book6.getRemainingCopies();
        int int13 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setRemainingCopies((int) (short) -1);
        java.lang.String str14 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        objects.Book book6 = new objects.Book(35, "35,BOOK,,,0,100.0,", "35,BOOK,,,0,100.0,", (int) (byte) 1, (double) (short) 1, "35,BOOK,,,0,100.0,");
        java.lang.String str7 = book6.toCSVString();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = book6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35,BOOK,35,BOOK,,,0,100.0,,35,BOOK,,,0,100.0,,1,1.0,35,BOOK,,,0,100.0," + "'", str7, "35,BOOK,35,BOOK,,,0,100.0,,35,BOOK,,,0,100.0,,1,1.0,35,BOOK,,,0,100.0,");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        int int11 = book6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"BOOK\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = book6.getIsbn();
        book6.setRemainingCopies((-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        book6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getLocation();
        boolean boolean9 = book6.isCanPurchase();
        java.lang.String str10 = book6.toCSVString();
        book6.setLocation("10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = book6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,BOOK,,,0,100.0," + "'", str10, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.getTitle();
        book6.setRemainingCopies((int) (byte) 10);
        int int12 = book6.getId();
        java.lang.String str13 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        book6.setRemainingCopies((int) (short) -1);
        boolean boolean9 = book6.isCanRent();
        int int10 = book6.getId();
        book6.setCanPurchase(true);
        java.lang.String str13 = book6.getLocation();
        book6.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setValue((-1.0d));
        book6.setValue((double) (byte) 10);
        double double13 = book6.getValue();
        java.lang.String str14 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,BOOK,,,0,10.0," + "'", str14, "35,BOOK,,,0,10.0,");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        objects.Book book6 = new objects.Book(100, "hi!", "35,BOOK,,,0,-1.0,", (int) 'a', (double) (short) -1, "35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        double double8 = book6.getValue();
        int int9 = book6.getRemainingCopies();
        book6.setCanPurchase(true);
        java.lang.String str12 = book6.getIsbn();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        java.lang.String str9 = book6.getTitle();
        boolean boolean10 = book6.isCanRent();
        book6.setValue((double) 1.0f);
        java.lang.String str13 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        book6.setRemainingCopies(10);
        java.lang.String str11 = book6.getLocation();
        int int12 = book6.getRemainingCopies();
        book6.setLocation("35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        int int11 = book6.getId();
        book6.setCanPurchase(true);
        java.lang.String str14 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        java.lang.String str9 = book6.toCSVString();
        book6.setCanRent(false);
        book6.setIsbn("35,BOOK,,,0,-1.0,");
        book6.setCanRent(false);
        java.lang.String str16 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,BOOK,,,0,100.0," + "'", str9, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35,BOOK,,,0,100.0,35,BOOK,,,0,-1.0," + "'", str16, "35,BOOK,,,0,100.0,35,BOOK,,,0,-1.0,");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        java.lang.String str16 = book6.getLocation();
        boolean boolean17 = book6.isCanPurchase();
        int int18 = book6.getRemainingCopies();
        book6.setValue((double) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,BOOK,35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,,35,BOOK,,,0,-1.0,,-1,-1.0,35,BOOK,,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        int int13 = book6.getRemainingCopies();
        java.lang.String str14 = book6.getIsbn();
        java.lang.String str15 = book6.toCSVString();
        book6.setRemainingCopies((-1));
        boolean boolean18 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35,BOOK,,,0,100.0," + "'", str15, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        book6.setCanPurchase(false);
        book6.setLocation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setValue((double) 10L);
        book6.setValue((double) '#');
        book6.setLocation("35,BOOK,,,0,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        java.lang.String str16 = book6.getTitle();
        java.lang.String str17 = book6.getIsbn();
        java.lang.String str18 = book6.getIsbn();
        book6.setLocation("35,BOOK,35,BOOK,,,0,100.0,,35,BOOK,,,0,100.0,,1,1.0,35,BOOK,,,0,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getTitle();
        book6.setValue((double) (short) -1);
        book6.setRemainingCopies((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        objects.Book book6 = new objects.Book((int) (byte) 1, "10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,", "35,BOOK,35,BOOK,,,0,100.0,,35,BOOK,,,0,100.0,,1,1.0,35,BOOK,,,0,100.0,", (int) (short) 1, 32.0d, "0,BOOK,35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,,35,BOOK,,,0,-1.0,,-1,-1.0,35,BOOK,,,0,100.0,");
        book6.setCanPurchase(false);
        book6.setCanRent(true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        book6.setCanPurchase(false);
        book6.setRemainingCopies((int) (short) -1);
        book6.setIsbn("hi!");
        java.lang.String str16 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        objects.Book book6 = new objects.Book((int) (short) 100, "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,", "35,BOOK,,,-1,100.0,", (int) (short) 100, (double) 0L, "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
        java.lang.String str7 = book6.getIsbn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0," + "'", str7, "35,BOOK,,35,BOOK,,,0,-1.0,,-1,100.0,");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        java.lang.String str13 = book6.getIsbn();
        book6.setCanRent(false);
        int int16 = book6.getId();
        book6.setLocation("35,BOOK,,,10,100.0,");
        java.lang.String str19 = book6.getIsbn();
        book6.setValue((double) (-1L));
        boolean boolean22 = book6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        int int9 = book6.getRemainingCopies();
        java.lang.String str10 = book6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,BOOK,,,0,100.0," + "'", str10, "35,BOOK,,,0,100.0,");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        boolean boolean11 = book6.isCanRent();
        java.lang.String str12 = book6.getIsbn();
        java.lang.String str13 = book6.getIsbn();
        java.lang.String str14 = book6.toCSVString();
        int int15 = book6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,BOOK,,,0,-1.0," + "'", str14, "35,BOOK,,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        boolean boolean8 = book6.isCanRent();
        book6.setCanRent(false);
        boolean boolean11 = book6.isCanRent();
        book6.setCanRent(true);
        book6.setRemainingCopies((int) (byte) 100);
        book6.setRemainingCopies((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        int int10 = book6.getRemainingCopies();
        double double11 = book6.getValue();
        java.lang.Class<?> wildcardClass12 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        book6.setValue((-1.0d));
        boolean boolean10 = book6.isCanPurchase();
        book6.setLocation("35,BOOK,,,-1,100.0,");
        book6.setLocation("10,BOOK,35,BOOK,,,10,100.0,,35,BOOK,,,-1,-1.0,,0,100.0,");
        int int15 = book6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        java.lang.String str8 = book6.getIsbn();
        int int9 = book6.getRemainingCopies();
        double double10 = book6.getValue();
        java.lang.String str11 = book6.toCSVString();
        java.lang.Class<?> wildcardClass12 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,BOOK,,,0,100.0," + "'", str11, "35,BOOK,,,0,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getId();
        book6.setIsbn("");
        book6.setCanRent(true);
        book6.setValue(0.0d);
        book6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        book6.setLocation("");
        int int10 = book6.getId();
        book6.setRemainingCopies(0);
        book6.setIsbn("35,BOOK,,,0,-1.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        objects.Book book6 = new objects.Book((int) '#', "", "", 0, (double) (byte) 100, "");
        double double7 = book6.getValue();
        double double8 = book6.getValue();
        book6.setCanRent(false);
        book6.setRemainingCopies((int) '4');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }
}

