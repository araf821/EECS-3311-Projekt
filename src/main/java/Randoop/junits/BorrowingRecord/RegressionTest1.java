package Randoop.junits.BorrowingRecord;

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
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) (short) 0, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) ' ', 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (-1), (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, 0, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', 10, 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (int) (short) -1, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (short) 100, (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (short) 0, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (byte) 10, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (int) (byte) 100, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, (int) (short) 100, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) '#', 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', 0, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', 0, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', 1, (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, 1, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) '4', (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, (int) (byte) -1, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) '#', (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (byte) 0, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (byte) -1, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (int) (byte) 10, (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (int) (short) 1, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', 1, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (byte) 1, (int) (short) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (short) 100, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, (-1), (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) (short) -1, (int) (short) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, 0, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (byte) 0, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (byte) -1, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) '4', (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) (short) 1, (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, (int) (short) 1, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, 10, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) (short) 100, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (short) 100, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, (int) (short) 0, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (byte) 10, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', 100, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, 0, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, (int) (byte) 1, (int) (byte) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, 0, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (short) -1, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (int) (short) 10, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) (byte) 100, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, 10, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, 100, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) 'a', (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', 1, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (int) (byte) 10, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, 10, (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (-1), (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, 10, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, (int) ' ', (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, 0, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, 100, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, 100, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) (byte) 10, (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) -1, (int) (byte) 100, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', 10, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (-1), (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, 0, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) '4', 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (-1), 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) '#', (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, 0, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (int) (short) 10, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) (byte) 10, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) '#', 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) '#', 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) ' ', (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) (byte) 0, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, (int) 'a', (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (short) 100, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (int) (byte) -1, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, 100, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, (int) (short) 1, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (-1), (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) '4', (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) '#', (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) ' ', (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (int) (short) 100, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (short) -1, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', 100, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, 0, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) -1, (-1), (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, (int) (byte) 10, (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (byte) 0, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (byte) 10, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (int) (byte) 100, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) '4', 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, (int) (short) -1, (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) (byte) 1, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, 10, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) '#', 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (byte) 100, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) ' ', 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (short) 0, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, 1, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, 1, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (int) (short) 10, (int) (short) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, 100, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (short) 1, (int) (short) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, (int) (byte) 1, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, 100, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (int) (short) 10, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) (byte) 10, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) (byte) 10, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) (short) 0, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) (byte) 0, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (byte) -1, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (byte) -1, (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (int) (byte) 10, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) ' ', (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) '4', 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (byte) 10, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (-1), 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) -1, 0, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, (int) (byte) 1, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, (int) 'a', (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, 0, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) 'a', (int) (byte) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (byte) 100, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, 100, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (byte) 0, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, 10, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, (int) ' ', (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, 1, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) (byte) -1, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) (byte) 0, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, 0, 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), 100, (int) (byte) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) (short) 1, (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', 1, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, 1, (int) (byte) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (int) (byte) 0, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, (int) '4', (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (short) 100, (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (short) 100, (int) (byte) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) (short) 100, 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', 0, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), 1, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, 0, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, 0, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) '4', (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (int) (short) 100, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) 'a', (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, (int) (byte) -1, (int) (short) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (int) (short) 1, (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) '4', (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (int) '4', (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) (byte) 0, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (short) 0, (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (int) (byte) 10, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) -1, (int) (short) -1, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, 100, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) (short) 10, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', 100, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (-1), (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) 'a', 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) (short) 0, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) '#', 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (-1), (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', 0, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) (short) 0, 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, 10, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', 1, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) -1, 10, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, 0, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (byte) 100, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) ' ', 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) (byte) 100, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) -1, (int) ' ', (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, (int) (short) 1, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) ' ', (int) (byte) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, 0, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, (int) (short) 1, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, (int) (short) 10, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, 10, (int) (short) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (int) (short) 1, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (byte) 1, 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) (byte) -1, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) -1, (int) (short) 100, (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (byte) 10, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, (int) '#', (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (byte) 1, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, 0, (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (short) 100, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) '#', (int) (short) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (-1), (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) (short) 100, (int) (short) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (byte) 10, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (byte) 100, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) 'a', (int) (byte) 1, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, 1, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, (int) '#', (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) '4', 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (short) 10, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (short) -1, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) (short) 0, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) '4', (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (short) 10, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (int) '4', (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) (short) 0, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, (-1), (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (-1), (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((-1), (int) (byte) 10, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) ' ', 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (int) (byte) 1, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (int) (short) 100, (int) (byte) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, (int) (short) 10, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (int) (byte) 100, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) '#', (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) ' ', (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) '4', 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) ' ', (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (int) '#', 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (int) (short) 0, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', 0, (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (byte) 0, (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) 'a', (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (byte) 1, (int) '4', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (int) (byte) -1, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (-1), (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 100, (int) (byte) 0, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (int) (byte) 1, (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', (-1), (int) (short) -1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, (int) (short) 10, (int) '#', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, 0, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) (short) 0, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) (byte) 100, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(100, (int) (short) 100, 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (short) 1, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, 0, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (byte) 1, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 10, (int) (short) 100, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 100, 1, (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (int) (short) -1, (int) (byte) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) (byte) 10, (int) ' ', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) '#', (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 1, (int) ' ', (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, (int) (short) 10, (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) '4', 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '4', (int) (short) -1, (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 10, (int) '#', (int) (short) 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) -1, (int) (short) 10, (int) (byte) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 0, (int) (byte) 100, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (byte) 10, 100, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(0, (int) (short) 100, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (short) 0, (int) (short) 1, (-1), date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) (byte) 1, 1, (int) (short) 1, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (byte) 1, (int) (byte) 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(1, 10, 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) '#', (int) (byte) 1, (int) 'a', date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord(10, (int) (byte) 10, 10, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objects.BorrowingRecord borrowingRecord4 = new objects.BorrowingRecord((int) ' ', 1, (int) (short) 0, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

