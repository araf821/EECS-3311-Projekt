package Randoop.junits.Usertests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        objects.User.UserType userType0 = objects.User.UserType.STUDENT;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + objects.User.UserType.STUDENT + "'", userType0.equals(objects.User.UserType.STUDENT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        objects.User.UserType userType0 = objects.User.UserType.NON_FACULTY_STAFF;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + objects.User.UserType.NON_FACULTY_STAFF + "'", userType0.equals(objects.User.UserType.NON_FACULTY_STAFF));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        objects.User.UserType userType0 = objects.User.UserType.SYSTEM_MANAGER;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + objects.User.UserType.SYSTEM_MANAGER + "'", userType0.equals(objects.User.UserType.SYSTEM_MANAGER));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        objects.User.UserType userType0 = objects.User.UserType.VISITOR;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + objects.User.UserType.VISITOR + "'", userType0.equals(objects.User.UserType.VISITOR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        objects.User.UserType userType0 = objects.User.UserType.FACULTY;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + objects.User.UserType.FACULTY + "'", userType0.equals(objects.User.UserType.FACULTY));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

