package Randoop.junits.VisitorTest;

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
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        java.lang.Class<?> wildcardClass5 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.lang.String str9 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.PaymentType paymentType9 = null;
        visitor4.addPaymentMethod(paymentType9, (double) 0L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass7 = borrowingRecordList6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Newsletter newsletter16 = null;
        visitor4.unSubscribe(newsletter16);
        java.lang.Class<?> wildcardClass18 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass18 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.getValidationStatus();
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Newsletter newsletter11 = null;
        visitor4.unSubscribe(newsletter11);
        java.lang.String str13 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass10 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        objects.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        java.lang.Class<?> wildcardClass5 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter21 = null;
        visitor4.subscribe(newsletter21);
        objects.Newsletter newsletter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        java.lang.Class<?> wildcardClass16 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        visitor4.addPenalty(0.0d);
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        boolean boolean6 = visitor4.getValidationStatus();
        visitor4.setValidationStatus(true);
        objects.User.UserType userType9 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        java.lang.String str7 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        visitor4.setValidationStatus(false);
        boolean boolean9 = visitor4.moreThanThreeOverdueItems();
        objects.User.UserType userType10 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) '4', "hi!", "hi!", userType3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Newsletter newsletter11 = null;
        visitor4.unSubscribe(newsletter11);
        visitor4.addPenalty((double) (byte) 100);
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        java.lang.Class<?> wildcardClass14 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Newsletter newsletter11 = null;
        visitor4.unSubscribe(newsletter11);
        visitor4.addPenalty((double) (byte) 100);
        int int15 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        org.junit.Assert.assertNotNull(borrowingRecordList5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        objects.User.UserType userType7 = visitor4.getUserType();
        boolean boolean8 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        int int6 = visitor4.getId();
        java.lang.String str7 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        java.lang.String str5 = visitor4.getPassword();
        objects.Book book6 = null;
        int int8 = visitor4.sendRequest(book6, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.addPenalty((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        visitor4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        visitor4.setValidationStatus(true);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass10 = borrowingRecordList9.getClass();
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        java.lang.String str7 = visitor4.getEmail();
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str17 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass18 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.Book book8 = null;
        int int10 = visitor4.sendRequest(book8, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        int int19 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        objects.Book book14 = null;
        int int16 = visitor4.sendRequest(book14, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.getValidationStatus();
        objects.Newsletter newsletter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "hi!", "hi!", userType3);
        java.lang.String str5 = visitor4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) -1, "hi!", "", userType3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Book book7 = null;
        int int9 = visitor4.sendRequest(book7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        objects.User.UserType userType6 = visitor4.getUserType();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        boolean boolean6 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        java.lang.String str12 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        visitor4.addPenalty((double) (-1.0f));
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 100, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) (-1L));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        java.lang.String str7 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        int int15 = visitor4.getId();
        java.lang.String str16 = visitor4.getEmail();
        int int17 = visitor4.getId();
        objects.User.UserType userType18 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(userType18);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        objects.User.UserType userType14 = visitor4.getUserType();
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertNull(userType14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        visitor4.addPenalty((double) (short) 0);
        boolean boolean19 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter21 = null;
        visitor4.subscribe(newsletter21);
        boolean boolean23 = visitor4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList24 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList24);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType9 = null;
        visitor4.addPaymentMethod(paymentType9, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        boolean boolean15 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((-1), "", "hi!", userType3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 10, "hi!", "", userType3);
        java.lang.String str5 = visitor4.getEmail();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        java.lang.Class<?> wildcardClass16 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, (double) (byte) 10);
        objects.Newsletter newsletter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        visitor4.setValidationStatus(false);
        int int13 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter6 = null;
        visitor4.unSubscribe(newsletter6);
        org.junit.Assert.assertNotNull(borrowingRecordList5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 1, "hi!", "hi!", userType3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 0L);
        visitor4.setValidationStatus(true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        visitor4.addPenalty((double) (byte) -1);
        java.lang.String str8 = visitor4.getPassword();
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        int int13 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        java.lang.Class<?> wildcardClass11 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, (double) (byte) 10);
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = visitor4.getPassword();
        java.lang.String str6 = visitor4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        int int16 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        java.lang.String str12 = visitor4.getEmail();
        objects.Book book13 = null;
        int int15 = visitor4.sendRequest(book13, false);
        objects.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        org.junit.Assert.assertNotNull(borrowingRecordList5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 100, "", "hi!", userType3);
        visitor4.setValidationStatus(false);
        objects.User.UserType userType7 = visitor4.getUserType();
        org.junit.Assert.assertNull(userType7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        objects.Book book15 = null;
        int int17 = visitor4.sendRequest(book15, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = visitor4.updateBorrowingRecords();
        objects.Book book8 = null;
        int int10 = visitor4.sendRequest(book8, false);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) 1);
        visitor4.setValidationStatus(false);
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        java.lang.Class<?> wildcardClass10 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 0, "", "", userType3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) '4', "hi!", "", userType3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        boolean boolean6 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        int int16 = visitor4.getId();
        boolean boolean17 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        objects.Book book14 = null;
        int int16 = visitor4.sendRequest(book14, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        visitor4.addPenalty(0.0d);
        visitor4.addPenalty((double) 10L);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((-1), "hi!", "hi!", userType3);
        visitor4.setValidationStatus(true);
        java.lang.String str7 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 1.0f);
        boolean boolean8 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 1.0f);
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        visitor4.addPenalty((double) 100.0f);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str21 = visitor4.getPassword();
        boolean boolean22 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        visitor4.addPenalty((double) 1.0f);
        java.lang.String str14 = visitor4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        boolean boolean6 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Newsletter newsletter16 = null;
        visitor4.unSubscribe(newsletter16);
        objects.User.UserType userType18 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(userType18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 100, "", "hi!", userType3);
        visitor4.addPenalty((double) (byte) 10);
        objects.Newsletter newsletter7 = null;
        visitor4.subscribe(newsletter7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        boolean boolean8 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 0L);
        java.lang.String str8 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        visitor4.addPenalty((double) 1.0f);
        java.lang.Class<?> wildcardClass14 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        visitor4.addPenalty((double) (byte) -1);
        visitor4.addPenalty((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "hi!", "", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        visitor4.addPenalty(0.0d);
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        objects.User.UserType userType10 = visitor4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList11 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertNotNull(borrowingRecordList11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty((double) (short) -1);
        boolean boolean10 = visitor4.getValidationStatus();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        visitor4.addPenalty((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        visitor4.addPenalty((double) (short) -1);
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        visitor4.setValidationStatus(false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        objects.PaymentType paymentType16 = null;
        visitor4.addPaymentMethod(paymentType16, (-1.0d));
        java.lang.String str19 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((-1), "hi!", "hi!", userType3);
        java.lang.String str5 = visitor4.getEmail();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.Book book6 = null;
        int int8 = visitor4.sendRequest(book6, true);
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.subscribe(newsletter7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        visitor4.addPenalty((-1.0d));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.User.UserType userType6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getEmail();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList11 = visitor4.updateBorrowingRecords();
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, (double) (short) -1);
        visitor4.setValidationStatus(false);
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        java.lang.String str12 = visitor4.getEmail();
        int int13 = visitor4.getId();
        java.lang.String str14 = visitor4.getEmail();
        boolean boolean15 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, false);
        objects.Newsletter newsletter19 = null;
        visitor4.unSubscribe(newsletter19);
        objects.Newsletter newsletter21 = null;
        visitor4.subscribe(newsletter21);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList23 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass24 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) '#', "hi!", "", userType3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        boolean boolean15 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) (byte) 0);
        java.lang.String str13 = visitor4.getEmail();
        java.lang.String str14 = visitor4.getPassword();
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        visitor4.addPenalty(0.0d);
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        objects.User.UserType userType10 = visitor4.getUserType();
        objects.User.UserType userType11 = visitor4.getUserType();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertNull(userType11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty(1.0d);
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) 10L);
        objects.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        boolean boolean6 = visitor4.getValidationStatus();
        int int7 = visitor4.getId();
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(100, "", "hi!", userType3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        visitor4.setValidationStatus(true);
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        objects.PaymentType paymentType18 = null;
        visitor4.addPaymentMethod(paymentType18, (double) 10);
        visitor4.addPenalty((double) (byte) 0);
        objects.User.UserType userType23 = visitor4.getUserType();
        objects.Newsletter newsletter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertNull(userType23);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        boolean boolean7 = visitor4.getValidationStatus();
        java.lang.String str8 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        boolean boolean6 = visitor4.getValidationStatus();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        visitor4.addPenalty(1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        java.lang.String str5 = visitor4.getPassword();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        java.lang.Class<?> wildcardClass8 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Newsletter newsletter16 = null;
        visitor4.unSubscribe(newsletter16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter21 = null;
        visitor4.subscribe(newsletter21);
        boolean boolean23 = visitor4.moreThanThreeOverdueItems();
        objects.User.UserType userType24 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(userType24);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str21 = visitor4.getPassword();
        objects.User.UserType userType22 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(userType22);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        int int15 = visitor4.getId();
        java.lang.String str16 = visitor4.getEmail();
        objects.User.UserType userType17 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(userType17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        objects.User.UserType userType12 = visitor4.getUserType();
        objects.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(userType12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) -1, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        java.lang.String str9 = visitor4.getPassword();
        java.lang.String str10 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty(1.0d);
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) 10L);
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        visitor4.addPenalty((double) (-1.0f));
        visitor4.addPenalty((double) (-1.0f));
        boolean boolean15 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType10 = visitor4.getUserType();
        int int11 = visitor4.getId();
        visitor4.addPenalty((double) (short) -1);
        boolean boolean14 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str15 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        java.lang.String str7 = visitor4.getEmail();
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        visitor4.setValidationStatus(false);
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        java.lang.String str10 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass11 = visitor4.getClass();
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        visitor4.setValidationStatus(false);
        int int13 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, (double) (byte) 100);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList19 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        int int15 = visitor4.getId();
        java.lang.String str16 = visitor4.getEmail();
        int int17 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList18 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        visitor4.addPenalty((double) 0.0f);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        java.lang.String str6 = visitor4.getPassword();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.lang.String str6 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Newsletter newsletter16 = null;
        visitor4.unSubscribe(newsletter16);
        objects.Book book18 = null;
        int int20 = visitor4.sendRequest(book18, true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "hi!", "", userType3);
        java.lang.String str5 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        objects.Newsletter newsletter16 = null;
        visitor4.unSubscribe(newsletter16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((-1), "hi!", "hi!", userType3);
        visitor4.setValidationStatus(true);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        int int20 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        objects.PaymentType paymentType16 = null;
        visitor4.addPaymentMethod(paymentType16, (double) (byte) 0);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList19 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList19);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        objects.Newsletter newsletter15 = null;
        visitor4.subscribe(newsletter15);
        visitor4.addPenalty((-1.0d));
        boolean boolean19 = visitor4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList20 = visitor4.updateBorrowingRecords();
        visitor4.addPenalty((double) (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList20);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        java.lang.String str10 = visitor4.getPassword();
        objects.Newsletter newsletter11 = null;
        visitor4.unSubscribe(newsletter11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        java.lang.Class<?> wildcardClass17 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        objects.PaymentType paymentType18 = null;
        visitor4.addPaymentMethod(paymentType18, (double) 10);
        visitor4.addPenalty((double) (byte) 0);
        objects.User.UserType userType23 = visitor4.getUserType();
        boolean boolean24 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertNull(userType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        boolean boolean12 = visitor4.getValidationStatus();
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        visitor4.addPenalty((double) (byte) -1);
        java.lang.String str8 = visitor4.getPassword();
        visitor4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        visitor4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        objects.PaymentType paymentType16 = null;
        visitor4.addPaymentMethod(paymentType16, (double) (byte) 0);
        objects.Newsletter newsletter19 = null;
        visitor4.subscribe(newsletter19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass17 = borrowingRecordList16.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty(1.0d);
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) 10L);
        int int13 = visitor4.getId();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = visitor4.getPassword();
        objects.User.UserType userType6 = visitor4.getUserType();
        objects.User.UserType userType7 = visitor4.getUserType();
        objects.User.UserType userType8 = visitor4.getUserType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertNull(userType8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 100, "", "hi!", userType3);
        visitor4.setValidationStatus(false);
        objects.Book book7 = null;
        int int9 = visitor4.sendRequest(book7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType19 = null;
        visitor4.addPaymentMethod(paymentType19, (double) ' ');
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList22 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList22);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        int int6 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, false);
        objects.Newsletter newsletter19 = null;
        visitor4.unSubscribe(newsletter19);
        objects.Newsletter newsletter21 = null;
        visitor4.subscribe(newsletter21);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList23 = visitor4.updateBorrowingRecords();
        int int24 = visitor4.getId();
        objects.PaymentType paymentType25 = null;
        visitor4.addPaymentMethod(paymentType25, 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty(1.0d);
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) 10L);
        objects.Newsletter newsletter13 = null;
        visitor4.unSubscribe(newsletter13);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertNotNull(borrowingRecordList15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        int int15 = visitor4.getId();
        int int16 = visitor4.getId();
        objects.Newsletter newsletter17 = null;
        visitor4.unSubscribe(newsletter17);
        int int19 = visitor4.getId();
        java.lang.String str20 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        java.lang.String str16 = visitor4.getPassword();
        objects.Newsletter newsletter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 100, "", "hi!", userType3);
        visitor4.setValidationStatus(false);
        int int7 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(97, "hi!", "", userType3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str6 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        java.lang.String str6 = visitor4.getEmail();
        objects.PaymentType paymentType7 = null;
        visitor4.addPaymentMethod(paymentType7, (double) 1);
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) -1, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType17 = visitor4.getUserType();
        int int18 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
        org.junit.Assert.assertNull(userType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "hi!", "", userType3);
        java.lang.Class<?> wildcardClass5 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        boolean boolean12 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 1, "", "hi!", userType3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 0L);
        objects.User.UserType userType8 = visitor4.getUserType();
        java.lang.String str9 = visitor4.getPassword();
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        java.lang.String str17 = visitor4.getPassword();
        int int18 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        visitor4.setValidationStatus(false);
        objects.PaymentType paymentType14 = null;
        visitor4.addPaymentMethod(paymentType14, 0.0d);
        java.lang.Class<?> wildcardClass17 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) (byte) 0);
        java.lang.String str13 = visitor4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList14);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.User.UserType userType16 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(userType16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        int int13 = visitor4.getId();
        visitor4.addPenalty((double) (-1L));
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        visitor4.addPenalty((double) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((-1), "hi!", "hi!", userType3);
        java.lang.String str5 = visitor4.getEmail();
        boolean boolean6 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        boolean boolean9 = visitor4.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 100, "", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        visitor4.addPenalty((double) (byte) -1);
        boolean boolean8 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "hi!", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        java.lang.String str8 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        boolean boolean6 = visitor4.getValidationStatus();
        int int7 = visitor4.getId();
        boolean boolean8 = visitor4.moreThanThreeOverdueItems();
        int int9 = visitor4.getId();
        objects.Newsletter newsletter10 = null;
        visitor4.subscribe(newsletter10);
        java.lang.String str12 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 0, "hi!", "", userType3);
        int int5 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        objects.Newsletter newsletter15 = null;
        visitor4.subscribe(newsletter15);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        visitor4.addPenalty(10.0d);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = visitor4.updateBorrowingRecords();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertNotNull(borrowingRecordList12);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        objects.User.UserType userType6 = visitor4.getUserType();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.PaymentType paymentType9 = null;
        visitor4.addPaymentMethod(paymentType9, (double) 100.0f);
        java.lang.Class<?> wildcardClass12 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        visitor4.addPenalty((double) (short) 0);
        objects.Newsletter newsletter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, (double) (byte) 10);
        int int15 = visitor4.getId();
        objects.PaymentType paymentType16 = null;
        visitor4.addPaymentMethod(paymentType16, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Newsletter newsletter11 = null;
        visitor4.unSubscribe(newsletter11);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList13 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        boolean boolean7 = visitor4.getValidationStatus();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        objects.Newsletter newsletter14 = null;
        visitor4.subscribe(newsletter14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType10 = visitor4.getUserType();
        int int11 = visitor4.getId();
        visitor4.addPenalty((double) (short) -1);
        boolean boolean14 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        visitor4.addPenalty((double) (-1.0f));
        visitor4.addPenalty((double) (-1.0f));
        objects.Book book15 = null;
        int int17 = visitor4.sendRequest(book15, false);
        java.lang.String str18 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.Newsletter newsletter9 = null;
        visitor4.unSubscribe(newsletter9);
        objects.User.UserType userType11 = visitor4.getUserType();
        objects.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userType11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        boolean boolean7 = visitor4.getValidationStatus();
        java.lang.String str8 = visitor4.getEmail();
        objects.Newsletter newsletter9 = null;
        visitor4.unSubscribe(newsletter9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType10 = visitor4.getUserType();
        int int11 = visitor4.getId();
        visitor4.addPenalty((double) (short) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        boolean boolean13 = visitor4.getValidationStatus();
        java.lang.String str14 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        java.lang.String str14 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, (double) (byte) 10);
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        int int14 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty(1.0d);
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) (byte) -1);
        objects.Newsletter newsletter13 = null;
        visitor4.unSubscribe(newsletter13);
        objects.PaymentType paymentType15 = null;
        visitor4.addPaymentMethod(paymentType15, (double) 10.0f);
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = visitor4.updateBorrowingRecords();
        boolean boolean15 = visitor4.moreThanThreeOverdueItems();
        objects.User.UserType userType16 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(userType16);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        visitor4.setValidationStatus(true);
        boolean boolean9 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 100, "hi!", "hi!", userType3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter9 = null;
        visitor4.subscribe(newsletter9);
        boolean boolean11 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.lang.String str7 = visitor4.getPassword();
        java.lang.String str8 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        objects.Newsletter newsletter15 = null;
        visitor4.subscribe(newsletter15);
        visitor4.addPenalty((-1.0d));
        boolean boolean19 = visitor4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList20 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass21 = borrowingRecordList20.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        visitor4.addPenalty((double) 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        objects.Newsletter newsletter16 = null;
        visitor4.unSubscribe(newsletter16);
        visitor4.setValidationStatus(false);
        objects.Newsletter newsletter20 = null;
        visitor4.unSubscribe(newsletter20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        java.lang.String str6 = visitor4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = visitor4.updateBorrowingRecords();
        java.lang.String str8 = visitor4.getPassword();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, (double) (byte) 10);
        objects.User.UserType userType15 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(userType15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) 'a');
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        objects.User.UserType userType12 = visitor4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList13 = visitor4.updateBorrowingRecords();
        visitor4.addPenalty(0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(userType12);
        org.junit.Assert.assertNotNull(borrowingRecordList13);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        visitor4.setValidationStatus(true);
        visitor4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "", userType3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 10, "hi!", "", userType3);
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        objects.Newsletter newsletter7 = null;
        visitor4.subscribe(newsletter7);
        boolean boolean9 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        java.lang.String str6 = visitor4.getEmail();
        objects.User.UserType userType7 = visitor4.getUserType();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(userType7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        objects.Book book12 = null;
        int int14 = visitor4.sendRequest(book12, true);
        boolean boolean15 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.Newsletter newsletter9 = null;
        visitor4.unSubscribe(newsletter9);
        objects.Newsletter newsletter11 = null;
        visitor4.unSubscribe(newsletter11);
        int int13 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType10 = visitor4.getUserType();
        boolean boolean11 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType17 = visitor4.getUserType();
        objects.Newsletter newsletter18 = null;
        visitor4.unSubscribe(newsletter18);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
        org.junit.Assert.assertNull(userType17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        java.lang.String str12 = visitor4.getPassword();
        java.lang.String str13 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        int int15 = visitor4.getId();
        int int16 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        boolean boolean18 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str19 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        java.lang.String str9 = visitor4.getPassword();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        java.lang.String str12 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean7 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        visitor4.addPenalty(10.0d);
        java.lang.Class<?> wildcardClass12 = visitor4.getClass();
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) 'a');
        int int9 = visitor4.getId();
        int int10 = visitor4.getId();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType10 = visitor4.getUserType();
        int int11 = visitor4.getId();
        objects.Book book12 = null;
        int int14 = visitor4.sendRequest(book12, false);
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        int int17 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList18 = visitor4.updateBorrowingRecords();
        java.lang.String str19 = visitor4.getEmail();
        java.lang.String str20 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        boolean boolean7 = visitor4.getValidationStatus();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter18 = null;
        visitor4.unSubscribe(newsletter18);
        objects.PaymentType paymentType20 = null;
        visitor4.addPaymentMethod(paymentType20, (double) (byte) -1);
        visitor4.addPenalty((double) (-1));
        int int25 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = visitor4.updateBorrowingRecords();
        boolean boolean15 = visitor4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        visitor4.addPenalty((double) (byte) 10);
        java.lang.String str21 = visitor4.getEmail();
        boolean boolean22 = visitor4.getValidationStatus();
        int int23 = visitor4.getId();
        objects.Newsletter newsletter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 100, "", "hi!", userType3);
        visitor4.addPenalty(1.0d);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        objects.Newsletter newsletter15 = null;
        visitor4.unSubscribe(newsletter15);
        java.lang.String str17 = visitor4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList18 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(borrowingRecordList18);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        int int15 = visitor4.getId();
        int int16 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType18 = visitor4.getUserType();
        objects.User.UserType userType19 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertNull(userType18);
        org.junit.Assert.assertNull(userType19);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 1.0f);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str17 = visitor4.getEmail();
        objects.Newsletter newsletter18 = null;
        visitor4.unSubscribe(newsletter18);
        boolean boolean20 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.Book book6 = null;
        int int8 = visitor4.sendRequest(book6, true);
        int int9 = visitor4.getId();
        java.lang.String str10 = visitor4.getPassword();
        java.lang.String str11 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((-1), "", "", userType3);
        java.lang.Class<?> wildcardClass5 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str6 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 1.0f);
        objects.Book book8 = null;
        int int10 = visitor4.sendRequest(book8, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        visitor4.addPenalty((double) (byte) -1);
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        objects.Newsletter newsletter15 = null;
        visitor4.unSubscribe(newsletter15);
        java.lang.Class<?> wildcardClass17 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) 'a');
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        boolean boolean14 = visitor4.getValidationStatus();
        boolean boolean15 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter9 = null;
        visitor4.subscribe(newsletter9);
        java.lang.String str11 = visitor4.getEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        boolean boolean8 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "hi!", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.User.UserType userType8 = visitor4.getUserType();
        visitor4.addPenalty((-1.0d));
        int int11 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(userType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        java.lang.String str8 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        int int13 = visitor4.getId();
        visitor4.addPenalty((double) (-1L));
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        objects.Newsletter newsletter19 = null;
        visitor4.subscribe(newsletter19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        boolean boolean9 = visitor4.getValidationStatus();
        java.lang.Class<?> wildcardClass10 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.Newsletter newsletter9 = null;
        visitor4.unSubscribe(newsletter9);
        objects.PaymentType paymentType11 = null;
        visitor4.addPaymentMethod(paymentType11, (double) (-1L));
        visitor4.addPenalty((double) (-1L));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.subscribe(newsletter7);
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        objects.User.UserType userType12 = visitor4.getUserType();
        boolean boolean13 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertNull(userType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.Class<?> wildcardClass8 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        boolean boolean9 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Newsletter newsletter16 = null;
        visitor4.unSubscribe(newsletter16);
        boolean boolean18 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        java.lang.String str17 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        java.lang.String str12 = visitor4.getEmail();
        int int13 = visitor4.getId();
        java.lang.String str14 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        boolean boolean11 = visitor4.getValidationStatus();
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, (-1.0d));
        objects.Newsletter newsletter15 = null;
        visitor4.unSubscribe(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        visitor4.addPenalty((double) (short) 0);
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        java.lang.Class<?> wildcardClass14 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.Book book6 = null;
        int int8 = visitor4.sendRequest(book6, true);
        int int9 = visitor4.getId();
        java.lang.String str10 = visitor4.getPassword();
        int int11 = visitor4.getId();
        objects.User.UserType userType12 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(userType12);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        objects.Newsletter newsletter15 = null;
        visitor4.unSubscribe(newsletter15);
        objects.Newsletter newsletter17 = null;
        visitor4.subscribe(newsletter17);
        objects.Newsletter newsletter19 = null;
        visitor4.subscribe(newsletter19);
        visitor4.addPenalty((double) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) -1, "", "", userType3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        java.lang.String str9 = visitor4.getPassword();
        visitor4.addPenalty((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.User.UserType userType10 = visitor4.getUserType();
        boolean boolean11 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter21 = null;
        visitor4.subscribe(newsletter21);
        boolean boolean23 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str24 = visitor4.getPassword();
        boolean boolean25 = visitor4.getValidationStatus();
        java.lang.String str26 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) 1);
        visitor4.setValidationStatus(false);
        objects.PaymentType paymentType13 = null;
        visitor4.addPaymentMethod(paymentType13, 10.0d);
        java.lang.String str16 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        visitor4.addPenalty((double) 0.0f);
        objects.User.UserType userType9 = visitor4.getUserType();
        java.lang.String str10 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        objects.Newsletter newsletter15 = null;
        visitor4.subscribe(newsletter15);
        visitor4.addPenalty((-1.0d));
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList19 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList19);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 10, "hi!", "", userType3);
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        boolean boolean8 = visitor4.moreThanThreeOverdueItems();
        java.lang.Class<?> wildcardClass9 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        java.lang.String str7 = visitor4.getPassword();
        java.lang.String str8 = visitor4.getEmail();
        visitor4.addPenalty(0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        visitor4.addPenalty((double) (-1));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        visitor4.addPenalty((double) 0.0f);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        java.lang.String str13 = visitor4.getPassword();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass8 = borrowingRecordList7.getClass();
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        objects.Book book13 = null;
        int int15 = visitor4.sendRequest(book13, true);
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, false);
        visitor4.addPenalty((double) 1.0f);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        objects.Newsletter newsletter15 = null;
        visitor4.subscribe(newsletter15);
        visitor4.addPenalty((-1.0d));
        java.lang.Class<?> wildcardClass19 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 1, "hi!", "", userType3);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        java.lang.String str7 = visitor4.getEmail();
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        visitor4.setValidationStatus(false);
        objects.PaymentType paymentType12 = null;
        visitor4.addPaymentMethod(paymentType12, 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        boolean boolean14 = visitor4.getValidationStatus();
        objects.Newsletter newsletter15 = null;
        visitor4.unSubscribe(newsletter15);
        java.lang.String str17 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        visitor4.addPenalty((double) (byte) 10);
        boolean boolean21 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType9 = null;
        visitor4.addPaymentMethod(paymentType9, (double) (short) -1);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        visitor4.addPenalty(0.0d);
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        java.lang.Class<?> wildcardClass10 = visitor4.getClass();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType10 = visitor4.getUserType();
        objects.Newsletter newsletter11 = null;
        visitor4.subscribe(newsletter11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter18 = null;
        visitor4.unSubscribe(newsletter18);
        int int20 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(100, "hi!", "hi!", userType3);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        java.lang.String str8 = visitor4.getPassword();
        visitor4.addPenalty((double) (short) 1);
        objects.Newsletter newsletter11 = null;
        visitor4.subscribe(newsletter11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        visitor4.addPenalty((double) 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.lang.String str7 = visitor4.getPassword();
        visitor4.addPenalty((double) 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        int int15 = visitor4.getId();
        java.lang.String str16 = visitor4.getEmail();
        int int17 = visitor4.getId();
        java.lang.String str18 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        visitor4.addPenalty((double) (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.User.UserType userType16 = visitor4.getUserType();
        objects.Book book17 = null;
        int int19 = visitor4.sendRequest(book17, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(userType16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        java.lang.String str5 = visitor4.getPassword();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) 0);
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        objects.Newsletter newsletter20 = null;
        visitor4.subscribe(newsletter20);
        java.lang.String str22 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        objects.Newsletter newsletter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        java.lang.String str8 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(32, "hi!", "", userType3);
        int int5 = visitor4.getId();
        objects.Newsletter newsletter6 = null;
        visitor4.unSubscribe(newsletter6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        int int17 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList18 = visitor4.updateBorrowingRecords();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList18);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 10, "hi!", "", userType3);
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        boolean boolean8 = visitor4.moreThanThreeOverdueItems();
        int int9 = visitor4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        objects.PaymentType paymentType18 = null;
        visitor4.addPaymentMethod(paymentType18, (double) 10);
        visitor4.addPenalty((double) (byte) 0);
        objects.User.UserType userType23 = visitor4.getUserType();
        objects.Newsletter newsletter24 = null;
        visitor4.unSubscribe(newsletter24);
        objects.Newsletter newsletter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertNull(userType23);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.getValidationStatus();
        objects.User.UserType userType21 = visitor4.getUserType();
        objects.Book book22 = null;
        int int24 = visitor4.sendRequest(book22, false);
        java.lang.String str25 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(userType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        visitor4.addPenalty((double) 100);
        java.lang.String str8 = visitor4.getPassword();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType9 = null;
        visitor4.addPaymentMethod(paymentType9, (double) (short) -1);
        visitor4.addPenalty(100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) 1);
        visitor4.addPenalty(0.0d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.Book book6 = null;
        int int8 = visitor4.sendRequest(book6, true);
        int int9 = visitor4.getId();
        java.lang.String str10 = visitor4.getPassword();
        int int11 = visitor4.getId();
        java.lang.String str12 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 10, "hi!", "hi!", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        int int13 = visitor4.getId();
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) 1);
        objects.Newsletter newsletter11 = null;
        visitor4.subscribe(newsletter11);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        visitor4.addPenalty((double) 1.0f);
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        boolean boolean7 = visitor4.getValidationStatus();
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(1, "", "", userType3);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        objects.User.UserType userType6 = visitor4.getUserType();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        visitor4.addPenalty((double) 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        visitor4.addPenalty((double) '4');
        visitor4.addPenalty((double) 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        visitor4.setValidationStatus(true);
        java.lang.String str19 = visitor4.getPassword();
        int int20 = visitor4.getId();
        visitor4.addPenalty((-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.Book book6 = null;
        int int8 = visitor4.sendRequest(book6, true);
        int int9 = visitor4.getId();
        java.lang.String str10 = visitor4.getPassword();
        visitor4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        int int13 = visitor4.getId();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        visitor4.setValidationStatus(false);
        java.lang.String str15 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        visitor4.setValidationStatus(true);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        java.lang.String str11 = visitor4.getPassword();
        visitor4.addPenalty((double) 1.0f);
        java.lang.String str14 = visitor4.getEmail();
        java.lang.String str15 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        int int15 = visitor4.getId();
        int int16 = visitor4.getId();
        objects.Newsletter newsletter17 = null;
        visitor4.unSubscribe(newsletter17);
        int int19 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList20 = visitor4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList21 = visitor4.updateBorrowingRecords();
        boolean boolean22 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList20);
        org.junit.Assert.assertNotNull(borrowingRecordList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        visitor4.addPenalty((double) (byte) 10);
        java.lang.String str21 = visitor4.getEmail();
        boolean boolean22 = visitor4.getValidationStatus();
        int int23 = visitor4.getId();
        objects.Newsletter newsletter24 = null;
        visitor4.subscribe(newsletter24);
        visitor4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "hi!", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Book book8 = null;
        int int10 = visitor4.sendRequest(book8, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        visitor4.addPenalty((double) 0.0f);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        objects.Newsletter newsletter13 = null;
        visitor4.subscribe(newsletter13);
        objects.PaymentType paymentType15 = null;
        visitor4.addPaymentMethod(paymentType15, (double) 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType10 = visitor4.getUserType();
        int int11 = visitor4.getId();
        visitor4.addPenalty((double) (short) -1);
        boolean boolean14 = visitor4.moreThanThreeOverdueItems();
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        visitor4.addPenalty(0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty(1.0d);
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) 10L);
        objects.Newsletter newsletter13 = null;
        visitor4.unSubscribe(newsletter13);
        visitor4.addPenalty((double) 1.0f);
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType9 = null;
        visitor4.addPaymentMethod(paymentType9, (double) (short) -1);
        int int12 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter9 = null;
        visitor4.subscribe(newsletter9);
        visitor4.addPenalty(100.0d);
        boolean boolean13 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "hi!", "", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(borrowingRecordList5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        boolean boolean6 = visitor4.getValidationStatus();
        int int7 = visitor4.getId();
        boolean boolean8 = visitor4.moreThanThreeOverdueItems();
        boolean boolean9 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 0L);
        objects.User.UserType userType8 = visitor4.getUserType();
        java.lang.String str9 = visitor4.getPassword();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        org.junit.Assert.assertNull(userType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.subscribe(newsletter14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.subscribe(newsletter5);
        java.lang.String str7 = visitor4.getEmail();
        objects.User.UserType userType8 = visitor4.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = userType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(userType8);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        visitor4.setValidationStatus(false);
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        visitor4.setValidationStatus(true);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = visitor4.updateBorrowingRecords();
        java.lang.String str13 = visitor4.getEmail();
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertNotNull(borrowingRecordList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        java.lang.String str12 = visitor4.getPassword();
        objects.PaymentType paymentType13 = null;
        visitor4.addPaymentMethod(paymentType13, 0.0d);
        boolean boolean16 = visitor4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty(1.0d);
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) (byte) -1);
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        boolean boolean20 = visitor4.getValidationStatus();
        objects.User.UserType userType21 = visitor4.getUserType();
        objects.Book book22 = null;
        int int24 = visitor4.sendRequest(book22, false);
        objects.PaymentType paymentType25 = null;
        visitor4.addPaymentMethod(paymentType25, (double) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(userType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        int int15 = visitor4.getId();
        int int16 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter18 = null;
        visitor4.unSubscribe(newsletter18);
        int int20 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "hi!", "", userType3);
        visitor4.addPenalty((double) 100);
        java.lang.String str7 = visitor4.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        visitor4.setValidationStatus(true);
        java.lang.String str19 = visitor4.getPassword();
        objects.User.UserType userType20 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(userType20);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        objects.Book book13 = null;
        int int15 = visitor4.sendRequest(book13, true);
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, false);
        objects.User.UserType userType19 = visitor4.getUserType();
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(userType19);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        visitor4.setValidationStatus(true);
        visitor4.setValidationStatus(false);
        visitor4.setValidationStatus(true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        int int10 = visitor4.getId();
        objects.Newsletter newsletter11 = null;
        visitor4.unSubscribe(newsletter11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList15);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        boolean boolean14 = visitor4.getValidationStatus();
        objects.Newsletter newsletter15 = null;
        visitor4.subscribe(newsletter15);
        visitor4.addPenalty((-1.0d));
        boolean boolean19 = visitor4.getValidationStatus();
        objects.User.UserType userType20 = visitor4.getUserType();
        objects.User.UserType userType21 = visitor4.getUserType();
        objects.User.UserType userType22 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(userType20);
        org.junit.Assert.assertNull(userType21);
        org.junit.Assert.assertNull(userType22);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        boolean boolean12 = visitor4.getValidationStatus();
        objects.Newsletter newsletter13 = null;
        visitor4.subscribe(newsletter13);
        int int15 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 1, "", "", userType3);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(1, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) 10.0f);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType17 = null;
        visitor4.addPaymentMethod(paymentType17, (double) (short) 0);
        java.lang.Class<?> wildcardClass20 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        visitor4.addPenalty(0.0d);
        objects.Newsletter newsletter8 = null;
        visitor4.subscribe(newsletter8);
        objects.User.UserType userType10 = visitor4.getUserType();
        boolean boolean11 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.User.UserType userType6 = visitor4.getUserType();
        objects.Newsletter newsletter7 = null;
        visitor4.subscribe(newsletter7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNull(userType6);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList11 = visitor4.updateBorrowingRecords();
        visitor4.setValidationStatus(false);
        objects.PaymentType paymentType14 = null;
        visitor4.addPaymentMethod(paymentType14, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList11);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str17 = visitor4.getEmail();
        objects.Newsletter newsletter18 = null;
        visitor4.unSubscribe(newsletter18);
        java.lang.String str20 = visitor4.getPassword();
        objects.Newsletter newsletter21 = null;
        visitor4.unSubscribe(newsletter21);
        objects.PaymentType paymentType23 = null;
        visitor4.addPaymentMethod(paymentType23, (double) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        visitor4.setValidationStatus(true);
        java.lang.String str19 = visitor4.getPassword();
        int int20 = visitor4.getId();
        objects.Newsletter newsletter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 10, "hi!", "", userType3);
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        objects.Newsletter newsletter7 = null;
        visitor4.subscribe(newsletter7);
        objects.Newsletter newsletter9 = null;
        visitor4.subscribe(newsletter9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 10, "", "hi!", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        boolean boolean17 = visitor4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList18 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList18);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.User.UserType userType6 = visitor4.getUserType();
        visitor4.addPenalty((-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNull(userType6);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 10, "hi!", "", userType3);
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        objects.Book book8 = null;
        int int10 = visitor4.sendRequest(book8, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        int int16 = visitor4.getId();
        visitor4.setValidationStatus(true);
        java.lang.String str19 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList20 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList20);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        int int13 = visitor4.getId();
        visitor4.addPenalty((double) (-1L));
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.lang.Class<?> wildcardClass17 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        java.lang.String str16 = visitor4.getPassword();
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        objects.User.UserType userType6 = visitor4.getUserType();
        java.lang.String str7 = visitor4.getPassword();
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        visitor4.addPenalty((double) 0.0f);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        objects.Newsletter newsletter9 = null;
        visitor4.unSubscribe(newsletter9);
        objects.User.UserType userType11 = visitor4.getUserType();
        objects.Newsletter newsletter12 = null;
        visitor4.subscribe(newsletter12);
        visitor4.addPenalty((double) (byte) 0);
        boolean boolean16 = visitor4.getValidationStatus();
        org.junit.Assert.assertNull(userType11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        java.lang.String str9 = visitor4.getPassword();
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = visitor4.updateBorrowingRecords();
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 1, "", "", userType3);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        visitor4.addPenalty((double) (byte) 10);
        java.lang.String str21 = visitor4.getPassword();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 0, "", "hi!", userType3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str17 = visitor4.getEmail();
        int int18 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList19 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList19);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType17 = visitor4.getUserType();
        objects.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
        org.junit.Assert.assertNull(userType17);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        visitor4.unSubscribe(newsletter12);
        visitor4.addPenalty((double) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) 1);
        java.lang.String str11 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.User.UserType userType16 = visitor4.getUserType();
        int int17 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(userType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        visitor4.addPenalty((double) (-1.0f));
        objects.PaymentType paymentType13 = null;
        visitor4.addPaymentMethod(paymentType13, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        java.lang.String str8 = visitor4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Newsletter newsletter11 = null;
        visitor4.subscribe(newsletter11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        java.lang.String str12 = visitor4.getEmail();
        objects.Book book13 = null;
        int int15 = visitor4.sendRequest(book13, false);
        objects.Newsletter newsletter16 = null;
        visitor4.subscribe(newsletter16);
        visitor4.setValidationStatus(true);
        objects.PaymentType paymentType20 = null;
        visitor4.addPaymentMethod(paymentType20, (double) (short) 10);
        visitor4.addPenalty((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 0, "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = visitor4.updateBorrowingRecords();
        visitor4.addPenalty((double) 0.0f);
        objects.User.UserType userType9 = visitor4.getUserType();
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        java.lang.String str12 = visitor4.getPassword();
        objects.User.UserType userType13 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(userType13);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = visitor4.getPassword();
        visitor4.addPenalty((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "", "hi!", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        objects.Newsletter newsletter6 = null;
        visitor4.subscribe(newsletter6);
        visitor4.addPenalty(1.0d);
        objects.PaymentType paymentType10 = null;
        visitor4.addPaymentMethod(paymentType10, (double) (byte) -1);
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        visitor4.unSubscribe(newsletter15);
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (byte) -1);
        visitor4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.moreThanThreeOverdueItems();
        int int6 = visitor4.getId();
        objects.Newsletter newsletter7 = null;
        visitor4.unSubscribe(newsletter7);
        int int9 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "hi!", "hi!", userType3);
        int int5 = visitor4.getId();
        objects.User.UserType userType6 = visitor4.getUserType();
        objects.Book book7 = null;
        int int9 = visitor4.sendRequest(book7, false);
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) 1);
        visitor4.setValidationStatus(false);
        objects.PaymentType paymentType13 = null;
        visitor4.addPaymentMethod(paymentType13, 0.0d);
        visitor4.setValidationStatus(true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) 'a');
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.User.UserType userType16 = visitor4.getUserType();
        java.lang.Class<?> wildcardClass17 = visitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(userType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        boolean boolean6 = visitor4.getValidationStatus();
        visitor4.setValidationStatus(true);
        objects.Newsletter newsletter9 = null;
        visitor4.unSubscribe(newsletter9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(32, "", "", userType3);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) -1, "hi!", "", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) 1);
        visitor4.setValidationStatus(false);
        java.lang.String str13 = visitor4.getEmail();
        visitor4.addPenalty(0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        objects.Newsletter newsletter7 = null;
        visitor4.subscribe(newsletter7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        java.lang.String str8 = visitor4.getPassword();
        int int9 = visitor4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter11 = null;
        visitor4.subscribe(newsletter11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, false);
        objects.Newsletter newsletter19 = null;
        visitor4.unSubscribe(newsletter19);
        objects.PaymentType paymentType21 = null;
        visitor4.addPaymentMethod(paymentType21, (double) 1L);
        boolean boolean24 = visitor4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.User.UserType userType5 = visitor4.getUserType();
        org.junit.Assert.assertNull(userType5);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        visitor4.setValidationStatus(true);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = visitor4.updateBorrowingRecords();
        java.lang.String str10 = visitor4.getPassword();
        objects.PaymentType paymentType11 = null;
        visitor4.addPaymentMethod(paymentType11, (double) 1);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        java.lang.String str14 = visitor4.getPassword();
        java.lang.String str15 = visitor4.getEmail();
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, true);
        visitor4.addPenalty((double) (byte) 10);
        java.lang.String str21 = visitor4.getEmail();
        objects.User.UserType userType22 = visitor4.getUserType();
        objects.User.UserType userType23 = visitor4.getUserType();
        objects.PaymentType paymentType24 = null;
        visitor4.addPaymentMethod(paymentType24, (double) 'a');
        java.lang.String str27 = visitor4.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(userType22);
        org.junit.Assert.assertNull(userType23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        visitor4.addPaymentMethod(paymentType5, (double) '4');
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) 1);
        visitor4.setValidationStatus(false);
        java.lang.String str13 = visitor4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = visitor4.updateBorrowingRecords();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList14);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (short) 100, "hi!", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = visitor4.getPassword();
        java.lang.String str6 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        objects.Newsletter newsletter7 = null;
        visitor4.subscribe(newsletter7);
        visitor4.setValidationStatus(true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str8 = visitor4.getPassword();
        objects.Book book9 = null;
        int int11 = visitor4.sendRequest(book9, false);
        visitor4.addPenalty((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        java.lang.String str12 = visitor4.getPassword();
        objects.PaymentType paymentType13 = null;
        visitor4.addPaymentMethod(paymentType13, 0.0d);
        objects.PaymentType paymentType16 = null;
        visitor4.addPaymentMethod(paymentType16, 100.0d);
        objects.PaymentType paymentType19 = null;
        visitor4.addPaymentMethod(paymentType19, 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) ' ', "", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        visitor4.setValidationStatus(true);
        java.lang.String str8 = visitor4.getEmail();
        visitor4.addPenalty(0.0d);
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        int int8 = visitor4.getId();
        int int9 = visitor4.getId();
        visitor4.setValidationStatus(false);
        objects.User.UserType userType12 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(userType12);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        int int5 = visitor4.getId();
        boolean boolean6 = visitor4.getValidationStatus();
        objects.User.UserType userType7 = visitor4.getUserType();
        visitor4.setValidationStatus(false);
        objects.Book book10 = null;
        int int12 = visitor4.sendRequest(book10, false);
        boolean boolean13 = visitor4.getValidationStatus();
        objects.Book book14 = null;
        int int16 = visitor4.sendRequest(book14, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        objects.Book book16 = null;
        int int18 = visitor4.sendRequest(book16, false);
        objects.Newsletter newsletter19 = null;
        visitor4.unSubscribe(newsletter19);
        objects.Newsletter newsletter21 = null;
        visitor4.subscribe(newsletter21);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList23 = visitor4.updateBorrowingRecords();
        objects.User.UserType userType24 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList23);
        org.junit.Assert.assertNull(userType24);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        boolean boolean5 = visitor4.getValidationStatus();
        int int6 = visitor4.getId();
        int int7 = visitor4.getId();
        objects.PaymentType paymentType8 = null;
        visitor4.addPaymentMethod(paymentType8, (double) (byte) 10);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList11 = visitor4.updateBorrowingRecords();
        objects.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList11);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((-1), "hi!", "hi!", userType3);
        java.lang.String str5 = visitor4.getEmail();
        boolean boolean6 = visitor4.moreThanThreeOverdueItems();
        java.lang.String str7 = visitor4.getPassword();
        objects.Book book8 = null;
        int int10 = visitor4.sendRequest(book8, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        visitor4.unSubscribe(newsletter10);
        int int12 = visitor4.getId();
        boolean boolean13 = visitor4.moreThanThreeOverdueItems();
        visitor4.setValidationStatus(false);
        visitor4.addPenalty((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(0, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        visitor4.unSubscribe(newsletter5);
        boolean boolean7 = visitor4.moreThanThreeOverdueItems();
        objects.Book book8 = null;
        int int10 = visitor4.sendRequest(book8, false);
        objects.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor4.visit(newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) (byte) 100, "hi!", "", userType3);
        java.lang.String str5 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        java.lang.String str12 = visitor4.getEmail();
        objects.User.UserType userType13 = visitor4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(userType13);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        boolean boolean10 = visitor4.getValidationStatus();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        visitor4.addPenalty((double) 10);
        boolean boolean16 = visitor4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = visitor4.updateBorrowingRecords();
        objects.PaymentType paymentType18 = null;
        visitor4.addPaymentMethod(paymentType18, (double) 10);
        visitor4.addPenalty((double) (byte) 0);
        objects.PaymentType paymentType23 = null;
        visitor4.addPaymentMethod(paymentType23, (double) '4');
        int int26 = visitor4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        visitor4.setValidationStatus(true);
        java.lang.String str12 = visitor4.getEmail();
        objects.Book book13 = null;
        int int15 = visitor4.sendRequest(book13, false);
        objects.Newsletter newsletter16 = null;
        visitor4.subscribe(newsletter16);
        visitor4.setValidationStatus(true);
        visitor4.setValidationStatus(false);
        java.lang.String str22 = visitor4.getPassword();
        objects.Book book23 = null;
        int int25 = visitor4.sendRequest(book23, true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = visitor4.sendRequest(book5, false);
        objects.Newsletter newsletter8 = null;
        visitor4.unSubscribe(newsletter8);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = visitor4.updateBorrowingRecords();
        objects.Book book11 = null;
        int int13 = visitor4.sendRequest(book11, true);
        objects.Newsletter newsletter14 = null;
        visitor4.unSubscribe(newsletter14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        objects.User.UserType userType3 = null;
        objects.Visitor visitor4 = new objects.Visitor(10, "hi!", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = visitor4.updateBorrowingRecords();
        objects.PaymentType paymentType6 = null;
        visitor4.addPaymentMethod(paymentType6, (double) (short) 0);
        org.junit.Assert.assertNotNull(borrowingRecordList5);
    }
}

