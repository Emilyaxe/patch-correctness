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
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 0L, (int) (byte) 100);
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 10L, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        double double0 = org.apache.commons.math.util.MathUtils.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-16d + "'", double0 == 1.1102230246251565E-16d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 10L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5663706143591725d) + "'", double2 == (-2.5663706143591725d));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.55795945611504d + "'", double1 == 81.55795945611504d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 10, (-972220257));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-972220247) + "'", int2 == (-972220247));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (byte) 1, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) Float.NaN, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals((double) double3, Double.NaN, 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-1), (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-972220247), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-972220247) + "'", int2 == (-972220247));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(Double.NaN, (double) (-1L));
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 'a', (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        double double0 = org.apache.commons.math.util.MathUtils.SAFE_MIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.2250738585072014E-308d + "'", double0 == 2.2250738585072014E-308d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int1 = org.apache.commons.math.util.MathUtils.sign(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(81.55795945611504d, (double) Float.NaN);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) Float.NaN);
        org.junit.Assert.assertEquals((double) double1, Double.NaN, 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1L), (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) (-1.0f), 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(36, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.58351893845611d + "'", double2 == 3.58351893845611d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        float float1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) (byte) 0, 34, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1074790400), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (short) 100, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-972220257), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-972220257) + "'", int2 == (-972220257));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (short) 0, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 0.0f, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 34, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3059272169822616d + "'", double2 == 1.3059272169822616d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) Float.NaN, (-972220257), 0);
        org.junit.Assert.assertEquals((double) double3, Double.NaN, 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 34);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) ' ', (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.5430806348152437d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102.07404554968862d + "'", double2 == 102.07404554968862d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-972220247), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        float float2 = org.apache.commons.math.util.MathUtils.round(0.0f, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) ' ', 618584223);
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-972220257), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1074790400), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790400) + "'", int2 == (-1074790400));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 'a', (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.5d + "'", double2 == 48.5d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) 'a', 618584223);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        double[] doubleArray6 = new double[] { 10, (byte) 1, Float.NaN, 0.0d, 1.0d, 10.0f };
        double[] doubleArray12 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray18 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray18);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray12);
        double[] doubleArray22 = new double[] { (short) 100 };
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray22);
        java.lang.Class<?> wildcardClass24 = doubleArray22.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-1), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (short) 0, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        double double1 = org.apache.commons.math.util.MathUtils.sign(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(618584223, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-456206177) + "'", int2 == (-456206177));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) ' ', (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 320L + "'", long2 == 320L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 320L, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 'a', (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 618584223);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) '4', (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.104412573075518d + "'", double1 == 15.104412573075518d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int1 = org.apache.commons.math.util.MathUtils.sign(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) 0, (-90));
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1), 618584223);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 618584222 + "'", int2 == 618584222);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1L), (long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1074790401L) + "'", long2 == (-1074790401L));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        float float2 = org.apache.commons.math.util.MathUtils.round(0.0f, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        long long1 = org.apache.commons.math.util.MathUtils.sign(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 363.7393755555636d + "'", double1 == 363.7393755555636d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.065817517094494E67d + "'", double1 == 8.065817517094494E67d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 618584222, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-972220257), 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-972220257), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-972220289) + "'", int2 == (-972220289));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1074790400 + "'", int2 == 1074790400);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(15.104412573075518d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.104412573075516d + "'", double2 == 15.104412573075516d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(4.9E-324d, 2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 10, 3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7168146928204138d + "'", double2 == 3.7168146928204138d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 0, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(100, (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 156.3608363030788d + "'", double1 == 156.3608363030788d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 0, 618584223);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 618584223 + "'", int2 == 618584223);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 320L, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 160.0d + "'", double2 == 160.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        double[] doubleArray0 = null;
        int int1 = org.apache.commons.math.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (short) 0, 618584223);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-972220257));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-972220257), (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1), 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-2.0f) + "'", float3 == (-2.0f));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, (long) (-456206177));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 456206177L + "'", long2 == 456206177L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-972220247));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, 34, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (short) 1, (double) 320L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 321.4424506661589d + "'", double2 == 321.4424506661589d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((-0.9999999999999999d), (double) Float.NaN);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999998d) + "'", double2 == (-0.9999999999999998d));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1.0f, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-972220289), (double) (byte) 0);
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(34, 1074790400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.605170185988092d + "'", double2 == 4.605170185988092d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-972220289), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(1L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) -1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 149L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(2.2250738585072014E-308d, (-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.225073858507201E-308d + "'", double2 == 2.225073858507201E-308d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 100, 1074790400, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1072693248 + "'", int1 == 1072693248);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1074790400, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1074790400 + "'", int2 == 1074790400);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (byte) -1, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (short) -1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-97L) + "'", long2 == (-97L));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 10, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 35, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1072693248, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(15.104412573075518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1814399.9999998664d + "'", double1 == 1814399.9999998664d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-972220257));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(3.7168146928204138d, (double) 320L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(2.225073858507201E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 618584223);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 239234924 + "'", int1 == 239234924);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 618584223, (int) (byte) 1, 618584223);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-972220247), (double) (-1L));
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) '#', 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1074790400));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-972220257));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-90), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 60.224974280318214d + "'", double2 == 60.224974280318214d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 618584223, 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.18584223E8d + "'", double2 == 6.18584223E8d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 0L, (double) 618584222);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(34, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray12 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray20 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray26 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray26);
        int int28 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        double[] doubleArray34 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray40 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray34, doubleArray40);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray40);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray40);
        java.lang.Class<?> wildcardClass44 = doubleArray40.getClass();
        double[] doubleArray50 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray56 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean57 = org.apache.commons.math.util.MathUtils.equals(doubleArray50, doubleArray56);
        int int58 = org.apache.commons.math.util.MathUtils.hash(doubleArray56);
        double[] doubleArray64 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray70 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean71 = org.apache.commons.math.util.MathUtils.equals(doubleArray64, doubleArray70);
        int int72 = org.apache.commons.math.util.MathUtils.hash(doubleArray70);
        boolean boolean73 = org.apache.commons.math.util.MathUtils.equals(doubleArray56, doubleArray70);
        boolean boolean74 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray70);
        boolean boolean75 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray40);
        java.lang.Class<?> wildcardClass76 = doubleArray12.getClass();
        boolean boolean77 = org.apache.commons.math.util.MathUtils.equals(doubleArray0, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-972220257) + "'", int14 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-972220257) + "'", int28 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-972220257) + "'", int42 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-972220257) + "'", int58 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-972220257) + "'", int72 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1074790401L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-107479040100L) + "'", long2 == (-107479040100L));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) (-97L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        double double3 = org.apache.commons.math.util.MathUtils.round(1814399.9999998664d, 0, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1814400.0d + "'", double3 == 1814400.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1074790400), (-456206177));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1074790400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((-0.9999999999999999d), 1072693248);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 618584222, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 618584222L + "'", long2 == 618584222L);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 618584222);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 10L, 618584223, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 2L, 2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 34L, (-456206177));
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        double double2 = org.apache.commons.math.util.MathUtils.round((-1.1752011936438014d), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1752011936d) + "'", double2 == (-1.1752011936d));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1074790400), 1, 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0747904E9f) + "'", float3 == (-1.0747904E9f));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) '#', (-456206177));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-456206177), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-456206176) + "'", int2 == (-456206176));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-90), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-190) + "'", int2 == (-190));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(239234924, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 239234934 + "'", int2 == 239234934);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        double double1 = org.apache.commons.math.util.MathUtils.sign(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 618584222L, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0837836265563965d + "'", double2 == 4.0837836265563965d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 10, 60.224974280318214d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(30.0d, (-972220257), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(6.691673596021348E41d, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.345836798010674E41d + "'", double2 == 3.345836798010674E41d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-456206176));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) 100, (long) 618584222);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 618584322L + "'", long2 == 618584322L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) -1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        double double2 = org.apache.commons.math.util.MathUtils.log(81.55795945611504d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0463171368664534d + "'", double2 == 1.0463171368664534d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (byte) 0, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 0L, 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.41592653589793d + "'", double2 == 31.41592653589793d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(15.104412573075516d, (int) ' ', 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-107479040100L), (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0747904009999998E11d) + "'", double2 == (-1.0747904009999998E11d));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.55795945611504d + "'", double1 == 81.55795945611504d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, (-972220289), (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(618584223, 239234924);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 379349299 + "'", int2 == 379349299);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        float float1 = org.apache.commons.math.util.MathUtils.sign(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-90), (-1074790401L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1074790311L + "'", long2 == 1074790311L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-1.0f), (double) (-456206176));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.56206177129112E8d) + "'", double2 == (-4.56206177129112E8d));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(160.0d, (double) 1074790311L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 100L, 34, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-1074790400), (-972220247));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-456206176), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) (byte) 1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 0, (-190));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double[] doubleArray19 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray25 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray25);
        int int29 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-972220257) + "'", int13 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-972220257) + "'", int27 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-972220257) + "'", int29 == (-972220257));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-972220257) + "'", int30 == (-972220257));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-972220257) + "'", int31 == (-972220257));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 10, (-972220247), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 456206177L, (-1.0d));
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(81.55795945611504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 0, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(1.3059272169822616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.710094375780631d + "'", double1 == 1.710094375780631d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round(0.0f, (int) (byte) 1, (-456206176));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-190), 239234934);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', (-456206176));
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int int1 = org.apache.commons.math.util.MathUtils.hash(321.4424506661589d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 122832123 + "'", int1 == 122832123);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(1.3059272169822616d, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 618584223);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(320L, 456206177L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-456205857L) + "'", long2 == (-456205857L));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray12 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray20 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray26 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray26);
        int int28 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray26);
        java.lang.Class<?> wildcardClass30 = doubleArray26.getClass();
        boolean boolean31 = org.apache.commons.math.util.MathUtils.equals(doubleArray0, doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-972220257) + "'", int14 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-972220257) + "'", int28 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 10L, (-972220289));
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(15.104412573075516d, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        long long1 = org.apache.commons.math.util.MathUtils.sign(456206177L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 618584222L, 1072693248);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.18584222E8d + "'", double2 == 6.18584222E8d);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double[] doubleArray19 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray25 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray25);
        java.lang.Class<?> wildcardClass29 = doubleArray25.getClass();
        java.lang.Class<?> wildcardClass30 = doubleArray25.getClass();
        double[] doubleArray36 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray42 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray36, doubleArray42);
        java.lang.Class<?> wildcardClass44 = doubleArray36.getClass();
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-972220257) + "'", int13 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-972220257) + "'", int27 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-1.0f), 2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-1), 618584222);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6537540933272573E47d) + "'", double2 == (-3.6537540933272573E47d));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(Float.NaN);
        org.junit.Assert.assertEquals((float) float1, Float.NaN, 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.13617560368711d + "'", double1 == 92.13617560368711d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 0, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(102.07404554968862d, (-4.56206177129112E8d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round(10.0f, (int) (short) 100, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) '4', (long) 379349299);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 379349351L + "'", long2 == 379349351L);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        long long1 = org.apache.commons.math.util.MathUtils.sign(1074790311L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 618584322L, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.1858432E8d + "'", double2 == 6.1858432E8d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-1074790401L), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.074790401E9d) + "'", double2 == (-1.074790401E9d));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-90));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 379349351L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-456206177));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 618584322L, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.185843219999999E8d + "'", double2 == 6.185843219999999E8d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(18L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1), 379349299);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 379349298 + "'", int2 == 379349298);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 363.7393755555636d + "'", double1 == 363.7393755555636d);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-972220257));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        int int1 = org.apache.commons.math.util.MathUtils.hash(4.0837836265563965d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 537941451 + "'", int1 == 537941451);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray19 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray25 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray19);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 618584223 + "'", int13 == 618584223);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 618584223 + "'", int27 == 618584223);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-190));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 99L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079558144 + "'", int1 == 1079558144);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1074790400, 1079558144);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(320L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 284L + "'", long2 == 284L);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        int int1 = org.apache.commons.math.util.MathUtils.sign(122832123);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 379349299, (long) (-972220289));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-592870990L) + "'", long2 == (-592870990L));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, (-190));
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double[] doubleArray19 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray25 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray25);
        java.lang.Class<?> wildcardClass29 = doubleArray25.getClass();
        java.lang.Class<?> wildcardClass30 = doubleArray25.getClass();
        java.lang.Class<?> wildcardClass31 = doubleArray25.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-972220257) + "'", int13 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-972220257) + "'", int27 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(2, 1072693248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693250 + "'", int2 == 1072693250);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 100L, (-1), (-972220289));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-190));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1066942464) + "'", int1 == (-1066942464));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6313083693369503E35d + "'", double1 == 2.6313083693369503E35d);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(36, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 900 + "'", int2 == 900);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(618584222, 1072693250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        double double2 = org.apache.commons.math.util.MathUtils.log(1.1752011936438014d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(30.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.343237290762231E12d + "'", double1 == 5.343237290762231E12d);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(363.7393755555636d, (double) 1072693250);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 239234924, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(2.6313083693369503E35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(36, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.58351893845611d + "'", double2 == 3.58351893845611d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        double double3 = org.apache.commons.math.util.MathUtils.round((-1.0d), (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 618584222);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) 0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(32, (-456206176));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-456206144) + "'", int2 == (-456206144));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 320L, 6.18584222E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 320.00000000000006d + "'", double2 == 320.00000000000006d);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 18L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1077018624 + "'", int1 == 1077018624);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double[] doubleArray19 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray25 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray25);
        double[] doubleArray34 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray40 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray34, doubleArray40);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray40);
        double[] doubleArray48 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray54 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray48, doubleArray54);
        int int56 = org.apache.commons.math.util.MathUtils.hash(doubleArray54);
        boolean boolean57 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray54);
        java.lang.Class<?> wildcardClass58 = doubleArray54.getClass();
        boolean boolean59 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray54);
        int int60 = org.apache.commons.math.util.MathUtils.hash(doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-972220257) + "'", int13 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-972220257) + "'", int27 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-972220257) + "'", int42 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-972220257) + "'", int56 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-972220257) + "'", int60 == (-972220257));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 10, 618584223);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 618584233 + "'", int2 == 618584233);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-456206144));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, 900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 900 + "'", int2 == 900);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 91L + "'", long2 == 91L);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        double double1 = org.apache.commons.math.util.MathUtils.sign(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.719933267899063E41d + "'", double1 == 3.719933267899063E41d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        double double2 = org.apache.commons.math.util.MathUtils.log(1.0463171368664534d, (double) 456206177L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 440.37085656913064d + "'", double2 == 440.37085656913064d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-90));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, (long) 1077018624);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1077018624L) + "'", long2 == (-1077018624L));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 900);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        int int1 = org.apache.commons.math.util.MathUtils.hash(3.7168146928204138d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 393877977 + "'", int1 == 393877977);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 239234934, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 239234934L + "'", long2 == 239234934L);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-1074790401L), (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0747904009999998E9d) + "'", double2 == (-1.0747904009999998E9d));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double[] doubleArray19 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray25 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        double[] doubleArray33 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray39 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equals(doubleArray33, doubleArray39);
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray39);
        boolean boolean42 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray39);
        java.lang.Class<?> wildcardClass43 = doubleArray39.getClass();
        double[] doubleArray49 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray55 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean56 = org.apache.commons.math.util.MathUtils.equals(doubleArray49, doubleArray55);
        int int57 = org.apache.commons.math.util.MathUtils.hash(doubleArray55);
        double[] doubleArray63 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray69 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean70 = org.apache.commons.math.util.MathUtils.equals(doubleArray63, doubleArray69);
        int int71 = org.apache.commons.math.util.MathUtils.hash(doubleArray69);
        boolean boolean72 = org.apache.commons.math.util.MathUtils.equals(doubleArray55, doubleArray69);
        boolean boolean73 = org.apache.commons.math.util.MathUtils.equals(doubleArray39, doubleArray69);
        boolean boolean74 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray39);
        double[] doubleArray80 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray86 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray80, doubleArray86);
        boolean boolean88 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray86);
        int int89 = org.apache.commons.math.util.MathUtils.hash(doubleArray86);
        java.lang.Class<?> wildcardClass90 = doubleArray86.getClass();
        int int91 = org.apache.commons.math.util.MathUtils.hash(doubleArray86);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-972220257) + "'", int13 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-972220257) + "'", int27 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-972220257) + "'", int41 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-972220257) + "'", int57 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-972220257) + "'", int71 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-972220257) + "'", int89 == (-972220257));
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-972220257) + "'", int91 == (-972220257));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-972220247));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 618584223 + "'", int15 == 618584223);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-456205857L), (long) 239234934);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-695440791L) + "'", long2 == (-695440791L));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(3628800.0d, 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3628799.9999999995d + "'", double2 == 3628799.9999999995d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1066942464));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        double double1 = org.apache.commons.math.util.MathUtils.sign(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 284L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        double double1 = org.apache.commons.math.util.MathUtils.sign(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1), (-972220257));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 972220257 + "'", int2 == 972220257);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        float float2 = org.apache.commons.math.util.MathUtils.round((-2.0f), (-456206176));
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 537941451, 618584223);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.931011557123308E56d) + "'", double2 == (-3.931011557123308E56d));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(1.1752011936438014d, (double) 1074790311L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(30.0d, (-972220289), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(618584222, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-972220247), 1074790400);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.72220247E8d) + "'", double2 == (-9.72220247E8d));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) -1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((-3.931011557123308E56d), 0, (-456206177));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-456206176));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-1.0747904009999998E9d), 1.710094375780631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6714861392974854d) + "'", double2 == (-0.6714861392974854d));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        double double2 = org.apache.commons.math.util.MathUtils.round((-1.1752011936d), 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1752011936d) + "'", double2 == (-1.1752011936d));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-456205857L), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.56205857E8d) + "'", double2 == (-4.56205857E8d));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 35, 972220257);
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        double[] doubleArray6 = new double[] { 10, (byte) 1, Float.NaN, 0.0d, 1.0d, 10.0f };
        double[] doubleArray12 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray18 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray18);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray12);
        double[] doubleArray22 = new double[] { (short) 100 };
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray22);
        java.lang.Class<?> wildcardClass24 = doubleArray12.getClass();
        int int25 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 618584223 + "'", int25 == 618584223);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-972220247));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 122832123);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        double[] doubleArray18 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray24 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray18, doubleArray24);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray24);
        double[] doubleArray32 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray38 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equals(doubleArray32, doubleArray38);
        int int40 = org.apache.commons.math.util.MathUtils.hash(doubleArray38);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray38);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray38);
        double[] doubleArray48 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray54 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray48, doubleArray54);
        int int56 = org.apache.commons.math.util.MathUtils.hash(doubleArray54);
        double[] doubleArray62 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray68 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equals(doubleArray62, doubleArray68);
        int int70 = org.apache.commons.math.util.MathUtils.hash(doubleArray68);
        boolean boolean71 = org.apache.commons.math.util.MathUtils.equals(doubleArray54, doubleArray68);
        int int72 = org.apache.commons.math.util.MathUtils.hash(doubleArray68);
        boolean boolean73 = org.apache.commons.math.util.MathUtils.equals(doubleArray38, doubleArray68);
        boolean boolean74 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray68);
        int int75 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-972220257) + "'", int26 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-972220257) + "'", int40 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-972220257) + "'", int42 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-972220257) + "'", int56 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-972220257) + "'", int70 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-972220257) + "'", int72 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 618584223 + "'", int75 == 618584223);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6313083693369503E35d + "'", double1 == 2.6313083693369503E35d);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(36, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        int int1 = org.apache.commons.math.util.MathUtils.hash(60.224974280318214d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1253955330) + "'", int1 == (-1253955330));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 972220257);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double[] doubleArray19 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray25 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray25);
        int int29 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-972220257) + "'", int13 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-972220257) + "'", int27 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-972220257) + "'", int29 == (-972220257));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 36, (long) 618584222);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-618584186L) + "'", long2 == (-618584186L));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        double double2 = org.apache.commons.math.util.MathUtils.log(3.7168146928204138d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.70807931321432d + "'", double2 == 2.70807931321432d);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, 1077018624, (-1066942464));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 149L, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.99999999999997d + "'", double2 == 148.99999999999997d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 0, 239234924);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(8.065817517094494E67d, (double) 2L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(537941451, 618584222);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) 0, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(440.37085656913064d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5478850665596156d + "'", double2 == 0.5478850665596156d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.0463171368664534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.599187517120123d + "'", double1 == 1.599187517120123d);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((-4.56205857E8d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.5620585699999994E8d) + "'", double2 == (-4.5620585699999994E8d));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1077018624L), 239234934L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1316253558L) + "'", long2 == (-1316253558L));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 284L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-1074790400), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1066942464), 379349299);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-687593165) + "'", int2 == (-687593165));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 10, 1074790400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790390) + "'", int2 == (-1074790390));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 284L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1), (-1066942464));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1066942463 + "'", int2 == 1066942463);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 34L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        long long1 = org.apache.commons.math.util.MathUtils.sign(379349351L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (byte) 100, 3628799.9999999995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000001d + "'", double2 == 100.00000000000001d);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-456206176));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        double[] doubleArray6 = new double[] { 10, (byte) 1, Float.NaN, 0.0d, 1.0d, 10.0f };
        double[] doubleArray12 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray18 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray18);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray12);
        double[] doubleArray22 = new double[] { (short) 100 };
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray22);
        java.lang.Class<?> wildcardClass24 = doubleArray12.getClass();
        java.lang.Class<?> wildcardClass25 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 1, (-456206144));
        org.junit.Assert.assertEquals((double) double2, Double.NaN, 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-97L), (int) 'a');
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(99.99999999999999d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 199.99999999999997d + "'", double2 == 199.99999999999997d);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1066942463, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1066942445L + "'", long2 == 1066942445L);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1072693248);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        double double3 = org.apache.commons.math.util.MathUtils.round(148.99999999999997d, 1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 149.0d + "'", double3 == 149.0d);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        double[] doubleArray18 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray24 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray18, doubleArray24);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray24);
        double[] doubleArray32 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray38 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equals(doubleArray32, doubleArray38);
        int int40 = org.apache.commons.math.util.MathUtils.hash(doubleArray38);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray38);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray38);
        double[] doubleArray48 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray54 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray48, doubleArray54);
        int int56 = org.apache.commons.math.util.MathUtils.hash(doubleArray54);
        double[] doubleArray62 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray68 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equals(doubleArray62, doubleArray68);
        int int70 = org.apache.commons.math.util.MathUtils.hash(doubleArray68);
        boolean boolean71 = org.apache.commons.math.util.MathUtils.equals(doubleArray54, doubleArray68);
        int int72 = org.apache.commons.math.util.MathUtils.hash(doubleArray68);
        boolean boolean73 = org.apache.commons.math.util.MathUtils.equals(doubleArray38, doubleArray68);
        boolean boolean74 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray68);
        double[] doubleArray80 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray86 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray80, doubleArray86);
        java.lang.Class<?> wildcardClass88 = doubleArray80.getClass();
        int int89 = org.apache.commons.math.util.MathUtils.hash(doubleArray80);
        boolean boolean90 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray80);
        java.lang.Class<?> wildcardClass91 = doubleArray80.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-972220257) + "'", int26 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-972220257) + "'", int40 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-972220257) + "'", int42 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-972220257) + "'", int56 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-972220257) + "'", int70 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-972220257) + "'", int72 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 618584223 + "'", int89 == 618584223);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1066942464));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.626860407847019d) + "'", double1 == (-3.626860407847019d));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-2L), 32, (-190));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(379349299);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1074790400);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(618584222);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 10, 239234924);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.802596928649634E-44d + "'", double2 == 2.802596928649634E-44d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((-0.6714861392974854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((-3.931011557123308E56d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1079574528);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        double double2 = org.apache.commons.math.util.MathUtils.round(3.719933267899063E41d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.719933267899063E41d + "'", double2 == 3.719933267899063E41d);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1072693248, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 618584322L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(618584222, 618584223);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double[] doubleArray19 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray25 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray25);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray25);
        java.lang.Class<?> wildcardClass29 = doubleArray11.getClass();
        java.lang.Class<?> wildcardClass30 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-972220257) + "'", int13 == (-972220257));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-972220257) + "'", int27 == (-972220257));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 900, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 910L + "'", long2 == 910L);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 379349298, (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.008401930332184d + "'", double2 == 31.008401930332184d);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 900, 0.5478850665596156d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 899.9999999999999d + "'", double2 == 899.9999999999999d);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        float float2 = org.apache.commons.math.util.MathUtils.round(0.0f, 1079558144);
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 0, 972220257);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 2, 1079574528);
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-687593165), 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        double[] doubleArray5 = new double[] { 100.0f, 100, (-1L), (byte) 1, '4' };
        double[] doubleArray11 = new double[] { (-1.0f), (-1.0f), (-1.0f), (byte) 1, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        double[] doubleArray14 = null;
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray14);
        java.lang.Class<?> wildcardClass16 = doubleArray5.getClass();
        java.lang.Class<?> wildcardClass17 = doubleArray5.getClass();
        double[] doubleArray18 = null;
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray18);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-2L), (-1074790390));
        org.junit.Assert.assertEquals((float) float2, Float.NaN, 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1072693248, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(36, 239234934);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-239234898) + "'", int2 == (-239234898));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (short) -1, (long) 618584223);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-618584224L) + "'", long2 == (-618584224L));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 239234924);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }
}

