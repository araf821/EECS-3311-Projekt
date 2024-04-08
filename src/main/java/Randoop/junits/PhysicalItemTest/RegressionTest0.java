package Randoop.junits.PhysicalItemTest;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVLine("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        // The following exception was thrown during execution in test generation
        try {
            objects.PhysicalItem physicalItem1 = objects.PhysicalItem.fromCSVString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        objects.PhysicalItem.ItemType itemType0 = objects.PhysicalItem.ItemType.CD;
        java.lang.Class<?> wildcardClass1 = itemType0.getClass();
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + objects.PhysicalItem.ItemType.CD + "'", itemType0.equals(objects.PhysicalItem.ItemType.CD));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        objects.PhysicalItem.ItemType itemType0 = objects.PhysicalItem.ItemType.MAGAZINE;
        java.lang.Class<?> wildcardClass1 = itemType0.getClass();
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + objects.PhysicalItem.ItemType.MAGAZINE + "'", itemType0.equals(objects.PhysicalItem.ItemType.MAGAZINE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        objects.PhysicalItem.ItemType itemType0 = objects.PhysicalItem.ItemType.BOOK;
        java.lang.Class<?> wildcardClass1 = itemType0.getClass();
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + objects.PhysicalItem.ItemType.BOOK + "'", itemType0.equals(objects.PhysicalItem.ItemType.BOOK));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

