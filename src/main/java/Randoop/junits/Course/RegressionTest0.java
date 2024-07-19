package Randoop.junits.Course;
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
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '4', "", (-1), textbook3, "hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "hi!", (int) (byte) 100, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 0, "", (int) (short) 10, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getId();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 1, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = textbook7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = textbook11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = textbook9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) (short) 0, textbook3, "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        int int8 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 0, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "hi!", (int) (byte) -1, textbook3, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(textbook9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        int int6 = course5.getId();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        java.lang.String str8 = course5.getTerm();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(35, "hi!", (int) (byte) 100, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getId();
        java.lang.Class<?> wildcardClass12 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getId();
        objects.Textbook textbook12 = course5.getTextbook();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (byte) 1, textbook3, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "hi!", (int) (short) 10, textbook3, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        objects.Textbook textbook8 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(textbook8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 100, textbook3, "");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "", 0, textbook3, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.Class<?> wildcardClass12 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) -1, "hi!", 35, textbook3, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "hi!", (int) (byte) -1, textbook3, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getCourseName();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getFacultyId();
        int int12 = course5.getId();
        java.lang.String str13 = course5.getCourseName();
        objects.Textbook textbook14 = course5.getTextbook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = textbook14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(textbook14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "hi!", 0, textbook3, "hi!");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '4', "", (int) (byte) 1, textbook3, "hi!");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 1, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", 10, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        objects.Textbook textbook13 = course5.getTextbook();
        int int14 = course5.getId();
        java.lang.String str15 = course5.getTerm();
        java.lang.String str16 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        objects.Textbook textbook13 = course5.getTextbook();
        int int14 = course5.getId();
        java.lang.String str15 = course5.getTerm();
        int int16 = course5.getId();
        java.lang.String str17 = course5.getTerm();
        int int18 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        int int11 = course5.getFacultyId();
        java.lang.String str12 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getId();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        java.lang.String str6 = course5.getTerm();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "hi!", (int) (short) 100, textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        int int11 = course5.getId();
        int int12 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        int int11 = course5.getId();
        java.lang.Class<?> wildcardClass12 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        java.lang.Class<?> wildcardClass12 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 0, textbook3, "hi!");
        int int6 = course5.getId();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "", (int) ' ', textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        int int14 = course5.getId();
        int int15 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        int int12 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass12 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 0, "hi!", (int) (short) 100, textbook3, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseName();
        java.lang.String str15 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getFacultyId();
        int int12 = course5.getId();
        java.lang.String str13 = course5.getCourseName();
        java.lang.Class<?> wildcardClass14 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 10, "hi!", (int) (byte) 100, textbook3, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", (int) 'a', textbook3, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "", 97, textbook3, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 0, textbook3, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getFacultyId();
        java.lang.String str12 = course5.getCourseName();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getFacultyId();
        int int9 = course5.getFacultyId();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseName();
        int int15 = course5.getFacultyId();
        java.lang.String str16 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getTerm();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = textbook10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", 10, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", 0, textbook3, "hi!");
        java.lang.String str6 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        objects.Textbook textbook13 = course5.getTextbook();
        int int14 = course5.getId();
        java.lang.String str15 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 0, textbook3, "hi!");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 100, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        int int12 = course5.getId();
        java.lang.String str13 = course5.getTerm();
        objects.Textbook textbook14 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(textbook14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 1, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getId();
        int int9 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 0, textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", 10, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", 10, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        objects.Textbook textbook13 = course5.getTextbook();
        int int14 = course5.getId();
        java.lang.String str15 = course5.getTerm();
        int int16 = course5.getId();
        java.lang.String str17 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) -1, "", (int) (byte) 1, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getCourseName();
        objects.Textbook textbook10 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(textbook10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(textbook9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 0, textbook3, "hi!");
        int int6 = course5.getId();
        java.lang.String str7 = course5.getTerm();
        objects.Textbook textbook8 = course5.getTextbook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(textbook8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getFacultyId();
        java.lang.String str10 = course5.getCourseName();
        java.lang.String str11 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseName();
        java.lang.Class<?> wildcardClass15 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getId();
        int int9 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(textbook9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "", 0, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 0, textbook3, "hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(35, "hi!", 0, textbook3, "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((-1), "", (-1), textbook3, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = textbook9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(textbook9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "", 0, textbook3, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getTerm();
        int int11 = course5.getFacultyId();
        int int12 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(10, "", 32, textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getCourseName();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "hi!", (int) (short) 100, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 100, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getTerm();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) -1, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 100, "hi!", (int) (byte) 0, textbook3, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '4', "hi!", 97, textbook3, "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        int int12 = course5.getId();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 0, textbook3, "");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        java.lang.String str7 = course5.getCourseName();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        int int12 = course5.getFacultyId();
        int int13 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass14 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getFacultyId();
        int int11 = course5.getId();
        objects.Textbook textbook12 = course5.getTextbook();
        int int13 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 1, textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        java.lang.String str10 = course5.getTerm();
        int int11 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "hi!", 0, textbook3, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getFacultyId();
        int int11 = course5.getId();
        objects.Textbook textbook12 = course5.getTextbook();
        java.lang.String str13 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "hi!", 35, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(10, "", 100, textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getTerm();
        int int11 = course5.getFacultyId();
        int int12 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getFacultyId();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "hi!", 100, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getFacultyId();
        java.lang.String str12 = course5.getCourseName();
        objects.Textbook textbook13 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", (int) (short) 10, textbook3, "hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 0, "", (int) (short) 1, textbook3, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getFacultyId();
        java.lang.String str11 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        int int9 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "hi!", 10, textbook3, "hi!");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        objects.Textbook textbook8 = course5.getTextbook();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", (int) 'a', textbook3, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) (byte) -1, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getCourseName();
        java.lang.String str11 = course5.getCourseName();
        java.lang.String str12 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) (byte) 1, textbook3, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "hi!", 32, textbook3, "hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getId();
        int int9 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "hi!", (int) ' ', textbook3, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", 0, textbook3, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "hi!", 100, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        int int13 = course5.getFacultyId();
        int int14 = course5.getId();
        int int15 = course5.getId();
        int int16 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 1, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        objects.Textbook textbook8 = course5.getTextbook();
        int int9 = course5.getFacultyId();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        int int11 = course5.getId();
        java.lang.String str12 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 100, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        int int9 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 100, "", (int) (short) 0, textbook3, "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        int int11 = course5.getFacultyId();
        objects.Textbook textbook12 = course5.getTextbook();
        java.lang.String str13 = course5.getTerm();
        java.lang.Class<?> wildcardClass14 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getCourseName();
        objects.Textbook textbook12 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(textbook12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(35, "", 0, textbook3, "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        int int13 = course5.getFacultyId();
        int int14 = course5.getFacultyId();
        java.lang.String str15 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) ' ', textbook3, "hi!");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", 97, textbook3, "hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "hi!", (int) (short) 100, textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 10, "", 35, textbook3, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) ' ', textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "hi!", 32, textbook3, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        int int7 = course5.getFacultyId();
        objects.Textbook textbook8 = course5.getTextbook();
        objects.Textbook textbook9 = course5.getTextbook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertNull(textbook9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 0, "", (int) (short) 10, textbook3, "");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "", (int) '#', textbook3, "");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getFacultyId();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "", (int) (byte) 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        objects.Textbook textbook14 = course5.getTextbook();
        objects.Textbook textbook15 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(textbook14);
        org.junit.Assert.assertNull(textbook15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "hi!", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        int int12 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getFacultyId();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        java.lang.String str10 = course5.getTerm();
        java.lang.String str11 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(35, "hi!", (int) (byte) 100, textbook3, "");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        int int11 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", 10, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "hi!", 52, textbook3, "hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) '#', textbook3, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getFacultyId();
        int int10 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", 0, textbook3, "hi!");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "hi!", 1, textbook3, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        int int13 = course5.getFacultyId();
        int int14 = course5.getId();
        int int15 = course5.getId();
        objects.Textbook textbook16 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(textbook16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", (-1), textbook3, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "hi!", (int) ' ', textbook3, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        objects.Textbook textbook8 = course5.getTextbook();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        int int9 = course5.getFacultyId();
        java.lang.String str10 = course5.getTerm();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        int int9 = course5.getFacultyId();
        java.lang.String str10 = course5.getTerm();
        java.lang.String str11 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        int int12 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        int int13 = course5.getFacultyId();
        int int14 = course5.getId();
        int int15 = course5.getId();
        int int16 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getId();
        int int10 = course5.getId();
        int int11 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getCourseName();
        int int11 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        objects.Textbook textbook13 = course5.getTextbook();
        int int14 = course5.getId();
        int int15 = course5.getId();
        objects.Textbook textbook16 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(textbook16);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(textbook10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(35, "hi!", (int) (byte) 0, textbook3, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        int int12 = course5.getId();
        objects.Textbook textbook13 = course5.getTextbook();
        java.lang.Class<?> wildcardClass14 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        int int13 = course5.getFacultyId();
        java.lang.String str14 = course5.getCourseName();
        int int15 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "hi!", 52, textbook3, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "hi!", (int) (short) -1, textbook3, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(10, "hi!", 100, textbook3, "hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getFacultyId();
        int int11 = course5.getId();
        objects.Textbook textbook12 = course5.getTextbook();
        java.lang.String str13 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", 0, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "", 100, textbook3, "");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", 0, textbook3, "");
        int int6 = course5.getFacultyId();
        int int7 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getTerm();
        java.lang.String str13 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((-1), "hi!", (int) '#', textbook3, "hi!");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 100, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getFacultyId();
        java.lang.String str12 = course5.getTerm();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getTerm();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        objects.Textbook textbook8 = course5.getTextbook();
        int int9 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getTerm();
        int int11 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "hi!", 10, textbook3, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        objects.Textbook textbook14 = course5.getTextbook();
        int int15 = course5.getId();
        java.lang.Class<?> wildcardClass16 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(textbook14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "hi!", (int) '#', textbook3, "hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "hi!", (int) (byte) 100, textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '4', "", (int) (byte) 1, textbook3, "hi!");
        objects.Textbook textbook6 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        int int14 = course5.getId();
        java.lang.String str15 = course5.getTerm();
        int int16 = course5.getId();
        int int17 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass18 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        java.lang.String str11 = course5.getTerm();
        int int12 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "hi!", (int) (short) 0, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 0, "", (int) (short) 10, textbook3, "");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        objects.Textbook textbook8 = course5.getTextbook();
        java.lang.String str9 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        int int11 = course5.getId();
        java.lang.String str12 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getFacultyId();
        int int9 = course5.getFacultyId();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        objects.Textbook textbook12 = course5.getTextbook();
        int int13 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "hi!", (int) (short) -1, textbook3, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) ' ', textbook3, "hi!");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "", 52, textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getCourseName();
        int int12 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", 1, textbook3, "");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        int int9 = course5.getFacultyId();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 0, "hi!", (int) (short) 1, textbook3, "hi!");
        objects.Textbook textbook6 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getFacultyId();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "hi!", 1, textbook3, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 1, "hi!", (-1), textbook3, "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "", (int) (short) 100, textbook3, "hi!");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        objects.Textbook textbook8 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertNull(textbook8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getFacultyId();
        int int12 = course5.getId();
        objects.Textbook textbook13 = course5.getTextbook();
        objects.Textbook textbook14 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertNull(textbook14);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 0, textbook3, "hi!");
        int int6 = course5.getId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        objects.Textbook textbook10 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(textbook10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((-1), "", (int) (byte) 100, textbook3, "hi!");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 100, "hi!", (int) '#', textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getId();
        objects.Textbook textbook12 = course5.getTextbook();
        java.lang.String str13 = course5.getCourseName();
        int int14 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        java.lang.String str11 = course5.getTerm();
        objects.Textbook textbook12 = course5.getTextbook();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseName();
        int int15 = course5.getFacultyId();
        int int16 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 100, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        objects.Textbook textbook12 = course5.getTextbook();
        java.lang.String str13 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(textbook12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) -1, "hi!", (int) '4', textbook3, "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        java.lang.String str11 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        java.lang.String str11 = course5.getCourseName();
        int int12 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getFacultyId();
        java.lang.String str10 = course5.getTerm();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 0, textbook3, "hi!");
        int int6 = course5.getId();
        int int7 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", (int) (byte) 1, textbook3, "hi!");
        java.lang.String str6 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        int int11 = course5.getId();
        int int12 = course5.getId();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) -1, "", (int) (short) 0, textbook3, "");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "hi!", (-1), textbook3, "hi!");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "hi!", (int) ' ', textbook3, "hi!");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((-1), "", (int) (short) 0, textbook3, "hi!");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) ' ', textbook3, "hi!");
        objects.Textbook textbook6 = course5.getTextbook();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        java.lang.Class<?> wildcardClass9 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        objects.Textbook textbook14 = course5.getTextbook();
        java.lang.String str15 = course5.getCourseName();
        int int16 = course5.getId();
        int int17 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(textbook14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "", (int) (short) 0, textbook3, "hi!");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((-1), "hi!", (int) (byte) 1, textbook3, "");
        int int6 = course5.getId();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "hi!", 97, textbook3, "hi!");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) -1, "", (int) (byte) 1, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) ' ', textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getId();
        int int9 = course5.getFacultyId();
        int int10 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", 0, textbook3, "");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "hi!", (int) (byte) 100, textbook3, "");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) ' ', textbook3, "hi!");
        objects.Textbook textbook6 = course5.getTextbook();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(32, "", (int) ' ', textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 1, "hi!", (int) (byte) -1, textbook3, "");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "", (int) (byte) 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        int int8 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "", 10, textbook3, "hi!");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 100, textbook3, "hi!");
        objects.Textbook textbook6 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        objects.Textbook textbook10 = course5.getTextbook();
        objects.Textbook textbook11 = course5.getTextbook();
        java.lang.String str12 = course5.getCourseName();
        objects.Textbook textbook13 = course5.getTextbook();
        objects.Textbook textbook14 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertNull(textbook14);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        int int13 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        int int11 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass12 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getCourseName();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getTerm();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        int int11 = course5.getId();
        int int12 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        objects.Textbook textbook8 = course5.getTextbook();
        objects.Textbook textbook9 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertNull(textbook9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "hi!", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        int int9 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", (int) (byte) 1, textbook3, "hi!");
        int int6 = course5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "hi!", 35, textbook3, "hi!");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getTerm();
        java.lang.String str13 = course5.getTerm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        objects.Textbook textbook13 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getFacultyId();
        int int11 = course5.getId();
        int int12 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        int int11 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", 10, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        objects.Textbook textbook8 = course5.getTextbook();
        int int9 = course5.getId();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        java.lang.String str8 = course5.getCourseName();
        objects.Textbook textbook9 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
    }
}

