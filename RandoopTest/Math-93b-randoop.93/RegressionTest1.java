import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest1 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test001");
    int int1=org.apache.commons.math.util.MathUtils.hash((double)(-618584224L));
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ (-1849528468)+ "'",int1 == (-1849528468));
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test002");
    long long2=org.apache.commons.math.util.MathUtils.binomialCoefficient(0,(-456206177));
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test003#26");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test003");
    float float2=org.apache.commons.math.util.MathUtils.round((float)(-972220289),(int)(short)0);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ (-9.7222029E8f)+ "'",float2 == (-9.7222029E8f));
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test004#34");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test004");
    double double2=org.apache.commons.math.util.MathUtils.nextAfter(156.3608363030788d,32.0d);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 156.36083630307877d+ "'",double2 == 156.36083630307877d);
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test005#42");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test005");
    double double1=org.apache.commons.math.util.MathUtils.sign((double)1066942463);
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 1.0d+ "'",double1 == 1.0d);
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test006#50");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test006");
    try {
      double double2=org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-972220247),(-1849528468));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test007#61");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test007");
    double double1=org.apache.commons.math.util.MathUtils.sinh((double)(-972220247));
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ Double.NEGATIVE_INFINITY+ "'",double1 == Double.NEGATIVE_INFINITY);
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test008#69");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test008");
    double double2=org.apache.commons.math.util.MathUtils.scalb(3.58351893845611d,1072693250);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 14.33407575382444d+ "'",double2 == 14.33407575382444d);
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test009#77");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test009");
    double double2=org.apache.commons.math.util.MathUtils.nextAfter(0.0d,1.3059272169822616d);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 4.9E-324d+ "'",double2 == 4.9E-324d);
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test010#85");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test010");
    double double1=org.apache.commons.math.util.MathUtils.cosh(1814400.0d);
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ Double.POSITIVE_INFINITY+ "'",double1 == Double.POSITIVE_INFINITY);
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test011#93");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test011");
    float float1=org.apache.commons.math.util.MathUtils.sign((float)(short)0);
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test012#101");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test012");
    double double2=org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(900,0);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 1.0d+ "'",double2 == 1.0d);
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test013#109");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test013");
    int int2=org.apache.commons.math.util.MathUtils.subAndCheck((int)(byte)100,1072693248);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1072693148)+ "'",int2 == (-1072693148));
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test014#117");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test014");
    long long2=org.apache.commons.math.util.MathUtils.mulAndCheck((-1074790401L),(long)10);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ (-10747904010L)+ "'",long2 == (-10747904010L));
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test015#125");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test015");
    try {
      double double3=org.apache.commons.math.util.MathUtils.round((double)(-2L),32,34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test016#136");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test016");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck(0L,(long)972220257);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ (-972220257L)+ "'",long2 == (-972220257L));
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test017#144");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test017");
    int int2=org.apache.commons.math.util.MathUtils.subAndCheck((-1066942464),97);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1066942561)+ "'",int2 == (-1066942561));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test018#152");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test018");
    double double2=org.apache.commons.math.util.MathUtils.normalizeAngle((double)(-10747904010L),(-0.6714861392974854d));
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ (-0.43167877197265625d)+ "'",double2 == (-0.43167877197265625d));
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test019#160");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test019");
    int int2=org.apache.commons.math.util.MathUtils.subAndCheck(0,1079558144);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1079558144)+ "'",int2 == (-1079558144));
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test020#168");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test020");
    try {
      double double3=org.apache.commons.math.util.MathUtils.round((double)10L,(-239234898),(-456206144));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test021#179");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test021");
    double[] doubleArray0=new double[]{};
    int int1=org.apache.commons.math.util.MathUtils.hash(doubleArray0);
    java.lang.Class<?> wildcardClass2=doubleArray0.getClass();
    org.junit.Assert.assertNotNull(doubleArray0);
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 1+ "'",int1 == 1);
    org.junit.Assert.assertNotNull(wildcardClass2);
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test022#191");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test022");
    int int1=org.apache.commons.math.util.MathUtils.indicator((-456206177));
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ (-1)+ "'",int1 == (-1));
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test023#199");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test023");
    double[] doubleArray5=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray11=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean12=org.apache.commons.math.util.MathUtils.equals(doubleArray5,doubleArray11);
    int int13=org.apache.commons.math.util.MathUtils.hash(doubleArray5);
    java.lang.Class<?> wildcardClass14=doubleArray5.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ 618584223+ "'",int13 == 618584223);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test024#215");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test024");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck((long)(-687593165),(long)(-972220247));
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 284627082L+ "'",long2 == 284627082L);
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test025#223");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test025");
    try {
      long long2=org.apache.commons.math.util.MathUtils.binomialCoefficient((int)(short)10,379349299);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test026#234");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test026");
    int int1=org.apache.commons.math.util.MathUtils.hash((double)379349351L);
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 649501801+ "'",int1 == 649501801);
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test027#242");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test027");
    long long1=org.apache.commons.math.util.MathUtils.sign(618584322L);
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 1L+ "'",long1 == 1L);
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test028#250");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test028");
    int int2=org.apache.commons.math.util.MathUtils.gcd((-1074790390),(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test029#258");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test029");
    long long1=org.apache.commons.math.util.MathUtils.sign((long)618584222);
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 1L+ "'",long1 == 1L);
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test030#266");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test030");
    double[] doubleArray5=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray11=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean12=org.apache.commons.math.util.MathUtils.equals(doubleArray5,doubleArray11);
    double[] doubleArray18=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray24=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean25=org.apache.commons.math.util.MathUtils.equals(doubleArray18,doubleArray24);
    int int26=org.apache.commons.math.util.MathUtils.hash(doubleArray24);
    double[] doubleArray32=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray38=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean39=org.apache.commons.math.util.MathUtils.equals(doubleArray32,doubleArray38);
    int int40=org.apache.commons.math.util.MathUtils.hash(doubleArray38);
    boolean boolean41=org.apache.commons.math.util.MathUtils.equals(doubleArray24,doubleArray38);
    int int42=org.apache.commons.math.util.MathUtils.hash(doubleArray38);
    double[] doubleArray48=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray54=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean55=org.apache.commons.math.util.MathUtils.equals(doubleArray48,doubleArray54);
    int int56=org.apache.commons.math.util.MathUtils.hash(doubleArray54);
    double[] doubleArray62=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray68=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean69=org.apache.commons.math.util.MathUtils.equals(doubleArray62,doubleArray68);
    int int70=org.apache.commons.math.util.MathUtils.hash(doubleArray68);
    boolean boolean71=org.apache.commons.math.util.MathUtils.equals(doubleArray54,doubleArray68);
    int int72=org.apache.commons.math.util.MathUtils.hash(doubleArray68);
    boolean boolean73=org.apache.commons.math.util.MathUtils.equals(doubleArray38,doubleArray68);
    boolean boolean74=org.apache.commons.math.util.MathUtils.equals(doubleArray5,doubleArray68);
    double[] doubleArray80=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray86=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean87=org.apache.commons.math.util.MathUtils.equals(doubleArray80,doubleArray86);
    java.lang.Class<?> wildcardClass88=doubleArray80.getClass();
    int int89=org.apache.commons.math.util.MathUtils.hash(doubleArray80);
    boolean boolean90=org.apache.commons.math.util.MathUtils.equals(doubleArray5,doubleArray80);
    int int91=org.apache.commons.math.util.MathUtils.hash(doubleArray80);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertTrue("'" + int26 + "' != '"+ (-972220257)+ "'",int26 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertTrue("'" + int40 + "' != '"+ (-972220257)+ "'",int40 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ true+ "'",boolean41 == true);
    org.junit.Assert.assertTrue("'" + int42 + "' != '"+ (-972220257)+ "'",int42 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray48);
    org.junit.Assert.assertNotNull(doubleArray54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '"+ false+ "'",boolean55 == false);
    org.junit.Assert.assertTrue("'" + int56 + "' != '"+ (-972220257)+ "'",int56 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray62);
    org.junit.Assert.assertNotNull(doubleArray68);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '"+ false+ "'",boolean69 == false);
    org.junit.Assert.assertTrue("'" + int70 + "' != '"+ (-972220257)+ "'",int70 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '"+ true+ "'",boolean71 == true);
    org.junit.Assert.assertTrue("'" + int72 + "' != '"+ (-972220257)+ "'",int72 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '"+ true+ "'",boolean73 == true);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '"+ false+ "'",boolean74 == false);
    org.junit.Assert.assertNotNull(doubleArray80);
    org.junit.Assert.assertNotNull(doubleArray86);
    org.junit.Assert.assertTrue("'" + boolean87 + "' != '"+ false+ "'",boolean87 == false);
    org.junit.Assert.assertNotNull(wildcardClass88);
    org.junit.Assert.assertTrue("'" + int89 + "' != '"+ 618584223+ "'",int89 == 618584223);
    org.junit.Assert.assertTrue("'" + boolean90 + "' != '"+ true+ "'",boolean90 == true);
    org.junit.Assert.assertTrue("'" + int91 + "' != '"+ 618584223+ "'",int91 == 618584223);
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test031#336");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test031");
    try {
      double double3=org.apache.commons.math.util.MathUtils.round((double)(-1079558144),(-972220289),239234934);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test032#347");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test032");
    long long2=org.apache.commons.math.util.MathUtils.addAndCheck(618584322L,(long)1079558144);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 1698142466L+ "'",long2 == 1698142466L);
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test033#355");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test033");
    boolean boolean2=org.apache.commons.math.util.MathUtils.equals(3.7168146928204138d,(double)618584222L);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test034#363");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test034");
    try {
      float float3=org.apache.commons.math.util.MathUtils.round((float)1066942463,0,1066942463);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test035#374");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test035");
    try {
      double double1=org.apache.commons.math.util.MathUtils.factorialLog((-90));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test036#385");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test036");
    long long2=org.apache.commons.math.util.MathUtils.addAndCheck((long)34,(long)2);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 36L+ "'",long2 == 36L);
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test037#393");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test037");
    double[] doubleArray5=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray11=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean12=org.apache.commons.math.util.MathUtils.equals(doubleArray5,doubleArray11);
    int int13=org.apache.commons.math.util.MathUtils.hash(doubleArray11);
    double[] doubleArray19=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray25=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean26=org.apache.commons.math.util.MathUtils.equals(doubleArray19,doubleArray25);
    int int27=org.apache.commons.math.util.MathUtils.hash(doubleArray25);
    boolean boolean28=org.apache.commons.math.util.MathUtils.equals(doubleArray11,doubleArray25);
    int int29=org.apache.commons.math.util.MathUtils.hash(doubleArray25);
    int int30=org.apache.commons.math.util.MathUtils.hash(doubleArray25);
    java.lang.Class<?> wildcardClass31=doubleArray25.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-972220257)+ "'",int13 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '"+ (-972220257)+ "'",int27 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '"+ true+ "'",boolean28 == true);
    org.junit.Assert.assertTrue("'" + int29 + "' != '"+ (-972220257)+ "'",int29 == (-972220257));
    org.junit.Assert.assertTrue("'" + int30 + "' != '"+ (-972220257)+ "'",int30 == (-972220257));
    org.junit.Assert.assertNotNull(wildcardClass31);
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test038#423");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test038");
    boolean boolean2=org.apache.commons.math.util.MathUtils.equals((double)1074790400,(double)(short)100);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test039#431");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test039");
    try {
      long long2=org.apache.commons.math.util.MathUtils.mulAndCheck((-10747904010L),(long)(-1253955330));
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
    }
 catch (    java.lang.ArithmeticException e) {
    }
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test040#442");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test040");
    short short1=org.apache.commons.math.util.MathUtils.indicator((short)(byte)100);
    org.junit.Assert.assertTrue("'" + short1 + "' != '"+ (short)1+ "'",short1 == (short)1);
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test041#450");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test041");
    try {
      double double2=org.apache.commons.math.util.MathUtils.binomialCoefficientLog(2,97);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test042#461");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test042");
    long long1=org.apache.commons.math.util.MathUtils.sign(10L);
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 1L+ "'",long1 == 1L);
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test043#469");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test043");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck((long)(-1253955330),(long)649501801);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ (-1903457131L)+ "'",long2 == (-1903457131L));
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test044#477");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test044");
    long long2=org.apache.commons.math.util.MathUtils.mulAndCheck((long)(-1066942464),0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test045#485");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test045");
    double[] doubleArray5=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray11=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean12=org.apache.commons.math.util.MathUtils.equals(doubleArray5,doubleArray11);
    int int13=org.apache.commons.math.util.MathUtils.hash(doubleArray11);
    double[] doubleArray19=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray25=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean26=org.apache.commons.math.util.MathUtils.equals(doubleArray19,doubleArray25);
    int int27=org.apache.commons.math.util.MathUtils.hash(doubleArray25);
    boolean boolean28=org.apache.commons.math.util.MathUtils.equals(doubleArray11,doubleArray25);
    java.lang.Class<?> wildcardClass29=doubleArray25.getClass();
    java.lang.Class<?> wildcardClass30=doubleArray25.getClass();
    int int31=org.apache.commons.math.util.MathUtils.hash(doubleArray25);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-972220257)+ "'",int13 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '"+ (-972220257)+ "'",int27 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '"+ true+ "'",boolean28 == true);
    org.junit.Assert.assertNotNull(wildcardClass29);
    org.junit.Assert.assertNotNull(wildcardClass30);
    org.junit.Assert.assertTrue("'" + int31 + "' != '"+ (-972220257)+ "'",int31 == (-972220257));
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test046#515");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test046");
    try {
      long long2=org.apache.commons.math.util.MathUtils.binomialCoefficient((-456206144),239234924);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test047#526");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test047");
    try {
      float float3=org.apache.commons.math.util.MathUtils.round((float)(-456206176),(int)(short)-1,36);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test048#537");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test048");
    float float2=org.apache.commons.math.util.MathUtils.round((float)537941451,(-972220289));
    org.junit.Assert.assertEquals((float)float2,Float.NaN,0);
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test049#545");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test049");
    try {
      float float3=org.apache.commons.math.util.MathUtils.round(0.0f,(int)(byte)100,32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test050#556");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test050");
    double[] doubleArray5=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray11=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean12=org.apache.commons.math.util.MathUtils.equals(doubleArray5,doubleArray11);
    int int13=org.apache.commons.math.util.MathUtils.hash(doubleArray11);
    double[] doubleArray19=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray25=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean26=org.apache.commons.math.util.MathUtils.equals(doubleArray19,doubleArray25);
    int int27=org.apache.commons.math.util.MathUtils.hash(doubleArray25);
    double[] doubleArray33=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray39=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean40=org.apache.commons.math.util.MathUtils.equals(doubleArray33,doubleArray39);
    int int41=org.apache.commons.math.util.MathUtils.hash(doubleArray39);
    boolean boolean42=org.apache.commons.math.util.MathUtils.equals(doubleArray25,doubleArray39);
    java.lang.Class<?> wildcardClass43=doubleArray39.getClass();
    double[] doubleArray49=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray55=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean56=org.apache.commons.math.util.MathUtils.equals(doubleArray49,doubleArray55);
    int int57=org.apache.commons.math.util.MathUtils.hash(doubleArray55);
    double[] doubleArray63=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray69=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean70=org.apache.commons.math.util.MathUtils.equals(doubleArray63,doubleArray69);
    int int71=org.apache.commons.math.util.MathUtils.hash(doubleArray69);
    boolean boolean72=org.apache.commons.math.util.MathUtils.equals(doubleArray55,doubleArray69);
    boolean boolean73=org.apache.commons.math.util.MathUtils.equals(doubleArray39,doubleArray69);
    boolean boolean74=org.apache.commons.math.util.MathUtils.equals(doubleArray11,doubleArray39);
    java.lang.Class<?> wildcardClass75=doubleArray11.getClass();
    int int76=org.apache.commons.math.util.MathUtils.hash(doubleArray11);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-972220257)+ "'",int13 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '"+ (-972220257)+ "'",int27 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertTrue("'" + int41 + "' != '"+ (-972220257)+ "'",int41 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ true+ "'",boolean42 == true);
    org.junit.Assert.assertNotNull(wildcardClass43);
    org.junit.Assert.assertNotNull(doubleArray49);
    org.junit.Assert.assertNotNull(doubleArray55);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '"+ false+ "'",boolean56 == false);
    org.junit.Assert.assertTrue("'" + int57 + "' != '"+ (-972220257)+ "'",int57 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray63);
    org.junit.Assert.assertNotNull(doubleArray69);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '"+ false+ "'",boolean70 == false);
    org.junit.Assert.assertTrue("'" + int71 + "' != '"+ (-972220257)+ "'",int71 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '"+ true+ "'",boolean72 == true);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '"+ true+ "'",boolean73 == true);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '"+ true+ "'",boolean74 == true);
    org.junit.Assert.assertNotNull(wildcardClass75);
    org.junit.Assert.assertTrue("'" + int76 + "' != '"+ (-972220257)+ "'",int76 == (-972220257));
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test051#616");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test051");
    double[] doubleArray5=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray11=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean12=org.apache.commons.math.util.MathUtils.equals(doubleArray5,doubleArray11);
    int int13=org.apache.commons.math.util.MathUtils.hash(doubleArray11);
    double[] doubleArray19=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray25=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean26=org.apache.commons.math.util.MathUtils.equals(doubleArray19,doubleArray25);
    int int27=org.apache.commons.math.util.MathUtils.hash(doubleArray25);
    double[] doubleArray33=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray39=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean40=org.apache.commons.math.util.MathUtils.equals(doubleArray33,doubleArray39);
    int int41=org.apache.commons.math.util.MathUtils.hash(doubleArray39);
    boolean boolean42=org.apache.commons.math.util.MathUtils.equals(doubleArray25,doubleArray39);
    java.lang.Class<?> wildcardClass43=doubleArray39.getClass();
    double[] doubleArray49=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray55=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean56=org.apache.commons.math.util.MathUtils.equals(doubleArray49,doubleArray55);
    int int57=org.apache.commons.math.util.MathUtils.hash(doubleArray55);
    double[] doubleArray63=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray69=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean70=org.apache.commons.math.util.MathUtils.equals(doubleArray63,doubleArray69);
    int int71=org.apache.commons.math.util.MathUtils.hash(doubleArray69);
    boolean boolean72=org.apache.commons.math.util.MathUtils.equals(doubleArray55,doubleArray69);
    boolean boolean73=org.apache.commons.math.util.MathUtils.equals(doubleArray39,doubleArray69);
    boolean boolean74=org.apache.commons.math.util.MathUtils.equals(doubleArray11,doubleArray39);
    double[] doubleArray80=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray86=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean87=org.apache.commons.math.util.MathUtils.equals(doubleArray80,doubleArray86);
    boolean boolean88=org.apache.commons.math.util.MathUtils.equals(doubleArray11,doubleArray86);
    double[] doubleArray89=null;
    boolean boolean90=org.apache.commons.math.util.MathUtils.equals(doubleArray11,doubleArray89);
    java.lang.Class<?> wildcardClass91=doubleArray11.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-972220257)+ "'",int13 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '"+ (-972220257)+ "'",int27 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertTrue("'" + int41 + "' != '"+ (-972220257)+ "'",int41 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ true+ "'",boolean42 == true);
    org.junit.Assert.assertNotNull(wildcardClass43);
    org.junit.Assert.assertNotNull(doubleArray49);
    org.junit.Assert.assertNotNull(doubleArray55);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '"+ false+ "'",boolean56 == false);
    org.junit.Assert.assertTrue("'" + int57 + "' != '"+ (-972220257)+ "'",int57 == (-972220257));
    org.junit.Assert.assertNotNull(doubleArray63);
    org.junit.Assert.assertNotNull(doubleArray69);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '"+ false+ "'",boolean70 == false);
    org.junit.Assert.assertTrue("'" + int71 + "' != '"+ (-972220257)+ "'",int71 == (-972220257));
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '"+ true+ "'",boolean72 == true);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '"+ true+ "'",boolean73 == true);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '"+ true+ "'",boolean74 == true);
    org.junit.Assert.assertNotNull(doubleArray80);
    org.junit.Assert.assertNotNull(doubleArray86);
    org.junit.Assert.assertTrue("'" + boolean87 + "' != '"+ false+ "'",boolean87 == false);
    org.junit.Assert.assertTrue("'" + boolean88 + "' != '"+ true+ "'",boolean88 == true);
    org.junit.Assert.assertTrue("'" + boolean90 + "' != '"+ false+ "'",boolean90 == false);
    org.junit.Assert.assertNotNull(wildcardClass91);
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test052#685");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test052");
    long long2=org.apache.commons.math.util.MathUtils.mulAndCheck((long)(-972220247),(long)10);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ (-9722202470L)+ "'",long2 == (-9722202470L));
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test053#693");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test053");
    int int2=org.apache.commons.math.util.MathUtils.addAndCheck(2,(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 2+ "'",int2 == 2);
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test054#701");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test054");
    long long2=org.apache.commons.math.util.MathUtils.mulAndCheck((-1L),(long)(-1849528468));
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 1849528468L+ "'",long2 == 1849528468L);
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test055#709");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test055");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck((long)10,(long)(byte)-1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 11L+ "'",long2 == 11L);
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test056#717");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test056");
    int int2=org.apache.commons.math.util.MathUtils.gcd((-1074790390),(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1074790390+ "'",int2 == 1074790390);
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test057#725");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test057");
    long long1=org.apache.commons.math.util.MathUtils.indicator(456206177L);
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 1L+ "'",long1 == 1L);
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test058#733");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test058");
    float float2=org.apache.commons.math.util.MathUtils.round((float)34L,(int)(short)10);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 34.0f+ "'",float2 == 34.0f);
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test059#741");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test059");
    double double2=org.apache.commons.math.util.MathUtils.scalb((double)(-972220257L),(-90));
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ (-7.853532692594941E-19d)+ "'",double2 == (-7.853532692594941E-19d));
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test060#749");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test060");
    double double1=org.apache.commons.math.util.MathUtils.sign(1814399.9999998664d);
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 1.0d+ "'",double1 == 1.0d);
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test061#757");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test061");
    double double2=org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1074790400,(-972220257));
    org.junit.Assert.assertEquals((double)double2,Double.NaN,0);
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test062#765");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test062");
    long long2=org.apache.commons.math.util.MathUtils.mulAndCheck(91L,(long)34);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 3094L+ "'",long2 == 3094L);
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test063#773");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test063");
    double double2=org.apache.commons.math.util.MathUtils.scalb((double)34L,35);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 1.168231104512E12d+ "'",double2 == 1.168231104512E12d);
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test064#781");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test064");
    double double1=org.apache.commons.math.util.MathUtils.indicator(1.1102230246251565E-16d);
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 1.0d+ "'",double1 == 1.0d);
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test065#789");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test065");
    long long1=org.apache.commons.math.util.MathUtils.sign((long)(-687593165));
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ (-1L)+ "'",long1 == (-1L));
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test066#797");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test066");
    int int2=org.apache.commons.math.util.MathUtils.addAndCheck(35,239234934);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 239234969+ "'",int2 == 239234969);
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test067#805");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test067");
    float float1=org.apache.commons.math.util.MathUtils.sign((float)(-1079558144));
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ (-1.0f)+ "'",float1 == (-1.0f));
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test068#813");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test068");
    long long2=org.apache.commons.math.util.MathUtils.mulAndCheck((long)(byte)10,320L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 3200L+ "'",long2 == 3200L);
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test069#821");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test069");
    try {
      int int2=org.apache.commons.math.util.MathUtils.lcm((-1074790400),(-972220289));
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
    }
 catch (    java.lang.ArithmeticException e) {
    }
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test070#832");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test070");
    double[] doubleArray6=new double[]{10,(byte)1,Float.NaN,0.0d,1.0d,10.0f};
    double[] doubleArray12=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray18=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean19=org.apache.commons.math.util.MathUtils.equals(doubleArray12,doubleArray18);
    boolean boolean20=org.apache.commons.math.util.MathUtils.equals(doubleArray6,doubleArray12);
    double[] doubleArray22=new double[]{(short)100};
    boolean boolean23=org.apache.commons.math.util.MathUtils.equals(doubleArray12,doubleArray22);
    int int24=org.apache.commons.math.util.MathUtils.hash(doubleArray12);
    int int25=org.apache.commons.math.util.MathUtils.hash(doubleArray12);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ false+ "'",boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '"+ false+ "'",boolean20 == false);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertTrue("'" + int24 + "' != '"+ 618584223+ "'",int24 == 618584223);
    org.junit.Assert.assertTrue("'" + int25 + "' != '"+ 618584223+ "'",int25 == 618584223);
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test071#856");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test071");
    try {
      long long1=org.apache.commons.math.util.MathUtils.factorial((-972220257));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test072#867");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test072");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck((long)379349299,(long)(-1066942561));
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 1446291860L+ "'",long2 == 1446291860L);
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test073#875");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test073");
    try {
      double double3=org.apache.commons.math.util.MathUtils.round(100.0d,0,(int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test074#886");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test074");
    int int1=org.apache.commons.math.util.MathUtils.sign(537941451);
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 1+ "'",int1 == 1);
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test075#894");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test075");
    int int2=org.apache.commons.math.util.MathUtils.lcm(5,(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test076#902");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test076");
    double double2=org.apache.commons.math.util.MathUtils.nextAfter(1.3440585709080678E43d,92.13617560368711d);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 1.3440585709080676E43d+ "'",double2 == 1.3440585709080676E43d);
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test077#910");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test077");
    float float1=org.apache.commons.math.util.MathUtils.sign((float)393877977);
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 1.0f+ "'",float1 == 1.0f);
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test078#918");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test078");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck((long)1079558144,(-1074790401L));
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 2154348545L+ "'",long2 == 2154348545L);
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test079#926");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test079");
    double double2=org.apache.commons.math.util.MathUtils.scalb(60.224974280318214d,239234934);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 1.728371998167276E-40d+ "'",double2 == 1.728371998167276E-40d);
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test080#934");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test080");
    double double1=org.apache.commons.math.util.MathUtils.sign((double)537941451);
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 1.0d+ "'",double1 == 1.0d);
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test081#942");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test081");
    try {
      float float3=org.apache.commons.math.util.MathUtils.round(Float.NaN,1079574528,1077018624);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test082#953");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test082");
    double double2=org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1079558144,(-239234898));
    org.junit.Assert.assertEquals((double)double2,Double.NaN,0);
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test083#961");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test083");
    double double1=org.apache.commons.math.util.MathUtils.sinh((double)1698142466L);
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ Double.POSITIVE_INFINITY+ "'",double1 == Double.POSITIVE_INFINITY);
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test084#969");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test084");
    float float3=org.apache.commons.math.util.MathUtils.round((-1.0747904E9f),(-1849528468),5);
    org.junit.Assert.assertEquals((float)float3,Float.NaN,0);
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test085#977");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test085");
    long long1=org.apache.commons.math.util.MathUtils.indicator((long)379349298);
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 1L+ "'",long1 == 1L);
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test086#985");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test086");
    int int2=org.apache.commons.math.util.MathUtils.subAndCheck(0,1074790400);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1074790400)+ "'",int2 == (-1074790400));
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test087#993");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test087");
    double double1=org.apache.commons.math.util.MathUtils.factorialDouble(239234924);
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ Double.POSITIVE_INFINITY+ "'",double1 == Double.POSITIVE_INFINITY);
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test088#1001");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test088");
    double double2=org.apache.commons.math.util.MathUtils.round(5.343237290762231E12d,(-90));
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 0.0d+ "'",double2 == 0.0d);
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test089#1009");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test089");
    try {
      long long2=org.apache.commons.math.util.MathUtils.binomialCoefficient(122832123,618584233);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test090#1020");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test090");
    int int2=org.apache.commons.math.util.MathUtils.subAndCheck(1074790390,(-456206176));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1530996566+ "'",int2 == 1530996566);
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test091#1028");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test091");
    double double2=org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1077018624,379349298);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 6.987816300092759E8d+ "'",double2 == 6.987816300092759E8d);
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test092#1036");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test092");
    double double3=org.apache.commons.math.util.MathUtils.round(4.605170185988092d,900,(int)(short)0);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 4.605170185988092d+ "'",double3 == 4.605170185988092d);
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test093#1044");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test093");
    boolean boolean2=org.apache.commons.math.util.MathUtils.equals(2.225073858507201E-308d,(double)649501801);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test094#1052");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test094");
    boolean boolean2=org.apache.commons.math.util.MathUtils.equals((double)618584222L,Double.NaN);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test095#1060");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test095");
    int int2=org.apache.commons.math.util.MathUtils.mulAndCheck(34,0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test096#1068");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test096");
    int int2=org.apache.commons.math.util.MathUtils.subAndCheck(2,(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-8)+ "'",int2 == (-8));
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test097#1076");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test097");
    int int1=org.apache.commons.math.util.MathUtils.sign(239234969);
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 1+ "'",int1 == 1);
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test098#1084");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test098");
    double double2=org.apache.commons.math.util.MathUtils.nextAfter(31.41592653589793d,(-0.9999999999999998d));
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 31.415926535897928d+ "'",double2 == 31.415926535897928d);
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test099#1092");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test099");
    double double1=org.apache.commons.math.util.MathUtils.cosh((double)3200L);
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ Double.POSITIVE_INFINITY+ "'",double1 == Double.POSITIVE_INFINITY);
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test100#1100");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test100");
    double double2=org.apache.commons.math.util.MathUtils.nextAfter((double)34.0f,(double)(short)100);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 34.00000000000001d+ "'",double2 == 34.00000000000001d);
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test101#1108");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test101");
    try {
      float float3=org.apache.commons.math.util.MathUtils.round((float)3628800L,239234934,972220257);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test102#1119");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test102");
    long long1=org.apache.commons.math.util.MathUtils.indicator((long)239234969);
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 1L+ "'",long1 == 1L);
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test103#1127");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test103");
    double double2=org.apache.commons.math.util.MathUtils.round((double)Float.NaN,(int)'4');
    org.junit.Assert.assertEquals((double)double2,Double.NaN,0);
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test104#1135");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test104");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck((long)(-239234898),(long)(-1074790390));
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 835555492L+ "'",long2 == 835555492L);
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test105#1143");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test105");
    boolean boolean2=org.apache.commons.math.util.MathUtils.equals((double)91L,(double)36);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test106#1151");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test106");
    long long2=org.apache.commons.math.util.MathUtils.mulAndCheck((-90L),2L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ (-180L)+ "'",long2 == (-180L));
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test107#1159");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test107");
    double double1=org.apache.commons.math.util.MathUtils.cosh((-1.074790401E9d));
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ Double.POSITIVE_INFINITY+ "'",double1 == Double.POSITIVE_INFINITY);
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test108#1167");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test108");
    long long2=org.apache.commons.math.util.MathUtils.mulAndCheck((long)(-687593165),239234934L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ (-164496305447626110L)+ "'",long2 == (-164496305447626110L));
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test109#1175");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test109");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck((-592870990L),(-36L));
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ (-592870954L)+ "'",long2 == (-592870954L));
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test110#1183");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test110");
    try {
      double double1=org.apache.commons.math.util.MathUtils.factorialLog((-972220289));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test111#1194");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test111");
    int int1=org.apache.commons.math.util.MathUtils.indicator((int)'#');
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 1+ "'",int1 == 1);
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test112#1202");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test112");
    int int1=org.apache.commons.math.util.MathUtils.hash((double)(-1074790401L));
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ (-1047526400)+ "'",int1 == (-1047526400));
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test113#1210");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test113");
    try {
      double double2=org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-456206177),(-456206144));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test114#1221");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test114");
    float float2=org.apache.commons.math.util.MathUtils.round((float)1077018624,239234969);
    org.junit.Assert.assertEquals((float)float2,Float.NaN,0);
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test115#1229");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test115");
    double double1=org.apache.commons.math.util.MathUtils.cosh((double)(-618584186L));
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ Double.POSITIVE_INFINITY+ "'",double1 == Double.POSITIVE_INFINITY);
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test116#1237");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test116");
    boolean boolean2=org.apache.commons.math.util.MathUtils.equals(0.0d,(double)'#');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test117#1245");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test117");
    int int1=org.apache.commons.math.util.MathUtils.sign(1079574528);
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 1+ "'",int1 == 1);
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test118#1253");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test118");
    int int1=org.apache.commons.math.util.MathUtils.indicator(618584233);
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 1+ "'",int1 == 1);
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test119#1261");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test119");
    long long2=org.apache.commons.math.util.MathUtils.subAndCheck((long)1077018624,(long)(-456206176));
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 1533224800L+ "'",long2 == 1533224800L);
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test120#1269");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test120");
    try {
      double double3=org.apache.commons.math.util.MathUtils.round(1.710094375780631d,(-1079558144),972220257);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test121#1280");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test121");
    double[] doubleArray6=new double[]{10,(byte)1,Float.NaN,0.0d,1.0d,10.0f};
    double[] doubleArray12=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray18=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean19=org.apache.commons.math.util.MathUtils.equals(doubleArray12,doubleArray18);
    boolean boolean20=org.apache.commons.math.util.MathUtils.equals(doubleArray6,doubleArray12);
    double[] doubleArray22=new double[]{(short)100};
    boolean boolean23=org.apache.commons.math.util.MathUtils.equals(doubleArray12,doubleArray22);
    int int24=org.apache.commons.math.util.MathUtils.hash(doubleArray12);
    double[] doubleArray30=new double[]{100.0f,100,(-1L),(byte)1,'4'};
    double[] doubleArray36=new double[]{(-1.0f),(-1.0f),(-1.0f),(byte)1,'a'};
    boolean boolean37=org.apache.commons.math.util.MathUtils.equals(doubleArray30,doubleArray36);
    java.lang.Class<?> wildcardClass38=doubleArray30.getClass();
    double[] doubleArray39=null;
    boolean boolean40=org.apache.commons.math.util.MathUtils.equals(doubleArray30,doubleArray39);
    boolean boolean41=org.apache.commons.math.util.MathUtils.equals(doubleArray12,doubleArray30);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ false+ "'",boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '"+ false+ "'",boolean20 == false);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertTrue("'" + int24 + "' != '"+ 618584223+ "'",int24 == 618584223);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertNotNull(wildcardClass38);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ true+ "'",boolean41 == true);
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test122#1315");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test122");
    long long1=org.apache.commons.math.util.MathUtils.indicator((-2L));
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ (-1L)+ "'",long1 == (-1L));
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test123#1323");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test123");
    double double1=org.apache.commons.math.util.MathUtils.indicator((double)(-180L));
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ (-1.0d)+ "'",double1 == (-1.0d));
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test124#1331");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test124");
    try {
      double double2=org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1072693148),(int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test125#1342");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test125");
    try {
      int int2=org.apache.commons.math.util.MathUtils.mulAndCheck(649501801,1077018624);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
    }
 catch (    java.lang.ArithmeticException e) {
    }
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test126#1353");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test126");
    boolean boolean2=org.apache.commons.math.util.MathUtils.equals(34.00000000000001d,(double)1072693248);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test127#1361");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test127");
    int int1=org.apache.commons.math.util.MathUtils.hash((double)(short)0);
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test128#1369");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test128");
    boolean boolean2=org.apache.commons.math.util.MathUtils.equals(81.55795945611504d,(-9.72220247E8d));
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test129#1377");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test129");
    try {
      double double3=org.apache.commons.math.util.MathUtils.round(0.0d,(-972220289),(int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test130#1388");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test130");
    long long2=org.apache.commons.math.util.MathUtils.addAndCheck((long)379349299,1533224800L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 1912574099L+ "'",long2 == 1912574099L);
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test131#1396");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test131");
    try {
      double double1=org.apache.commons.math.util.MathUtils.factorialLog((-1047526400));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test132#1407");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test132");
    double double2=org.apache.commons.math.util.MathUtils.nextAfter(2.70807931321432d,(double)(-1047526400));
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 2.7080793132143195d+ "'",double2 == 2.7080793132143195d);
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test133#1415");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test133");
    double double2=org.apache.commons.math.util.MathUtils.round((double)(-90),(-90));
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 0.0d+ "'",double2 == 0.0d);
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test134#1423");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test134");
    double double2=org.apache.commons.math.util.MathUtils.nextAfter(31.41592653589793d,30.0d);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 31.415926535897928d+ "'",double2 == 31.415926535897928d);
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test135#1431");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test135");
    long long2=org.apache.commons.math.util.MathUtils.binomialCoefficient(1074790400,0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 1L+ "'",long2 == 1L);
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test136#1439");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test136");
    try {
      float float3=org.apache.commons.math.util.MathUtils.round((float)18L,(int)(short)10,1074790390);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test137#1450");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test137");
    int int2=org.apache.commons.math.util.MathUtils.addAndCheck((-1849528468),(-239234898));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-2088763366)+ "'",int2 == (-2088763366));
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test138#1458");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test138");
    int int1=org.apache.commons.math.util.MathUtils.sign(34);
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 1+ "'",int1 == 1);
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Math93b_Patch207/fixed",this,"\n.RegressionTest1::test139#1466");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test139");
    try {
      long long1=org.apache.commons.math.util.MathUtils.factorial(1079574528);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
    }
 catch (    java.lang.ArithmeticException e) {
    }
  }
}
