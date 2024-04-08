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
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "hi!", (int) '#', textbook3, "hi!");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 100, "", 32, textbook3, "hi!");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '4', "", (int) (byte) 0, textbook3, "hi!");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "", (-1), textbook3, "");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(35, "hi!", 35, textbook3, "hi!");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", 10, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(1, "", 32, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getTerm();
        java.lang.String str11 = course5.getCourseName();
        java.lang.String str12 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 100, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", 0, textbook3, "hi!");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", (int) (byte) 10, textbook3, "hi!");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 100, "hi!", (int) (byte) 0, textbook3, "");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        int int18 = course5.getFacultyId();
        java.lang.String str19 = course5.getCourseName();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        java.lang.Class<?> wildcardClass10 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        java.lang.Class<?> wildcardClass18 = course5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        java.lang.Class<?> wildcardClass13 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getFacultyId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getTerm();
        objects.Textbook textbook13 = course5.getTextbook();
        java.lang.String str14 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(textbook13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) 'a', "", (int) (short) 0, textbook3, "hi!");
        int int6 = course5.getId();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        java.lang.String str9 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "", 0, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        int int9 = course5.getFacultyId();
        objects.Textbook textbook10 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(textbook10);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "hi!", (int) (byte) 1, textbook3, "");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", 1, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        int int12 = course5.getFacultyId();
        int int13 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getFacultyId();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        int int15 = course5.getId();
        int int16 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(textbook14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "hi!", 0, textbook3, "");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) 'a', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "", 10, textbook3, "hi!");
        int int6 = course5.getId();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        int int9 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        int int8 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 100, "hi!", (int) ' ', textbook3, "");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        java.lang.String str12 = course5.getCourseName();
        java.lang.String str13 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getFacultyId();
        int int9 = course5.getId();
        java.lang.String str10 = course5.getTerm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        int int11 = course5.getId();
        java.lang.String str12 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 100, "hi!", (int) ' ', textbook3, "hi!");
        java.lang.String str6 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        int int11 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) -1, "", (int) (byte) 1, textbook3, "hi!");
        java.lang.Class<?> wildcardClass6 = course5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 0, "", (int) (short) 10, textbook3, "");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "", (int) (short) 10, textbook3, "");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        int int7 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "hi!", (int) (byte) 10, textbook3, "");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 100, "hi!", (int) '#', textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "hi!", 32, textbook3, "hi!");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "hi!", (int) (short) 100, textbook3, "");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "hi!", (int) ' ', textbook3, "");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        int int11 = course5.getId();
        int int12 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((-1), "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 100, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((-1), "", (int) (short) 0, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        objects.Textbook textbook7 = course5.getTextbook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        int int9 = course5.getFacultyId();
        int int10 = course5.getId();
        objects.Textbook textbook11 = course5.getTextbook();
        objects.Textbook textbook12 = course5.getTextbook();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(textbook11);
        org.junit.Assert.assertNull(textbook12);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        int int11 = course5.getFacultyId();
        java.lang.String str12 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", 10, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        objects.Textbook textbook8 = course5.getTextbook();
        int int9 = course5.getId();
        int int10 = course5.getFacultyId();
        java.lang.String str11 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertNull(textbook8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", (-1), textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) (short) -1, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.String str7 = course5.getCourseName();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "hi!", (int) (byte) 0, textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        org.junit.Assert.assertNull(textbook6);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getId();
        java.lang.String str12 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 0, "", (int) (short) 10, textbook3, "");
        int int6 = course5.getFacultyId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getCourseName();
        java.lang.String str10 = course5.getCourseName();
        java.lang.String str11 = course5.getTerm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        int int9 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "", (int) ' ', textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        java.lang.String str8 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getTerm();
        java.lang.String str10 = course5.getCourseName();
        objects.Textbook textbook11 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(textbook11);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (byte) 100, "hi!", (int) '#', textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        java.lang.String str7 = course5.getCourseName();
        int int8 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        java.lang.String str9 = course5.getCourseName();
        objects.Textbook textbook10 = course5.getTextbook();
        int int11 = course5.getId();
        java.lang.String str12 = course5.getTerm();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "hi!", 0, textbook3, "hi!");
        int int6 = course5.getFacultyId();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 10, "hi!", 0, textbook3, "");
        java.lang.String str6 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) ' ', "", (int) (byte) 0, textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getCourseName();
        java.lang.Class<?> wildcardClass8 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getTerm();
        objects.Textbook textbook9 = course5.getTextbook();
        java.lang.String str10 = course5.getCourseName();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.Class<?> wildcardClass11 = course5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "", (int) ' ', textbook3, "");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        java.lang.String str6 = course5.getTerm();
        java.lang.String str7 = course5.getTerm();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getTerm();
        int int10 = course5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(100, "", (-1), textbook3, "");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '4', "", (-1), textbook3, "hi!");
        int int6 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        objects.Textbook textbook7 = course5.getTextbook();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        int int10 = course5.getId();
        int int11 = course5.getId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        int int11 = course5.getId();
        java.lang.String str12 = course5.getTerm();
        int int13 = course5.getFacultyId();
        objects.Textbook textbook14 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(textbook14);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(0, "", (int) (byte) 0, textbook3, "");
        int int6 = course5.getId();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "hi!", (int) (byte) 100, textbook3, "");
        int int6 = course5.getId();
        java.lang.Class<?> wildcardClass7 = course5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getId();
        java.lang.String str8 = course5.getCourseName();
        java.lang.String str9 = course5.getCourseName();
        objects.Textbook textbook10 = course5.getTextbook();
        java.lang.String str11 = course5.getTerm();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(textbook10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 1, "", (int) ' ', textbook3, "");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(97, "", 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        int int7 = course5.getFacultyId();
        objects.Textbook textbook8 = course5.getTextbook();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = textbook8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(textbook8);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) '#', "", (int) (short) 0, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getId();
        objects.Textbook textbook9 = course5.getTextbook();
        int int10 = course5.getId();
        int int11 = course5.getFacultyId();
        objects.Textbook textbook12 = course5.getTextbook();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(textbook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(textbook12);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course((int) (short) 0, "", (int) '4', textbook3, "");
        objects.Textbook textbook6 = course5.getTextbook();
        int int7 = course5.getFacultyId();
        int int8 = course5.getFacultyId();
        int int9 = course5.getId();
        int int10 = course5.getFacultyId();
        org.junit.Assert.assertNull(textbook6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        objects.Textbook textbook3 = null;
        objects.Course course5 = new objects.Course(52, "hi!", (int) (short) 100, textbook3, "hi!");
        java.lang.String str6 = course5.getCourseName();
        objects.Textbook textbook7 = course5.getTextbook();
        int int8 = course5.getFacultyId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(textbook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }
}

