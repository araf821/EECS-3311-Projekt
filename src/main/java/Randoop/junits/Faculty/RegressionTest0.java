package Randoop.junits.Faculty;

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
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList6 = faculty4.getCoursesTeaching();
        java.lang.Class<?> wildcardClass7 = courseList6.getClass();
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) ' ', "hi!", "hi!", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        java.lang.Class<?> wildcardClass6 = courseList5.getClass();
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, 0.0d);
        objects.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.lang.String str8 = faculty4.getPassword();
        java.lang.String str9 = faculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) 100.0f);
        faculty4.addPenalty((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        objects.Newsletter newsletter9 = null;
        faculty4.unSubscribe(newsletter9);
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) 100.0f);
        faculty4.update();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList6 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList10 = faculty4.getCoursesTeaching();
        boolean boolean11 = faculty4.getValidationStatus();
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        objects.User.UserType userType7 = faculty4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(userType7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "", "", userType3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.Book> bookList6 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        java.util.ArrayList<objects.Course> courseList10 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.lang.String str8 = faculty4.getPassword();
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((-1), "hi!", "", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        java.lang.Class<?> wildcardClass6 = courseList5.getClass();
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        objects.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        objects.User.UserType userType12 = faculty4.getUserType();
        objects.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(userType12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.Book> bookList16 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.lang.String str14 = faculty4.getPassword();
        objects.Newsletter newsletter15 = null;
        faculty4.subscribe(newsletter15);
        objects.Newsletter newsletter17 = null;
        faculty4.unSubscribe(newsletter17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        faculty4.setValidationStatus(true);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.update();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        int int6 = faculty4.getId();
        boolean boolean7 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass7 = borrowingRecordList6.getClass();
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        faculty4.addPenalty((double) (-1.0f));
        faculty4.addPenalty(1.0d);
        faculty4.setValidationStatus(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        faculty4.update();
        faculty4.setValidationStatus(true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList10 = faculty4.getCoursesTeaching();
        boolean boolean11 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 0, "", "", userType3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList6 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter7 = null;
        faculty4.unSubscribe(newsletter7);
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        faculty4.update();
        java.lang.String str6 = faculty4.getEmail();
        objects.Newsletter newsletter7 = null;
        faculty4.subscribe(newsletter7);
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) 100);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter13 = null;
        faculty4.subscribe(newsletter13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        faculty4.setValidationStatus(true);
        java.lang.String str14 = faculty4.getPassword();
        java.util.ArrayList<objects.Book> bookList15 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        faculty4.setValidationStatus(true);
        java.lang.String str14 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass15 = faculty4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.addPenalty((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        objects.User.UserType userType14 = faculty4.getUserType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(userType14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.moreThanThreeOverdueItems();
        objects.User.UserType userType11 = faculty4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(userType11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        int int10 = faculty4.getId();
        boolean boolean11 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        faculty4.setValidationStatus(true);
        faculty4.addPenalty((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        boolean boolean11 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str12 = faculty4.getEmail();
        faculty4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getEmail();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.lang.String str14 = faculty4.getPassword();
        objects.Book book15 = null;
        int int17 = faculty4.sendRequest(book15, false);
        boolean boolean18 = faculty4.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        objects.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        faculty4.addPenalty((double) 100);
        objects.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) '4', "hi!", "", userType3);
        faculty4.setValidationStatus(false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.lang.String str14 = faculty4.getPassword();
        objects.Newsletter newsletter15 = null;
        faculty4.subscribe(newsletter15);
        faculty4.setValidationStatus(false);
        java.lang.Class<?> wildcardClass19 = faculty4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        objects.PaymentType paymentType14 = null;
        faculty4.addPaymentMethod(paymentType14, (double) 100.0f);
        java.lang.Class<?> wildcardClass17 = faculty4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        boolean boolean10 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Course> courseList11 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        objects.Newsletter newsletter11 = null;
        faculty4.subscribe(newsletter11);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        java.lang.String str10 = faculty4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        int int9 = faculty4.getId();
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "hi!", "", userType3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        faculty4.addPenalty((double) (short) 100);
        objects.Newsletter newsletter14 = null;
        faculty4.unSubscribe(newsletter14);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.moreThanThreeOverdueItems();
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = faculty4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        objects.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, 0.0d);
        objects.Newsletter newsletter12 = null;
        faculty4.unSubscribe(newsletter12);
        int int14 = faculty4.getId();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        objects.PaymentType paymentType10 = null;
        faculty4.addPaymentMethod(paymentType10, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        java.lang.String str11 = faculty4.getPassword();
        java.util.ArrayList<objects.Book> bookList12 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Newsletter newsletter7 = null;
        faculty4.unSubscribe(newsletter7);
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (-1.0f));
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        faculty4.addPaymentMethod(paymentType5, (double) (short) 100);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        java.util.ArrayList<objects.Course> courseList12 = faculty4.getCoursesTeaching();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList13 = faculty4.updateBorrowingRecords();
        int int14 = faculty4.getId();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(borrowingRecordList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        faculty4.setValidationStatus(true);
        faculty4.setValidationStatus(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        faculty4.addPaymentMethod(paymentType5, (double) (short) 100);
        boolean boolean8 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        java.lang.Class<?> wildcardClass6 = faculty4.getClass();
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        objects.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        int int6 = faculty4.getId();
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        faculty4.addPenalty((double) 'a');
        java.lang.String str13 = faculty4.getEmail();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty((double) '#');
        faculty4.setValidationStatus(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) ' ', "hi!", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "hi!", "", userType3);
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) ' ', "hi!", "hi!", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        faculty4.addPenalty((double) '4');
        org.junit.Assert.assertNotNull(courseList5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, true);
        objects.Newsletter newsletter8 = null;
        faculty4.subscribe(newsletter8);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        java.lang.String str9 = faculty4.getEmail();
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        java.lang.String str12 = faculty4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 100, "", "", userType3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 10, "hi!", "", userType3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter7 = null;
        faculty4.subscribe(newsletter7);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.lang.String str14 = faculty4.getPassword();
        objects.User.UserType userType15 = faculty4.getUserType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(userType15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.lang.Class<?> wildcardClass14 = faculty4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Course> courseList8 = faculty4.getCoursesTeaching();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) ' ', "hi!", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        boolean boolean11 = faculty4.getValidationStatus();
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, true);
        java.util.ArrayList<objects.Book> bookList10 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        boolean boolean11 = faculty4.moreThanThreeOverdueItems();
        objects.User.UserType userType12 = faculty4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(userType12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        java.lang.String str8 = faculty4.getPassword();
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (short) 10);
        java.lang.String str12 = faculty4.getEmail();
        faculty4.update();
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList6 = faculty4.getCoursesTeaching();
        faculty4.addPenalty(100.0d);
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList6 = faculty4.getCoursesTeaching();
        boolean boolean7 = faculty4.getValidationStatus();
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        int int9 = faculty4.getId();
        faculty4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.getValidationStatus();
        int int11 = faculty4.getId();
        objects.Newsletter newsletter12 = null;
        faculty4.subscribe(newsletter12);
        faculty4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = faculty4.updateBorrowingRecords();
        java.lang.String str11 = faculty4.getPassword();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.getValidationStatus();
        int int11 = faculty4.getId();
        objects.Newsletter newsletter12 = null;
        faculty4.subscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) ' ', "hi!", "", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        java.lang.String str6 = faculty4.getPassword();
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "", "hi!", userType3);
        objects.PaymentType paymentType5 = null;
        faculty4.addPaymentMethod(paymentType5, (double) (short) 100);
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty((double) '#');
        boolean boolean18 = faculty4.getValidationStatus();
        boolean boolean19 = faculty4.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Course> courseList8 = faculty4.getCoursesTeaching();
        java.lang.Class<?> wildcardClass9 = courseList8.getClass();
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        objects.User.UserType userType10 = faculty4.getUserType();
        faculty4.addPenalty(1.0d);
        boolean boolean13 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str14 = faculty4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        faculty4.setValidationStatus(true);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = faculty4.updateBorrowingRecords();
        boolean boolean15 = faculty4.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        java.lang.Class<?> wildcardClass9 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        objects.Newsletter newsletter12 = null;
        faculty4.subscribe(newsletter12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((-1), "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        faculty4.subscribe(newsletter5);
        boolean boolean7 = faculty4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        boolean boolean14 = faculty4.moreThanThreeOverdueItems();
        objects.Book book15 = null;
        int int17 = faculty4.sendRequest(book15, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        objects.Newsletter newsletter9 = null;
        faculty4.unSubscribe(newsletter9);
        objects.Newsletter newsletter11 = null;
        faculty4.subscribe(newsletter11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        objects.User.UserType userType6 = faculty4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "hi!", "", userType3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        faculty4.addPenalty((double) (-1.0f));
        faculty4.addPenalty(1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(1, "hi!", "hi!", userType3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.String str8 = faculty4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) 100.0f);
        java.lang.String str9 = faculty4.getPassword();
        objects.User.UserType userType10 = faculty4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        java.lang.String str5 = faculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Newsletter newsletter7 = null;
        faculty4.unSubscribe(newsletter7);
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (-1.0f));
        objects.Newsletter newsletter12 = null;
        faculty4.unSubscribe(newsletter12);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 1, "", "hi!", userType3);
        faculty4.update();
        boolean boolean6 = faculty4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(10, "", "", userType3);
        objects.Newsletter newsletter5 = null;
        faculty4.unSubscribe(newsletter5);
        faculty4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, true);
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        faculty4.addPenalty((double) (short) 100);
        int int14 = faculty4.getId();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        objects.User.UserType userType8 = faculty4.getUserType();
        objects.User.UserType userType9 = faculty4.getUserType();
        objects.Newsletter newsletter10 = null;
        faculty4.subscribe(newsletter10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(userType8);
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        faculty4.unSubscribe(newsletter5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        boolean boolean10 = faculty4.getValidationStatus();
        java.lang.String str11 = faculty4.getEmail();
        java.util.ArrayList<objects.Course> courseList12 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        faculty4.addPenalty((double) 'a');
        objects.Newsletter newsletter13 = null;
        faculty4.subscribe(newsletter13);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        objects.Newsletter newsletter9 = null;
        faculty4.unSubscribe(newsletter9);
        objects.Book book11 = null;
        int int13 = faculty4.sendRequest(book11, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        int int7 = faculty4.getId();
        faculty4.addPenalty((double) 97);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        int int7 = faculty4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.Book> bookList6 = faculty4.getUsedTextbooks();
        java.lang.String str7 = faculty4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(borrowingRecordList12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        faculty4.addPenalty((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        objects.User.UserType userType8 = faculty4.getUserType();
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        objects.Newsletter newsletter12 = null;
        faculty4.subscribe(newsletter12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(userType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(10, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass7 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        faculty4.addPenalty((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        faculty4.update();
        java.lang.String str6 = faculty4.getEmail();
        objects.Newsletter newsletter7 = null;
        faculty4.subscribe(newsletter7);
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        java.lang.Class<?> wildcardClass11 = faculty4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 100, "hi!", "", userType3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        faculty4.addPenalty((double) 0L);
        java.lang.String str8 = faculty4.getPassword();
        boolean boolean9 = faculty4.moreThanThreeOverdueItems();
        boolean boolean10 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getEmail();
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        faculty4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType13 = null;
        faculty4.addPaymentMethod(paymentType13, (-1.0d));
        boolean boolean16 = faculty4.getValidationStatus();
        objects.Newsletter newsletter17 = null;
        faculty4.unSubscribe(newsletter17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        boolean boolean10 = faculty4.getValidationStatus();
        objects.Newsletter newsletter11 = null;
        faculty4.unSubscribe(newsletter11);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Course> courseList8 = faculty4.getCoursesTeaching();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, 0.0d);
        objects.Newsletter newsletter12 = null;
        faculty4.unSubscribe(newsletter12);
        java.util.ArrayList<objects.Course> courseList14 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList17);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        faculty4.addPenalty((double) 0L);
        java.lang.String str8 = faculty4.getPassword();
        boolean boolean9 = faculty4.moreThanThreeOverdueItems();
        int int10 = faculty4.getId();
        java.lang.String str11 = faculty4.getPassword();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        boolean boolean10 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        objects.PaymentType paymentType12 = null;
        faculty4.addPaymentMethod(paymentType12, (double) (short) -1);
        objects.User.UserType userType15 = faculty4.getUserType();
        java.lang.String str16 = faculty4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(userType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getEmail();
        int int8 = faculty4.getId();
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        java.util.ArrayList<objects.Course> courseList12 = faculty4.getCoursesTeaching();
        boolean boolean13 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        java.util.ArrayList<objects.Course> courseList10 = faculty4.getCoursesTeaching();
        objects.Book book11 = null;
        int int13 = faculty4.sendRequest(book11, false);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = faculty4.updateBorrowingRecords();
        objects.PaymentType paymentType11 = null;
        faculty4.addPaymentMethod(paymentType11, (double) 0);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(100, "hi!", "hi!", userType3);
        java.lang.Class<?> wildcardClass5 = faculty4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.update();
        boolean boolean8 = faculty4.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        faculty4.addPenalty((double) (short) 100);
        objects.Newsletter newsletter14 = null;
        faculty4.subscribe(newsletter14);
        objects.User.UserType userType16 = faculty4.getUserType();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(userType16);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        objects.PaymentType paymentType8 = null;
        faculty4.addPaymentMethod(paymentType8, (double) 0L);
        faculty4.addPenalty((double) (-1L));
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        java.lang.String str7 = faculty4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty((double) '#');
        boolean boolean18 = faculty4.getValidationStatus();
        java.lang.String str19 = faculty4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 100, "", "hi!", userType3);
        int int5 = faculty4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        objects.User.UserType userType7 = faculty4.getUserType();
        objects.Newsletter newsletter8 = null;
        faculty4.subscribe(newsletter8);
        faculty4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 1, "hi!", "hi!", userType3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList10 = faculty4.getCoursesTeaching();
        boolean boolean11 = faculty4.getValidationStatus();
        objects.Newsletter newsletter12 = null;
        faculty4.unSubscribe(newsletter12);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 0, "", "", userType3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        int int8 = faculty4.getId();
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty(1.0d);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = faculty4.updateBorrowingRecords();
        boolean boolean9 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str10 = faculty4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Newsletter newsletter7 = null;
        faculty4.unSubscribe(newsletter7);
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.getValidationStatus();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        objects.User.UserType userType10 = faculty4.getUserType();
        java.lang.String str11 = faculty4.getPassword();
        java.lang.String str12 = faculty4.getEmail();
        int int13 = faculty4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList11 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Course> courseList8 = faculty4.getCoursesTeaching();
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (-1L));
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = faculty4.updateBorrowingRecords();
        java.lang.String str15 = faculty4.getPassword();
        boolean boolean16 = faculty4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter17 = null;
        faculty4.subscribe(newsletter17);
        java.lang.String str19 = faculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        java.lang.String str10 = faculty4.getPassword();
        java.lang.String str11 = faculty4.getPassword();
        objects.User.UserType userType12 = faculty4.getUserType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(userType12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 0, "hi!", "hi!", userType3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        java.lang.String str15 = faculty4.getEmail();
        objects.Newsletter newsletter16 = null;
        faculty4.subscribe(newsletter16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        objects.Newsletter newsletter8 = null;
        faculty4.unSubscribe(newsletter8);
        int int10 = faculty4.getId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        java.lang.String str8 = faculty4.getPassword();
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, 0.0d);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) 100.0f);
        java.lang.String str9 = faculty4.getPassword();
        faculty4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getEmail();
        faculty4.addPenalty((double) 100);
        faculty4.update();
        objects.PaymentType paymentType11 = null;
        faculty4.addPaymentMethod(paymentType11, (double) 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        objects.Newsletter newsletter7 = null;
        faculty4.unSubscribe(newsletter7);
        java.lang.String str9 = faculty4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        boolean boolean17 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Course> courseList18 = faculty4.getCoursesTeaching();
        java.util.ArrayList<objects.Book> bookList19 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) '4', "hi!", "", userType3);
        objects.User.UserType userType5 = faculty4.getUserType();
        java.lang.String str6 = faculty4.getEmail();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(10, "", "", userType3);
        objects.Newsletter newsletter5 = null;
        faculty4.unSubscribe(newsletter5);
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 0, "hi!", "hi!", userType3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        objects.Book book17 = null;
        int int19 = faculty4.sendRequest(book17, true);
        java.lang.String str20 = faculty4.getPassword();
        boolean boolean21 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList22 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList22);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        boolean boolean11 = faculty4.getValidationStatus();
        objects.User.UserType userType12 = faculty4.getUserType();
        boolean boolean13 = faculty4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter14 = null;
        faculty4.unSubscribe(newsletter14);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(userType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty((double) '#');
        boolean boolean18 = faculty4.getValidationStatus();
        objects.Newsletter newsletter19 = null;
        faculty4.unSubscribe(newsletter19);
        objects.Newsletter newsletter21 = null;
        faculty4.unSubscribe(newsletter21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        faculty4.update();
        java.lang.String str10 = faculty4.getEmail();
        objects.PaymentType paymentType11 = null;
        faculty4.addPaymentMethod(paymentType11, (double) (short) 1);
        faculty4.addPenalty((double) (-1.0f));
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        faculty4.addPenalty((double) (-1.0f));
        faculty4.addPenalty(1.0d);
        int int14 = faculty4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) 0L);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        faculty4.update();
        java.lang.String str6 = faculty4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        faculty4.addPenalty((double) 10.0f);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.getValidationStatus();
        int int11 = faculty4.getId();
        java.lang.String str12 = faculty4.getPassword();
        faculty4.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        boolean boolean6 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Course> courseList7 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(courseList7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) '#', "hi!", "", userType3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        java.lang.String str8 = faculty4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.lang.String str14 = faculty4.getPassword();
        objects.Newsletter newsletter15 = null;
        faculty4.subscribe(newsletter15);
        faculty4.setValidationStatus(false);
        java.lang.String str19 = faculty4.getEmail();
        objects.Book book20 = null;
        int int22 = faculty4.sendRequest(book20, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "hi!", userType3);
        java.lang.String str5 = faculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(100, "", "hi!", userType3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Course> courseList8 = faculty4.getCoursesTeaching();
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (short) 1);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        faculty4.addPenalty((double) 0L);
        java.lang.String str8 = faculty4.getPassword();
        objects.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.addPenalty((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, true);
        objects.Newsletter newsletter8 = null;
        faculty4.subscribe(newsletter8);
        java.lang.Class<?> wildcardClass10 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        faculty4.update();
        java.lang.String str6 = faculty4.getEmail();
        objects.Newsletter newsletter7 = null;
        faculty4.subscribe(newsletter7);
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        int int11 = faculty4.getId();
        objects.Newsletter newsletter12 = null;
        faculty4.unSubscribe(newsletter12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((-1), "hi!", "", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, false);
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) 100.0f);
        objects.Newsletter newsletter9 = null;
        faculty4.unSubscribe(newsletter9);
        objects.Book book11 = null;
        int int13 = faculty4.sendRequest(book11, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty(1.0d);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = faculty4.updateBorrowingRecords();
        boolean boolean9 = faculty4.moreThanThreeOverdueItems();
        objects.User.UserType userType10 = faculty4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((-1), "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        faculty4.subscribe(newsletter5);
        java.lang.String str7 = faculty4.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.update();
        boolean boolean8 = faculty4.moreThanThreeOverdueItems();
        objects.User.UserType userType9 = faculty4.getUserType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Newsletter newsletter7 = null;
        faculty4.unSubscribe(newsletter7);
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (-1.0f));
        objects.PaymentType paymentType12 = null;
        faculty4.addPaymentMethod(paymentType12, (double) (short) -1);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 10, "", "", userType3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = faculty4.updateBorrowingRecords();
        java.lang.String str15 = faculty4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter17 = null;
        faculty4.unSubscribe(newsletter17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList16);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        boolean boolean10 = faculty4.getValidationStatus();
        java.lang.String str11 = faculty4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(borrowingRecordList12);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        boolean boolean13 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str14 = faculty4.getPassword();
        java.lang.String str15 = faculty4.getPassword();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        faculty4.addPenalty((double) 100);
        objects.User.UserType userType7 = faculty4.getUserType();
        objects.User.UserType userType8 = faculty4.getUserType();
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertNull(userType8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        java.util.ArrayList<objects.Course> courseList9 = faculty4.getCoursesTeaching();
        objects.PaymentType paymentType10 = null;
        faculty4.addPaymentMethod(paymentType10, (double) (byte) 10);
        objects.Book book13 = null;
        int int15 = faculty4.sendRequest(book13, false);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        objects.Newsletter newsletter9 = null;
        faculty4.unSubscribe(newsletter9);
        java.lang.String str11 = faculty4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        objects.Book book17 = null;
        int int19 = faculty4.sendRequest(book17, true);
        java.lang.String str20 = faculty4.getPassword();
        boolean boolean21 = faculty4.moreThanThreeOverdueItems();
        int int22 = faculty4.getId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        objects.PaymentType paymentType8 = null;
        faculty4.addPaymentMethod(paymentType8, (double) '#');
        org.junit.Assert.assertNotNull(courseList5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 1, "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        faculty4.update();
        java.lang.String str10 = faculty4.getEmail();
        objects.PaymentType paymentType11 = null;
        faculty4.addPaymentMethod(paymentType11, (double) (short) 1);
        java.util.ArrayList<objects.Course> courseList14 = faculty4.getCoursesTeaching();
        objects.PaymentType paymentType15 = null;
        faculty4.addPaymentMethod(paymentType15, (double) 97);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(0, "hi!", "hi!", userType3);
        faculty4.addPenalty((double) 100);
        objects.User.UserType userType7 = faculty4.getUserType();
        objects.Book book8 = null;
        int int10 = faculty4.sendRequest(book8, true);
        org.junit.Assert.assertNull(userType7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        objects.PaymentType paymentType10 = null;
        faculty4.addPaymentMethod(paymentType10, 0.0d);
        faculty4.addPenalty(0.0d);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        objects.PaymentType paymentType13 = null;
        faculty4.addPaymentMethod(paymentType13, (-1.0d));
        java.util.ArrayList<objects.Book> bookList16 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty(1.0d);
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter16 = null;
        faculty4.unSubscribe(newsletter16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) '4', "", "hi!", userType3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, true);
        objects.Newsletter newsletter8 = null;
        faculty4.subscribe(newsletter8);
        java.lang.String str10 = faculty4.getEmail();
        boolean boolean11 = faculty4.getValidationStatus();
        objects.Book book12 = null;
        int int14 = faculty4.sendRequest(book12, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.Book> bookList6 = faculty4.getUsedTextbooks();
        faculty4.addPenalty((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        faculty4.addPenalty((double) (short) 100);
        objects.Newsletter newsletter14 = null;
        faculty4.subscribe(newsletter14);
        java.util.ArrayList<objects.Course> courseList16 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        java.lang.Class<?> wildcardClass12 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, true);
        objects.Newsletter newsletter8 = null;
        faculty4.subscribe(newsletter8);
        java.lang.String str10 = faculty4.getEmail();
        int int11 = faculty4.getId();
        int int12 = faculty4.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.moreThanThreeOverdueItems();
        objects.Book book14 = null;
        int int16 = faculty4.sendRequest(book14, false);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        objects.Book book17 = null;
        int int19 = faculty4.sendRequest(book17, true);
        java.lang.String str20 = faculty4.getPassword();
        boolean boolean21 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.Course> courseList22 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(courseList22);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        java.lang.String str10 = faculty4.getPassword();
        java.util.ArrayList<objects.Book> bookList11 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        java.lang.String str9 = faculty4.getEmail();
        objects.Newsletter newsletter10 = null;
        faculty4.subscribe(newsletter10);
        java.lang.String str12 = faculty4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        int int6 = faculty4.getId();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        java.util.ArrayList<objects.Course> courseList12 = faculty4.getCoursesTeaching();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList13 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter14 = null;
        faculty4.unSubscribe(newsletter14);
        objects.User.UserType userType16 = faculty4.getUserType();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(borrowingRecordList13);
        org.junit.Assert.assertNull(userType16);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        faculty4.update();
        java.lang.String str6 = faculty4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Course> courseList9 = faculty4.getCoursesTeaching();
        java.util.ArrayList<objects.Book> bookList10 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 100, "", "hi!", userType3);
        faculty4.addPenalty((double) (byte) -1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        java.util.ArrayList<objects.Book> bookList12 = faculty4.getUsedTextbooks();
        objects.User.UserType userType13 = faculty4.getUserType();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(userType13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) 100.0f);
        objects.Newsletter newsletter9 = null;
        faculty4.unSubscribe(newsletter9);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList11 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        objects.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        boolean boolean10 = faculty4.getValidationStatus();
        faculty4.addPenalty((double) (short) 0);
        objects.Book book13 = null;
        int int15 = faculty4.sendRequest(book13, false);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Course> courseList8 = faculty4.getCoursesTeaching();
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (-1L));
        objects.Book book12 = null;
        int int14 = faculty4.sendRequest(book12, true);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        objects.PaymentType paymentType14 = null;
        faculty4.addPaymentMethod(paymentType14, (double) 100.0f);
        java.lang.String str17 = faculty4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList18 = faculty4.updateBorrowingRecords();
        objects.PaymentType paymentType19 = null;
        faculty4.addPaymentMethod(paymentType19, (double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList18);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        objects.PaymentType paymentType8 = null;
        faculty4.addPaymentMethod(paymentType8, (double) (byte) 0);
        objects.Book book11 = null;
        int int13 = faculty4.sendRequest(book11, false);
        boolean boolean14 = faculty4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        boolean boolean11 = faculty4.getValidationStatus();
        objects.User.UserType userType12 = faculty4.getUserType();
        boolean boolean13 = faculty4.moreThanThreeOverdueItems();
        java.lang.Class<?> wildcardClass14 = faculty4.getClass();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(userType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.Course> courseList6 = faculty4.getCoursesTeaching();
        faculty4.addPenalty(100.0d);
        objects.Newsletter newsletter9 = null;
        faculty4.unSubscribe(newsletter9);
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        objects.Book book12 = null;
        int int14 = faculty4.sendRequest(book12, false);
        objects.Newsletter newsletter15 = null;
        faculty4.subscribe(newsletter15);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, true);
        objects.PaymentType paymentType10 = null;
        faculty4.addPaymentMethod(paymentType10, (double) (-1L));
        objects.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str8 = faculty4.getEmail();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty((double) '#');
        boolean boolean18 = faculty4.getValidationStatus();
        objects.Newsletter newsletter19 = null;
        faculty4.unSubscribe(newsletter19);
        java.lang.String str21 = faculty4.getEmail();
        faculty4.update();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter8 = null;
        faculty4.unSubscribe(newsletter8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList7);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        objects.Book book17 = null;
        int int19 = faculty4.sendRequest(book17, true);
        objects.PaymentType paymentType20 = null;
        faculty4.addPaymentMethod(paymentType20, (-1.0d));
        java.lang.String str23 = faculty4.getEmail();
        objects.Newsletter newsletter24 = null;
        faculty4.subscribe(newsletter24);
        objects.Newsletter newsletter26 = null;
        faculty4.unSubscribe(newsletter26);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        boolean boolean10 = faculty4.getValidationStatus();
        java.lang.String str11 = faculty4.getEmail();
        java.util.ArrayList<objects.Book> bookList12 = faculty4.getUsedTextbooks();
        java.util.ArrayList<objects.Book> bookList13 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        int int10 = faculty4.getId();
        java.util.ArrayList<objects.Course> courseList11 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        faculty4.addPenalty((double) (-1.0f));
        boolean boolean12 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Course> courseList13 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList11 = faculty4.updateBorrowingRecords();
        faculty4.addPenalty((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(borrowingRecordList11);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        faculty4.setValidationStatus(true);
        faculty4.update();
        java.lang.String str9 = faculty4.getEmail();
        objects.PaymentType paymentType10 = null;
        faculty4.addPaymentMethod(paymentType10, (double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str6 = faculty4.getEmail();
        java.lang.String str7 = faculty4.getEmail();
        faculty4.addPenalty((double) 100);
        faculty4.update();
        boolean boolean11 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty((double) 0.0f);
        objects.Newsletter newsletter14 = null;
        faculty4.subscribe(newsletter14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        faculty4.addPenalty((double) 100L);
        objects.Newsletter newsletter12 = null;
        faculty4.unSubscribe(newsletter12);
        boolean boolean14 = faculty4.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (short) 0);
        java.util.ArrayList<objects.Course> courseList12 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        faculty4.setValidationStatus(true);
        objects.PaymentType paymentType14 = null;
        faculty4.addPaymentMethod(paymentType14, (double) 100);
        objects.Book book17 = null;
        int int19 = faculty4.sendRequest(book17, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Course> courseList7 = faculty4.getCoursesTeaching();
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(courseList7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        java.lang.String str8 = faculty4.getPassword();
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.setValidationStatus(true);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(borrowingRecordList10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        boolean boolean10 = faculty4.getValidationStatus();
        java.lang.String str11 = faculty4.getEmail();
        faculty4.addPenalty(0.0d);
        objects.Newsletter newsletter14 = null;
        faculty4.subscribe(newsletter14);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        objects.Newsletter newsletter7 = null;
        faculty4.unSubscribe(newsletter7);
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.moreThanThreeOverdueItems();
        objects.Book book11 = null;
        int int13 = faculty4.sendRequest(book11, true);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.update();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass8 = borrowingRecordList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) -1, "hi!", "", userType3);
        faculty4.update();
        java.lang.String str6 = faculty4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Course> courseList9 = faculty4.getCoursesTeaching();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList11 = faculty4.getUsedTextbooks();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = faculty4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass13 = borrowingRecordList12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(borrowingRecordList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(borrowingRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) 100.0f);
        objects.Newsletter newsletter9 = null;
        faculty4.unSubscribe(newsletter9);
        java.lang.String str11 = faculty4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 100, "", "hi!", userType3);
        objects.Newsletter newsletter5 = null;
        faculty4.unSubscribe(newsletter5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        faculty4.update();
        java.lang.String str10 = faculty4.getEmail();
        objects.PaymentType paymentType11 = null;
        faculty4.addPaymentMethod(paymentType11, (double) (short) 1);
        java.util.ArrayList<objects.Course> courseList14 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter15 = null;
        faculty4.subscribe(newsletter15);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        java.util.ArrayList<objects.Book> bookList13 = faculty4.getUsedTextbooks();
        int int14 = faculty4.getId();
        boolean boolean15 = faculty4.getValidationStatus();
        java.lang.String str16 = faculty4.getPassword();
        int int17 = faculty4.getId();
        objects.Newsletter newsletter18 = null;
        faculty4.subscribe(newsletter18);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) '4', "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty4.visit(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) ' ', "hi!", "", userType3);
        java.util.ArrayList<objects.Course> courseList5 = faculty4.getCoursesTeaching();
        int int6 = faculty4.getId();
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        objects.PaymentType paymentType8 = null;
        faculty4.addPaymentMethod(paymentType8, (double) 0L);
        java.lang.String str11 = faculty4.getEmail();
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        java.util.ArrayList<objects.Book> bookList13 = faculty4.getUsedTextbooks();
        int int14 = faculty4.getId();
        boolean boolean15 = faculty4.getValidationStatus();
        java.lang.String str16 = faculty4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList17 = faculty4.updateBorrowingRecords();
        int int18 = faculty4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList19 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(borrowingRecordList19);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 1, "hi!", "", userType3);
        int int5 = faculty4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        faculty4.setValidationStatus(true);
        objects.PaymentType paymentType14 = null;
        faculty4.addPaymentMethod(paymentType14, (double) 100);
        java.util.ArrayList<objects.Book> bookList17 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 10, "", "hi!", userType3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        objects.User.UserType userType10 = faculty4.getUserType();
        faculty4.addPenalty(1.0d);
        objects.Newsletter newsletter13 = null;
        faculty4.subscribe(newsletter13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        boolean boolean7 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.Course> courseList8 = faculty4.getCoursesTeaching();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        boolean boolean6 = faculty4.getValidationStatus();
        faculty4.setValidationStatus(true);
        java.lang.String str9 = faculty4.getEmail();
        java.lang.String str10 = faculty4.getPassword();
        boolean boolean11 = faculty4.moreThanThreeOverdueItems();
        java.lang.String str12 = faculty4.getEmail();
        objects.Book book13 = null;
        int int15 = faculty4.sendRequest(book13, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) '4', "hi!", "", userType3);
        objects.User.UserType userType5 = faculty4.getUserType();
        objects.PaymentType paymentType6 = null;
        faculty4.addPaymentMethod(paymentType6, (double) '4');
        boolean boolean9 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNull(userType5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        faculty4.update();
        objects.Newsletter newsletter7 = null;
        faculty4.unSubscribe(newsletter7);
        boolean boolean9 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) -1, "", "", userType3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        objects.User.UserType userType8 = faculty4.getUserType();
        objects.User.UserType userType9 = faculty4.getUserType();
        int int10 = faculty4.getId();
        java.util.ArrayList<objects.Book> bookList11 = faculty4.getUsedTextbooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(userType8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        objects.Book book17 = null;
        int int19 = faculty4.sendRequest(book17, true);
        faculty4.setValidationStatus(false);
        java.lang.String str22 = faculty4.getPassword();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList14 = faculty4.getUsedTextbooks();
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        faculty4.addPenalty((double) '#');
        boolean boolean18 = faculty4.getValidationStatus();
        objects.Newsletter newsletter19 = null;
        faculty4.unSubscribe(newsletter19);
        faculty4.addPenalty((double) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 1, "hi!", "", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        faculty4.addPenalty((double) 0L);
        faculty4.setValidationStatus(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty(10, "", "", userType3);
        objects.Newsletter newsletter5 = null;
        faculty4.unSubscribe(newsletter5);
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        faculty4.setValidationStatus(false);
        objects.Newsletter newsletter12 = null;
        faculty4.subscribe(newsletter12);
        objects.Newsletter newsletter14 = null;
        faculty4.subscribe(newsletter14);
        boolean boolean16 = faculty4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        faculty4.addPenalty((double) 100L);
        faculty4.setValidationStatus(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.lang.String str14 = faculty4.getPassword();
        objects.Newsletter newsletter15 = null;
        faculty4.subscribe(newsletter15);
        faculty4.setValidationStatus(false);
        java.lang.String str19 = faculty4.getEmail();
        faculty4.update();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        boolean boolean12 = faculty4.getValidationStatus();
        java.lang.String str13 = faculty4.getEmail();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getEmail();
        java.lang.Class<?> wildcardClass8 = faculty4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.lang.Class<?> wildcardClass7 = borrowingRecordList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        objects.Book book5 = null;
        int int7 = faculty4.sendRequest(book5, true);
        java.util.ArrayList<objects.Course> courseList8 = faculty4.getCoursesTeaching();
        faculty4.update();
        objects.User.UserType userType10 = faculty4.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        faculty4.addPenalty((double) 100.0f);
        boolean boolean12 = faculty4.getValidationStatus();
        java.lang.String str13 = faculty4.getEmail();
        java.lang.String str14 = faculty4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        boolean boolean11 = faculty4.getValidationStatus();
        objects.User.UserType userType12 = faculty4.getUserType();
        java.util.ArrayList<objects.Book> bookList13 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter14 = null;
        faculty4.subscribe(newsletter14);
        objects.Newsletter newsletter16 = null;
        faculty4.subscribe(newsletter16);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(userType12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        java.lang.String str8 = faculty4.getPassword();
        faculty4.update();
        java.lang.String str10 = faculty4.getPassword();
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        objects.Newsletter newsletter7 = null;
        faculty4.subscribe(newsletter7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 100, "hi!", "hi!", userType3);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        faculty4.addPenalty((double) (byte) 0);
        objects.Book book10 = null;
        int int12 = faculty4.sendRequest(book10, false);
        faculty4.setValidationStatus(true);
        objects.Newsletter newsletter15 = null;
        faculty4.unSubscribe(newsletter15);
        objects.PaymentType paymentType17 = null;
        faculty4.addPaymentMethod(paymentType17, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.User.UserType userType9 = faculty4.getUserType();
        boolean boolean10 = faculty4.getValidationStatus();
        java.lang.String str11 = faculty4.getEmail();
        faculty4.addPenalty((double) '#');
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.moreThanThreeOverdueItems();
        int int11 = faculty4.getId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        java.util.ArrayList<objects.Course> courseList12 = faculty4.getCoursesTeaching();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList13 = faculty4.updateBorrowingRecords();
        objects.Newsletter newsletter14 = null;
        faculty4.unSubscribe(newsletter14);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = faculty4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(borrowingRecordList13);
        org.junit.Assert.assertNotNull(borrowingRecordList16);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        boolean boolean8 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.Book> bookList9 = faculty4.getUsedTextbooks();
        boolean boolean10 = faculty4.getValidationStatus();
        objects.PaymentType paymentType11 = null;
        faculty4.addPaymentMethod(paymentType11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        boolean boolean5 = faculty4.getValidationStatus();
        java.lang.String str6 = faculty4.getPassword();
        java.lang.String str7 = faculty4.getEmail();
        objects.Newsletter newsletter8 = null;
        faculty4.subscribe(newsletter8);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (byte) 100, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        java.lang.String str6 = faculty4.getEmail();
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        java.util.ArrayList<objects.Book> bookList8 = faculty4.getUsedTextbooks();
        objects.Newsletter newsletter9 = null;
        faculty4.subscribe(newsletter9);
        int int11 = faculty4.getId();
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        objects.Newsletter newsletter13 = null;
        faculty4.unSubscribe(newsletter13);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        boolean boolean5 = faculty4.moreThanThreeOverdueItems();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        objects.Book book7 = null;
        int int9 = faculty4.sendRequest(book7, false);
        faculty4.update();
        java.lang.String str11 = faculty4.getPassword();
        objects.PaymentType paymentType12 = null;
        faculty4.addPaymentMethod(paymentType12, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 100, "", "", userType3);
        java.lang.String str5 = faculty4.getEmail();
        objects.Newsletter newsletter6 = null;
        faculty4.unSubscribe(newsletter6);
        objects.User.UserType userType8 = faculty4.getUserType();
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        objects.PaymentType paymentType12 = null;
        faculty4.addPaymentMethod(paymentType12, (double) 100);
        boolean boolean15 = faculty4.moreThanThreeOverdueItems();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(userType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) 'a', "", "hi!", userType3);
        java.lang.String str5 = faculty4.getPassword();
        boolean boolean6 = faculty4.getValidationStatus();
        objects.PaymentType paymentType7 = null;
        faculty4.addPaymentMethod(paymentType7, (double) 1L);
        objects.Newsletter newsletter10 = null;
        faculty4.unSubscribe(newsletter10);
        boolean boolean12 = faculty4.moreThanThreeOverdueItems();
        boolean boolean13 = faculty4.getValidationStatus();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = faculty4.updateBorrowingRecords();
        java.lang.String str15 = faculty4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = faculty4.updateBorrowingRecords();
        int int17 = faculty4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        faculty4.update();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = faculty4.updateBorrowingRecords();
        java.util.ArrayList<objects.Book> bookList7 = faculty4.getUsedTextbooks();
        java.lang.String str8 = faculty4.getPassword();
        objects.PaymentType paymentType9 = null;
        faculty4.addPaymentMethod(paymentType9, (double) (short) 10);
        java.lang.String str12 = faculty4.getEmail();
        objects.Newsletter newsletter13 = null;
        faculty4.unSubscribe(newsletter13);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        objects.User.UserType userType3 = null;
        objects.Faculty faculty4 = new objects.Faculty((int) (short) 1, "", "hi!", userType3);
        java.util.ArrayList<objects.Book> bookList5 = faculty4.getUsedTextbooks();
        objects.Book book6 = null;
        int int8 = faculty4.sendRequest(book6, false);
        objects.Book book9 = null;
        int int11 = faculty4.sendRequest(book9, true);
        java.util.ArrayList<objects.Course> courseList12 = faculty4.getCoursesTeaching();
        java.util.ArrayList<objects.Book> bookList13 = faculty4.getUsedTextbooks();
        objects.Book book14 = null;
        int int16 = faculty4.sendRequest(book14, true);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}

