package Randoop.junits.TextbookTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        int int14 = textbook3.getId();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        java.lang.String str16 = textbook3.getCourseId();
        int int17 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        int int15 = textbook3.getId();
        java.lang.Class<?> wildcardClass16 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getEdition();
        java.lang.String str16 = textbook3.getEdition();
        java.lang.String str17 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        int int14 = textbook3.getId();
        int int15 = textbook3.getId();
        java.lang.String str16 = textbook3.getEdition();
        java.lang.String str17 = textbook3.getEdition();
        int int18 = textbook3.getId();
        java.lang.String str19 = textbook3.getCourseId();
        int int20 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        int int17 = textbook3.getId();
        java.lang.String str18 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.String str14 = textbook3.getEdition();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        int int17 = textbook3.getId();
        int int18 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getCourseId();
        int int15 = textbook3.getId();
        java.lang.String str16 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass17 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        java.lang.String str15 = textbook3.getEdition();
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        objects.Textbook textbook3 = new objects.Textbook(10, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        int int14 = textbook3.getId();
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.String str14 = textbook3.getEdition();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        int int17 = textbook3.getId();
        java.lang.Class<?> wildcardClass18 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        int int14 = textbook3.getId();
        int int15 = textbook3.getId();
        java.lang.String str16 = textbook3.getCourseId();
        objects.observer observer17 = null;
        textbook3.attachObserver(observer17);
        objects.observer observer19 = null;
        textbook3.attachObserver(observer19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        objects.Textbook textbook3 = new objects.Textbook(10, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        objects.Textbook textbook3 = new objects.Textbook(100, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.String str14 = textbook3.getEdition();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        java.lang.String str17 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        int int14 = textbook3.getId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        int int14 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getEdition();
        int int15 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        java.lang.Class<?> wildcardClass17 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        int int4 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        objects.Textbook textbook3 = new objects.Textbook(32, "hi!", "");
        int int4 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        java.lang.String str4 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        java.lang.String str16 = textbook3.getCourseId();
        java.lang.String str17 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        objects.Textbook textbook3 = new objects.Textbook(97, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        int int15 = textbook3.getId();
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        int int14 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getCourseId();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        int int14 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        java.lang.Class<?> wildcardClass16 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        int int15 = textbook3.getId();
        java.lang.String str16 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass16 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        objects.Textbook textbook3 = new objects.Textbook(100, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getEdition();
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getCourseId();
        int int14 = textbook3.getId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getEdition();
        int int15 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.String str14 = textbook3.getEdition();
        int int15 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        objects.Textbook textbook3 = new objects.Textbook(1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.String str14 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.String str14 = textbook3.getCourseId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        int int14 = textbook3.getId();
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        objects.observer observer17 = null;
        textbook3.attachObserver(observer17);
        objects.observer observer19 = null;
        textbook3.attachObserver(observer19);
        objects.observer observer21 = null;
        textbook3.attachObserver(observer21);
        objects.observer observer23 = null;
        textbook3.attachObserver(observer23);
        int int25 = textbook3.getId();
        objects.observer observer26 = null;
        textbook3.attachObserver(observer26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "hi!");
        int int4 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        objects.Textbook textbook3 = new objects.Textbook(32, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        int int17 = textbook3.getId();
        int int18 = textbook3.getId();
        java.lang.String str19 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getCourseId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        objects.Textbook textbook3 = new objects.Textbook(32, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass16 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getCourseId();
        int int14 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        java.lang.String str4 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        int int14 = textbook3.getId();
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getEdition();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        java.lang.String str16 = textbook3.getCourseId();
        objects.observer observer17 = null;
        textbook3.attachObserver(observer17);
        objects.observer observer19 = null;
        textbook3.attachObserver(observer19);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        int int17 = textbook3.getId();
        int int18 = textbook3.getId();
        int int19 = textbook3.getId();
        int int20 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        java.lang.String str17 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        int int15 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getEdition();
        java.lang.String str16 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        objects.Textbook textbook3 = new objects.Textbook(1, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}

