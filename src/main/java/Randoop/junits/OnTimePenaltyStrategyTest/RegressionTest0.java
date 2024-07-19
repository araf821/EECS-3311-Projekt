package Randoop.junits.OnTimePenaltyStrategyTest;

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
        objects.OnTimePenaltyStrategy onTimePenaltyStrategy0 = new objects.OnTimePenaltyStrategy();
        java.lang.Class<?> wildcardClass1 = onTimePenaltyStrategy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        objects.OnTimePenaltyStrategy onTimePenaltyStrategy0 = new objects.OnTimePenaltyStrategy();
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = onTimePenaltyStrategy0.calculate(date1, date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.after(java.util.Date)\" because \"returnDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

