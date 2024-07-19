package Randoop.junits.TextbookTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        int int13 = textbook3.getId();
        int int14 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "hi!", "");
        int int4 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        objects.Textbook textbook3 = new objects.Textbook(10, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        int int14 = textbook3.getId();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        java.lang.String str13 = textbook3.getEdition();
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        int int15 = textbook3.getId();
        java.lang.String str16 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        java.lang.String str14 = textbook3.getCourseId();
        int int15 = textbook3.getId();
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        objects.observer observer19 = null;
        textbook3.attachObserver(observer19);
        java.lang.Class<?> wildcardClass21 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
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
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
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
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        java.lang.String str16 = textbook3.getCourseId();
        java.lang.String str17 = textbook3.getEdition();
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getCourseId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        java.lang.String str14 = textbook3.getCourseId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        java.lang.String str17 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        int int19 = textbook3.getId();
        java.lang.String str20 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass21 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "");
        java.lang.String str4 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        java.lang.Class<?> wildcardClass17 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        int int15 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        int int17 = textbook3.getId();
        java.lang.String str18 = textbook3.getCourseId();
        java.lang.String str19 = textbook3.getCourseId();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        java.lang.String str15 = textbook3.getEdition();
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        int int13 = textbook3.getId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.lang.String str13 = textbook3.getEdition();
        java.lang.String str14 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        java.lang.String str18 = textbook3.getEdition();
        java.lang.String str19 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        int int12 = textbook3.getId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        objects.observer observer17 = null;
        textbook3.attachObserver(observer17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        int int16 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        objects.Textbook textbook3 = new objects.Textbook(32, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        java.lang.String str18 = textbook3.getCourseId();
        java.lang.String str19 = textbook3.getEdition();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        java.lang.String str14 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        objects.Textbook textbook3 = new objects.Textbook(97, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
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
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getEdition();
        java.lang.String str16 = textbook3.getEdition();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        int int14 = textbook3.getId();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
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
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        java.lang.String str19 = textbook3.getEdition();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        objects.observer observer17 = null;
        textbook3.attachObserver(observer17);
        java.lang.String str19 = textbook3.getEdition();
        int int20 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        objects.Textbook textbook3 = new objects.Textbook(100, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        int int14 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        objects.observer observer16 = null;
        textbook3.attachObserver(observer16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

