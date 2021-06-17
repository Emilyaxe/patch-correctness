import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest4 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test001");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("4","aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4"+ "'",str2.equals("4"));
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test002");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("###                                                                                       aaaaaaaaa ","...                    A"," aaaaaaaaa");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test003#26");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test003");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                             aaaaaaaaa                                                                  ",10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test004#34");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test004");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aa","...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test005#42");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test005");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                               ","4444444hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test006#50");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test006");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test007#58");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test007");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!"," ");
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,' ');
    java.lang.Class<?> wildcardClass6=strArray3.getClass();
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("A",strArray3);
    java.lang.String[] strArray8=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    try {
      java.lang.String str12=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray8,"                             aaaaaaaaa                                                                  ",97,(int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "Hi!"+ "'",str5.equals("Hi!"));
    org.junit.Assert.assertNotNull(wildcardClass6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertNotNull(strArray8);
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test008#79");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test008");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("###                                                                                       aaaaaaaaa ",108);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                                                                                       aaaaaaaaa         "+ "'",str2.equals("###                                                                                       aaaaaaaaa         "));
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test009#87");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test009");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,'#');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test010#96");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test010");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("i!","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i!"+ "'",str2.equals("i!"));
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test011#104");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test011");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0," aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test012#113");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test012");
    int int3=org.apache.commons.lang.math.NumberUtils.max(0,(int)'a',(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 97+ "'",int3 == 97);
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test013#121");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test013");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test014#129");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test014");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)94,(double)104,(double)32.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 32.0d+ "'",double3 == 32.0d);
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test015#137");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test015");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" aaaaaaaaa",' ');
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'#');
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "#aaaaaaaaa"+ "'",str4.equals("#aaaaaaaaa"));
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test016#147");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test016");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A"+ "'",str2.equals("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A"));
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test017#155");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test017");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"+ "'",str2.equals("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test018#163");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test018");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)65,24.0d,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 65.0d+ "'",double3 == 65.0d);
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test019#171");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test019");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ","                          aaaaaaaaA",3);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test020#179");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test020");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test021#187");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test021");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"+ "'",str1.equals("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"));
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test022#195");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test022");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!   #######################################################################################       A","#########");
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"#######################################################################################             ");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Hi!   #######################################################################################             ######       A"+ "'",str4.equals("Hi!   #######################################################################################             ######       A"));
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test023#205");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test023");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444","          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"+ "'",str2.equals("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"));
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test024#213");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test024");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaa i!","                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test025#221");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test025");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test026#229");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test026");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("    a     ",29);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "             a               "+ "'",str2.equals("             a               "));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test027#237");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test027");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str2.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test028#245");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test028");
    java.lang.String[] strArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("",strArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test029#254");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test029");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("#######################################################################################             ",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "             "+ "'",str2.equals("             "));
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test030#262");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test030");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",'a',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test031#270");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test031");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test032#279");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test032");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)26,(float)20,(float)7L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 7.0f+ "'",float3 == 7.0f);
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test033#287");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test033");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("###                     aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test034#295");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test034");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                        aaaaaaaaaaaaaaaaaaaa                                                        ",29,"AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                        aaaaaaaaaaaaaaaaaaaa                                                        "+ "'",str3.equals("                        aaaaaaaaaaaaaaaaaaaa                                                        "));
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test035#303");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test035");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                                    ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test036#311");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test036");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("4444444Hi!aaaaaaaaa","                                                                                                 ##a","H");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444Hi!"+ "'",str3.equals("4444444Hi!"));
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test037#319");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test037");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("###                                                                                       aaaaaaaaa ","#############################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test038#327");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test038");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test039#335");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test039");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("#######################################################################################          ",52);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################          "+ "'",str2.equals("#######################################################################################          "));
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test040#343");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test040");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("                                              hi!",(float)36);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 36.0f+ "'",float2 == 36.0f);
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test041#351");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test041");
    int int3=org.apache.commons.lang.StringUtils.indexOf("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a",'a',88);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test042#359");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test042");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("                          aaaaaaaaA");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaA\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test043#370");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test043");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)7L,(-1.0d),(double)94L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 94.0d+ "'",double3 == 94.0d);
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test044#378");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test044");
    int int2=org.apache.commons.lang.StringUtils.indexOf("4444444Hi!aaaaaaaaa                                                                                        ","                          aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test045#386");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test045");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("#########","iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","                                                hi!                                                 ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test046#394");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test046");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("Aaaaaaaaa ",93);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa "+ "'",str2.equals("Aaaaaaaaa "));
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test047#402");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test047");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("A                                                hi!","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!"+ "'",str2.equals("A                                                hi!"));
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test048#410");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test048");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)10,(byte)0,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)10+ "'",byte3 == (byte)10);
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test049#418");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test049");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("Aa hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aA HI!"+ "'",str1.equals("aA HI!"));
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test050#426");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test050");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("4444444Hi!aaaaaaaaa",(int)(short)1,"aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444Hi!aaaaaaaaa"+ "'",str3.equals("4444444Hi!aaaaaaaaa"));
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test051#434");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test051");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("#############################################################################          ","              ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#############################################################################          "+ "'",str2.equals("#############################################################################          "));
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test052#442");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test052");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("   #######################################################################################",65);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   #######################################################################################"+ "'",str2.equals("   #######################################################################################"));
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test053#450");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test053");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("!ih","AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!ih"+ "'",str2.equals("!ih"));
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test054#458");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test054");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                          aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!i aaaaaaaaa                                          "+ "'",str1.equals("!i aaaaaaaaa                                          "));
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test055#466");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test055");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble(" a                                                                                       ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test056#474");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test056");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("a ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A "+ "'",str1.equals("A "));
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test057#482");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test057");
    int int2=org.apache.commons.lang.StringUtils.indexOf("   "," aaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test058#490");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test058");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                          aaaaaaaaa i!","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test059#498");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test059");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("                                                                                                         HI!");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test060#506");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test060");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaa","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test061#514");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test061");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("",'#',7);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test062#522");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test062");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                                                                                   AAAAAAAAA ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAA\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test063#533");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test063");
    float[] floatArray4=new float[]{10,(byte)1,1L,(byte)-1};
    float float5=org.apache.commons.lang.math.NumberUtils.max(floatArray4);
    float float6=org.apache.commons.lang.math.NumberUtils.min(floatArray4);
    org.junit.Assert.assertNotNull(floatArray4);
    org.junit.Assert.assertTrue("'" + float5 + "' != '"+ 10.0f+ "'",float5 == 10.0f);
    org.junit.Assert.assertTrue("'" + float6 + "' != '"+ (-1.0f)+ "'",float6 == (-1.0f));
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test064#545");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test064");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)1,(short)(byte)-1,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)-1+ "'",short3 == (short)-1);
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test065#553");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test065");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaa                                ",(int)'4','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test066#561");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test066");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("... !ih..","#######################################################################################             ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test067#569");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test067");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)52,97L,(long)100);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 100L+ "'",long3 == 100L);
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test068#577");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test068");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","###                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                                                                                       aaaaaaaaa "+ "'",str2.equals("###                                                                                       aaaaaaaaa "));
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test069#585");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test069");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   "+ "'",str1.equals("   "));
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test070#593");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test070");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("","Hi!","4444444Hi!");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test071#601");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test071");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a",32,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"+ "'",str3.equals("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"));
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test072#609");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test072");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("Aaaaaaaaa                          ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","###                     aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A########                          "+ "'",str3.equals("A########                          "));
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test073#617");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test073");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("          ","aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test074#625");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test074");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("a ","########################AAAAAAAAAAAAAAAAAAAA########################################################i!","                                ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test075#633");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test075");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("#######################################################################################             ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test076#641");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test076");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test077#649");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test077");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","                                                    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test078#657");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test078");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("","          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 20+ "'",int2 == 20);
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test079#665");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test079");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("A...");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A...\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test080#676");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test080");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("hi!                         ...",' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 27+ "'",int2 == 27);
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test081#684");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test081");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)(byte)100,(float)(byte)10,(float)' ');
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 100.0f+ "'",float3 == 100.0f);
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test082#692");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test082");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test083#700");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test083");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","#########");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test084#708");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test084");
    int int2=org.apache.commons.lang.StringUtils.indexOf("    a     ","Hi!                                                                                             ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test085#716");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test085");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ",'a',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A         A         A         A         A         A         A         A         A         A       i!    "+ "'",str3.equals("A         A         A         A         A         A         A         A         A         A       i!    "));
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test086#724");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test086");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa i!"+ "'",str1.equals("aaaaaaaaa i!"));
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test087#732");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test087");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                ",' ');
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4);
    int int6=org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                ",strArray4);
    int int7=org.apache.commons.lang.StringUtils.indexOfAny("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",strArray4);
    try {
      java.lang.String str11=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'4',(-1),(int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ ""+ "'",str5.equals(""));
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ 0+ "'",int6 == 0);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ 0+ "'",int7 == 0);
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test088#751");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test088");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("                                                                                              !iH","!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test089#759");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test089");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!                                                                                             ",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test090#767");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test090");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)32,(float)9L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test091#775");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test091");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("AAAAAAAAA ",(int)(byte)10,2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test092#783");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test092");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("                               ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                               "+ "'",str2.equals("                               "));
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test093#791");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test093");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("h#################...#################...#################...#################...#######");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test094#802");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test094");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("#aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#aaaaaaaaa"+ "'",str1.equals("#aaaaaaaaa"));
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test095#810");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test095");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test096#818");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test096");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("aA HI!","AAAAAAAAA ","",1);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aA HI!"+ "'",str4.equals("aA HI!"));
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test097#826");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test097");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("H","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -34");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test098#837");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test098");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test099#845");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test099");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("... !ih..                                           ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih.."+ "'",str1.equals("... !ih.."));
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test100#853");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test100");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("          aaaaaaaaa ","",99);
    try {
      java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,'4',1,10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test101#866");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test101");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("4","                                                ",100,4);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "4                                                "+ "'",str4.equals("4                                                "));
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test102#874");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test102");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test103#882");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test103");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("                               ","a                                                HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test104#890");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test104");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test105#898");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test105");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("          ");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.stripAll(strArray1,"#################...");
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    try {
      java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"",(int)'a',(int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test106#915");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test106");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("###                     aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "###                     aaaaaaaaa"+ "'",str1.equals("###                     aaaaaaaaa"));
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test107#923");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test107");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!                                                                                              "+ "'",str1.equals("Hi!                                                                                              "));
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test108#931");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test108");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa "+ "'",str1.equals("aaaaaaaaa "));
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test109#939");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test109");
    float float3=org.apache.commons.lang.math.NumberUtils.min(4.0f,(float)' ',(float)(byte)100);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 4.0f+ "'",float3 == 4.0f);
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test110#947");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test110");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("HHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test111#955");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test111");
    float[] floatArray0=null;
    try {
      float float1=org.apache.commons.lang.math.NumberUtils.min(floatArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test112#967");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test112");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test113#975");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test113");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)48,(long)47,(long)0);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test114#983");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test114");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("a","   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test115#991");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test115");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("HHHHHHHHHH","                             aaaaaaaaa                                                                  ",0,108);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test116#1002");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test116");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","                        AAAAAAAAAAAAAAAAAAAA                                                        i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test117#1010");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test117");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                            !i aaaaaaaaa                                            "+ "'",str1.equals("                                            !i aaaaaaaaa                                            "));
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test118#1018");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test118");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("Aaaaaaaaa","                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 156+ "'",int2 == 156);
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test119#1026");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test119");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("i!","H");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test120#1034");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test120");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test121#1042");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test121");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("4444444hI!AAAAAAAAA                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test122#1050");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test122");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                                 ","hi!A",(int)(byte)0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test123#1058");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test123");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test124#1066");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test124");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","########################AAAAAAAAAAAAAAAAAAAA########################################################i!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test125#1074");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test125");
    double double3=org.apache.commons.lang.math.NumberUtils.min(48.0d,9.0d,(double)'4');
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 9.0d+ "'",double3 == 9.0d);
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test126#1082");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test126");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaai!"+ "'",str1.equals("aaaaaaaaai!"));
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test127#1090");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test127");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase(" aaaaaa...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " AAAAAA..."+ "'",str1.equals(" AAAAAA..."));
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test128#1098");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test128");
    int int3=org.apache.commons.lang.math.NumberUtils.max(99,47,0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 99+ "'",int3 == 99);
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test129#1106");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test129");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)(short)10,(float)52,10.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 52.0f+ "'",float3 == 52.0f);
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test130#1114");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test130");
    int int2=org.apache.commons.lang.StringUtils.indexOf("Aa","                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test131#1122");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test131");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test132#1130");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test132");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",(long)88);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 88L+ "'",long2 == 88L);
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test133#1138");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test133");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)(short)10,0,35);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 35+ "'",int3 == 35);
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test134#1146");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test134");
    char[] charArray3=new char[]{};
    int int4=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray3);
    boolean boolean5=org.apache.commons.lang.StringUtils.containsOnly("                                                                                   aaaaaaaaa ",charArray3);
    boolean boolean6=org.apache.commons.lang.StringUtils.containsOnly("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!",charArray3);
    org.junit.Assert.assertNotNull(charArray3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ (-1)+ "'",int4 == (-1));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '"+ false+ "'",boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test135#1160");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test135");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test136#1168");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test136");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("###                                                                                       aaaaaaaaa ","#############################################################################");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test137#1176");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test137");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",96,"!ih");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str3.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test138#1184");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test138");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                ","                                                                                                    ",100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test139#1192");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test139");
    char[] charArray7=new char[]{'a','4',' ','4','#'};
    int int8=org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!",charArray7);
    boolean boolean9=org.apache.commons.lang.StringUtils.containsOnly("             a               ",charArray7);
    org.junit.Assert.assertNotNull(charArray7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ 0+ "'",int8 == 0);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ true+ "'",boolean9 == true);
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test140#1204");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test140");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("                                                ",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                "+ "'",str2.equals("                                                "));
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test141#1212");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test141");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",96,29);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str4.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test142#1220");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test142");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("a                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test143#1228");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test143");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("hi!                         ...");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test144#1239");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test144");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","    a     ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test145#1247");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test145");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"));
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test146#1255");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test146");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("                             aaaaaaaaa                                                                  ","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                             aaaaaaaaa                                                                  "+ "'",str2.equals("                             aaaaaaaaa                                                                  "));
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test147#1263");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test147");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                                                                                ",'4','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                "+ "'",str3.equals("                                                                                                "));
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test148#1271");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test148");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("!i aaaaaaaaa                                          ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                          a!i "+ "'",str2.equals("                                          a!i "));
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test149#1279");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test149");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace(" aaaaaa...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test150#1287");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test150");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test151#1295");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test151");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("               ","#############################################################################");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test152#1303");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test152");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test153#1311");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test153");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                                              hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test154#1319");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test154");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test155#1330");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test155");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("H","aa ","A...");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test156#1338");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test156");
    int int3=org.apache.commons.lang.StringUtils.indexOf("Hi!",'#',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test157#1346");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test157");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)'4',(float)9,(float)(short)-1);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 52.0f+ "'",float3 == 52.0f);
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test158#1354");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test158");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                                                                                                ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"      \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test159#1365");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test159");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("#######################################################################################             ",29,0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test160#1376");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test160");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                               ","                                            aaaaaaaaa i!                                            ","hi!A");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'",str3.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test161#1384");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test161");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("          aaaaaaaaa ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test162#1392");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test162");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","Aa hi!","4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str3.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test163#1400");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test163");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("A                                                hi!                                                 ","#######################################################################################             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test164#1408");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test164");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test165#1416");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test165");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)35L,4.0f);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test166#1424");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test166");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("                                            aaaaaaaaa i!                                            ","H");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                            aaaaaaaaa i!                                            "+ "'",str2.equals("                                            aaaaaaaaa i!                                            "));
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test167#1432");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test167");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("AAAAAAAAA","                                              hi!","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AAAAAAAAA"+ "'",str3.equals("AAAAAAAAA"));
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test168#1440");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test168");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("... !ih..");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih.."+ "'",str1.equals("... !ih.."));
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test169#1448");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test169");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)100,(short)0,(short)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)-1+ "'",short3 == (short)-1);
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test170#1456");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test170");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                         i!                         ",36,"##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                         i!                         "+ "'",str3.equals("                         i!                         "));
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test171#1464");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test171");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("","                                                                                                 ##A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test172#1472");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test172");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test173#1480");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test173");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("             a               ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "             A               "+ "'",str1.equals("             A               "));
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test174#1488");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test174");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test175#1496");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test175");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("... !ih...                                ",(int)(byte)10,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "... !ih...                                "+ "'",str3.equals("... !ih...                                "));
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test176#1504");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test176");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray4);
    int int6=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa",strArray4);
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'a');
    java.lang.String str10=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'#');
    java.lang.String str11=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
    org.junit.Assert.assertTrue("'" + str10 + "' != '"+ ""+ "'",str10.equals(""));
    org.junit.Assert.assertTrue("'" + str11 + "' != '"+ ""+ "'",str11.equals(""));
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test177#1522");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test177");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaa i!",24);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!            "+ "'",str2.equals("aaaaaaaaa i!            "));
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test178#1530");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test178");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str1.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test179#1538");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test179");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("","4444444Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test180#1546");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test180");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("a                                                HI!","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                HI!"+ "'",str2.equals("a                                                HI!"));
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test181#1554");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test181");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("   aaaaaaaaa                                        ",'a','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   aaaaaaaaa                                        "+ "'",str3.equals("   aaaaaaaaa                                        "));
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test182#1562");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test182");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test183#1573");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test183");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("                                          aaaaaaaaa i!","      ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test184#1581");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test184");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test185#1589");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test185");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(52.0f,(-1.0f));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test186#1597");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test186");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("##A","A...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test187#1605");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test187");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("Aaaaaaaaa                          ","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444","Aa hi!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa                          "+ "'",str3.equals("Aaaaaaaaa                          "));
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test188#1613");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test188");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("                       AAAAAAAAA","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test189#1621");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test189");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("","... !ih...",156);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test190#1629");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test190");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("HHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test191#1637");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test191");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                                ","h#################...#################...#################...#################...#######");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test192#1645");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test192");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("... !ih..                                           ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih.."+ "'",str1.equals("... !ih.."));
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test193#1653");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test193");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("aaaaaaaaa ",' ');
    java.lang.Class<?> wildcardClass3=strArray2.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test194#1663");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test194");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test195#1671");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test195");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("              ",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "              "+ "'",str2.equals("              "));
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test196#1679");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test196");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("                                                                                              !Ih");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test197#1687");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test197");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"));
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test198#1695");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test198");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test199#1706");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test199");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaa"));
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test200#1714");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test200");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test201#1725");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test201");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("             ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test202#1733");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test202");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("###                     Aaaaaaaaa                                                                                        ",36);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                     "+ "'",str2.equals("                                                                                     "));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test203#1741");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test203");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("             A               ","4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test204#1749");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test204");
    char[] charArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                         HI!",charArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test205#1758");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test205");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)(byte)0,63,0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 63+ "'",int3 == 63);
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test206#1766");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test206");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("h#################...#################...#################...#################...#######","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test207#1774");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test207");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("4");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test208#1782");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test208");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test209#1790");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test209");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test210#1798");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test210");
    double[] doubleArray0=null;
    double[] doubleArray5=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray6=new double[]{};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray6);
    try {
      double double9=org.apache.commons.lang.math.NumberUtils.min(doubleArray6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test211#1818");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test211");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","                                                                                   AAAAAAAAA ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test212#1826");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test212");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)(-1L),0.0f,(float)7);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ (-1.0f)+ "'",float3 == (-1.0f));
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test213#1834");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test213");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("aaaaaaaaa",104);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test214#1842");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test214");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",20,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str3.equals("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test215#1850");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test215");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("   ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   "+ "'",str2.equals("   "));
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test216#1858");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test216");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test217#1866");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test217");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                                                                     ",43,108);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                     "+ "'",str3.equals("                                                                                     "));
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test218#1874");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test218");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("a ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test219#1882");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test219");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                                                                       aaaaaaaaa ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test220#1890");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test220");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("...                          ...",(float)(short)10);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 10.0f+ "'",float2 == 10.0f);
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test221#1898");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test221");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","HHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test222#1906");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test222");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    double[] doubleArray7=new double[]{};
    double[] doubleArray12=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray13=new double[]{};
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(doubleArray12,doubleArray13);
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray7,doubleArray13);
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray7);
    double[] doubleArray21=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray22=new double[]{};
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(doubleArray21,doubleArray22);
    double[] doubleArray24=null;
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(doubleArray22,doubleArray24);
    double[] doubleArray30=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray31=new double[]{};
    boolean boolean32=org.apache.commons.lang.math.NumberUtils.equals(doubleArray30,doubleArray31);
    double[] doubleArray33=new double[]{};
    double[] doubleArray38=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray39=new double[]{};
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(doubleArray38,doubleArray39);
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(doubleArray33,doubleArray39);
    boolean boolean42=org.apache.commons.lang.math.NumberUtils.equals(doubleArray30,doubleArray33);
    boolean boolean43=org.apache.commons.lang.math.NumberUtils.equals(doubleArray22,doubleArray33);
    boolean boolean44=org.apache.commons.lang.math.NumberUtils.equals(doubleArray7,doubleArray22);
    try {
      double double45=org.apache.commons.lang.math.NumberUtils.max(doubleArray22);
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
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '"+ false+ "'",boolean32 == false);
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ true+ "'",boolean41 == true);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ false+ "'",boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '"+ true+ "'",boolean43 == true);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '"+ true+ "'",boolean44 == true);
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test223#1966");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test223");
    float[] floatArray6=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float7=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    float[] floatArray14=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float15=org.apache.commons.lang.math.NumberUtils.min(floatArray14);
    java.lang.Class<?> wildcardClass16=floatArray14.getClass();
    float[] floatArray20=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float21=org.apache.commons.lang.math.NumberUtils.max(floatArray20);
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(floatArray14,floatArray20);
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray14);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ (-1.0f)+ "'",float7 == (-1.0f));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + float15 + "' != '"+ (-1.0f)+ "'",float15 == (-1.0f));
    org.junit.Assert.assertNotNull(wildcardClass16);
    org.junit.Assert.assertNotNull(floatArray20);
    org.junit.Assert.assertTrue("'" + float21 + "' != '"+ 100.0f+ "'",float21 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ true+ "'",boolean23 == true);
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test224#1990");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test224");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)1,(byte)-1,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test225#1998");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test225");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("",(-1),"aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test226#2006");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test226");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)100,(byte)10,(byte)10);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)10+ "'",byte3 == (byte)10);
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test227#2014");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test227");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test228#2025");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test228");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                 ","hi!",99);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test229#2033");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test229");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("          ",(int)' ','4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          4444444444444444444444"+ "'",str3.equals("          4444444444444444444444"));
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test230#2041");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test230");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("a ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test231#2049");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test231");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                   ","               ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test232#2057");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test232");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("Aa",104,(int)'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test233#2065");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test233");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("Aa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test234#2073");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test234");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("#######################################################################################             ",'#','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             "+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             "));
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test235#2081");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test235");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("hi!                         ...","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                         ..."+ "'",str2.equals("hi!                         ..."));
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test236#2089");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test236");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("aaaaaaaaa i!","#########");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test237#2097");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test237");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("A ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A "+ "'",str1.equals("A "));
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test238#2105");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test238");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("h#################...#################...#################...#################...#######","                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ",36);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test239#2113");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test239");
    int int3=org.apache.commons.lang.math.NumberUtils.max(10,41,0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 41+ "'",int3 == 41);
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test240#2121");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test240");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("###                     aaaaaaaaa                                                                                        ",27);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                     aaaaaaaaa                                                                                        "+ "'",str2.equals("###                     aaaaaaaaa                                                                                        "));
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test241#2129");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test241");
    char[] charArray9=new char[]{'#','4','#','#',' '};
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa ",charArray9);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsNone("",charArray9);
    boolean boolean12=org.apache.commons.lang.StringUtils.containsOnly("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ",charArray9);
    int int13=org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaa",charArray9);
    org.junit.Assert.assertNotNull(charArray9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ 0+ "'",int10 == 0);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ true+ "'",boolean11 == true);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-1)+ "'",int13 == (-1));
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test242#2145");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test242");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test243#2156");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test243");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                                                                                         HI!",'#',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                         HI!"+ "'",str3.equals("                                                                                                         HI!"));
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test244#2164");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test244");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test245#2172");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test245");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!"));
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test246#2180");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test246");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("Aaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa                          "+ "'",str1.equals("aaaaaaaaa                          "));
  }
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test247#2188");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test247");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("                         i!                         ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                         I!                         "+ "'",str1.equals("                         I!                         "));
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test248#2196");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test248");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("###                     aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test249#2204");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test249");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",31);
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test250#2211");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test250");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                                                                                              !Ih");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!Ih\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test251#2222");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test251");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("h#################...#################...#################...#################...#######",93);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "h#################...#################...#################...#################...#######"+ "'",str2.equals("h#################...#################...#################...#################...#######"));
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test252#2230");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test252");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("#######################################################################################             ","                                          aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test253#2238");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test253");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("... !ih..");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih.."+ "'",str1.equals("... !ih.."));
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test254#2246");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test254");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("###                     Aaaaaaaaa                                                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ###                     Aaaaaaaaa                                                                                         is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test255#2257");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test255");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("... !ih...",100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih..."+ "'",str2.equals("... !ih..."));
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test256#2265");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test256");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("... !ih...                                ","...                    A");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test257#2273");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test257");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaa","i!",36);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test258#2281");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test258");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test259#2289");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test259");
    long[] longArray2=new long[]{'#',10};
    long long3=org.apache.commons.lang.math.NumberUtils.min(longArray2);
    org.junit.Assert.assertNotNull(longArray2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 10L+ "'",long3 == 10L);
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test260#2299");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test260");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("Hi!                                                                                             ","   ","A########                          ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test261#2307");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test261");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaa ","hi!                                   A",47);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test262#2315");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test262");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("4");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test263#2323");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test263");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test264#2331");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test264");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("           4            ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test265#2339");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test265");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("aaaaaaaaa i!            ","","                                                                                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa i!            "+ "'",str3.equals("aaaaaaaaa i!            "));
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test266#2347");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test266");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                             hi!                                   A                             ","iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA",10);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test267#2355");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test267");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("h","hi!                                   A","                                                                                   AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "h"+ "'",str3.equals("h"));
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test268#2363");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test268");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("                                                                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test269#2371");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test269");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ",9);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "         "+ "'",str2.equals("         "));
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test270#2379");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test270");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa","                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test271#2387");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test271");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("A         A         A         A         A         A         A         A         A         A       i!    ","                                                                                       aaaaaaaaa ",0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test272#2395");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test272");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aa  Aaaaaaaaa"+ "'",str2.equals("aa  Aaaaaaaaa"));
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test273#2403");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test273");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("... !ih..");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test274#2411");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test274");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("4                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test275#2419");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test275");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test276#2430");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test276");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize(" a                                                                                       ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " a                                                                                       "+ "'",str1.equals(" a                                                                                       "));
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test277#2438");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test277");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("HHHHHHHHHH","                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "HHHHHHHHHH"+ "'",str2.equals("HHHHHHHHHH"));
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test278#2446");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test278");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("4444444hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444hi!aaaaaaaaa                                                                                        "+ "'",str1.equals("4444444hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test279#2454");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test279");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)(-1.0f),(double)10,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 10.0d+ "'",double3 == 10.0d);
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test280#2462");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test280");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ","Aa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 "+ "'",str2.equals("                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 "));
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test281#2470");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test281");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(0.0d,(double)63);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test282#2478");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test282");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("##Aaaaaaaaa",20,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##Aaaaaaaaaaaaaaaaaa"+ "'",str3.equals("##Aaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test283#2486");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test283");
    char[] charArray7=new char[]{'4','4','#'};
    boolean boolean8=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa",charArray7);
    int int9=org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa",charArray7);
    boolean boolean10=org.apache.commons.lang.StringUtils.containsNone("AAAAAAAAA ",charArray7);
    int int11=org.apache.commons.lang.StringUtils.indexOfAny("!ih",charArray7);
    org.junit.Assert.assertNotNull(charArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ true+ "'",boolean8 == true);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ (-1)+ "'",int9 == (-1));
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ true+ "'",boolean10 == true);
    org.junit.Assert.assertTrue("'" + int11 + "' != '"+ (-1)+ "'",int11 == (-1));
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test284#2502");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test284");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("4444444hI!AAAAAAAAA                                                                                        ","                         I!                         ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test285#2510");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test285");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa",'a');
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    int int5=org.apache.commons.lang.StringUtils.indexOfAny("",strArray4);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ 0+ "'",int5 == 0);
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test286#2522");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test286");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test287#2530");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test287");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                              hi!",' ');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test288#2538");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test288");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ","           4            ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test289#2546");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test289");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test290#2554");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test290");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)36,(float)10L,97.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 97.0f+ "'",float3 == 97.0f);
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test291#2562");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test291");
    java.lang.String[] strArray1=null;
    int int2=org.apache.commons.lang.StringUtils.lastIndexOfAny("4444444Hi!aaaaaaaaa",strArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test292#2571");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test292");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                            aaaaaaaaa i!                                            "+ "'",str1.equals("                                            aaaaaaaaa i!                                            "));
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test293#2579");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test293");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test294#2587");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test294");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("aaaaaaaaa                          ",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test295#2595");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test295");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh","aa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test296#2603");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test296");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("AAAAAAAAA ","                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ","Aaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A"+ "'",str3.equals("A"));
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test297#2611");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test297");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)-1,(short)(byte)-1,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)-1+ "'",short3 == (short)-1);
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test298#2619");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test298");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test299#2627");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test299");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)(byte)10,(short)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)-1+ "'",short3 == (short)-1);
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test300#2635");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test300");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("Hi!                                                                                              ",(int)'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                              "+ "'",str2.equals("                                                              "));
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test301#2643");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test301");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("             a               ","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test302#2651");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test302");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test303#2659");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test303");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)(byte)-1,(short)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)-1+ "'",short3 == (short)-1);
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test304#2667");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test304");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str1.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test305#2675");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test305");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("                                            !i aaaaaaaaa                                            ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                            !i aaaaaaaaa                                            \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test306#2686");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test306");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test307#2694");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test307");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("                                                                                                 ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 "+ "'",str2.equals("                                                                                                 "));
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test308#2702");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test308");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("4444444hI!AAAAAAAAA                                                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444hI!AAAAAAAAA                                                                                        \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test309#2713");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test309");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","... !ih...aaaaaaaaaaaaaaaaaaaa                                ",96);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test310#2721");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test310");
    int int2=org.apache.commons.lang.StringUtils.indexOf("","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test311#2729");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test311");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test312#2740");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test312");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("",3);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test313#2748");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test313");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test314#2756");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test314");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444Hi!aaaaaaaaa"+ "'",str1.equals("4444444Hi!aaaaaaaaa"));
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test315#2764");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test315");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("###                     aaaaaaaaa                                                                                        ",'4',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "###                     aaaaaaaaa                                                                                        "+ "'",str3.equals("###                     aaaaaaaaa                                                                                        "));
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test316#2772");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test316");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                 "+ "'",str1.equals("                                                                                                 "));
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test317#2780");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test317");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                                ...                          ......                 ","aaaaaaaaa                          ",0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test318#2788");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test318");
    int int3=org.apache.commons.lang.math.NumberUtils.max(96,(int)(short)100,94);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test319#2796");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test319");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("AAAAAAAAA");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test320#2807");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test320");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("aa  Aaaaaaaaa",' ');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test321#2815");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test321");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("","a                                                HI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test322#2823");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test322");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"," aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ",88);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test323#2831");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test323");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test324#2839");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test324");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test325#2847");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test325");
    int int3=org.apache.commons.lang.StringUtils.indexOf("#######################################################################################             ","#######################################################################################",35);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test326#2855");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test326");
    int int3=org.apache.commons.lang.StringUtils.indexOf("   ",'4',156);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test327#2863");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test327");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                                                                                 ##a",47,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                 ##a"+ "'",str3.equals("                                                                                                 ##a"));
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test328#2871");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test328");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("aaaaaaaaa ","#############################################################################          ");
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa"+ "'",str3.equals("aaaaaaaaa"));
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test329#2881");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test329");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","4444444Hi!",41);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test330#2889");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test330");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("             a               ","Hi!                                                                                             ","                        AAAAAAAAAAAAAAAAAAAA                                                        ",4);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "             a               "+ "'",str4.equals("             a               "));
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test331#2897");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test331");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("","aa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test332#2905");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test332");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!","hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aAAAAAAAA                                       HI!"+ "'",str2.equals("aAAAAAAAA                                       HI!"));
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test333#2913");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test333");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("#######################################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#######################################################################################"+ "'",str1.equals("#######################################################################################"));
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test334#2921");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test334");
    long long3=org.apache.commons.lang.math.NumberUtils.min(10L,(long)(short)1,(long)104);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 1L+ "'",long3 == 1L);
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test335#2929");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test335");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("   aaaaaaaaa                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test336#2937");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test336");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test337#2945");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test337");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("                                            !i aaaaaaaaa                                            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!i aaaaaaaaa"+ "'",str1.equals("!i aaaaaaaaa"));
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test338#2953");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test338");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf(""," aaaaaa...",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test339#2961");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test339");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("","AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test340#2969");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test340");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaa                          ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                          "+ "'",str2.equals("aaaaaaaaa                          "));
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test341#2977");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test341");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test342#2985");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test342");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("4444444444444444444444444444444444                                4444444444444444444444444444444444","#############################################################################          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str2.equals("4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test343#2993");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test343");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("aaaaaaaaa ",' ');
    int int4=org.apache.commons.lang.StringUtils.indexOfAny("a                                                HI!                                                 ",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ (-1)+ "'",int4 == (-1));
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test344#3003");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test344");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    double[] doubleArray7=null;
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray7);
    double[] doubleArray13=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray14=new double[]{};
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray13,doubleArray14);
    double[] doubleArray16=new double[]{};
    double[] doubleArray21=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray22=new double[]{};
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(doubleArray21,doubleArray22);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(doubleArray16,doubleArray22);
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(doubleArray13,doubleArray16);
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray16);
    double[] doubleArray31=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray32=new double[]{};
    boolean boolean33=org.apache.commons.lang.math.NumberUtils.equals(doubleArray31,doubleArray32);
    double[] doubleArray34=new double[]{};
    double[] doubleArray39=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray40=new double[]{};
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(doubleArray39,doubleArray40);
    boolean boolean42=org.apache.commons.lang.math.NumberUtils.equals(doubleArray34,doubleArray40);
    boolean boolean43=org.apache.commons.lang.math.NumberUtils.equals(doubleArray31,doubleArray34);
    boolean boolean44=org.apache.commons.lang.math.NumberUtils.equals(doubleArray16,doubleArray31);
    try {
      double double45=org.apache.commons.lang.math.NumberUtils.max(doubleArray16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ true+ "'",boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ true+ "'",boolean26 == true);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '"+ false+ "'",boolean33 == false);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ false+ "'",boolean41 == false);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ true+ "'",boolean42 == true);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '"+ false+ "'",boolean43 == false);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '"+ false+ "'",boolean44 == false);
  }
  @Test public void test345() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test345#3063");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test345");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaa",104,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test346#3071");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test346");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("hi!A",(-1),'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "hi!A"+ "'",str3.equals("hi!A"));
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test347#3079");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test347");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("Hi!                                                                                             ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test348#3087");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test348");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",93);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa"+ "'",str2.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa"));
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test349#3095");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test349");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"!i aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test350#3104");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test350");
    float float3=org.apache.commons.lang.math.NumberUtils.min(100.0f,(float)(short)-1,(float)(-1L));
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ (-1.0f)+ "'",float3 == (-1.0f));
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test351#3112");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test351");
    int int3=org.apache.commons.lang.StringUtils.indexOf("","                                ",(int)' ');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test352#3120");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test352");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa","                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test353#3128");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test353");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("a                                                HI!                                                 ","hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test354#3136");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test354");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)20,(long)48,7L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 48L+ "'",long3 == 48L);
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test355#3144");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test355");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)1,(short)0,(short)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test356#3152");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test356");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("             ","                                                              ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test357#3160");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test357");
    int int2=org.apache.commons.lang.StringUtils.indexOf("###                     aaaaaaaaa                                                                                        ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test358#3168");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test358");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("#############################################################################          ","                 ");
    java.lang.Class<?> wildcardClass3=strArray2.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test359#3178");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test359");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("                             aaaaaaaaa                                                                  ",(float)108L);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 108.0f+ "'",float2 == 108.0f);
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test360#3186");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test360");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","A...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A..."+ "'",str2.equals("A..."));
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test361#3194");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test361");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("",29,"Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAa"+ "'",str3.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa"));
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test362#3202");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test362");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("###                                                                                       aaaaaaaaa         ",35);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 35+ "'",int2 == 35);
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test363#3210");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test363");
    int int2=org.apache.commons.lang.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test364#3218");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test364");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ","                             aaaaaaaaa                                                                  ",(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test365#3226");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test365");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test366#3234");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test366");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("hi!",63,"aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test367#3242");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test367");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",(int)'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  "+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  "));
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test368#3250");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test368");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test369#3259");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test369");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)1,(byte)1,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test370#3267");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test370");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("","","   #######################################################################################");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test371#3275");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test371");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ","...                    A");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test372#3283");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test372");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("h#################...#################...#################...#################...#######","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test373#3291");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test373");
    char[] charArray6=new char[]{' ',' '};
    int int7=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray6);
    int int8=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                hi!                                                 ",charArray6);
    boolean boolean9=org.apache.commons.lang.StringUtils.containsOnly("                                   ",charArray6);
    boolean boolean10=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",charArray6);
    org.junit.Assert.assertNotNull(charArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ 0+ "'",int7 == 0);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ 48+ "'",int8 == 48);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ true+ "'",boolean9 == true);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ true+ "'",boolean10 == true);
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test374#3307");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test374");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","hi!                         ...");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test375#3318");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test375");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace(" ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test376#3326");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test376");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString(" ","Aa",(int)(short)10,0);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test377#3337");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test377");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                                                                                   aaaaaaaaa ","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                   aaaaaaaaa "+ "'",str2.equals("                                                                                   aaaaaaaaa "));
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test378#3345");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test378");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("",0,(int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test379#3356");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test379");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("Aa","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test380#3364");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test380");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("4444444Hi!","                                                ...                          ......                 ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test381#3372");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test381");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaa i!"," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!"+ "'",str2.equals("aaaaaaaaa i!"));
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test382#3380");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test382");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("Hi!   #######################################################################################       A","          #############################################################################");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test383#3388");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test383");
    int int2=org.apache.commons.lang.StringUtils.indexOf("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test384#3396");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test384");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("                                   ",29);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 29+ "'",int2 == 29);
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test385#3404");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test385");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("                                                                                     ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test386#3412");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test386");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("          ");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.stripAll(strArray1,"#################...");
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ ""+ "'",str6.equals(""));
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test387#3426");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test387");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("                                                                                                         HI!",(double)100);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 100.0d+ "'",double2 == 100.0d);
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test388#3434");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test388");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("!i aaaaaaaaa",104,104);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test389#3442");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test389");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaa",(long)48);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 48L+ "'",long2 == 48L);
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test390#3450");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test390");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("a                                                HI!                                                 ","                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test391#3458");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test391");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                ...                          ......                 "+ "'",str1.equals("                                                ...                          ......                 "));
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test392#3466");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test392");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("                               ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                               "+ "'",str1.equals("                               "));
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test393#3474");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test393");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("",26,104);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test394#3482");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test394");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)100,(byte)0,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test395#3490");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test395");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("hi!                                   A","   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","   aaaaaaaaa                                        ",(-1));
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "hi!                                   A"+ "'",str4.equals("hi!                                   A"));
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test396#3498");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test396");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test397#3506");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test397");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("h");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test398#3514");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test398");
    double[] doubleArray1=new double[]{24};
    double double2=org.apache.commons.lang.math.NumberUtils.min(doubleArray1);
    double double3=org.apache.commons.lang.math.NumberUtils.max(doubleArray1);
    org.junit.Assert.assertNotNull(doubleArray1);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 24.0d+ "'",double2 == 24.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 24.0d+ "'",double3 == 24.0d);
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test399#3526");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test399");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test400#3534");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test400");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("                                                ",10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                "+ "'",str2.equals("                                                "));
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test401#3542");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test401");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("                                                                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test402#3550");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test402");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                                ","... !ih...aaaaaaaaaaaaaaaaaaaa                                ",52);
    try {
      java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,'a',(int)'4',63);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test403#3563");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test403");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                                          aaaaaaaaa i!","4444444hI!AAAAAAAAA                                                                                        ","#############################################################################          ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test404#3571");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test404");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          "+ "'",str2.equals("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          "));
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test405#3579");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test405");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("Hi!",0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test406#3590");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test406");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("                                                                                   aaaaaaaaa ",29);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                   aaaaaaaaa "+ "'",str2.equals("                                                                                   aaaaaaaaa "));
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test407#3598");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test407");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaa                          ","                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test408#3606");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test408");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("#aaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test409#3614");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test409");
    byte[] byteArray3=new byte[]{(byte)0,(byte)100,(byte)100};
    byte[] byteArray4=null;
    boolean boolean5=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray4);
    try {
      byte byte6=org.apache.commons.lang.math.NumberUtils.min(byteArray4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '"+ false+ "'",boolean5 == false);
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test410#3630");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test410");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals(" 4            ","                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test411#3638");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test411");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf(" aaaaaaaaa",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test412#3646");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test412");
    float float3=org.apache.commons.lang.math.NumberUtils.min(52.0f,96.0f,(float)48);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 48.0f+ "'",float3 == 48.0f);
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test413#3654");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test413");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("Aa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aa"+ "'",str1.equals("Aa"));
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test414#3662");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test414");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("Hi!","Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!"+ "'",str2.equals("Hi!"));
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test415#3670");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test415");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("",(long)31);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 31L+ "'",long2 == 31L);
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test416#3678");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test416");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",(float)'#');
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 35.0f+ "'",float2 == 35.0f);
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test417#3686");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test417");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa "+ "'",str1.equals(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa "));
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test418#3694");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test418");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                         HI!","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(int)(short)10);
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                                                                                HI!"+ "'",str4.equals("                                                                                                HI!"));
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test419#3704");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test419");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                                                ...                          ......                 ",' ',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test420#3712");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test420");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("                          aaaaaaaaA","#########");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                          aaaaaaaaA"+ "'",str2.equals("                          aaaaaaaaA"));
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test421#3720");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test421");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("A ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test422#3728");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test422");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("4");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test423#3736");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test423");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test424#3744");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test424");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("#######################################################################################             ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test425#3752");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test425");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test426#3763");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test426");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("                                                                                        ","###                     aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test427#3771");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test427");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)7L,(float)48L,(float)4);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 48.0f+ "'",float3 == 48.0f);
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test428#3779");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test428");
    int int3=org.apache.commons.lang.StringUtils.indexOf("4","                       AAAAAAAAA",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test429#3787");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test429");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!                                                 "+ "'",str1.equals("A                                                hi!                                                 "));
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test430#3795");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test430");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("                                                hi!                                                 ",(int)'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                hi!                                                 "+ "'",str2.equals("                                                hi!                                                 "));
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test431#3803");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test431");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("A         A         A         A         A         A         A         A         A         A       i!    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A         A         A         A         A         A         A         A         A         A       I!    "+ "'",str1.equals("A         A         A         A         A         A         A         A         A         A       I!    "));
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test432#3811");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test432");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("                                                                                                 ##a");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##a"+ "'",str1.equals("##a"));
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test433#3819");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test433");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("###                                                                                       aaaaaaaaa         ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test434#3827");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test434");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int[] intArray19=null;
    boolean boolean20=org.apache.commons.lang.math.NumberUtils.equals(intArray17,intArray19);
    try {
      int int21=org.apache.commons.lang.math.NumberUtils.max(intArray19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '"+ false+ "'",boolean20 == false);
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test435#3851");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test435");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("hi!                         ...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test436#3859");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test436");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("... !ih...aaaaaaaaaaaaaaaaaaaa                                ","!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih...aaaaaaaaaaaaaaaaaaaa                                "+ "'",str2.equals("... !ih...aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test437#3867");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test437");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("A         A         A         A         A         A         A         A         A         A       i!    ","aaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A         A         A         A         A         A         A         A         A         A       i!    "+ "'",str2.equals("A         A         A         A         A         A         A         A         A         A       i!    "));
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test438#3875");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test438");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)10,(short)(byte)10,(short)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)-1+ "'",short3 == (short)-1);
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test439#3883");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test439");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test440#3891");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test440");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test441#3899");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test441");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa","###                                                                                       aaaaaaaaa         ",93);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test442#3907");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test442");
    float[] floatArray2=new float[]{48,4};
    float float3=org.apache.commons.lang.math.NumberUtils.max(floatArray2);
    float float4=org.apache.commons.lang.math.NumberUtils.min(floatArray2);
    org.junit.Assert.assertNotNull(floatArray2);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 48.0f+ "'",float3 == 48.0f);
    org.junit.Assert.assertTrue("'" + float4 + "' != '"+ 4.0f+ "'",float4 == 4.0f);
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test443#3919");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test443");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("!i aaaaaaaaa",96);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!i aaaaaaaaa"+ "'",str2.equals("!i aaaaaaaaa"));
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test444#3927");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test444");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("A ","          4444444444444444444444");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 31+ "'",int2 == 31);
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test445#3935");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test445");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"));
  }
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test446#3943");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test446");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("","AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test447#3951");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test447");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!ih"+ "'",str1.equals("!ih"));
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test448#3959");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test448");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("   #######################################################################################","###                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test449#3967");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test449");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("#######################################################################################             "," a                                                                                       ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 87+ "'",int2 == 87);
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test450#3975");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test450");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",52);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test451#3983");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test451");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test452#3991");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test452");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                               ",'#','4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                               "+ "'",str3.equals("                               "));
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test453#3999");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test453");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)(byte)-1,(double)36,(double)10L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 36.0d+ "'",double3 == 36.0d);
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test454#4007");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test454");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("             ","                                                                                     ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test455#4015");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test455");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("... !ih..                                           ",1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ".. !ih..                                           "+ "'",str2.equals(".. !ih..                                           "));
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test456#4023");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test456");
    java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat(" 4            ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 4.0f+ "'",float1.equals(4.0f));
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test457#4031");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test457");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("h","                                          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "h"+ "'",str2.equals("h"));
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test458#4039");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test458");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)99L,52.0d);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test459#4047");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test459");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test460#4055");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test460");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)1,(short)0,(short)(byte)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)1+ "'",short3 == (short)1);
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test461#4063");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test461");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                 ##a","4                                                ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test462#4071");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test462");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("",20);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test463#4079");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test463");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                         HI!","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test464#4087");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test464");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("Hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test465#4098");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test465");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                            !i aaaaaaaaa                                            ","                                          a!i ",65);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test466#4106");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test466");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("         ",21);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                     "+ "'",str2.equals("                     "));
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test467#4114");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test467");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("A...",(int)(short)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test468#4122");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test468");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa","          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test469#4130");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test469");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test470#4138");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test470");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("aaaaaaaaaa","                          aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test471#4146");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test471");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",26,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test472#4154");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test472");
    int int3=org.apache.commons.lang.StringUtils.indexOf("!i aaaaaaaaa",' ',41);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test473#4162");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test473");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test474#4170");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test474");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("4                                                ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4                                                \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test475#4181");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test475");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","               ",(int)(short)100);
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str4.equals("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test476#4191");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test476");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##Aaaaaaaaaaaaaaaaaa",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test477#4199");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test477");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test478#4207");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test478");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("  ",156,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'",str3.equals("  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test479#4215");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test479");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("                                                                                                         HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HI!"+ "'",str1.equals("HI!"));
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test480#4223");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test480");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test481#4231");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test481");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("i!","                             aaaaaaaaa                                                                  ","   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test482#4239");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test482");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"                               ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test483#4248");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test483");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("###                     aaaaaaaaa                                                                                        ","   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                     aaaaaaaaa                                                                                        "+ "'",str2.equals("###                     aaaaaaaaa                                                                                        "));
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test484#4256");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test484");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("    a     ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test485#4264");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test485");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("!i aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: !i aaaaaaaaa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test486#4275");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test486");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("aa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test487#4283");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test487");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                hi!                                                 ","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 48+ "'",int2 == 48);
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test488#4291");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test488");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("#######################################################################################             ",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################"+ "'",str2.equals("#######################################################################################"));
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test489#4299");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test489");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test490#4308");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test490");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test491#4316");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test491");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    double[] doubleArray7=null;
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray7);
    double[] doubleArray13=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray14=new double[]{};
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray13,doubleArray14);
    double[] doubleArray16=new double[]{};
    double[] doubleArray21=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray22=new double[]{};
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(doubleArray21,doubleArray22);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(doubleArray16,doubleArray22);
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(doubleArray13,doubleArray16);
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray16);
    try {
      double double27=org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ true+ "'",boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ true+ "'",boolean26 == true);
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test492#4356");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test492");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test493#4364");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test493");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"," aaaaaa","!i aaaaaaaaa                                          ",108);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str4.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test494#4372");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test494");
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa",strArray5);
    java.lang.String[] strArray8=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    int int9=org.apache.commons.lang.StringUtils.lastIndexOfAny("",strArray5);
    java.lang.String str10=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5);
    java.lang.String[] strArray11=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ (-1)+ "'",int9 == (-1));
    org.junit.Assert.assertTrue("'" + str10 + "' != '"+ ""+ "'",str10.equals(""));
    org.junit.Assert.assertNotNull(strArray11);
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test495#4392");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test495");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("",65);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test496#4400");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test496");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test497#4408");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test497");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)(byte)100,26,21);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 21+ "'",int3 == 21);
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test498#4416");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test498");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("a ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A "+ "'",str1.equals("A "));
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test499#4424");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test499");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("Aa ","aA HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest4::test500#4432");
    if (debug)     System.out.format("%n%s%n","RegressionTest4.test500");
    byte[] byteArray1=new byte[]{(byte)100};
    byte byte2=org.apache.commons.lang.math.NumberUtils.max(byteArray1);
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertTrue("'" + byte2 + "' != '"+ (byte)100+ "'",byte2 == (byte)100);
  }
}
