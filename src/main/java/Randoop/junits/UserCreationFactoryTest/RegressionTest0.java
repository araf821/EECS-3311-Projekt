package Randoop.junits.UserCreationFactoryTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        objects.UserCreationFactory userCreationFactory0 = new objects.UserCreationFactory();
        java.lang.Class<?> wildcardClass1 = userCreationFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) -1, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) 'a', "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(0, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) -1, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 10, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(0, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 10, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 0, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 100, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) -1, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) ' ', "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) 'a', "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) '#', "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 10, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(100, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) ' ', "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) ' ', "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(10, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 1, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) -1, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 10, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(100, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 100, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 1, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) -1, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 1, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 1, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) '#', "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(0, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(1, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 0, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(0, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) '4', "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 10, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) '4', "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(10, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(100, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 100, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 100, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((-1), "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) '#', "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 100, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 1, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 0, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((-1), "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) '#', "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(1, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 100, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) '4', "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(100, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(10, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 0, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) ' ', "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 1, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) -1, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(1, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) 'a', "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) -1, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 0, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 0, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 10, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 100, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) '4', "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 1, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 0, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((-1), "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) 'a', "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(1, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails(10, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 10, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 0, "hi!", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) -1, "", "", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 1, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (byte) 10, "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((int) (short) 100, "hi!", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        objects.User.UserType userType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.User user4 = objects.UserCreationFactory.getDetails((-1), "", "hi!", userType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"objects.User$UserType.toString()\" because \"userType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

