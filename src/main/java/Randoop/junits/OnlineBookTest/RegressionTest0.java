package Randoop.junits.OnlineBookTest;

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
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass9 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        int int10 = onlinebook6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        int int9 = onlinebook6.getRemainingCopies();
        java.lang.Class<?> wildcardClass10 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = onlinebook6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,hi!,10,52.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("97,,hi!,-1,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,hi!,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        boolean boolean12 = onlinebook6.isCanRent();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = onlinebook6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.Class<?> wildcardClass8 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        boolean boolean12 = onlinebook6.isCanRent();
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        java.lang.Class<?> wildcardClass10 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("97,,hi!,-1,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        boolean boolean16 = onlinebook6.isCanPurchase();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        int int9 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies(0);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        java.lang.Class<?> wildcardClass9 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,hi!,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,hi!,10,52.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,97,,hi!,-1,0.0,,10,52.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        int int13 = onlinebook6.getRemainingCopies();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = onlinebook6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        java.lang.String str14 = onlinebook6.getLocation();
        java.lang.String str15 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97,,hi!,0,10.0," + "'", str15, "97,,hi!,0,10.0,");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = onlinebook6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanRent(true);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = onlinebook6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setCanRent(false);
        java.lang.Class<?> wildcardClass11 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = onlinebook6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        boolean boolean16 = onlinebook6.isCanPurchase();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = onlinebook6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        java.lang.Class<?> wildcardClass12 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        java.lang.Class<?> wildcardClass16 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        boolean boolean13 = onlinebook6.isCanRent();
        java.lang.Class<?> wildcardClass14 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        java.lang.Class<?> wildcardClass15 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        onlinebook6.setCanPurchase(true);
        int int16 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = onlinebook6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        double double17 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.getLocation();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setValue((double) 100L);
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        java.lang.String str17 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies(0);
        boolean boolean13 = onlinebook6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 10, "", "0,hi!,hi!,100,100.0,", (int) (byte) -1, (double) (short) 10, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        java.lang.String str15 = onlinebook6.toCSVString();
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        boolean boolean16 = onlinebook6.isCanPurchase();
        double double17 = onlinebook6.getValue();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = onlinebook6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '#', "hi!", "", (int) (short) 0, (double) (byte) -1, "0,hi!,hi!,10,100.0,");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (short) -1);
        java.lang.String str9 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = onlinebook6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setValue((double) 100L);
        onlinebook6.setRemainingCopies(0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        java.lang.String str15 = onlinebook6.toCSVString();
        java.lang.Class<?> wildcardClass16 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "0,hi!,hi!,0,100.0,", "0,hi!,hi!,10,52.0,", (int) (byte) 1, (double) (byte) -1, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,52.0,", 10, (double) 1, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("97,,hi!,0,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,hi!,100,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,10,100.0,", "hi!", (int) (byte) 100, (double) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = onlinebook6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,hi!,100,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass11 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        java.lang.String str14 = onlinebook6.toCSVString();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,hi!,100,100.0," + "'", str14, "0,hi!,hi!,100,100.0,");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies(0);
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        java.lang.String str15 = onlinebook6.toCSVString();
        int int16 = onlinebook6.getRemainingCopies();
        double double17 = onlinebook6.getValue();
        java.lang.String str18 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "97,,hi!,-1,0.0,", "", (int) (short) 1, (double) (byte) 1, "97,,hi!,0,10.0,");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 10, "hi!", "0,hi!,hi!,10,100.0,", (int) '#', (double) 1, "hi!");
        double double7 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("97,,0,hi!,hi!,10,52.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        onlinebook6.setValue((double) (-1));
        onlinebook6.setRemainingCopies(100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        onlinebook6.setValue((double) (byte) 1);
        boolean boolean12 = onlinebook6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setValue((double) 100L);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = onlinebook6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,100,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", (int) (byte) 0, (double) (short) -1, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        boolean boolean12 = onlinebook6.isCanPurchase();
        onlinebook6.setCanPurchase(false);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        java.lang.String str14 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,0,10.0,", "hi!", (int) (short) -1, (double) '#', "hi!");
        onlinebook6.setCanRent(false);
        double double9 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setValue((double) 100L);
        onlinebook6.setRemainingCopies((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 10, "hi!", "0,hi!,hi!,10,100.0,", (int) '#', (double) 1, "hi!");
        onlinebook6.setCanPurchase(true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        boolean boolean14 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies(0);
        int int18 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("97,hi!,hi!,97,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = onlinebook6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        java.lang.Class<?> wildcardClass10 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("97,,hi!,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("97,,hi!,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        boolean boolean14 = onlinebook6.isCanRent();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = onlinebook6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        int int16 = onlinebook6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        int int11 = onlinebook6.getId();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", 97, (double) (short) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        int int7 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,97,,hi!,-1,0.0,,10,52.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "0,hi!,hi!,10,52.0,", "", (int) (short) -1, (double) 100, "hi!");
        int int7 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies(0);
        boolean boolean18 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,52.0,", 10, (double) 1, "");
        onlinebook6.setCanRent(false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        java.lang.String str10 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str10, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        onlinebook6.setCanPurchase(false);
        int int19 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        java.lang.String str15 = onlinebook6.toCSVString();
        int int16 = onlinebook6.getRemainingCopies();
        double double17 = onlinebook6.getValue();
        onlinebook6.setValue(1.0d);
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = onlinebook6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        boolean boolean12 = onlinebook6.isCanPurchase();
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        onlinebook6.setValue((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,-1,0.0,", "97,,hi!,0,10.0,", (int) (byte) 100, (double) (short) 10, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 100, "hi!", "0,hi!,hi!,10,52.0,", (int) 'a', 1.0d, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        onlinebook6.setLocation("97,,0,hi!,hi!,10,52.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        java.lang.Class<?> wildcardClass22 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str20, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97,,0,hi!,hi!,10,52.0,,1,10.0," + "'", str21, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", 97, (double) (short) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        boolean boolean8 = onlinebook6.isCanPurchase();
        java.lang.Class<?> wildcardClass9 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str7, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setLocation("97,,0,hi!,hi!,10,52.0,,1,10.0,");
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = onlinebook6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = onlinebook6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        double double8 = onlinebook6.getValue();
        java.lang.String str9 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str9, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        int int15 = onlinebook6.getRemainingCopies();
        onlinebook6.setValue(1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "97,hi!,hi!,97,10.0,", "", 10, (double) (-1.0f), "hi!");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        java.lang.Class<?> wildcardClass9 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        double double8 = onlinebook6.getValue();
        java.lang.String str9 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        java.lang.String str18 = onlinebook6.getLocation();
        java.lang.String str19 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,hi!,10,100.0," + "'", str18, "97,,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,hi!,97,,hi!,10,100.0,,10,100.0," + "'", str19, "0,hi!,97,,hi!,10,100.0,,10,100.0,");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "hi!", "97,,hi!,-1,0.0,", (int) (byte) 100, (double) 'a', "97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies((int) '4');
        onlinebook6.setLocation("");
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        java.lang.String str14 = onlinebook6.getLocation();
        java.lang.String str15 = onlinebook6.getTitle();
        java.lang.String str16 = onlinebook6.getLocation();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "", "", (int) (byte) 100, (double) (byte) -1, "0,hi!,hi!,10,100.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies(0);
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "hi!", "97,,hi!,-1,0.0,", (int) (byte) 100, (double) 'a', "97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies((int) '4');
        java.lang.String str9 = onlinebook6.getLocation();
        java.lang.String str10 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97,,hi!,-1,0.0," + "'", str9, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97,,hi!,-1,0.0," + "'", str10, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "97,hi!,hi!,97,10.0,", "", 10, (double) (-1.0f), "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,97,hi!,hi!,97,10.0,,,10,-1.0," + "'", str7, "97,97,hi!,hi!,97,10.0,,,10,-1.0,");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies((int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = onlinebook6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        java.lang.String str15 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("97,97,hi!,hi!,97,10.0,,,10,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        java.lang.String str14 = onlinebook6.getTitle();
        int int15 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        int int18 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        boolean boolean10 = onlinebook6.isCanPurchase();
        java.lang.Class<?> wildcardClass11 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "0,hi!,hi!,0,100.0,", "0,hi!,hi!,10,52.0,", (int) (short) 10, (double) (byte) 100, "0,hi!,hi!,0,100.0,");
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("97,hi!,hi!,97,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        int int12 = onlinebook6.getRemainingCopies();
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord14 = onlinebook6.borrow(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("97,,0,hi!,hi!,10,52.0,,1,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 100, "hi!", "0,hi!,hi!,10,52.0,", (int) 'a', 1.0d, "");
        boolean boolean7 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,97,,hi!,10,100.0,,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        java.lang.String str9 = onlinebook6.getLocation();
        java.lang.Class<?> wildcardClass10 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
        java.lang.String str21 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str20, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str21, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "", "0,hi!,hi!,100,100.0,", 0, (double) (byte) 100, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = onlinebook6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        onlinebook6.setCanRent(false);
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = onlinebook6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        java.lang.String str11 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        boolean boolean11 = onlinebook6.isCanPurchase();
        boolean boolean12 = onlinebook6.isCanPurchase();
        java.lang.String str13 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        double double13 = onlinebook6.getValue();
        int int14 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,,hi!,10,0.0,", "0,hi!,97,,hi!,10,100.0,,10,100.0,", (int) (short) 100, (double) ' ', "0,hi!,hi!,0,100.0,");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        onlinebook6.setCanRent(true);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = onlinebook6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setLocation("97,,hi!,0,10.0,");
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        java.lang.Class<?> wildcardClass10 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        java.lang.String str10 = onlinebook6.toCSVString();
        onlinebook6.setCanRent(true);
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str10, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        onlinebook6.setCanPurchase(false);
        java.lang.String str19 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '4', "97,hi!,hi!,97,10.0,", "", (int) ' ', (double) (-1.0f), "0,hi!,hi!,100,100.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        boolean boolean12 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        int int11 = onlinebook6.getId();
        java.lang.String str12 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97,,hi!,10,0.0," + "'", str12, "97,,hi!,10,0.0,");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.getLocation();
        onlinebook6.setLocation("97,97,hi!,hi!,97,10.0,,,10,-1.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        onlinebook6.setValue((double) (-1));
        double double17 = onlinebook6.getValue();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        double double16 = onlinebook6.getValue();
        boolean boolean17 = onlinebook6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        boolean boolean9 = onlinebook6.isCanPurchase();
        double double10 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        java.lang.String str12 = onlinebook6.getLocation();
        boolean boolean13 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        java.lang.String str9 = onlinebook6.getLocation();
        int int10 = onlinebook6.getRemainingCopies();
        boolean boolean11 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setRemainingCopies(0);
        java.lang.String str16 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass18 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((int) (short) 1);
        java.lang.String str17 = onlinebook6.getLocation();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanRent(true);
        onlinebook6.setLocation("0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "97,,0,hi!,hi!,10,52.0,,1,10.0,", "0,hi!,97,,hi!,10,100.0,,10,100.0,", (int) (short) 100, (double) (byte) -1, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        int int15 = onlinebook6.getRemainingCopies();
        java.lang.String str16 = onlinebook6.getLocation();
        java.lang.String str17 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("97,97,hi!,hi!,97,10.0,,,10,-1.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        boolean boolean10 = onlinebook6.isCanPurchase();
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (byte) -1);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        boolean boolean8 = onlinebook6.isCanRent();
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = onlinebook6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        boolean boolean18 = onlinebook6.isCanPurchase();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 0);
        boolean boolean19 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,,hi!,10,0.0,", "0,hi!,97,,hi!,10,100.0,,10,100.0,", (int) (short) 100, (double) ' ', "0,hi!,hi!,0,100.0,");
        java.lang.String str7 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0," + "'", str7, "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,0,hi!,hi!,10,52.0,,1,10.0,", "hi!", (int) (byte) 100, (double) 1.0f, "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        boolean boolean14 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        java.lang.String str17 = onlinebook6.getTitle();
        boolean boolean18 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = onlinebook6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        java.lang.String str10 = onlinebook6.toCSVString();
        onlinebook6.setCanRent(true);
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str10, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "97,hi!,hi!,97,10.0,", "", 10, (double) (-1.0f), "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.Class<?> wildcardClass8 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,97,hi!,hi!,97,10.0,,,10,-1.0," + "'", str7, "97,97,hi!,hi!,97,10.0,,,10,-1.0,");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = onlinebook6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        java.lang.Class<?> wildcardClass17 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setLocation("");
        onlinebook6.setValue((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) -1, "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,52.0,", (int) (byte) 1, (double) (short) 0, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", 0, (double) 97, "");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setCanRent(true);
        int int10 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,0,10.0,", "hi!", (int) (short) -1, (double) '#', "hi!");
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        onlinebook6.setValue((double) 1.0f);
        onlinebook6.setValue((double) (short) -1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(true);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = onlinebook6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        double double11 = onlinebook6.getValue();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "97,,hi!,-1,0.0,", (int) (short) -1, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanRent(false);
        java.lang.Class<?> wildcardClass9 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        int int15 = onlinebook6.getId();
        int int16 = onlinebook6.getRemainingCopies();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 10, "97,,hi!,10,100.0,", "97,hi!,hi!,97,10.0,", (int) (short) 100, (double) 10.0f, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        int int7 = onlinebook6.getId();
        int int8 = onlinebook6.getId();
        onlinebook6.setCanPurchase(false);
        boolean boolean11 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        java.lang.String str14 = onlinebook6.getTitle();
        onlinebook6.setLocation("0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str14, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,100,100.0,", "97,,hi!,0,10.0,", (int) 'a', (double) 100L, "0,hi!,hi!,100,100.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        boolean boolean15 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,0,10.0,", "hi!", (int) (short) -1, (double) '#', "hi!");
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        onlinebook6.setValue((double) 1.0f);
        onlinebook6.setValue((-1.0d));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        boolean boolean16 = onlinebook6.isCanPurchase();
        java.lang.String str17 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        java.lang.String str9 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "", (int) ' ', (double) 100L, "97,,hi!,10,100.0,");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        java.lang.String str14 = onlinebook6.toCSVString();
        java.lang.String str15 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies((int) (short) -1);
        onlinebook6.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str14, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str15, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,0,100.0,", "0,hi!,hi!,0,100.0,", (int) (short) 100, (double) 0, "97,,hi!,-1,0.0,");
        onlinebook6.setValue((double) 1L);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        java.lang.String str9 = onlinebook6.getLocation();
        int int10 = onlinebook6.getRemainingCopies();
        onlinebook6.setLocation("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        int int11 = onlinebook6.getId();
        java.lang.String str12 = onlinebook6.toCSVString();
        boolean boolean13 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97,,hi!,10,0.0," + "'", str12, "97,,hi!,10,0.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        boolean boolean14 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        java.lang.String str17 = onlinebook6.getTitle();
        int int18 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "0,hi!,hi!,10,52.0,", "", (int) (short) -1, (double) 100, "hi!");
        onlinebook6.setValue((double) 1L);
        boolean boolean9 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "hi!", "97,,hi!,-1,0.0,", (int) (byte) 100, (double) 'a', "97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies((int) '4');
        int int9 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        boolean boolean15 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanPurchase(false);
        onlinebook6.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        java.lang.String str14 = onlinebook6.getLocation();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord16 = onlinebook6.borrow(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanPurchase();
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getId();
        double double12 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        onlinebook6.setCanPurchase(false);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        java.lang.String str14 = onlinebook6.getTitle();
        int int15 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        java.lang.String str18 = onlinebook6.toCSVString();
        java.lang.String str19 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str18, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.Class<?> wildcardClass11 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setValue((double) 100L);
        java.lang.String str12 = onlinebook6.toCSVString();
        java.lang.Class<?> wildcardClass13 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97,,hi!,10,100.0," + "'", str12, "97,,hi!,10,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanPurchase();
        boolean boolean10 = onlinebook6.isCanPurchase();
        java.lang.String str11 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        onlinebook6.setValue((double) (byte) 1);
        int int12 = onlinebook6.getId();
        int int13 = onlinebook6.getRemainingCopies();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,0,10.0,", "hi!", (int) (short) -1, (double) '#', "hi!");
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        onlinebook6.setValue((double) 1.0f);
        onlinebook6.setValue((double) (-1));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", "", (-1), (double) 1L, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        double double13 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies(10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "97,,hi!,-1,0.0,", (int) (short) -1, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) -1, "97,,hi!,10,0.0,", "", (int) (short) 1, (double) 1.0f, "0,hi!,hi!,100,100.0,");
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        boolean boolean9 = onlinebook6.isCanPurchase();
        int int10 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        double double16 = onlinebook6.getValue();
        onlinebook6.setLocation("");
        int int19 = onlinebook6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setCanRent(false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        int int7 = onlinebook6.getRemainingCopies();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 10, "", "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,", 0, (double) (byte) -1, "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getId();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 100, "hi!", "0,hi!,hi!,10,52.0,", (int) 'a', 1.0d, "");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        boolean boolean8 = onlinebook6.isCanRent();
        onlinebook6.setValue((double) (short) 1);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        int int7 = onlinebook6.getRemainingCopies();
        java.lang.String str8 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "97,,0,hi!,hi!,10,52.0,,1,10.0,", "0,hi!,hi!,10,52.0,", 1, (double) 0.0f, "97,,0,hi!,hi!,10,52.0,,0,10.0,");
        onlinebook6.setValue((double) (short) 10);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = onlinebook6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 100, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "97,hi!,hi!,97,10.0,", (int) (short) -1, (double) (byte) 0, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies(0);
        java.lang.String str13 = onlinebook6.getLocation();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = onlinebook6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97,,hi!,-1,0.0," + "'", str13, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "hi!", "0,hi!,hi!,10,100.0,", (int) (byte) 100, (double) (-1), "0,hi!,hi!,10,52.0,");
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = onlinebook6.isCanPurchase();
        objects.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(1, "", "0,hi!,hi!,0,100.0,", (int) (byte) 0, (double) (short) 100, "0,hi!,hi!,10,52.0,");
        int int7 = onlinebook6.getId();
        double double8 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(true);
        java.lang.String str11 = onlinebook6.getTitle();
        boolean boolean12 = onlinebook6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,", "97,,hi!,0,10.0,", (int) ' ', 0.0d, "0,hi!,hi!,100,100.0,");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("97,,0,hi!,hi!,10,52.0,,0,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,0,10.0,", "hi!", (int) (short) -1, (double) '#', "hi!");
        int int7 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass8 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        java.lang.Class<?> wildcardClass14 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies((int) (byte) -1);
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = onlinebook6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        int int12 = onlinebook6.getRemainingCopies();
        java.lang.String str13 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 100);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getRemainingCopies();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies(1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        onlinebook6.setLocation("0,hi!,97,,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        java.lang.String str8 = onlinebook6.toCSVString();
        boolean boolean9 = onlinebook6.isCanPurchase();
        java.lang.String str10 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str8, "97,hi!,hi!,97,10.0,");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        java.lang.String str18 = onlinebook6.getLocation();
        onlinebook6.setValue((double) 0);
        onlinebook6.setRemainingCopies((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,hi!,10,100.0," + "'", str18, "97,,hi!,10,100.0,");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        java.lang.String str12 = onlinebook6.getLocation();
        boolean boolean13 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str12, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getId();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord9 = onlinebook6.borrow(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,", "97,,hi!,10,100.0,", (int) (byte) -1, 0.0d, "hi!");
        onlinebook6.setLocation("100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        boolean boolean12 = onlinebook6.isCanRent();
        boolean boolean13 = onlinebook6.isCanRent();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord15 = onlinebook6.borrow(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        double double11 = onlinebook6.getValue();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        int int14 = onlinebook6.getId();
        onlinebook6.setLocation("97,,hi!,0,10.0,");
        java.lang.Class<?> wildcardClass17 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getRemainingCopies();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        objects.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(true);
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord20 = onlinebook6.borrow(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "0,hi!,hi!,0,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", (int) (byte) 0, (double) 100L, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
        java.lang.String str7 = onlinebook6.getLocation();
        java.lang.String str8 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,0,hi!,hi!,10,52.0,,1,10.0," + "'", str7, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0," + "'", str8, "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        onlinebook6.setCanPurchase(false);
        boolean boolean10 = onlinebook6.isCanRent();
        java.lang.String str11 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        java.lang.String str13 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        java.lang.String str7 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        boolean boolean20 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        onlinebook6.setCanPurchase(false);
        int int19 = onlinebook6.getId();
        int int20 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        boolean boolean16 = onlinebook6.isCanRent();
        int int17 = onlinebook6.getRemainingCopies();
        boolean boolean18 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        int int11 = onlinebook6.getId();
        java.lang.String str12 = onlinebook6.toCSVString();
        int int13 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97,,hi!,10,0.0," + "'", str12, "97,,hi!,10,0.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        int int15 = onlinebook6.getId();
        int int16 = onlinebook6.getRemainingCopies();
        double double17 = onlinebook6.getValue();
        java.lang.String str18 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        boolean boolean12 = onlinebook6.isCanRent();
        int int13 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        onlinebook6.setRemainingCopies(0);
        int int13 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 10, "97,hi!,hi!,97,10.0,", "97,,0,hi!,hi!,10,52.0,,0,10.0,", 97, (double) 1.0f, "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        java.lang.String str14 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,hi!,100,100.0," + "'", str14, "0,hi!,hi!,100,100.0,");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        int int7 = onlinebook6.getId();
        int int8 = onlinebook6.getId();
        java.lang.String str9 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        int int17 = onlinebook6.getId();
        int int18 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((int) (short) 1);
        java.lang.String str17 = onlinebook6.getLocation();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        int int20 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((int) (short) 1);
        boolean boolean17 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        onlinebook6.setValue(0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = onlinebook6.isCanPurchase();
        java.lang.String str15 = onlinebook6.getTitle();
        java.lang.String str16 = onlinebook6.getTitle();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,100,100.0,", "97,,hi!,0,10.0,", (int) 'a', (double) 100L, "0,hi!,hi!,100,100.0,");
        java.lang.String str7 = onlinebook6.getLocation();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,0,10.0," + "'", str7, "97,,hi!,0,10.0,");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        onlinebook6.setValue((double) (byte) 1);
        int int12 = onlinebook6.getId();
        boolean boolean13 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,", (int) (byte) 100, (double) 10.0f, "0,hi!,97,,hi!,10,100.0,,10,100.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", 0, (double) 97, "");
        boolean boolean7 = onlinebook6.isCanRent();
        java.lang.String str8 = onlinebook6.getTitle();
        java.lang.String str9 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97,,0,hi!,hi!,10,52.0,,0,10.0," + "'", str8, "97,,0,hi!,hi!,10,52.0,,0,10.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str9, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        int int8 = onlinebook6.getId();
        java.lang.Class<?> wildcardClass9 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 10, "97,,hi!,0,10.0,", "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", (int) ' ', (double) 10.0f, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str14 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str14, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getRemainingCopies();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str13 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 10, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "0,hi!,97,,hi!,10,100.0,,10,100.0,", (int) '4', (double) (short) 1, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        onlinebook6.setValue((double) (-1));
        double double17 = onlinebook6.getValue();
        boolean boolean18 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.getLocation();
        java.lang.String str8 = onlinebook6.getLocation();
        int int9 = onlinebook6.getRemainingCopies();
        double double10 = onlinebook6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(1, "", "0,hi!,hi!,0,100.0,", (int) (byte) 0, (double) (short) 100, "0,hi!,hi!,10,52.0,");
        onlinebook6.setCanPurchase(false);
        java.lang.String str9 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,,0,hi!,hi!,0,100.0,,0,100.0," + "'", str9, "1,,0,hi!,hi!,0,100.0,,0,100.0,");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,0,100.0,", "0,hi!,hi!,0,100.0,", (int) (short) 100, (double) 0, "97,,hi!,-1,0.0,");
        onlinebook6.setValue((double) 1L);
        int int9 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "0,hi!,hi!,10,100.0,", "hi!", (int) '#', 0.0d, "97,,hi!,0,10.0,");
        java.lang.String str7 = onlinebook6.toCSVString();
        double double8 = onlinebook6.getValue();
        boolean boolean9 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0," + "'", str7, "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        java.lang.String str14 = onlinebook6.getTitle();
        int int15 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) ' ');
        double double20 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        java.lang.String str8 = onlinebook6.toCSVString();
        boolean boolean9 = onlinebook6.isCanPurchase();
        java.lang.String str10 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str8, "97,hi!,hi!,97,10.0,");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "97,,hi!,-1,0.0,", (int) (short) -1, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanRent(false);
        java.lang.String str9 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97,,hi!,-1,0.0," + "'", str9, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = onlinebook6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        int int7 = onlinebook6.getRemainingCopies();
        java.lang.String str8 = onlinebook6.getTitle();
        java.lang.String str9 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str8, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str9, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        java.lang.String str14 = onlinebook6.toCSVString();
        double double15 = onlinebook6.getValue();
        java.lang.String str16 = onlinebook6.getTitle();
        java.lang.String str17 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str14, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str17, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setCanPurchase(false);
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        java.lang.String str11 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str11, "0,hi!,hi!,0,100.0,");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "97,,0,hi!,hi!,10,52.0,,1,10.0,", "1,,0,hi!,hi!,0,100.0,,0,100.0,", (int) (byte) 100, (double) 100.0f, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        java.lang.String str10 = onlinebook6.toCSVString();
        java.lang.String str11 = onlinebook6.getTitle();
        java.lang.String str12 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str10, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 0, "", "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,", (int) (byte) 100, (double) (-1.0f), "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) (byte) 100);
        onlinebook6.setCanPurchase(false);
        onlinebook6.setRemainingCopies((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,hi!,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.getLocation();
        boolean boolean8 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = onlinebook6.isCanPurchase();
        boolean boolean15 = onlinebook6.isCanRent();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "0,hi!,97,,hi!,10,100.0,,10,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", (int) ' ', (double) (short) 1, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) (byte) 100);
        onlinebook6.setCanPurchase(false);
        onlinebook6.setRemainingCopies((int) (short) 100);
        java.lang.String str21 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies((int) (short) -1);
        onlinebook6.setValue((double) ' ');
        objects.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord17 = onlinebook6.borrow(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        int int9 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies(0);
        onlinebook6.setValue(0.0d);
        java.lang.String str14 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,hi!,0,0.0," + "'", str14, "0,hi!,hi!,0,0.0,");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        boolean boolean8 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "97,,hi!,10,100.0,", "1,,0,hi!,hi!,0,100.0,,0,100.0,", (-1), (double) (-1.0f), "97,97,hi!,hi!,97,10.0,,,10,-1.0,");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setCanPurchase(true);
        java.lang.String str12 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        double double9 = onlinebook6.getValue();
        onlinebook6.setValue((double) (byte) 1);
        int int12 = onlinebook6.getId();
        int int13 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        double double14 = onlinebook6.getValue();
        onlinebook6.setCanRent(true);
        java.lang.String str17 = onlinebook6.getLocation();
        java.lang.Class<?> wildcardClass18 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        boolean boolean10 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        java.lang.String str14 = onlinebook6.getLocation();
        onlinebook6.setCanRent(true);
        int int17 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        double double16 = onlinebook6.getValue();
        onlinebook6.setLocation("");
        java.lang.String str19 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        boolean boolean12 = onlinebook6.isCanPurchase();
        onlinebook6.setCanPurchase(false);
        java.lang.String str15 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97,,hi!,-1,0.0," + "'", str15, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "97,,hi!,10,100.0,", "0,hi!,hi!,10,52.0,", 0, (double) 1L, "");
        java.lang.String str7 = onlinebook6.getLocation();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) -1, "97,,hi!,0,10.0,", "hi!", (int) (byte) -1, (double) ' ', "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
        double double7 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        java.lang.String str14 = onlinebook6.toCSVString();
        java.lang.String str15 = onlinebook6.toCSVString();
        onlinebook6.setRemainingCopies((int) (short) -1);
        java.lang.String str18 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str14, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str15, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,-1,100.0," + "'", str18, "0,hi!,0,hi!,hi!,10,100.0,,-1,100.0,");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        onlinebook6.setCanPurchase(true);
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        onlinebook6.setLocation("97,hi!,hi!,97,10.0,");
        onlinebook6.setCanPurchase(false);
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "0,hi!,hi!,10,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", (int) (short) -1, (double) 10, "0,hi!,hi!,10,100.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setCanPurchase(false);
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        double double11 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) '4');
        boolean boolean11 = onlinebook6.isCanRent();
        onlinebook6.setRemainingCopies((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,0,100.0,", "0,hi!,hi!,0,100.0,", (int) (short) 100, (double) 0, "97,,hi!,-1,0.0,");
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
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        java.lang.String str14 = onlinebook6.getLocation();
        java.lang.String str15 = onlinebook6.getTitle();
        java.lang.String str16 = onlinebook6.getLocation();
        objects.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord18 = onlinebook6.borrow(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        int int12 = onlinebook6.getRemainingCopies();
        boolean boolean13 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,100.0,", (int) (short) 1, (double) (-1L), "97,,hi!,0,10.0,");
        int int7 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord11 = onlinebook6.borrow(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        boolean boolean17 = onlinebook6.isCanRent();
        java.lang.String str18 = onlinebook6.toCSVString();
        java.lang.String str19 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,100,100.0," + "'", str18, "0,hi!,hi!,100,100.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,0,hi!,hi!,10,100.0,,-1,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        boolean boolean17 = onlinebook6.isCanRent();
        java.lang.String str18 = onlinebook6.toCSVString();
        int int19 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,100,100.0," + "'", str18, "0,hi!,hi!,100,100.0,");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        int int19 = onlinebook6.getRemainingCopies();
        objects.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord21 = onlinebook6.borrow(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        onlinebook6.setCanRent(true);
        int int9 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        int int19 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 10, "hi!", "0,hi!,hi!,10,100.0,", (int) '#', (double) 1, "hi!");
        java.lang.String str7 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "0,hi!,hi!,10,52.0,", "", (int) (short) -1, (double) 100, "hi!");
        onlinebook6.setValue((double) 1L);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(true);
        java.lang.String str11 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        int int9 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        java.lang.String str20 = onlinebook6.getTitle();
        boolean boolean21 = onlinebook6.isCanRent();
        onlinebook6.setRemainingCopies((int) ' ');
        int int24 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '#', "hi!", "", (int) (short) 0, (double) (byte) -1, "0,hi!,hi!,10,100.0,");
        double double7 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((-1));
        java.lang.Class<?> wildcardClass10 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,", (int) (byte) 100, (double) 10.0f, "0,hi!,97,,hi!,10,100.0,,10,100.0,");
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
        int int9 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setLocation("97,,0,hi!,hi!,10,52.0,,1,10.0,");
        boolean boolean15 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        boolean boolean16 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        boolean boolean15 = onlinebook6.isCanPurchase();
        java.lang.String str16 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(false);
        java.lang.String str19 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 100, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "97,hi!,hi!,97,10.0,", (int) (short) -1, (double) (byte) 0, "97,,hi!,-1,0.0,");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((int) (short) 1);
        java.lang.String str17 = onlinebook6.getLocation();
        onlinebook6.setValue((double) 10.0f);
        java.lang.String str20 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,", (int) (byte) 100, (double) 10.0f, "0,hi!,97,,hi!,10,100.0,,10,100.0,");
        onlinebook6.setLocation("0,hi!,hi!,100,100.0,");
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord10 = onlinebook6.borrow(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        int int13 = onlinebook6.getRemainingCopies();
        java.lang.Class<?> wildcardClass14 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        boolean boolean12 = onlinebook6.isCanPurchase();
        boolean boolean13 = onlinebook6.isCanRent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        java.lang.String str19 = onlinebook6.toCSVString();
        java.lang.Class<?> wildcardClass20 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str16, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,hi!,hi!,0,100.0," + "'", str19, "0,hi!,hi!,0,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        java.lang.String str14 = onlinebook6.toCSVString();
        int int15 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,hi!,100,100.0," + "'", str14, "0,hi!,hi!,100,100.0,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        int int9 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies(0);
        int int12 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        int int15 = onlinebook6.getId();
        int int16 = onlinebook6.getRemainingCopies();
        double double17 = onlinebook6.getValue();
        int int18 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "", "0,hi!,97,,hi!,-1,0.0,,10,52.0,", (int) (byte) 10, (double) 100L, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        onlinebook6.setCanRent(true);
        objects.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        double double20 = onlinebook6.getValue();
        int int21 = onlinebook6.getRemainingCopies();
        int int22 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str18, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        int int7 = onlinebook6.getRemainingCopies();
        objects.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        java.lang.String str14 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97,,hi!,0,10.0," + "'", str14, "97,,hi!,0,10.0,");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setCanRent(false);
        objects.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord12 = onlinebook6.borrow(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        onlinebook6.setCanRent(true);
        int int12 = onlinebook6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        java.lang.String str15 = onlinebook6.toCSVString();
        int int16 = onlinebook6.getRemainingCopies();
        int int17 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,", "97,,hi!,10,100.0,", (int) (byte) -1, 0.0d, "hi!");
        onlinebook6.setCanPurchase(true);
        onlinebook6.setValue((double) (short) 10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        java.lang.String str14 = onlinebook6.getTitle();
        int int15 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        java.lang.String str18 = onlinebook6.toCSVString();
        int int19 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str18, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        boolean boolean12 = onlinebook6.isCanRent();
        boolean boolean13 = onlinebook6.isCanRent();
        java.lang.String str14 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,10,100.0,", "hi!", (int) (byte) 100, (double) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((int) (short) 1);
        onlinebook6.setCanRent(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        onlinebook6.setValue((double) 0);
        java.lang.String str19 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str19, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        java.lang.String str10 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        onlinebook6.setCanRent(true);
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        boolean boolean10 = onlinebook6.isCanPurchase();
        boolean boolean11 = onlinebook6.isCanRent();
        onlinebook6.setRemainingCopies((int) (byte) 100);
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        double double20 = onlinebook6.getValue();
        boolean boolean21 = onlinebook6.isCanPurchase();
        int int22 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str18, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) '#', "hi!", "", (int) (short) 0, (double) (byte) -1, "0,hi!,hi!,10,100.0,");
        double double7 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((-1));
        int int10 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,", "97,,hi!,10,100.0,", (int) (byte) -1, 0.0d, "hi!");
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
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
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
        double double20 = onlinebook6.getValue();
        double double21 = onlinebook6.getValue();
        objects.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str18, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        objects.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "97,,0,hi!,hi!,10,52.0,,0,10.0,", "97,,hi!,10,100.0,", (int) (short) 100, (double) (-1L), "0,hi!,97,,hi!,10,100.0,,10,100.0,");
        onlinebook6.setCanPurchase(true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", 0, (double) 97, "");
        java.lang.Class<?> wildcardClass7 = onlinebook6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        java.lang.String str12 = onlinebook6.getTitle();
        int int13 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        onlinebook6.setCanPurchase(true);
        java.lang.String str18 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,hi!,0,10.0," + "'", str18, "97,,hi!,0,10.0,");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "0,hi!,hi!,0,100.0,", "0,hi!,hi!,10,52.0,", 97, 100.0d, "97,,hi!,10,0.0,");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanPurchase(true);
        boolean boolean9 = onlinebook6.isCanRent();
        int int10 = onlinebook6.getId();
        int int11 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        java.lang.String str18 = onlinebook6.getLocation();
        java.lang.Class<?> wildcardClass19 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,hi!,10,100.0," + "'", str18, "97,,hi!,10,100.0,");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,0,10.0,", "hi!", (int) (short) -1, (double) '#', "hi!");
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        onlinebook6.setValue((double) 1.0f);
        onlinebook6.setRemainingCopies(1);
        onlinebook6.setCanRent(false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        double double14 = onlinebook6.getValue();
        onlinebook6.setCanRent(false);
        java.lang.String str17 = onlinebook6.getLocation();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        java.lang.String str15 = onlinebook6.toCSVString();
        int int16 = onlinebook6.getRemainingCopies();
        onlinebook6.setLocation("97,97,hi!,hi!,97,10.0,,,10,-1.0,");
        java.lang.String str19 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0," + "'", str19, "0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0,");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,10,100.0,", "hi!", (int) (byte) 100, (double) 10, "97,,hi!,-1,0.0,");
        int int7 = onlinebook6.getId();
        onlinebook6.setLocation("hi!");
        int int10 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        java.lang.String str18 = onlinebook6.getLocation();
        onlinebook6.setValue((double) 0);
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,hi!,10,100.0," + "'", str18, "97,,hi!,10,100.0,");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("-1,0,hi!,hi!,10,100.0,,hi!,35,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        java.lang.String str14 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) -1, "0,hi!,hi!,0,100.0,", "0,hi!,hi!,10,52.0,", (int) (short) 10, (double) (byte) 100, "0,hi!,hi!,0,100.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(true);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        java.lang.String str13 = onlinebook6.getLocation();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (short) 10);
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setCanRent(true);
        java.lang.String str16 = onlinebook6.getLocation();
        onlinebook6.setCanRent(false);
        int int19 = onlinebook6.getId();
        onlinebook6.setValue((double) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (short) 0);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        java.lang.String str20 = onlinebook6.getTitle();
        java.lang.String str21 = onlinebook6.toCSVString();
        double double22 = onlinebook6.getValue();
        objects.User user23 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97,,0,hi!,hi!,10,52.0,,1,10.0," + "'", str21, "97,,0,hi!,hi!,10,52.0,,1,10.0,");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
        java.lang.Class<?> wildcardClass23 = onlinebook6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "97,,hi!,-1,0.0,", (int) (short) -1, (double) (short) 10, "97,,hi!,-1,0.0,");
        int int7 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        boolean boolean14 = onlinebook6.isCanPurchase();
        onlinebook6.setValue((double) (byte) 100);
        onlinebook6.setCanPurchase(false);
        java.lang.String str19 = onlinebook6.getTitle();
        java.lang.Class<?> wildcardClass20 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        onlinebook6.setValue((double) 10);
        int int9 = onlinebook6.getRemainingCopies();
        int int10 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(10, "0,hi!,hi!,10,100.0,", "0,hi!,hi!,10,100.0,", (int) (byte) -1, 100.0d, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        int int7 = onlinebook6.getRemainingCopies();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str8, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "97,hi!,hi!,97,10.0,", "", 10, (double) (-1.0f), "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 100);
        java.lang.String str10 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,97,hi!,hi!,97,10.0,,,10,-1.0," + "'", str7, "97,97,hi!,hi!,97,10.0,,,10,-1.0,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str10, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(1, "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", 0, (double) (byte) 10, "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) ' ', "", "hi!", (int) (short) 0, (double) (byte) -1, "");
        java.lang.String str7 = onlinebook6.getLocation();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        int int10 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("97,,hi!,0,10.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        java.lang.String str20 = onlinebook6.getTitle();
        java.lang.String str21 = onlinebook6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,hi!,0,0.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        onlinebook6.setLocation("97,hi!,hi!,97,10.0,");
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setLocation("0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0,");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97,hi!,hi!,97,10.0," + "'", str12, "97,hi!,hi!,97,10.0,");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        double double15 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        int int14 = onlinebook6.getId();
        int int15 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 100, "0,hi!,hi!,0,100.0,", "", 32, 0.0d, "97,97,hi!,hi!,97,10.0,,,10,-1.0,");
        onlinebook6.setValue((double) (short) 10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setCanPurchase(false);
        onlinebook6.setCanPurchase(true);
        java.lang.String str18 = onlinebook6.toCSVString();
        objects.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord20 = onlinebook6.borrow(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,hi!,0,10.0," + "'", str18, "97,,hi!,0,10.0,");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        onlinebook6.setValue(0.0d);
        java.lang.String str18 = onlinebook6.getTitle();
        int int19 = onlinebook6.getRemainingCopies();
        java.lang.Class<?> wildcardClass20 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setCanRent(false);
        java.lang.String str12 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(100, "97,,0,hi!,hi!,10,52.0,,0,10.0,", "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,", 0, (double) 97, "");
        onlinebook6.setCanRent(true);
        java.lang.String str9 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str9, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        int int12 = onlinebook6.getRemainingCopies();
        java.lang.String str13 = onlinebook6.toCSVString();
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str13, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        java.lang.String str14 = onlinebook6.toCSVString();
        double double15 = onlinebook6.getValue();
        java.lang.String str16 = onlinebook6.getTitle();
        onlinebook6.setRemainingCopies(0);
        int int19 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str14, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        boolean boolean7 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        onlinebook6.setLocation("97,hi!,hi!,97,10.0,");
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = onlinebook6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (byte) 1);
        java.lang.String str20 = onlinebook6.getTitle();
        double double21 = onlinebook6.getValue();
        double double22 = onlinebook6.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        java.lang.String str9 = onlinebook6.getLocation();
        int int10 = onlinebook6.getRemainingCopies();
        java.lang.String str11 = onlinebook6.getLocation();
        java.lang.String str12 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(true);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getTitle();
        onlinebook6.setValue((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        java.lang.String str18 = onlinebook6.getLocation();
        onlinebook6.setValue((double) 0);
        onlinebook6.setRemainingCopies(1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,hi!,10,100.0," + "'", str18, "97,,hi!,10,100.0,");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        double double7 = onlinebook6.getValue();
        boolean boolean8 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        onlinebook6.setCanRent(false);
        boolean boolean16 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (byte) -1);
        boolean boolean19 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("100,97,,hi!,10,0.0,,0,hi!,97,,hi!,10,100.0,,10,100.0,,100,32.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        boolean boolean13 = onlinebook6.isCanRent();
        boolean boolean14 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        java.lang.String str17 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        java.lang.String str14 = onlinebook6.toCSVString();
        double double15 = onlinebook6.getValue();
        java.lang.String str16 = onlinebook6.getTitle();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi!,0,hi!,hi!,10,100.0,,10,100.0," + "'", str14, "0,hi!,0,hi!,hi!,10,100.0,,10,100.0,");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        java.lang.String str8 = onlinebook6.getTitle();
        onlinebook6.setLocation("97,,hi!,-1,0.0,");
        java.lang.String str11 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str7, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,hi!,97,,hi!,-1,0.0,,10,52.0," + "'", str11, "0,hi!,97,,hi!,-1,0.0,,10,52.0,");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setRemainingCopies((int) (short) 0);
        java.lang.String str15 = onlinebook6.getTitle();
        double double16 = onlinebook6.getValue();
        onlinebook6.setCanPurchase(false);
        onlinebook6.setRemainingCopies((int) '4');
        onlinebook6.setCanPurchase(false);
        java.lang.String str23 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        objects.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        double double14 = onlinebook6.getValue();
        onlinebook6.setCanRent(true);
        java.lang.String str17 = onlinebook6.getLocation();
        objects.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord19 = onlinebook6.borrow(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        int int13 = onlinebook6.getRemainingCopies();
        double double14 = onlinebook6.getValue();
        onlinebook6.setCanRent(true);
        java.lang.String str17 = onlinebook6.getLocation();
        onlinebook6.setCanPurchase(true);
        java.lang.String str20 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,hi!,hi!,100,100.0," + "'", str20, "0,hi!,hi!,100,100.0,");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        onlinebook6.setCanRent(true);
        boolean boolean14 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getRemainingCopies();
        java.lang.Class<?> wildcardClass14 = onlinebook6.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        boolean boolean10 = onlinebook6.isCanPurchase();
        int int11 = onlinebook6.getId();
        java.lang.String str12 = onlinebook6.toCSVString();
        onlinebook6.setCanPurchase(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97,,hi!,10,0.0," + "'", str12, "97,,hi!,10,0.0,");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        onlinebook6.setRemainingCopies((int) (byte) 10);
        boolean boolean9 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(true);
        java.lang.String str12 = onlinebook6.getLocation();
        onlinebook6.setValue(100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setCanRent(true);
        onlinebook6.setCanRent(false);
        java.lang.String str12 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getRemainingCopies();
        boolean boolean12 = onlinebook6.isCanRent();
        boolean boolean13 = onlinebook6.isCanRent();
        onlinebook6.setLocation("0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        double double14 = onlinebook6.getValue();
        onlinebook6.setRemainingCopies((int) (short) 1);
        java.lang.String str17 = onlinebook6.getLocation();
        onlinebook6.setValue((double) 10.0f);
        int int20 = onlinebook6.getId();
        objects.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord22 = onlinebook6.borrow(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        java.lang.String str15 = onlinebook6.toCSVString();
        java.lang.String str16 = onlinebook6.getLocation();
        java.lang.String str17 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str15, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str17, "0,hi!,hi!,10,100.0,");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(0, "0,hi!,hi!,10,100.0,", "97,hi!,hi!,97,10.0,", 0, (double) 10, "0,hi!,97,97,hi!,hi!,97,10.0,,,10,-1.0,,10,100.0,");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("0,hi!,97,,hi!,10,100.0,,10,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (byte) 100, "0,hi!,hi!,100,100.0,", "97,,0,hi!,hi!,10,52.0,,1,10.0,", 97, (double) 100, "");
        onlinebook6.setCanPurchase(false);
        double double9 = onlinebook6.getValue();
        boolean boolean10 = onlinebook6.isCanPurchase();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        int int9 = onlinebook6.getRemainingCopies();
        onlinebook6.setRemainingCopies(0);
        boolean boolean12 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        int int13 = onlinebook6.getId();
        java.lang.String str14 = onlinebook6.getLocation();
        boolean boolean15 = onlinebook6.isCanPurchase();
        boolean boolean16 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies(97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "97,,hi!,0,10.0,", "hi!", (int) (short) -1, (double) '#', "hi!");
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        onlinebook6.setValue((double) 1.0f);
        onlinebook6.setRemainingCopies(1);
        int int13 = onlinebook6.getId();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        int int17 = onlinebook6.getId();
        java.lang.String str18 = onlinebook6.getLocation();
        int int19 = onlinebook6.getRemainingCopies();
        int int20 = onlinebook6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str18, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setCanRent(false);
        int int11 = onlinebook6.getId();
        objects.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord13 = onlinebook6.borrow(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.moreThanThreeOverdueItems()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        java.lang.String str7 = onlinebook6.toCSVString();
        onlinebook6.setValue((double) 10.0f);
        onlinebook6.setRemainingCopies((int) (short) 0);
        onlinebook6.setValue((double) 10);
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        boolean boolean17 = onlinebook6.isCanRent();
        java.lang.String str18 = onlinebook6.toCSVString();
        java.lang.String str19 = onlinebook6.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97,,0,hi!,hi!,10,52.0,,0,10.0," + "'", str18, "97,,0,hi!,hi!,10,52.0,,0,10.0,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97,,0,hi!,hi!,10,52.0,,0,10.0," + "'", str19, "97,,0,hi!,hi!,10,52.0,,0,10.0,");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        onlinebook6.setRemainingCopies((int) (short) 1);
        boolean boolean11 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        double double20 = onlinebook6.getValue();
        boolean boolean21 = onlinebook6.isCanPurchase();
        java.lang.String str22 = onlinebook6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,,hi!,-1,0.0," + "'", str7, "97,,hi!,-1,0.0,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str18, "0,hi!,hi!,10,52.0,");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0,hi!,hi!,10,52.0," + "'", str22, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        boolean boolean8 = onlinebook6.isCanRent();
        onlinebook6.setLocation("");
        boolean boolean11 = onlinebook6.isCanRent();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        java.lang.String str12 = onlinebook6.getLocation();
        java.lang.String str13 = onlinebook6.getTitle();
        onlinebook6.setCanRent(false);
        onlinebook6.setLocation("97,,hi!,10,100.0,");
        java.lang.String str18 = onlinebook6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,", 100, (double) (byte) 10, "0,hi!,hi!,10,52.0,");
        double double7 = onlinebook6.getValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "97,,hi!,0,10.0,", "0,hi!,97,,hi!,10,100.0,,10,100.0,", (int) (short) 10, (double) (short) 10, "97,,hi!,10,0.0,");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        java.lang.String str9 = onlinebook6.getLocation();
        java.lang.String str10 = onlinebook6.toCSVString();
        int int11 = onlinebook6.getRemainingCopies();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,hi!,hi!,10,100.0," + "'", str10, "0,hi!,hi!,10,100.0,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("1,,0,hi!,hi!,0,100.0,,0,100.0,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        onlinebook6.setRemainingCopies((int) (byte) 100);
        double double13 = onlinebook6.getValue();
        onlinebook6.setLocation("0,hi!,hi!,10,52.0,");
        java.lang.String str16 = onlinebook6.getTitle();
        onlinebook6.setRemainingCopies((int) (short) 1);
        int int19 = onlinebook6.getRemainingCopies();
        java.lang.String str20 = onlinebook6.toCSVString();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,hi!,0,hi!,hi!,10,52.0,,1,100.0," + "'", str20, "0,hi!,0,hi!,hi!,10,52.0,,1,100.0,");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "0,hi!,97,,hi!,-1,0.0,,10,52.0,", "0,hi!,hi!,10,52.0,", 10, (double) 1, "");
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
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) (short) 0, "hi!", "hi!", (int) (short) 10, (double) '4', "hi!");
        onlinebook6.setValue((double) 100);
        onlinebook6.setCanRent(false);
        boolean boolean11 = onlinebook6.isCanPurchase();
        onlinebook6.setRemainingCopies((int) (short) 0);
        boolean boolean14 = onlinebook6.isCanPurchase();
        java.lang.String str15 = onlinebook6.getTitle();
        java.lang.String str16 = onlinebook6.getTitle();
        onlinebook6.setRemainingCopies((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(32, "97,97,hi!,hi!,97,10.0,,,10,-1.0,", "-1,0,hi!,hi!,0,100.0,,97,,0,hi!,hi!,10,52.0,,1,10.0,,0,100.0,", (int) (byte) 100, (double) (short) 10, "0,hi!,hi!,10,52.0,");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((int) 'a', "", "hi!", (int) (byte) -1, (double) 0, "hi!");
        boolean boolean7 = onlinebook6.isCanRent();
        int int8 = onlinebook6.getId();
        boolean boolean9 = onlinebook6.isCanPurchase();
        onlinebook6.setLocation("0,hi!,hi!,0,100.0,");
        onlinebook6.setValue((double) 1);
        onlinebook6.setCanRent(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "97,,hi!,-1,0.0,", (int) (short) -1, (double) (short) 10, "97,,hi!,-1,0.0,");
        objects.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            onlinebook6.returnObject(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User.updateBorrowingRecords()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook(97, "hi!", "hi!", 97, (double) (short) 10, "97,,hi!,-1,0.0,");
        java.lang.String str7 = onlinebook6.getTitle();
        onlinebook6.setValue((double) (byte) 1);
        boolean boolean10 = onlinebook6.isCanPurchase();
        boolean boolean11 = onlinebook6.isCanRent();
        onlinebook6.setCanPurchase(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        objects.Onlinebook onlinebook6 = new objects.Onlinebook((-1), "", "97,,hi!,-1,0.0,", (int) (short) -1, (double) (short) 10, "97,,hi!,-1,0.0,");
        onlinebook6.setCanRent(true);
    }
}

