package Randoop.junits.MagazineTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass8 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        int int9 = magazine6.getId();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass8 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setLocation("");
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        double double15 = magazine6.getValue();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.String str7 = magazine6.getLocation();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        double double15 = magazine6.getValue();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,10,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) ' ', (double) (byte) 100, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 10);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 1, 0.0d, "hi!");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 1);
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
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        boolean boolean10 = magazine6.isCanRent();
        magazine6.setValue((double) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        boolean boolean9 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        int int10 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 1);
        magazine6.setRemainingCopies((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) (short) 100);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,10,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getLocation();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,,hi!,-1,35.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setValue((double) '#');
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,,hi!,-1,35.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        int int12 = magazine6.getId();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.toCSVString();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass8 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        int int15 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str11 = magazine6.getTitle();
        double double12 = magazine6.getValue();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        int int16 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setCanRent(true);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        boolean boolean14 = magazine6.isCanPurchase();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.Class<?> wildcardClass8 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        int int11 = magazine6.getRemainingCopies();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        boolean boolean15 = magazine6.isCanRent();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '#', (double) 'a', "");
        int int7 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 0);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        boolean boolean16 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        magazine6.setValue(0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,100,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        boolean boolean12 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getRemainingCopies();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        objects.Magazine magazine6 = new objects.Magazine((-1), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "", 100, (double) (byte) 0, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setCanRent(true);
        java.lang.String str17 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) -1);
        java.lang.String str13 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,1,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies(100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) -1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (byte) 100, "hi!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = magazine6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        int int13 = magazine6.getId();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 10);
        magazine6.setCanRent(false);
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,100,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setRemainingCopies(10);
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = magazine6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "hi!", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (byte) 0, (double) (short) 100, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setValue((double) 0.0f);
        magazine6.setValue((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '#', (double) 'a', "");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) (short) 1);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        boolean boolean13 = magazine6.isCanRent();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.getTitle();
        boolean boolean10 = magazine6.isCanPurchase();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '#');
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str11 = magazine6.getTitle();
        double double12 = magazine6.getValue();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        objects.Magazine magazine6 = new objects.Magazine((int) ' ', "-1,MAGAZINE,hi!,,1,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) -1, (double) 1L, "");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        int int10 = magazine6.getRemainingCopies();
        int int11 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,1,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str11 = magazine6.getTitle();
        magazine6.setCanPurchase(false);
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        magazine6.setRemainingCopies((int) ' ');
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setRemainingCopies(35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getId();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) '#');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setValue((double) (byte) -1);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str12, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,,hi!,-1,35.0,", (int) (short) 10, (double) (short) 10, "-1,MAGAZINE,hi!,,1,100.0,");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        int int7 = magazine6.getId();
        int int8 = magazine6.getId();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        boolean boolean10 = magazine6.isCanRent();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanPurchase();
        magazine6.setValue((double) 0.0f);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        boolean boolean8 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        boolean boolean12 = magazine6.isCanRent();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        boolean boolean10 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        double double14 = magazine6.getValue();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        magazine6.setValue((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        int int14 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.getTitle();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.lang.String str22 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str22, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getId();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int16 = magazine6.getId();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        int int12 = magazine6.getId();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getLocation();
        java.lang.String str9 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.toCSVString();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        boolean boolean11 = magazine6.isCanRent();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        objects.User user23 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", (int) (short) 0, (double) 'a', "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        boolean boolean7 = magazine6.isCanPurchase();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 0, (double) (short) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 1);
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        magazine6.setValue(10.0d);
        magazine6.setCanRent(true);
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "-1,MAGAZINE,hi!,,100,10.0,", (int) (byte) -1, (double) 1L, "-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setRemainingCopies((int) 'a');
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(false);
        int int10 = magazine6.getId();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 1);
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
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setValue((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        int int13 = magazine6.getId();
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str12, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.getEdition();
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str18, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean18 = magazine6.isCanRent();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord20 = magazine6.borrow(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getEdition();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        int int9 = magazine6.getId();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass17 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setValue((double) 100);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 1, 0.0d, "hi!");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies(100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setValue(10.0d);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        int int13 = magazine6.getId();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setValue((double) (short) 100);
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "hi!", 0, (double) 100L, "-1,MAGAZINE,hi!,,1,100.0,");
        double double7 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        objects.Magazine magazine6 = new objects.Magazine((int) '4', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "-1,MAGAZINE,,hi!,-1,35.0,", 35, (double) '#', "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setValue((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.String str19 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,MAGAZINE,hi!,,1,-1.0," + "'", str19, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setValue((double) '#');
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(false);
        magazine6.setRemainingCopies((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 10, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) '#', (double) (byte) 10, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        boolean boolean7 = magazine6.isCanRent();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int16 = magazine6.getId();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        objects.Magazine magazine6 = new objects.Magazine((-1), "-1,MAGAZINE,hi!,,1,10.0,", "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (short) 10, (double) 10.0f, "-1,MAGAZINE,hi!,,1,100.0,");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "-1,MAGAZINE,hi!,,1,-1.0,", 1, (double) (-1.0f), "-1,MAGAZINE,hi!,,1,1.0,");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setValue((double) 100);
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setValue(100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setCanPurchase(false);
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getId();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        int int9 = magazine6.getId();
        java.lang.String str10 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        magazine6.setRemainingCopies((int) 'a');
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setValue((double) 0L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue((double) (-1));
        java.lang.String str15 = magazine6.getLocation();
        double double16 = magazine6.getValue();
        java.lang.String str17 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        int int16 = magazine6.getId();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanRent(true);
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        int int12 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,10.0,", "", 1, (double) '#', "-1,MAGAZINE,,hi!,-1,35.0,");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) '#', 0.0d, "");
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        int int19 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,MAGAZINE,hi!,,1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = magazine6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getTitle();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 1, 0.0d, "hi!");
        magazine6.setCanRent(true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str12 = magazine6.getLocation();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        boolean boolean10 = magazine6.isCanRent();
        double double11 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        boolean boolean11 = magazine6.isCanRent();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = magazine6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies(100);
        magazine6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isCanPurchase();
        int int17 = magazine6.getId();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        boolean boolean10 = magazine6.isCanRent();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        magazine6.setRemainingCopies((int) (byte) 100);
        double double11 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        double double10 = magazine6.getValue();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        boolean boolean13 = magazine6.isCanRent();
        boolean boolean14 = magazine6.isCanPurchase();
        double double15 = magazine6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        objects.Magazine magazine6 = new objects.Magazine(100, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,", 0, (double) 100L, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        int int7 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setLocation("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        int int10 = magazine6.getRemainingCopies();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,100,10.0,", (int) (byte) -1, (double) (short) 0, "-1,MAGAZINE,hi!,,1,10.0,");
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        boolean boolean17 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
            objects.BorrowingRecord borrowingRecord21 = magazine6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 1);
        java.lang.String str13 = magazine6.getEdition();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
        int int12 = magazine6.getRemainingCopies();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        int int16 = magazine6.getId();
        java.lang.String str17 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("");
        magazine6.setCanPurchase(false);
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        objects.Magazine magazine6 = new objects.Magazine((-1), "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,", (int) (byte) 0, (double) (byte) 0, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        int int17 = magazine6.getId();
        magazine6.setValue(0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str13 = magazine6.toCSVString();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0," + "'", str13, "0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,,1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        magazine6.setValue((double) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.getEdition();
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanRent();
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getEdition();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = magazine6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        int int13 = magazine6.getId();
        magazine6.setValue((double) (short) 1);
        double double16 = magazine6.getValue();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        java.lang.String str11 = magazine6.getTitle();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        boolean boolean11 = magazine6.isCanRent();
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str13 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getId();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        double double11 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setValue(0.0d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        int int11 = magazine6.getRemainingCopies();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        int int12 = magazine6.getRemainingCopies();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getTitle();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,100.0," + "'", str13, "-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        int int20 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        int int18 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", 35, (double) 10, "-1,MAGAZINE,hi!,,100,10.0,");
        magazine6.setValue((double) (-1));
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setValue((double) 1);
        java.lang.String str13 = magazine6.getEdition();
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        int int9 = magazine6.getRemainingCopies();
        boolean boolean10 = magazine6.isCanPurchase();
        int int11 = magazine6.getRemainingCopies();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.String str10 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("100,MAGAZINE,0,MAGAZINE,hi!,,-1,100.0,,-1,MAGAZINE,,hi!,-1,35.0,,100,100.0,-1,MAGAZINE,hi!,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setRemainingCopies((int) (short) 100);
        boolean boolean9 = magazine6.isCanRent();
        int int10 = magazine6.getRemainingCopies();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        magazine6.setLocation("");
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.String str15 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str15, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setRemainingCopies(100);
        int int15 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 0);
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = magazine6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", 10, (double) 0, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        magazine6.setRemainingCopies(10);
        java.lang.Class<?> wildcardClass16 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        double double15 = magazine6.getValue();
        magazine6.setLocation("");
        boolean boolean18 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies(1);
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,10,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 10, (double) 'a', "-1,MAGAZINE,,hi!,-1,35.0,");
        int int7 = magazine6.getRemainingCopies();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        double double15 = magazine6.getValue();
        magazine6.setLocation("");
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.toCSVString();
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str15, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(false);
        int int17 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getLocation();
        java.lang.String str10 = magazine6.toCSVString();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getEdition();
        java.lang.String str15 = magazine6.getEdition();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        int int14 = magazine6.getRemainingCopies();
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", (int) (short) 10, (double) (short) -1, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 10, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) '#', (double) 'a', "");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str8, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '4');
        int int18 = magazine6.getId();
        magazine6.setValue((double) (-1.0f));
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user21);
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.getValue();
        boolean boolean13 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        boolean boolean11 = magazine6.isCanRent();
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getId();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        int int14 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,1.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "-1,MAGAZINE,,hi!,-1,35.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", 10, (double) (-1.0f), "-1,MAGAZINE,,hi!,-1,35.0,");
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        int int9 = magazine6.getRemainingCopies();
        boolean boolean10 = magazine6.isCanPurchase();
        java.lang.String str11 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setCanRent(true);
        int int17 = magazine6.getId();
        java.lang.String str18 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        boolean boolean8 = magazine6.isCanPurchase();
        int int9 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue((double) (-1));
        java.lang.String str15 = magazine6.getLocation();
        magazine6.setValue((double) '4');
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '4');
        int int18 = magazine6.getId();
        magazine6.setValue((double) (-1.0f));
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        double double19 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setValue((double) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = magazine6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        int int16 = magazine6.getId();
        magazine6.setCanRent(true);
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setRemainingCopies((int) (short) 100);
        int int16 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,-1.0,0,MAGAZINE,hi!,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MAGAZINE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        objects.Magazine magazine6 = new objects.Magazine(1, "", "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,", (int) (short) 0, (double) 10.0f, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        boolean boolean10 = magazine6.isCanPurchase();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        int int10 = magazine6.getRemainingCopies();
        java.lang.String str11 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.toCSVString();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str8, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        int int12 = magazine6.getId();
        magazine6.setRemainingCopies((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        int int10 = magazine6.getId();
        magazine6.setCanRent(false);
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = magazine6.getTitle();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = magazine6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        objects.Magazine magazine6 = new objects.Magazine(0, "-1,MAGAZINE,hi!,,100,10.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 100, (double) (-1.0f), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getEdition();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) ' ');
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.toCSVString();
        magazine6.setCanRent(true);
        int int16 = magazine6.getRemainingCopies();
        java.lang.String str17 = magazine6.getEdition();
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        double double14 = magazine6.getValue();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        int int16 = magazine6.getId();
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        magazine6.setRemainingCopies(100);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str16 = magazine6.getTitle();
        boolean boolean17 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        double double12 = magazine6.getValue();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        int int21 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanPurchase(false);
        magazine6.setValue((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        int int9 = magazine6.getId();
        boolean boolean10 = magazine6.isCanPurchase();
        java.lang.String str11 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str11, "-1,MAGAZINE,hi!,,10,10.0,");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (-1));
        java.lang.String str12 = magazine6.getTitle();
        boolean boolean13 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str12, "-1,MAGAZINE,hi!,,100,10.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.getEdition();
        boolean boolean13 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass14 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        magazine6.setCanPurchase(true);
        magazine6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "hi!", (int) (short) -1, (double) '#', "");
        java.lang.String str7 = magazine6.toCSVString();
        magazine6.setRemainingCopies(10);
        boolean boolean10 = magazine6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str7, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.String str20 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        int int14 = magazine6.getRemainingCopies();
        double double15 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", 100, (double) (short) -1, "-1,MAGAZINE,hi!,hi!,100,-1.0,");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getTitle();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getId();
        double double9 = magazine6.getValue();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        java.lang.String str11 = magazine6.getEdition();
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) (short) 0);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        int int9 = magazine6.getRemainingCopies();
        boolean boolean10 = magazine6.isCanPurchase();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        int int19 = magazine6.getRemainingCopies();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = magazine6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str16 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        java.lang.String str19 = magazine6.getTitle();
        java.lang.String str20 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str16, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str20, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        magazine6.setLocation("-1,MAGAZINE,,hi!,-1,35.0,");
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setCanPurchase(true);
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,,hi!,-1,35.0," + "'", str14, "-1,MAGAZINE,,hi!,-1,35.0,");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        objects.Magazine magazine6 = new objects.Magazine((-1), "35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,hi!,,10,10.0,", 0, 0.0d, "1,MAGAZINE,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,,0,10.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getRemainingCopies();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = magazine6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        objects.Magazine magazine6 = new objects.Magazine(0, "32,MAGAZINE,-1,MAGAZINE,hi!,,1,10.0,,0,MAGAZINE,hi!,,-1,100.0,,-1,1.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", (int) (short) 0, 0.0d, "-1,MAGAZINE,hi!,,1,0.0,");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setValue((double) 1);
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        java.lang.String str8 = magazine6.getEdition();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = magazine6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        int int12 = magazine6.getId();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "", "", (int) 'a', (double) (-1L), "hi!");
        magazine6.setRemainingCopies(10);
        boolean boolean9 = magazine6.isCanPurchase();
        magazine6.setLocation("-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        magazine6.setRemainingCopies((int) '4');
        magazine6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        int int15 = magazine6.getId();
        java.lang.String str16 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies(100);
        boolean boolean13 = magazine6.isCanRent();
        magazine6.setValue((double) 100L);
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        double double13 = magazine6.getValue();
        boolean boolean14 = magazine6.isCanPurchase();
        boolean boolean15 = magazine6.isCanPurchase();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str18, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0," + "'", str21, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getLocation();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = magazine6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getEdition();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        double double8 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setCanPurchase(false);
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
        int int11 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getEdition();
        magazine6.setCanRent(false);
        int int15 = magazine6.getId();
        magazine6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "", "-1,MAGAZINE,hi!,,1,1.0,", (int) ' ', (double) (short) 0, "-1,MAGAZINE,hi!,,1,-1.0,");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setValue((double) (short) 100);
        java.lang.String str12 = magazine6.toCSVString();
        java.lang.String str13 = magazine6.getLocation();
        int int14 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str12, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getEdition();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        boolean boolean12 = magazine6.isCanPurchase();
        java.lang.String str13 = magazine6.toCSVString();
        java.lang.String str14 = magazine6.toCSVString();
        int int15 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str13, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str14, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isCanPurchase();
        boolean boolean14 = magazine6.isCanRent();
        magazine6.setValue((double) (byte) 10);
        magazine6.setRemainingCopies((int) (byte) 100);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) '4');
        int int18 = magazine6.getId();
        magazine6.setValue((double) (-1.0f));
        boolean boolean21 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 10.0f);
        boolean boolean13 = magazine6.isCanPurchase();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = magazine6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        objects.Magazine magazine6 = new objects.Magazine(10, "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (byte) 0, (double) 100L, "");
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setLocation("35,MAGAZINE,,hi!,0,100.0,0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        java.lang.String str16 = magazine6.getTitle();
        double double17 = magazine6.getValue();
        java.lang.String str18 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str9, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setCanPurchase(false);
        java.lang.String str12 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str12, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(false);
        int int16 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isCanRent();
        magazine6.setLocation("-1,MAGAZINE,hi!,,-1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        objects.Magazine magazine6 = new objects.Magazine(1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,", "-1,MAGAZINE,hi!,,1,-1.0,", (int) (byte) -1, 0.0d, "-1,MAGAZINE,hi!,,100,10.0,");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0," + "'", str7, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str8, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        magazine6.setCanPurchase(true);
        java.lang.String str13 = magazine6.getEdition();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,MAGAZINE,hi!,hi!,100,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        objects.Magazine magazine6 = new objects.Magazine(35, "-1,MAGAZINE,hi!,,1,10.0,", "-1,MAGAZINE,hi!,,1,10.0,", (int) 'a', (double) 0.0f, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        java.lang.String str7 = magazine6.getLocation();
        int int8 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str7, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        java.lang.String str8 = magazine6.getTitle();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setValue(1.0d);
        boolean boolean15 = magazine6.isCanPurchase();
        java.lang.String str16 = magazine6.getLocation();
        int int17 = magazine6.getId();
        magazine6.setRemainingCopies(0);
        java.lang.String str20 = magazine6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) (byte) -1);
        int int13 = magazine6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        double double12 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 100, "0,MAGAZINE,hi!,,-1,100.0,", "-1,MAGAZINE,,hi!,-1,35.0,", (int) '#', 100.0d, "-1,MAGAZINE,hi!,,1,10.0,");
        boolean boolean7 = magazine6.isCanRent();
        int int8 = magazine6.getRemainingCopies();
        java.lang.Class<?> wildcardClass9 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getTitle();
        int int11 = magazine6.getRemainingCopies();
        int int12 = magazine6.getId();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,MAGAZINE,hi!,,100,10.0," + "'", str8, "-1,MAGAZINE,hi!,,100,10.0,");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 1, 0.0d, "0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getLocation();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (int) (short) 1, (double) (-1L), "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanRent(false);
        boolean boolean10 = magazine6.isCanRent();
        boolean boolean11 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.toCSVString();
        boolean boolean12 = magazine6.isCanRent();
        magazine6.setCanRent(false);
        java.lang.String str15 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanRent();
        boolean boolean8 = magazine6.isCanPurchase();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.getEdition();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toCSVString();
        java.lang.String str10 = magazine6.getEdition();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        objects.Magazine magazine6 = new objects.Magazine(97, "52,MAGAZINE,1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,,-1,MAGAZINE,,hi!,-1,35.0,,35,35.0,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", "-1,MAGAZINE,hi!,,1,1.0,", (int) '4', 0.0d, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanRent(false);
        magazine6.setValue((double) (short) -1);
        magazine6.setCanPurchase(false);
        boolean boolean19 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        objects.Magazine magazine6 = new objects.Magazine((int) '#', "", "hi!", (int) (short) 0, (double) 100L, "0,MAGAZINE,hi!,,-1,100.0,");
        boolean boolean7 = magazine6.isCanRent();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        magazine6.setValue(100.0d);
        magazine6.setRemainingCopies((int) '#');
        magazine6.setValue((double) 100.0f);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        java.lang.String str11 = magazine6.toCSVString();
        int int12 = magazine6.getId();
        java.lang.String str13 = magazine6.getTitle();
        java.lang.String str14 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str14, "-1,MAGAZINE,hi!,,1,10.0,");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        magazine6.setCanPurchase(true);
        magazine6.setLocation("hi!");
        int int11 = magazine6.getId();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 1);
        magazine6.setValue((double) (short) -1);
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!" + "'", str17, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,hi!,1,-1.0,hi!");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        objects.Magazine magazine6 = new objects.Magazine((-1), "", "", (int) '#', (double) (byte) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        int int8 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        objects.Magazine magazine6 = new objects.Magazine((-1), "hi!", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 0, (double) 10L, "hi!");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setLocation("hi!");
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setCanRent(true);
        boolean boolean13 = magazine6.isCanPurchase();
        magazine6.setValue((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getLocation();
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        java.lang.String str14 = magazine6.getEdition();
        boolean boolean15 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        double double9 = magazine6.getValue();
        java.lang.String str10 = magazine6.getLocation();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        int int12 = magazine6.getRemainingCopies();
        int int13 = magazine6.getRemainingCopies();
        boolean boolean14 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setLocation("-1,MAGAZINE,hi!,,10,10.0,");
        boolean boolean12 = magazine6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "-1,MAGAZINE,hi!,,100,10.0,", "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,", (int) (short) 0, (double) 1L, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.toCSVString();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = magazine6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0," + "'", str9, "1,MAGAZINE,-1,MAGAZINE,hi!,,100,10.0,,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,,0,1.0,");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        int int7 = magazine6.getId();
        int int8 = magazine6.getId();
        int int9 = magazine6.getRemainingCopies();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 1, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,100,10.0,,-1,10.0,,1,1.0,", "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!", (int) (byte) -1, (double) (byte) 10, "0,MAGAZINE,-1,MAGAZINE,hi!,,10,10.0,,-1,MAGAZINE,hi!,,10,10.0,,-1,0.0,hi!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setRemainingCopies((int) (short) 10);
        java.lang.String str12 = magazine6.toCSVString();
        int int13 = magazine6.getRemainingCopies();
        magazine6.setLocation("");
        double double16 = magazine6.getValue();
        boolean boolean17 = magazine6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str12, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getEdition();
        magazine6.setRemainingCopies((int) '#');
        java.lang.String str13 = magazine6.getEdition();
        boolean boolean14 = magazine6.isCanPurchase();
        java.lang.String str15 = magazine6.getLocation();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getTitle();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        objects.Magazine magazine6 = new objects.Magazine((int) (byte) 0, "hi!", "", (int) (short) -1, (double) 100.0f, "");
        int int7 = magazine6.getRemainingCopies();
        magazine6.setValue((double) (short) 100);
        magazine6.setValue((double) (short) 100);
        boolean boolean12 = magazine6.isCanPurchase();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str14, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(false);
        boolean boolean16 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setCanPurchase(true);
        java.lang.String str11 = magazine6.getTitle();
        int int12 = magazine6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanRent(true);
        double double11 = magazine6.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        int int9 = magazine6.getRemainingCopies();
        java.lang.String str10 = magazine6.toCSVString();
        int int11 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str10, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setCanRent(false);
        java.lang.String str10 = magazine6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 100, "-1,MAGAZINE,hi!,,1,10.0,", "", 1, (double) '#', "-1,MAGAZINE,,hi!,-1,35.0,");
        int int7 = magazine6.getId();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = magazine6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) (-1L));
        magazine6.setRemainingCopies(0);
        magazine6.setLocation("hi!");
        java.lang.String str18 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str12 = magazine6.getTitle();
        magazine6.setCanRent(false);
        java.lang.String str15 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setCanRent(false);
        magazine6.setRemainingCopies((int) (byte) 10);
        int int11 = magazine6.getRemainingCopies();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,100.0,");
        magazine6.setCanRent(true);
        magazine6.setCanPurchase(true);
        magazine6.setValue((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        magazine6.setCanPurchase(true);
        magazine6.setRemainingCopies((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getId();
        magazine6.setRemainingCopies((int) ' ');
        magazine6.setValue(0.0d);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = magazine6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        objects.Magazine magazine6 = new objects.Magazine((int) 'a', "", "hi!", (int) (byte) 10, (double) 100, "0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.setCanRent(true);
        int int12 = magazine6.getId();
        boolean boolean13 = magazine6.isCanPurchase();
        java.lang.String str14 = magazine6.getTitle();
        magazine6.setRemainingCopies((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setLocation("0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.Class<?> wildcardClass10 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,MAGAZINE,hi!,,10,10.0," + "'", str7, "-1,MAGAZINE,hi!,,10,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 1, "0,MAGAZINE,hi!,,-1,100.0,", "0,MAGAZINE,hi!,,-1,100.0,", (int) (short) 1, 0.0d, "0,MAGAZINE,hi!,,-1,100.0,");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str7, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str8, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        int int10 = magazine6.getId();
        java.lang.String str11 = magazine6.toCSVString();
        double double12 = magazine6.getValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str11, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        int int9 = magazine6.getId();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        magazine6.setCanRent(false);
        double double14 = magazine6.getValue();
        java.lang.String str15 = magazine6.getEdition();
        java.lang.String str16 = magazine6.getEdition();
        java.lang.String str17 = magazine6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0," + "'", str17, "-1,MAGAZINE,hi!,-1,MAGAZINE,hi!,,1,10.0,,1,10.0,");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        magazine6.setLocation("");
        java.lang.String str9 = magazine6.toCSVString();
        boolean boolean10 = magazine6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str9, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        int int11 = magazine6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        boolean boolean7 = magazine6.isCanPurchase();
        boolean boolean8 = magazine6.isCanRent();
        magazine6.setCanPurchase(true);
        double double11 = magazine6.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        objects.Magazine magazine6 = new objects.Magazine(0, "hi!", "-1,MAGAZINE,hi!,,1,10.0,", 1, (double) (-1L), "0,MAGAZINE,hi!,,-1,100.0,");
        int int7 = magazine6.getRemainingCopies();
        int int8 = magazine6.getRemainingCopies();
        java.lang.String str9 = magazine6.getEdition();
        java.lang.String str10 = magazine6.getTitle();
        magazine6.setLocation("-1,MAGAZINE,hi!,,1,10.0,");
        java.lang.String str13 = magazine6.getLocation();
        java.lang.String str14 = magazine6.getTitle();
        java.lang.String str15 = magazine6.getEdition();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str9, "0,MAGAZINE,hi!,,-1,100.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,MAGAZINE,hi!,,1,10.0," + "'", str13, "-1,MAGAZINE,hi!,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,MAGAZINE,hi!,,-1,100.0," + "'", str15, "0,MAGAZINE,hi!,,-1,100.0,");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) -1, "hi!", "", (int) (short) 1, (double) (byte) 10, "");
        double double7 = magazine6.getValue();
        magazine6.setCanPurchase(true);
        java.lang.String str10 = magazine6.getEdition();
        java.lang.String str11 = magazine6.getEdition();
        java.lang.Class<?> wildcardClass12 = magazine6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        objects.Magazine magazine6 = new objects.Magazine((int) (short) 0, "-1,MAGAZINE,hi!,,10,10.0,", "-1,MAGAZINE,hi!,,10,10.0,", (-1), (double) 0, "hi!");
        boolean boolean7 = magazine6.isCanPurchase();
        magazine6.setCanPurchase(true);
        int int10 = magazine6.getRemainingCopies();
        magazine6.setRemainingCopies(100);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }
}

