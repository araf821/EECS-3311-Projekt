package Randoop.junits.TextbookTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        int int13 = textbook3.getId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.Class<?> wildcardClass17 = textbook3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        java.lang.String str13 = textbook3.getCourseId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        int int14 = textbook3.getId();
        int int15 = textbook3.getId();
        java.lang.Class<?> wildcardClass16 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        int int14 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        java.lang.String str15 = textbook3.getCourseId();
        java.lang.String str16 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass17 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        java.lang.String str15 = textbook3.getEdition();
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        java.lang.String str16 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        objects.Textbook textbook3 = new objects.Textbook(32, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        java.lang.String str13 = textbook3.getEdition();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        int int16 = textbook3.getId();
        objects.observer observer17 = null;
        textbook3.attachObserver(observer17);
        java.lang.Class<?> wildcardClass19 = textbook3.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        int int13 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        objects.Textbook textbook3 = new objects.Textbook(100, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        java.lang.String str14 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        objects.Textbook textbook3 = new objects.Textbook(1, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        int int14 = textbook3.getId();
        int int15 = textbook3.getId();
        int int16 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.lang.String str14 = textbook3.getCourseId();
        java.lang.String str15 = textbook3.getEdition();
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        objects.Textbook textbook3 = new objects.Textbook(1, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        int int4 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        objects.observer observer18 = null;
        textbook3.attachObserver(observer18);
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
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.lang.String str18 = textbook3.getEdition();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        objects.Textbook textbook3 = new objects.Textbook(32, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        objects.observer observer18 = null;
        textbook3.attachObserver(observer18);
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
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        int int14 = textbook3.getId();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        int int14 = textbook3.getId();
        int int15 = textbook3.getId();
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        java.lang.String str13 = textbook3.getEdition();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        int int15 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        java.lang.String str14 = textbook3.getCourseId();
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        objects.observer observer17 = null;
        textbook3.attachObserver(observer17);
        java.lang.String str19 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "", "");
        int int4 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        int int13 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        java.lang.String str18 = textbook3.getCourseId();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.lang.Class<?> wildcardClass16 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        int int14 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getCourseId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        java.lang.String str14 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        objects.Textbook textbook3 = new objects.Textbook(1, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        java.lang.String str13 = textbook3.getEdition();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        java.lang.Class<?> wildcardClass16 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        int int14 = textbook3.getId();
        int int15 = textbook3.getId();
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        objects.observer observer17 = null;
        textbook3.attachObserver(observer17);
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
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.lang.String str14 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        int int13 = textbook3.getId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }
}

