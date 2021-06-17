import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest0 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test001");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("","hi!",(int)(short)1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test002");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("hi!","hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test003#26");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test003");
    java.lang.Object[] objArray5=new java.lang.Object[]{0,1L,(short)100,1.0f,100L};
    try {
      java.lang.String str9=org.apache.commons.lang.StringUtils.join(objArray5,"hi!",0,(int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(objArray5);
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test004#39");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test004");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test005#47");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test005");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test006#55");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test006");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("hi!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test007#63");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test007");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)(short)0,(int)(byte)-1,0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test008#71");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test008");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test009#79");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test009");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("",10,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          "+ "'",str3.equals("          "));
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test010#87");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test010");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test011#95");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test011");
    java.lang.Float float0=org.apache.commons.lang.math.NumberUtils.FLOAT_ZERO;
    org.junit.Assert.assertTrue("'" + float0 + "' != '"+ 0.0f+ "'",float0.equals(0.0f));
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test012#103");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test012");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("          ","hi!","hi!",0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "          "+ "'",str4.equals("          "));
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test013#111");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test013");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test014#119");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test014");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test015#127");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test015");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test016#135");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test016");
    int int3=org.apache.commons.lang.math.NumberUtils.max(0,(int)(short)100,0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test017#143");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test017");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test018#151");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test018");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test019#159");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test019");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test020#167");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test020");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("          ",(int)'a',"          ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                 "+ "'",str3.equals("                                                                                                 "));
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test021#175");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test021");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                 ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test022#183");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test022");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test023#191");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test023");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("","",(int)'4',(int)(short)100);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test024#199");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test024");
    java.lang.Byte byte0=org.apache.commons.lang.math.NumberUtils.BYTE_ZERO;
    org.junit.Assert.assertTrue("'" + byte0 + "' != '"+ (byte)0+ "'",byte0.equals((byte)0));
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test025#207");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test025");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!"+ "'",str1.equals("Hi!"));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test026#215");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test026");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("",(int)(short)-1,(int)(short)1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test027#223");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test027");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("hi!",(int)(short)100,"          ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                hi!                                                 "+ "'",str3.equals("                                                hi!                                                 "));
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test028#231");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test028");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test029#239");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test029");
    int int2=org.apache.commons.lang.StringUtils.indexOf("Hi!","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test030#247");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test030");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("Hi!");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test031#255");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test031");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("",(int)'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                   "+ "'",str2.equals("                                   "));
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test032#263");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test032");
    double[] doubleArray0=null;
    try {
      double double1=org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test033#275");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test033");
    java.lang.Byte byte0=org.apache.commons.lang.math.NumberUtils.BYTE_MINUS_ONE;
    org.junit.Assert.assertTrue("'" + byte0 + "' != '"+ (byte)-1+ "'",byte0.equals((byte)-1));
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test034#283");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test034");
    java.lang.Object[] objArray0=null;
    java.lang.String str1=org.apache.commons.lang.StringUtils.concatenate(objArray0);
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test035#292");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test035");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("hi!","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test036#300");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test036");
    java.lang.Integer int0=org.apache.commons.lang.math.NumberUtils.INTEGER_MINUS_ONE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '"+ (-1)+ "'",int0.equals((-1)));
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test037#308");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test037");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                                   ","Hi!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test038#316");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test038");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test039#324");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test039");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("Hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!"+ "'",str1.equals("Hi!"));
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test040#332");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test040");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("                                                                                                 ","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 "+ "'",str2.equals("                                                                                                 "));
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test041#340");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test041");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test042#348");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test042");
    org.apache.commons.lang.math.NumberUtils numberUtils0=new org.apache.commons.lang.math.NumberUtils();
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test043#355");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test043");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)0,(byte)0,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test044#363");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test044");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)10L,(-1.0d));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test045#371");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test045");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test046#379");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test046");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("                                                hi!                                                 ","Hi!",(int)(short)-1,(int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test047#390");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test047");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test048#398");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test048");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("Hi!","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test049#406");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test049");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test050#414");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test050");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("hi!","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 97+ "'",int2 == 97);
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test051#422");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test051");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test052#433");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test052");
    int int0=org.apache.commons.lang.StringUtils.INDEX_NOT_FOUND;
    org.junit.Assert.assertTrue("'" + int0 + "' != '"+ (-1)+ "'",int0 == (-1));
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test053#441");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test053");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                   ",(int)(byte)0,(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          "+ "'",str3.equals("          "));
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test054#449");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test054");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("                                   ",(-1));
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " "+ "'",str2.equals(" "));
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test055#457");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test055");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("                                   ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test056#465");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test056");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("          ",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test057#473");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test057");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber(" ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test058#484");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test058");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                hi!                                                 "+ "'",str1.equals("                                                hi!                                                 "));
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test059#492");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test059");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test060#500");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test060");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("",' ',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test061#508");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test061");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("Hi!","                                   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!"+ "'",str2.equals("Hi!"));
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test062#516");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test062");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                                hi!                                                 ",(int)' ',(int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test063#527");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test063");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("","          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test064#535");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test064");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("hi!",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i!"+ "'",str2.equals("i!"));
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test065#543");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test065");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("Hi!",0,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Hi!"+ "'",str3.equals("Hi!"));
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test066#551");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test066");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test067#559");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test067");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test068#567");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test068");
    java.lang.Float float0=org.apache.commons.lang.math.NumberUtils.FLOAT_MINUS_ONE;
    org.junit.Assert.assertTrue("'" + float0 + "' != '"+ (-1.0f)+ "'",float0.equals((-1.0f)));
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test069#575");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test069");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test070#583");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test070");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("",(int)(byte)0,(int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test071#594");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test071");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                hi!                                                 ",(int)(byte)100,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                hi!                                                 "+ "'",str3.equals("                                                hi!                                                 "));
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test072#602");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test072");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad(" ",10,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa "+ "'",str3.equals("aaaaaaaaa "));
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test073#610");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test073");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("Hi!",'#',(-1));
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test074#618");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test074");
    java.lang.Double double0=org.apache.commons.lang.math.NumberUtils.DOUBLE_ZERO;
    org.junit.Assert.assertTrue("'" + double0 + "' != '"+ 0.0d+ "'",double0.equals(0.0d));
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test075#626");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test075");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("Hi!","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!"+ "'",str2.equals("Hi!"));
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test076#634");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test076");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)(-1),(long)(byte)-1,(long)(short)100);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ (-1L)+ "'",long3 == (-1L));
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test077#642");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test077");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                                                hi!                                                 ","","                                                                                                 ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test078#650");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test078");
    java.lang.Short short0=org.apache.commons.lang.math.NumberUtils.SHORT_ZERO;
    org.junit.Assert.assertTrue("'" + short0 + "' != '"+ (short)0+ "'",short0.equals((short)0));
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test079#658");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test079");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("","                                                                                                 ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test080#666");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test080");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa "+ "'",str1.equals("Aaaaaaaaa "));
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test081#674");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test081");
    java.lang.Integer int0=org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;
    org.junit.Assert.assertTrue("'" + int0 + "' != '"+ 0+ "'",int0.equals(0));
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test082#682");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test082");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)(short)-1,(float)0L,100.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ (-1.0f)+ "'",float3 == (-1.0f));
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test083#690");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test083");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("Aaaaaaaaa ","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa "+ "'",str2.equals("Aaaaaaaaa "));
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test084#698");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test084");
    java.lang.Short short0=org.apache.commons.lang.math.NumberUtils.SHORT_ONE;
    org.junit.Assert.assertTrue("'" + short0 + "' != '"+ (short)1+ "'",short0.equals((short)1));
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test085#706");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test085");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("                                                                                                 ",(int)(short)100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 "+ "'",str2.equals("                                                                                                 "));
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test086#714");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test086");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("hi!");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test087#722");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test087");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test088#730");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test088");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test089#738");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test089");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa "+ "'",str1.equals("aaaaaaaaa "));
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test090#746");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test090");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaa ",(int)'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                                                                        "+ "'",str2.equals("aaaaaaaaa                                                                                        "));
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test091#754");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test091");
    java.lang.String[] strArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("i!",strArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test092#763");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test092");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)100,(byte)10,(byte)-1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test093#771");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test093");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)(short)0,(long)0,0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test094#779");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test094");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("                                   ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test095#787");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test095");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaa                                                                                        ","Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                                                                        "+ "'",str2.equals("aaaaaaaaa                                                                                        "));
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test096#795");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test096");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("                                                                                                 ");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test097#803");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test097");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("i!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test098#811");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test098");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                                   ",'#',(int)'#');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test099#819");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test099");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test100#827");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test100");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf(" ",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test101#835");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test101");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("                                   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                   "+ "'",str1.equals("                                   "));
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test102#843");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test102");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)100,(short)100,(short)(byte)10);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test103#851");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test103");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaa ","          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa "+ "'",str2.equals("aaaaaaaaa "));
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test104#859");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test104");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("Aaaaaaaaa "," ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa"));
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test105#867");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test105");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test106#875");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test106");
    java.lang.Object[] objArray0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(objArray0,"");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test107#884");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test107");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("hi!","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!"+ "'",str2.equals("hi!"));
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test108#892");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test108");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("          ","aaaaaaaaa ","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          "+ "'",str3.equals("          "));
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test109#900");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test109");
    int int3=org.apache.commons.lang.StringUtils.indexOf("Aaaaaaaaa","                                   ",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test110#908");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test110");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test111#916");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test111");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("Aaaaaaaaa","Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test112#924");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test112");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)'#',0L,(long)1);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test113#932");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test113");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("          ","          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test114#940");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test114");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test115#948");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test115");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("          ",(int)(byte)100,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"+ "'",str3.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"));
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test116#956");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test116");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "          "+ "'",str1.equals("          "));
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test117#964");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test117");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)97,(long)(byte)10,100L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 10L+ "'",long3 == 10L);
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test118#972");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test118");
    int int2=org.apache.commons.lang.StringUtils.countMatches("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","                                   ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test119#980");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test119");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)100,(short)0,(short)10);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test120#988");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test120");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test121#996");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test121");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("Aaaaaaaaa","                                   ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test122#1004");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test122");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("          "," ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test123#1012");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test123");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test124#1020");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test124");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaa ",97);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str2.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test125#1028");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test125");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("                                                                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test126#1039");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test126");
    java.lang.Integer int0=org.apache.commons.lang.math.NumberUtils.INTEGER_ONE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '"+ 1+ "'",int0.equals(1));
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test127#1047");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test127");
    java.lang.Long long0=org.apache.commons.lang.math.NumberUtils.LONG_ONE;
    org.junit.Assert.assertTrue("'" + long0 + "' != '"+ 1L+ "'",long0.equals(1L));
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test128#1055");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test128");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test129#1066");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test129");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test130#1074");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test130");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)10,(byte)-1,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test131#1082");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test131");
    int int3=org.apache.commons.lang.StringUtils.indexOf("i!",'4',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test132#1090");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test132");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("Hi!","Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test133#1098");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test133");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)100L,(float)(byte)100);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test134#1106");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test134");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test135#1114");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test135");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad(" ",(int)' ',"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                "+ "'",str3.equals("                                "));
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test136#1122");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test136");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaa                                                                                        ",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                                                                        "+ "'",str2.equals("aaaaaaaaa                                                                                        "));
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test137#1130");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test137");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)0,(byte)0,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test138#1138");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test138");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("                                   ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test139#1146");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test139");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                                                                                       aaaaaaaaa ",0,"i!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str3.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test140#1154");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test140");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test141#1162");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test141");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"));
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test142#1170");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test142");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("hi!","Hi!");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test143#1178");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test143");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                                                                 ","",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test144#1186");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test144");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("","                                                hi!                                                 ","          ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test145#1194");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test145");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("                                                                                                 ","                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 "+ "'",str2.equals("                                                                                                 "));
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test146#1202");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test146");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("Aaaaaaaaa ",(int)'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 97+ "'",int2 == 97);
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test147#1210");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test147");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("          ","                                                hi!                                                 ","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          "+ "'",str3.equals("          "));
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test148#1218");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test148");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                   ",(int)'4',(int)'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                   "+ "'",str3.equals("                                   "));
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test149#1226");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test149");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize(" ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " "+ "'",str1.equals(" "));
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test150#1234");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test150");
    float float3=org.apache.commons.lang.math.NumberUtils.min(0.0f,(float)' ',(float)(byte)10);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 0.0f+ "'",float3 == 0.0f);
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test151#1242");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test151");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("i!",(int)'a',(int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test152#1253");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test152");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble(" ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test153#1264");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test153");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                                                                                 ","hi!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test154#1272");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test154");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test155#1280");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test155");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa "+ "'",str1.equals("aaaaaaaaa "));
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test156#1288");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test156");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOfAny("",strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test157#1298");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test157");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test158#1306");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test158");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("                                                                                                 ","Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 "+ "'",str2.equals("                                                                                                 "));
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test159#1314");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test159");
    java.lang.Long long0=org.apache.commons.lang.math.NumberUtils.LONG_MINUS_ONE;
    org.junit.Assert.assertTrue("'" + long0 + "' != '"+ (-1L)+ "'",long0.equals((-1L)));
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test160#1322");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test160");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("hi!",0,(int)(short)1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "h"+ "'",str3.equals("h"));
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test161#1330");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test161");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test162#1338");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test162");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("",'#','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test163#1346");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test163");
    java.lang.Long long0=org.apache.commons.lang.math.NumberUtils.LONG_ZERO;
    org.junit.Assert.assertTrue("'" + long0 + "' != '"+ 0L+ "'",long0.equals(0L));
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test164#1354");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test164");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)(byte)1,(float)(byte)10,(float)(short)-1);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ (-1.0f)+ "'",float3 == (-1.0f));
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test165#1362");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test165");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray3,"                                   ");
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray6,"h");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test166#1376");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test166");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("                                                                                                 ");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.stripAll(strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test167#1386");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test167");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)1,(double)(byte)1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test168#1394");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test168");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test169#1402");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test169");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("          ","h");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test170#1410");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test170");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter(" ","i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test171#1418");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test171");
    int int3=org.apache.commons.lang.StringUtils.indexOf("hi!",'a',(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test172#1426");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test172");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("Hi!",10,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444Hi!"+ "'",str3.equals("4444444Hi!"));
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test173#1434");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test173");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                   ",(int)(short)100,1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test174#1445");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test174");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("          ",(int)'a','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#######################################################################################          "+ "'",str3.equals("#######################################################################################          "));
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test175#1453");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test175");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("Aaaaaaaaa","                                                hi!                                                 ",(int)(short)1,(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "A                                                hi!                                                 "+ "'",str4.equals("A                                                hi!                                                 "));
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test176#1461");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test176");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("h",'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test177#1469");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test177");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)-1,(byte)0,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test178#1477");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test178");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("i!","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test179#1485");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test179");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("                                                                                       aaaaaaaaa ",(int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test180#1496");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test180");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaa                                                                                        ","444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test181#1504");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test181");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("          ","          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test182#1512");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test182");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("aaaaaaaaa ","Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa "+ "'",str2.equals("aaaaaaaaa "));
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test183#1520");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test183");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaa                                                                                        ","Hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test184#1528");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test184");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)1,(short)10,(short)(byte)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test185#1536");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test185");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaa ","i!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test186#1544");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test186");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,'a');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test187#1553");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test187");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","                                ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test188#1561");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test188");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test189#1569");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test189");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                                   ",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test190#1577");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test190");
    org.apache.commons.lang.StringUtils stringUtils0=new org.apache.commons.lang.StringUtils();
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test191#1584");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test191");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "          "+ "'",str1.equals("          "));
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test192#1592");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test192");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)10,(short)(byte)1,(short)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)1+ "'",short3 == (short)1);
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test193#1600");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test193");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("                                ");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test194#1608");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test194");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                   ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test195#1616");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test195");
    char[] charArray1=null;
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                                                                                       aaaaaaaaa ",charArray1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test196#1625");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test196");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("Aaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test197#1633");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test197");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "i!"+ "'",str1.equals("i!"));
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test198#1641");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test198");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test199#1649");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test199");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test200#1657");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test200");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("Aaaaaaaaa ",(int)'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 52+ "'",int2 == 52);
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test201#1665");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test201");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test202#1673");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test202");
    int int3=org.apache.commons.lang.StringUtils.indexOf("Hi!",'4',(int)'#');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test203#1681");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test203");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("h","A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "h"+ "'",str2.equals("h"));
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test204#1689");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test204");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("          ");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test205#1697");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test205");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("Hi!",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test206#1705");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test206");
    java.lang.Double double0=org.apache.commons.lang.math.NumberUtils.DOUBLE_MINUS_ONE;
    org.junit.Assert.assertTrue("'" + double0 + "' != '"+ (-1.0d)+ "'",double0.equals((-1.0d)));
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test207#1713");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test207");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("4444444Hi!",(int)(byte)10,"444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444Hi!"+ "'",str3.equals("4444444Hi!"));
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test208#1721");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test208");
    long[] longArray0=null;
    try {
      long long1=org.apache.commons.lang.math.NumberUtils.min(longArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test209#1733");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test209");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("          ",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test210#1741");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test210");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,'#');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test211#1750");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test211");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace(""," ","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test212#1758");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test212");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("Aaaaaaaaa","h");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa"));
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test213#1766");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test213");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("h");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "h"+ "'",str1.equals("h"));
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test214#1774");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test214");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("                                                                                       aaaaaaaaa ","h");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test215#1782");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test215");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!"+ "'",str1.equals("A                                                hi!"));
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test216#1790");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test216");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test217#1798");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test217");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("Aaaaaaaaa ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa "+ "'",str2.equals("Aaaaaaaaa "));
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test218#1806");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test218");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)0,(byte)0,(byte)10);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)10+ "'",byte3 == (byte)10);
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test219#1814");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test219");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited(" ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " "+ "'",str2.equals(" "));
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test220#1822");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test220");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("                                                                                                 ","A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test221#1830");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test221");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("","          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test222#1838");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test222");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("A                                                hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test223#1846");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test223");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test224#1857");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test224");
    int int2=org.apache.commons.lang.StringUtils.countMatches("                                                                                                 ","h");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test225#1865");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test225");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("          ","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test226#1873");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test226");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("A                                                hi!",'4','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A                                                hi!"+ "'",str3.equals("A                                                hi!"));
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test227#1881");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test227");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test228#1889");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test228");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test229#1897");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test229");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("4444444Hi!",'a',(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test230#1905");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test230");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("                                   ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test231#1916");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test231");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("","aaaaaaaaa ",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test232#1924");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test232");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)1L,0.0d,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test233#1932");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test233");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("          ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test234#1943");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test234");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"                                                                                                 ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test235#1952");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test235");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!");
    try {
      java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,"aaaaaaaaa ",(-1),(int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test236#1965");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test236");
    java.lang.Byte byte0=org.apache.commons.lang.math.NumberUtils.BYTE_ONE;
    org.junit.Assert.assertTrue("'" + byte0 + "' != '"+ (byte)1+ "'",byte0.equals((byte)1));
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test237#1973");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test237");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test238#1981");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test238");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("#######################################################################################          ",97);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test239#1989");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test239");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("hi!","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!"+ "'",str2.equals("hi!"));
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test240#1997");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test240");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("aaaaaaaaa                                                                                        ",' ');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test241#2005");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test241");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("",(int)(byte)-1,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test242#2013");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test242");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test243#2021");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test243");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)'a',0,10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test244#2029");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test244");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test245#2037");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test245");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("A                                                hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A                                                hi!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test246#2048");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test246");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("#######################################################################################          ","Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################          "+ "'",str2.equals("#######################################################################################          "));
  }
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test247#2056");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test247");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("                                                                                       aaaaaaaaa ","4444444Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str2.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test248#2064");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test248");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("",52,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                    "+ "'",str3.equals("                                                    "));
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test249#2072");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test249");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("h");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "H"+ "'",str1.equals("H"));
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test250#2080");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test250");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("Aaaaaaaaa ","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test251#2088");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test251");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"Aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test252#2097");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test252");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("Hi!",(float)(short)10);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 10.0f+ "'",float2 == 10.0f);
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test253#2105");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test253");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("hi!","H");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test254#2113");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test254");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                    ",(int)(short)1,"A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                    "+ "'",str3.equals("                                                    "));
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test255#2121");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test255");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                 "+ "'",str1.equals("                                                                                                 "));
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test256#2129");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test256");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("A                                                hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test257#2137");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test257");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("","aaaaaaaaa","hi!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test258#2145");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test258");
    java.lang.Double double0=org.apache.commons.lang.math.NumberUtils.DOUBLE_ONE;
    org.junit.Assert.assertTrue("'" + double0 + "' != '"+ 1.0d+ "'",double0.equals(1.0d));
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test259#2153");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test259");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("","A                                                hi!                                                 ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test260#2161");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test260");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("i!",1.0f);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 1.0f+ "'",float2 == 1.0f);
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test261#2169");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test261");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test262#2177");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test262");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                                ","i!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test263#2185");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test263");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("          ","                                                                                       aaaaaaaaa ",(int)'4');
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test264#2193");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test264");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test265#2201");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test265");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test266#2209");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test266");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaa"));
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test267#2217");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test267");
    int int2=org.apache.commons.lang.StringUtils.indexOf("i!","Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test268#2225");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test268");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test269#2233");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test269");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("                                                                                       aaaaaaaaa ","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test270#2241");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test270");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("h","                                                                                       aaaaaaaaa ","h",(-1));
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "h"+ "'",str4.equals("h"));
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test271#2249");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test271");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("A                                                hi!                                                 ","                                   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                   A"+ "'",str2.equals("hi!                                   A"));
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test272#2257");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test272");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("#######################################################################################          ",(int)(short)10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test273#2265");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test273");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)(byte)0,(double)'#',0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test274#2273");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test274");
    int int3=org.apache.commons.lang.math.NumberUtils.min(52,(int)'#',10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 10+ "'",int3 == 10);
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test275#2281");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test275");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"H");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test276#2290");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test276");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("#######################################################################################          ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################          "+ "'",str2.equals("#######################################################################################          "));
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test277#2298");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test277");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test278#2306");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test278");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("#######################################################################################          ",(int)'a',(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#######################################################################################          "+ "'",str3.equals("#######################################################################################          "));
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test279#2314");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test279");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                ",'4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test280#2322");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test280");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("hi!                                   A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!                                   A"+ "'",str1.equals("hi!                                   A"));
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test281#2330");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test281");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                                ",(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test282#2338");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test282");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                ",(int)'4','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test283#2346");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test283");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                    ",1,"A                                                hi!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                    "+ "'",str3.equals("                                                    "));
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test284#2354");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test284");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test285#2362");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test285");
    long[] longArray0=null;
    long[] longArray2=new long[]{'#'};
    long[] longArray6=new long[]{97,(-1),' '};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(longArray2,longArray6);
    long long8=org.apache.commons.lang.math.NumberUtils.max(longArray2);
    boolean boolean9=org.apache.commons.lang.math.NumberUtils.equals(longArray0,longArray2);
    try {
      long long10=org.apache.commons.lang.math.NumberUtils.max(longArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(longArray2);
    org.junit.Assert.assertNotNull(longArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + long8 + "' != '"+ 35L+ "'",long8 == 35L);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test286#2384");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test286");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("i!","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i!"+ "'",str2.equals("i!"));
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test287#2392");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test287");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim(" ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test288#2400");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test288");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("",(int)(short)-1,(int)'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test289#2408");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test289");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test290#2416");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test290");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test291#2424");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test291");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test292#2432");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test292");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa "+ "'",str1.equals("Aaaaaaaaa "));
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test293#2440");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test293");
    int int3=org.apache.commons.lang.StringUtils.indexOf("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444",'a',(-1));
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test294#2448");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test294");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!                                                 "+ "'",str1.equals("A                                                hi!                                                 "));
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test295#2456");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test295");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("hi!",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!"+ "'",str2.equals("hi!"));
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test296#2464");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test296");
    long[] longArray0=null;
    try {
      long long1=org.apache.commons.lang.math.NumberUtils.max(longArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test297#2476");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test297");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("A                                                hi!                                                 ","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!                                                 "+ "'",str2.equals("A                                                hi!                                                 "));
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test298#2484");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test298");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("hi!                                   A","aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                   A"+ "'",str2.equals("hi!                                   A"));
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test299#2492");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test299");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("Aaaaaaaaa ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test300#2500");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test300");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,' ');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test301#2509");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test301");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test302#2517");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test302");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("                                   ","                                                    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                 "+ "'",str2.equals("                 "));
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test303#2525");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test303");
    double double3=org.apache.commons.lang.math.NumberUtils.min((-1.0d),(double)52,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ (-1.0d)+ "'",double3 == (-1.0d));
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test304#2533");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test304");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("                                                                                                 ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 "+ "'",str2.equals("                                                                                                 "));
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test305#2541");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test305");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("aaaaaaaaa","4444444Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444Hi!"+ "'",str2.equals("4444444Hi!"));
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test306#2549");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test306");
    int int3=org.apache.commons.lang.math.NumberUtils.max(1,48,100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test307#2557");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test307");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test308#2565");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test308");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)(short)0,(int)(short)0,0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test309#2573");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test309");
    java.lang.String str0=org.apache.commons.lang.StringUtils.EMPTY;
    org.junit.Assert.assertTrue("'" + str0 + "' != '"+ ""+ "'",str0.equals(""));
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test310#2581");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test310");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("h",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test311#2589");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test311");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                                    ","i!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test312#2597");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test312");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("A                                                hi!                                                 ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test313#2605");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test313");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test314#2613");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test314");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("#######################################################################################          ",10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#############################################################################          "+ "'",str2.equals("#############################################################################          "));
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test315#2621");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test315");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("A                                                hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!"+ "'",str1.equals("A                                                hi!"));
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test316#2629");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test316");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                ",(int)(short)0,(int)(short)1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " "+ "'",str3.equals(" "));
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test317#2637");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test317");
    double[] doubleArray0=new double[]{};
    double[] doubleArray5=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray6=new double[]{};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray6);
    try {
      double double9=org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ true+ "'",boolean8 == true);
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test318#2658");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test318");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)35L,(float)100L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test319#2666");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test319");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("A                                                hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!"+ "'",str1.equals("A                                                hi!"));
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test320#2674");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test320");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("aaaaaaaaa                                                                                        ","                                   ",0,(int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test321#2685");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test321");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test322#2693");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test322");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test323#2701");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test323");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty(" ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test324#2709");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test324");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("","hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test325#2717");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test325");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("h");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test326#2725");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test326");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("hi!                                   A","H");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                   A"+ "'",str2.equals("hi!                                   A"));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test327#2733");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test327");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test328#2741");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test328");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                ","                                   ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test329#2749");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test329");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaa ","Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa "+ "'",str2.equals("aaaaaaaaa "));
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test330#2757");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test330");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test331#2768");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test331");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test332#2776");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test332");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("H");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: H is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test333#2787");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test333");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("4444444Hi!","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test334#2795");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test334");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)0,(byte)100,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test335#2803");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test335");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("4444444Hi!",10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test336#2811");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test336");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("                                                                                                 ","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test337#2819");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test337");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("aaaaaaaaa","A                                                hi!","444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa"+ "'",str3.equals("aaaaaaaaa"));
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test338#2827");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test338");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("4444444Hi!",(int)(byte)0,"A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444Hi!"+ "'",str3.equals("4444444Hi!"));
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test339#2835");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test339");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)(-1),(long)(short)10,(-1L));
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ (-1L)+ "'",long3 == (-1L));
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test340#2843");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test340");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("Aaaaaaaaa","hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test341#2851");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test341");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("A                                                hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test342#2859");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test342");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)1,(short)100,(short)(byte)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test343#2867");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test343");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("Hi!",52,(int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test344#2878");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test344");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("","hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test345() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test345#2886");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test345");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("","4444444Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test346#2894");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test346");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test347#2902");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test347");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("A                                                hi!",0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test348#2910");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test348");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("#############################################################################          ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: #############################################################################           is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test349#2921");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test349");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("hi!                                   A",(int)'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test350#2929");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test350");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)0,(float)(-1L));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test351#2937");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test351");
    java.lang.Float float0=org.apache.commons.lang.math.NumberUtils.FLOAT_ONE;
    org.junit.Assert.assertTrue("'" + float0 + "' != '"+ 1.0f+ "'",float0.equals(1.0f));
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test352#2945");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test352");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test353#2953");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test353");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("h");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "h"+ "'",str1.equals("h"));
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test354#2961");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test354");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test355#2969");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test355");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("i!","Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test356#2977");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test356");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("hi!                                   A","hi!                                   A");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test357#2985");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test357");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                                                                                 ",'a',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                 "+ "'",str3.equals("                                                                                                 "));
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test358#2993");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test358");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)'#',(int)(byte)100,100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 35+ "'",int3 == 35);
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test359#3001");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test359");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)48,(float)10L,(float)' ');
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 10.0f+ "'",float3 == 10.0f);
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test360#3009");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test360");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("Aaaaaaaaa ",(int)' ',"aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test361#3017");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test361");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("hi!                                   A",(int)'a',"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                             hi!                                   A                             "+ "'",str3.equals("                             hi!                                   A                             "));
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test362#3025");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test362");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("hi!                                   A","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                   A"+ "'",str2.equals("hi!                                   A"));
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test363#3033");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test363");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("hi!                                   A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!                                   A\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test364#3044");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test364");
    int int3=org.apache.commons.lang.math.NumberUtils.min(52,(int)(short)-1,(int)' ');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test365#3052");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test365");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("Aaaaaaaaa","                                                    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa"));
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test366#3060");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test366");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaa                                                                                        ",' ',(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 52+ "'",int3 == 52);
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test367#3068");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test367");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test368#3076");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test368");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                                   ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test369#3084");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test369");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)100,(short)100,(short)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test370#3092");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test370");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaa                                ",(int)(short)100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        aaaaaaaaaaaaaaaaaaaa                                                        "+ "'",str2.equals("                        aaaaaaaaaaaaaaaaaaaa                                                        "));
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test371#3100");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test371");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("          ",(double)(byte)-1);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ (-1.0d)+ "'",double2 == (-1.0d));
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test372#3108");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test372");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("                                                hi!                                                 ","aaaaaaaaa                                                                                        ","",(int)(short)0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                                hi!                                                 "+ "'",str4.equals("                                                hi!                                                 "));
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test373#3116");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test373");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)10,(short)(byte)10,(short)(byte)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test374#3124");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test374");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa                                ","",0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test375#3132");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test375");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("hi!",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test376#3140");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test376");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test377#3148");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test377");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)(byte)100,(int)'4',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test378#3156");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test378");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("hi!                                   A",'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test379#3164");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test379");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("Aaaaaaaaa ","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 96+ "'",int2 == 96);
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test380#3172");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test380");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,' ',(int)(byte)1,10);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test381#3181");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test381");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("                                ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test382#3192");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test382");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("h");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test383#3200");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test383");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                                   ",48);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                   "+ "'",str2.equals("                                   "));
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test384#3208");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test384");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaa","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test385#3216");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test385");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("4","i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4"+ "'",str2.equals("4"));
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test386#3224");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test386");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("h",(int)(byte)-1,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "h"+ "'",str3.equals("h"));
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test387#3232");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test387");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("h","4",1);
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,' ',100,(int)'4');
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test388#3242");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test388");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("A                                                hi!","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test389#3250");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test389");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("4","H");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test390#3258");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test390");
    byte[] byteArray0=null;
    try {
      byte byte1=org.apache.commons.lang.math.NumberUtils.min(byteArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test391#3270");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test391");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("4");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test392#3278");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test392");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                         aaaaaaaaaaaaaaaaaaaa                                                         is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test393#3289");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test393");
    float float3=org.apache.commons.lang.math.NumberUtils.min((-1.0f),0.0f,0.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ (-1.0f)+ "'",float3 == (-1.0f));
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test394#3297");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test394");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    try {
      double double7=org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test395#3314");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test395");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("          ","A                                                hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test396#3322");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test396");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                   ",52,(int)' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test397#3330");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test397");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("Aaaaaaaaa ","                                   ");
    java.lang.Class<?> wildcardClass3=strArray2.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test398#3340");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test398");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test399#3348");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test399");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("#######################################################################################          ",100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################          "+ "'",str2.equals("#######################################################################################          "));
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test400#3356");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test400");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("A                                                hi!",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!"+ "'",str2.equals("A                                                hi!"));
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test401#3364");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test401");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test402#3372");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test402");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)1,(short)100,(short)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)1+ "'",short3 == (short)1);
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test403#3380");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test403");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    double[] doubleArray7=new double[]{};
    double[] doubleArray12=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray13=new double[]{};
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(doubleArray12,doubleArray13);
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray7,doubleArray13);
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray7);
    try {
      double double17=org.apache.commons.lang.math.NumberUtils.max(doubleArray7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ true+ "'",boolean15 == true);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test404#3409");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test404");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str1.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test405#3417");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test405");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,'4');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test406#3426");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test406");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("H");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test407#3434");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test407");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test408#3442");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test408");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test409#3450");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test409");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("A                                                hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a                                                HI!"+ "'",str1.equals("a                                                HI!"));
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test410#3458");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test410");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("",(int)(short)10,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test411#3466");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test411");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("H");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "H"+ "'",str1.equals("H"));
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test412#3474");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test412");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a                                                HI!                                                 "+ "'",str1.equals("a                                                HI!                                                 "));
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test413#3482");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test413");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Aaaaaaaaa ");
    java.lang.String str2=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa"));
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test414#3492");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test414");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("a                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test415#3500");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test415");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("",(double)(byte)100);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 100.0d+ "'",double2 == 100.0d);
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test416#3508");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test416");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test417#3516");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test417");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("A                                                hi!                                                 ","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!"+ "'",str2.equals("A                                                hi!"));
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test418#3524");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test418");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)' ',(-1),(-1));
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test419#3532");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test419");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("                                ","#############################################################################          ","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                "+ "'",str3.equals("                                "));
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test420#3540");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test420");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                        aaaaaaaaaaaaaaaaaaaa                                                        ","#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 24+ "'",int2 == 24);
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test421#3548");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test421");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("          ","aaaaaaaaa ",100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test422#3556");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test422");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test423#3567");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test423");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                ","4");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test424#3575");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test424");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("i!","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i!"+ "'",str2.equals("i!"));
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test425#3583");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test425");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test426#3591");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test426");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("A                                                hi!                                                 ",96);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!                                                 "+ "'",str2.equals("A                                                hi!                                                 "));
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test427#3599");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test427");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test428#3607");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test428");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("          ","",(int)(byte)100,(int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test429#3618");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test429");
    int int3=org.apache.commons.lang.math.NumberUtils.min(52,(int)(byte)0,(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test430#3626");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test430");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("                                                                                       aaaaaaaaa ","A                                                hi!","          ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test431#3634");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test431");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaa                                ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test432#3642");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test432");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test433#3650");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test433");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test434#3658");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test434");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                   ",35,(int)(short)0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test435#3666");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test435");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test436#3674");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test436");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        "+ "'",str1.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        "));
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test437#3682");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test437");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                                hi!                                                 ","h");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                "+ "'",str2.equals("                                                "));
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test438#3690");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test438");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test439#3698");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test439");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                                ","",10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 10+ "'",int3 == 10);
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test440#3706");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test440");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("          ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test441#3714");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test441");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("                                                    ",(float)(-1));
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ (-1.0f)+ "'",float2 == (-1.0f));
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test442#3722");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test442");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaa"));
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test443#3730");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test443");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4);
    java.lang.String[] strArray7=org.apache.commons.lang.StringUtils.stripAll(strArray4,"                                   ");
    int int8=org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                 ",strArray7);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ ""+ "'",str5.equals(""));
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test444#3744");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test444");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                        aaaaaaaaaaaaaaaaaaaa                                                        \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test445#3755");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test445");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test446#3763");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test446");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("i!","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test447#3771");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test447");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("","#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test448#3779");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test448");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("          ","i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test449#3787");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test449");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("4444444Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test450#3795");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test450");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test451#3803");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test451");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test452#3811");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test452");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        "+ "'",str2.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        "));
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test453#3819");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test453");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)(byte)10,(short)-1,(short)(byte)10);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test454#3827");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test454");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ ""+ "'",str6.equals(""));
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test455#3841");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test455");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("4444444Hi!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test456#3849");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test456");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test457#3857");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test457");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp(" ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " "+ "'",str2.equals(" "));
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test458#3865");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test458");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("                                                ","A                                                hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                "+ "'",str2.equals("                                                "));
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test459#3873");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test459");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                 ",3);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   "+ "'",str2.equals("   "));
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test460#3881");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test460");
    int int2=org.apache.commons.lang.StringUtils.countMatches("H","Hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test461#3889");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test461");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains(" ","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test462#3897");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test462");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test463#3905");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test463");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("   ",(-1),48);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   "+ "'",str3.equals("   "));
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test464#3913");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test464");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test465#3921");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test465");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                 !ih                                                "+ "'",str1.equals("                                                 !ih                                                "));
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test466#3929");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test466");
    int int2=org.apache.commons.lang.StringUtils.countMatches("i!","#############################################################################          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test467#3937");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test467");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)35L,(float)(short)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test468#3945");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test468");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("a                                                HI!                                                 ",(int)(short)10,(int)' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...                          ..."+ "'",str3.equals("...                          ..."));
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test469#3953");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test469");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("                                                 !ih                                                ","...                          ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                 !ih                                                "+ "'",str2.equals("                                                 !ih                                                "));
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test470#3961");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test470");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaa                                ",'#',48);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test471#3969");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test471");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test472#3977");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test472");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("...                          ...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test473#3985");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test473");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                hi!                                                 ",0,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                hi!                                                 "+ "'",str3.equals("                                                hi!                                                 "));
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test474#3993");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test474");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        "+ "'",str1.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        "));
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test475#4001");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test475");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test476#4009");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test476");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test477#4020");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test477");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)52,(float)(byte)100,0.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 100.0f+ "'",float3 == 100.0f);
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test478#4028");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test478");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test479#4039");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test479");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa "+ "'",str1.equals("Aaaaaaaaa "));
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test480#4047");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test480");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " aaaaaaaaa"+ "'",str1.equals(" aaaaaaaaa"));
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test481#4055");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test481");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("                                   ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                   \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test482#4066");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test482");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test483#4074");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test483");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                                ",(int)(byte)100,(int)'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                "+ "'",str3.equals("                                                "));
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test484#4082");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test484");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)48,(double)1L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test485#4090");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test485");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(0.0f,(float)35);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test486#4098");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test486");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test487#4106");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test487");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("                 ");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test488#4114");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test488");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("#######################################################################################          ",10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################          "+ "'",str2.equals("#######################################################################################          "));
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test489#4122");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test489");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("hi!                                   A","                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A"+ "'",str2.equals("A"));
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test490#4130");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test490");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test491#4138");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test491");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test492#4146");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test492");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test493#4154");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test493");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("","                        AAAAAAAAAAAAAAAAAAAA                                                        ",(int)(byte)100,9);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        "+ "'",str4.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        "));
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test494#4162");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test494");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("aaaaaaaaa",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test495#4170");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test495");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("                                                hi!                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test496#4181");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test496");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test497#4189");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test497");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("i!","                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i!"+ "'",str2.equals("i!"));
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test498#4197");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test498");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("4",24);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "           4            "+ "'",str2.equals("           4            "));
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test499#4205");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test499");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("a                                                HI!","                                                                                                 ",32,(int)(byte)0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                                                                                                  HI!"+ "'",str4.equals("                                                                                                                  HI!"));
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest0::test500#4213");
    if (debug)     System.out.format("%n%s%n","RegressionTest0.test500");
    int int2=org.apache.commons.lang.StringUtils.countMatches("A                                                hi!","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
}
