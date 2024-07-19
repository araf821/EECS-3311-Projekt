package Randoop.junits.SystemManagerUserTest;
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
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        int int9 = systemManagerUser4.getId();
        objects.PaymentType paymentType10 = null;
        systemManagerUser4.addPaymentMethod(paymentType10, 1.0d);
        objects.User.UserType userType13 = systemManagerUser4.getUserType();
        java.lang.String str14 = systemManagerUser4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNull(userType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        objects.Newsletter newsletter9 = null;
        systemManagerUser4.subscribe(newsletter9);
        objects.PaymentType paymentType11 = null;
        systemManagerUser4.addPaymentMethod(paymentType11, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        objects.PaymentType paymentType8 = null;
        systemManagerUser4.addPaymentMethod(paymentType8, (double) 1.0f);
        boolean boolean11 = systemManagerUser4.getValidationStatus();
        systemManagerUser4.setValidationStatus(true);
        boolean boolean14 = systemManagerUser4.moreThanThreeOverdueItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.getValidationStatus();
        objects.User.UserType userType6 = systemManagerUser4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = systemManagerUser4.updateBorrowingRecords();
        objects.User.UserType userType8 = systemManagerUser4.getUserType();
        boolean boolean9 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book10 = null;
        int int12 = systemManagerUser4.sendRequest(book10, true);
        objects.PaymentType paymentType13 = null;
        systemManagerUser4.addPaymentMethod(paymentType13, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertNull(userType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = systemManagerUser4.updateBorrowingRecords();
        java.lang.String str6 = systemManagerUser4.getEmail();
        objects.Newsletter newsletter7 = null;
        systemManagerUser4.unSubscribe(newsletter7);
        objects.Book book9 = null;
        int int11 = systemManagerUser4.sendRequest(book9, false);
        java.lang.String str12 = systemManagerUser4.getEmail();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) (byte) 1, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        systemManagerUser4.subscribe(newsletter5);
        objects.PhysicalItem.ItemType itemType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemManagerUser4.addPhysicalItem("hi!", itemType8, "hi!", 0.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PhysicalItem$ItemType.ordinal()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        int int5 = systemManagerUser4.getId();
        objects.User.UserType userType6 = systemManagerUser4.getUserType();
        objects.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemManagerUser4.visit(newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(userType6);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) ' ', "hi!", "hi!", userType3);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = systemManagerUser4.updateBorrowingRecords();
        systemManagerUser4.addPenalty((double) '#');
        objects.PaymentType paymentType12 = null;
        systemManagerUser4.addPaymentMethod(paymentType12, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        objects.Newsletter newsletter9 = null;
        systemManagerUser4.subscribe(newsletter9);
        systemManagerUser4.validateUser("");
        int int13 = systemManagerUser4.getId();
        objects.Newsletter newsletter14 = null;
        systemManagerUser4.subscribe(newsletter14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        objects.Newsletter newsletter9 = null;
        systemManagerUser4.subscribe(newsletter9);
        boolean boolean11 = systemManagerUser4.getValidationStatus();
        objects.Book book12 = null;
        int int14 = systemManagerUser4.sendRequest(book12, true);
        systemManagerUser4.addPenalty((double) (-1L));
        boolean boolean17 = systemManagerUser4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        boolean boolean9 = systemManagerUser4.moreThanThreeOverdueItems();
        int int10 = systemManagerUser4.getId();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList11 = systemManagerUser4.updateBorrowingRecords();
        boolean boolean12 = systemManagerUser4.moreThanThreeOverdueItems();
        java.lang.Class<?> wildcardClass13 = systemManagerUser4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(borrowingRecordList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.lang.String str8 = systemManagerUser4.getEmail();
        objects.User.UserType userType9 = systemManagerUser4.getUserType();
        objects.Book book10 = null;
        int int12 = systemManagerUser4.sendRequest(book10, false);
        systemManagerUser4.setValidationStatus(false);
        java.lang.String str15 = systemManagerUser4.getEmail();
        java.lang.String str16 = systemManagerUser4.getPassword();
        systemManagerUser4.setValidationStatus(false);
        boolean boolean19 = systemManagerUser4.getValidationStatus();
        objects.Newsletter newsletter20 = null;
        systemManagerUser4.subscribe(newsletter20);
        boolean boolean22 = systemManagerUser4.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        objects.PaymentType paymentType9 = null;
        systemManagerUser4.addPaymentMethod(paymentType9, (double) 0L);
        systemManagerUser4.addPenalty((double) 100.0f);
        java.lang.String str14 = systemManagerUser4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.getValidationStatus();
        objects.User.UserType userType6 = systemManagerUser4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = systemManagerUser4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        java.lang.String str9 = systemManagerUser4.getEmail();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList10 = systemManagerUser4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(borrowingRecordList10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        objects.Newsletter newsletter9 = null;
        systemManagerUser4.subscribe(newsletter9);
        java.lang.String str11 = systemManagerUser4.getPassword();
        systemManagerUser4.addPenalty((double) (short) 100);
        objects.Newsletter newsletter14 = null;
        systemManagerUser4.unSubscribe(newsletter14);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList16 = systemManagerUser4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList16);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        objects.Newsletter newsletter9 = null;
        systemManagerUser4.subscribe(newsletter9);
        java.lang.String str11 = systemManagerUser4.getEmail();
        systemManagerUser4.addPenalty((double) '#');
        objects.Newsletter newsletter14 = null;
        systemManagerUser4.unSubscribe(newsletter14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        objects.PaymentType paymentType9 = null;
        systemManagerUser4.addPaymentMethod(paymentType9, (double) (short) -1);
        boolean boolean12 = systemManagerUser4.moreThanThreeOverdueItems();
        java.lang.String str13 = systemManagerUser4.getEmail();
        java.lang.Class<?> wildcardClass14 = systemManagerUser4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.getValidationStatus();
        objects.User.UserType userType6 = systemManagerUser4.getUserType();
        objects.Newsletter newsletter7 = null;
        systemManagerUser4.unSubscribe(newsletter7);
        objects.Newsletter newsletter9 = null;
        systemManagerUser4.unSubscribe(newsletter9);
        java.lang.String str11 = systemManagerUser4.getEmail();
        objects.Newsletter newsletter12 = null;
        systemManagerUser4.subscribe(newsletter12);
        java.lang.String str14 = systemManagerUser4.getPassword();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList15 = systemManagerUser4.updateBorrowingRecords();
        systemManagerUser4.addPenalty((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(borrowingRecordList15);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = systemManagerUser4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList6 = systemManagerUser4.updateBorrowingRecords();
        java.lang.String str7 = systemManagerUser4.getEmail();
        objects.Newsletter newsletter8 = null;
        systemManagerUser4.unSubscribe(newsletter8);
        objects.User.UserType userType10 = systemManagerUser4.getUserType();
        objects.PaymentType paymentType11 = null;
        systemManagerUser4.addPaymentMethod(paymentType11, (double) (-1L));
        systemManagerUser4.addPenalty((double) (short) 1);
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertNotNull(borrowingRecordList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) (byte) 1, "hi!", "", userType3);
        objects.Newsletter newsletter5 = null;
        systemManagerUser4.subscribe(newsletter5);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = systemManagerUser4.updateBorrowingRecords();
        org.junit.Assert.assertNotNull(borrowingRecordList7);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        int int9 = systemManagerUser4.getId();
        objects.PaymentType paymentType10 = null;
        systemManagerUser4.addPaymentMethod(paymentType10, 1.0d);
        objects.PaymentType paymentType13 = null;
        systemManagerUser4.addPaymentMethod(paymentType13, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.lang.String str8 = systemManagerUser4.getEmail();
        objects.Book book9 = null;
        int int11 = systemManagerUser4.sendRequest(book9, true);
        objects.Book book12 = null;
        int int14 = systemManagerUser4.sendRequest(book12, true);
        int int15 = systemManagerUser4.getId();
        systemManagerUser4.setValidationStatus(true);
        objects.Newsletter newsletter18 = null;
        systemManagerUser4.unSubscribe(newsletter18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser(1, "", "hi!", userType3);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        boolean boolean9 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.User.UserType userType10 = systemManagerUser4.getUserType();
        objects.Newsletter newsletter11 = null;
        systemManagerUser4.unSubscribe(newsletter11);
        objects.Newsletter newsletter13 = null;
        systemManagerUser4.subscribe(newsletter13);
        int int15 = systemManagerUser4.getId();
        objects.Book book16 = null;
        int int18 = systemManagerUser4.sendRequest(book16, true);
        systemManagerUser4.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.lang.String str8 = systemManagerUser4.getEmail();
        systemManagerUser4.addPenalty((double) 1L);
        java.lang.String str11 = systemManagerUser4.getEmail();
        objects.Book book12 = null;
        int int14 = systemManagerUser4.sendRequest(book12, false);
        objects.PaymentType paymentType15 = null;
        systemManagerUser4.addPaymentMethod(paymentType15, (double) (short) 1);
        java.lang.String str18 = systemManagerUser4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser(1, "hi!", "", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = systemManagerUser4.updateBorrowingRecords();
        java.lang.String str6 = systemManagerUser4.getEmail();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser(1, "hi!", "", userType3);
        systemManagerUser4.validateUser("");
        objects.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemManagerUser4.visit(newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.Newsletter.displayNews()\" because \"news\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        systemManagerUser4.addPenalty((double) 100L);
        systemManagerUser4.addPenalty((double) 100);
        objects.Newsletter newsletter12 = null;
        systemManagerUser4.subscribe(newsletter12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = systemManagerUser4.updateBorrowingRecords();
        boolean boolean10 = systemManagerUser4.getValidationStatus();
        objects.User.UserType userType11 = systemManagerUser4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = systemManagerUser4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(userType11);
        org.junit.Assert.assertNotNull(borrowingRecordList12);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = systemManagerUser4.updateBorrowingRecords();
        systemManagerUser4.setValidationStatus(false);
        systemManagerUser4.addPenalty((double) (-1));
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = systemManagerUser4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        boolean boolean9 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.User.UserType userType10 = systemManagerUser4.getUserType();
        systemManagerUser4.validateUser("hi!");
        int int13 = systemManagerUser4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.getValidationStatus();
        objects.User.UserType userType6 = systemManagerUser4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList7 = systemManagerUser4.updateBorrowingRecords();
        java.lang.String str8 = systemManagerUser4.getEmail();
        java.lang.String str9 = systemManagerUser4.getEmail();
        systemManagerUser4.setValidationStatus(false);
        boolean boolean12 = systemManagerUser4.getValidationStatus();
        objects.User.UserType userType13 = systemManagerUser4.getUserType();
        objects.User.UserType userType14 = systemManagerUser4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertNotNull(borrowingRecordList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(userType13);
        org.junit.Assert.assertNull(userType14);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = systemManagerUser4.updateBorrowingRecords();
        systemManagerUser4.setValidationStatus(false);
        objects.PaymentType paymentType8 = null;
        systemManagerUser4.addPaymentMethod(paymentType8, (double) (short) 0);
        int int11 = systemManagerUser4.getId();
        objects.PhysicalItem.ItemType itemType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemManagerUser4.addPhysicalItem("", itemType13, "", (-1.0d), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PhysicalItem$ItemType.ordinal()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        int int8 = systemManagerUser4.getId();
        objects.Book book9 = null;
        int int11 = systemManagerUser4.sendRequest(book9, false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList12 = systemManagerUser4.updateBorrowingRecords();
        int int13 = systemManagerUser4.getId();
        objects.Newsletter newsletter14 = null;
        systemManagerUser4.unSubscribe(newsletter14);
        boolean boolean16 = systemManagerUser4.getValidationStatus();
        int int17 = systemManagerUser4.getId();
        objects.PaymentType paymentType18 = null;
        systemManagerUser4.addPaymentMethod(paymentType18, 0.0d);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList21 = systemManagerUser4.updateBorrowingRecords();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(borrowingRecordList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(borrowingRecordList21);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = systemManagerUser4.updateBorrowingRecords();
        java.lang.String str6 = systemManagerUser4.getEmail();
        objects.Book book7 = null;
        int int9 = systemManagerUser4.sendRequest(book7, true);
        boolean boolean10 = systemManagerUser4.moreThanThreeOverdueItems();
        java.lang.String str11 = systemManagerUser4.getPassword();
        boolean boolean12 = systemManagerUser4.moreThanThreeOverdueItems();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        int int8 = systemManagerUser4.getId();
        systemManagerUser4.addPenalty((double) (short) 100);
        objects.PhysicalItem.ItemType itemType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemManagerUser4.addPhysicalItem("", itemType12, "hi!", (double) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PhysicalItem$ItemType.ordinal()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = systemManagerUser4.updateBorrowingRecords();
        objects.User.UserType userType10 = systemManagerUser4.getUserType();
        systemManagerUser4.addPenalty((double) (short) 100);
        int int13 = systemManagerUser4.getId();
        systemManagerUser4.setValidationStatus(true);
        systemManagerUser4.validateUser("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        objects.Newsletter newsletter9 = null;
        systemManagerUser4.subscribe(newsletter9);
        java.lang.String str11 = systemManagerUser4.getPassword();
        systemManagerUser4.addPenalty((double) (short) 100);
        objects.PhysicalItem.ItemType itemType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemManagerUser4.addPhysicalItem("", itemType15, "", (double) 35, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PhysicalItem$ItemType.ordinal()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = systemManagerUser4.updateBorrowingRecords();
        objects.User.UserType userType10 = systemManagerUser4.getUserType();
        systemManagerUser4.addPenalty((double) (short) 100);
        int int13 = systemManagerUser4.getId();
        systemManagerUser4.setValidationStatus(true);
        java.lang.String str16 = systemManagerUser4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.lang.String str8 = systemManagerUser4.getEmail();
        objects.User.UserType userType9 = systemManagerUser4.getUserType();
        objects.Book book10 = null;
        int int12 = systemManagerUser4.sendRequest(book10, false);
        objects.User.UserType userType13 = systemManagerUser4.getUserType();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList14 = systemManagerUser4.updateBorrowingRecords();
        systemManagerUser4.setValidationStatus(false);
        java.lang.String str17 = systemManagerUser4.getEmail();
        boolean boolean18 = systemManagerUser4.getValidationStatus();
        boolean boolean19 = systemManagerUser4.getValidationStatus();
        java.lang.Class<?> wildcardClass20 = systemManagerUser4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(userType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(userType13);
        org.junit.Assert.assertNotNull(borrowingRecordList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList5 = systemManagerUser4.updateBorrowingRecords();
        boolean boolean6 = systemManagerUser4.moreThanThreeOverdueItems();
        int int7 = systemManagerUser4.getId();
        objects.Newsletter newsletter8 = null;
        systemManagerUser4.unSubscribe(newsletter8);
        boolean boolean10 = systemManagerUser4.getValidationStatus();
        org.junit.Assert.assertNotNull(borrowingRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList9 = systemManagerUser4.updateBorrowingRecords();
        objects.User.UserType userType10 = systemManagerUser4.getUserType();
        java.lang.String str11 = systemManagerUser4.getEmail();
        objects.PhysicalItem.ItemType itemType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemManagerUser4.addPhysicalItem("hi!", itemType13, "", (double) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.PhysicalItem$ItemType.ordinal()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertNotNull(borrowingRecordList9);
        org.junit.Assert.assertNull(userType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        objects.Book book6 = null;
        int int8 = systemManagerUser4.sendRequest(book6, true);
        boolean boolean9 = systemManagerUser4.moreThanThreeOverdueItems();
        java.lang.String str10 = systemManagerUser4.getPassword();
        java.lang.String str11 = systemManagerUser4.getPassword();
        int int12 = systemManagerUser4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        boolean boolean9 = systemManagerUser4.getValidationStatus();
        objects.Newsletter newsletter10 = null;
        systemManagerUser4.unSubscribe(newsletter10);
        objects.PaymentType paymentType12 = null;
        systemManagerUser4.addPaymentMethod(paymentType12, (double) (byte) 10);
        objects.Newsletter newsletter15 = null;
        systemManagerUser4.subscribe(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        objects.User.UserType userType3 = null;
        objects.SystemManagerUser systemManagerUser4 = new objects.SystemManagerUser((int) '#', "hi!", "hi!", userType3);
        boolean boolean5 = systemManagerUser4.moreThanThreeOverdueItems();
        systemManagerUser4.setValidationStatus(false);
        java.util.ArrayList<objects.BorrowingRecord> borrowingRecordList8 = systemManagerUser4.updateBorrowingRecords();
        int int9 = systemManagerUser4.getId();
        java.lang.String str10 = systemManagerUser4.getEmail();
        int int11 = systemManagerUser4.getId();
        java.lang.String str12 = systemManagerUser4.getPassword();
        java.lang.String str13 = systemManagerUser4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(borrowingRecordList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }
}

