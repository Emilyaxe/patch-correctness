import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest6 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test001");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!","                                                                                   aaaaaaaaa ");
    java.lang.Class<?> wildcardClass4=strArray3.getClass();
    int int5=org.apache.commons.lang.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(wildcardClass4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ (-1)+ "'",int5 == (-1));
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test002#22");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test002");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA"+ "'",str1.equals("AAAAAAAAA"));
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test003#30");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test003");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             ");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.stripAll(strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test004#40");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test004");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("                                                              ",99);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test005#48");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test005");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("                     4444444Hi!                     ","                                              hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                         hi!"+ "'",str2.equals("                         hi!"));
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test006#56");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test006");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",48);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test007#64");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test007");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("aa  Aaaaaaaaa","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test008#72");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test008");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","                                                ","Aaaaaaaaa ",0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str4.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test009#80");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test009");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("                     4444444Hi!                     "," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444Hi!                     "+ "'",str2.equals("4444444Hi!                     "));
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test010#88");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test010");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#######################################################################################          ","aaaaaaaaa");
    int int4=org.apache.commons.lang.StringUtils.indexOfAny("A                                                hi!                                                 ",strArray3);
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"                               ");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ (-1)+ "'",int4 == (-1));
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ "#######################################################################################          "+ "'",str6.equals("#######################################################################################          "));
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test011#100");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test011");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut(" aaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test012#108");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test012");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                                                                                 ##A",26,48);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...                                          ..."+ "'",str3.equals("...                                          ..."));
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test013#116");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test013");
    double double3=org.apache.commons.lang.math.NumberUtils.max(97.0d,97.0d,47.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 97.0d+ "'",double3 == 97.0d);
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test014#124");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test014");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)(byte)10,(float)1,41.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 1.0f+ "'",float3 == 1.0f);
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test015#132");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test015");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA","a");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA"+ "'",str2.equals("!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA"));
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test016#140");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test016");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,"                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ",134,0);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test017#149");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test017");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter(""," aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test018#157");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test018");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)(short)100,(long)52,(long)2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 100L+ "'",long3 == 100L);
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test019#165");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test019");
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa",strArray5);
    java.lang.String str9=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,'a');
    java.lang.String str11=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,'#');
    int int12=org.apache.commons.lang.StringUtils.indexOfAny("                     4444444Hi!                     ",strArray5);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + str9 + "' != '"+ ""+ "'",str9.equals(""));
    org.junit.Assert.assertTrue("'" + str11 + "' != '"+ ""+ "'",str11.equals(""));
    org.junit.Assert.assertTrue("'" + int12 + "' != '"+ (-1)+ "'",int12 == (-1));
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test020#183");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test020");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","Aa hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test021#191");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test021");
    int int2=org.apache.commons.lang.StringUtils.indexOf("i!",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test022#199");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test022");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                "+ "'",str1.equals("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                "));
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test023#207");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test023");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)(short)-1,1L,48L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 48L+ "'",long3 == 48L);
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test024#215");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test024");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!i aaaaaaaaa                                          ","                                                                                ");
    java.lang.Class<?> wildcardClass3=strArray2.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test025#225");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test025");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("","... !ih...aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test026#233");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test026");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces(".. !ih..                                           ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "..!ih.."+ "'",str1.equals("..!ih.."));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test027#241");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test027");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test028#249");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test028");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("                                                                                                HI!","                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test029#257");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test029");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("  ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test030#265");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test030");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test031#273");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test031");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                              hi!","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",(int)(short)1);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test032#281");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test032");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa",'a');
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.stripAll(strArray2);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"                                                                                              !Ih");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih"+ "'",str5.equals("                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih"));
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test033#293");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test033");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"+ "'",str1.equals("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"));
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test034#301");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test034");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                       AAAAAAAAA",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test035#309");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test035");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("#######################################################################################","AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test036#317");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test036");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                                                HI!",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test037#325");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test037");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("",34);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                  "+ "'",str2.equals("                                  "));
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test038#333");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test038");
    java.lang.Object[] objArray0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(objArray0,"##########################################!i aaaaaaaaa###########################################");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test039#342");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test039");
    long long3=org.apache.commons.lang.math.NumberUtils.max(0L,(long)1,(long)' ');
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 32L+ "'",long3 == 32L);
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test040#350");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test040");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("",43);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                           "+ "'",str2.equals("                                           "));
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test041#358");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test041");
    long long3=org.apache.commons.lang.math.NumberUtils.min(48L,35L,(long)9);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 9L+ "'",long3 == 9L);
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test042#366");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test042");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test043#374");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test043");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("","Aaaaaaaaa                          ",96,87);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Aaaaaaaaa                          "+ "'",str4.equals("Aaaaaaaaa                          "));
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test044#382");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test044");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("                             aaaaaaaaa                                                                  ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 29+ "'",int2 == 29);
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test045#390");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test045");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###                     aaaaaaaaa","",94);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test046#398");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test046");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("########################AAAAAAAAAAAAAAAAAAAA########################################################i!","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!",41);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test047#406");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test047");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                                HI!",47,"AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                HI!"+ "'",str3.equals("                                                HI!"));
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test048#414");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test048");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("... !ih..                                           ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test049#422");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test049");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("Hi!   #######################################################################################             ######       A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!   #######################################################################################             ######       A"+ "'",str1.equals("Hi!   #######################################################################################             ######       A"));
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test050#430");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test050");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("hi!                         ...","             a               ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test051#438");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test051");
    int[] intArray4=new int[]{100,1};
    int[] intArray11=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean12=org.apache.commons.lang.math.NumberUtils.equals(intArray4,intArray11);
    java.lang.String[] strArray16=org.apache.commons.lang.StringUtils.splitByWholeSeparator("","                                                                                                 ");
    java.lang.Object[] objArray17=new java.lang.Object[]{(byte)10,"aaaaaaaaa                                                                                        ",boolean12,"aaaaaaaaa ",strArray16};
    java.lang.String str19=org.apache.commons.lang.StringUtils.join(objArray17,"hi!");
    java.lang.String str20=org.apache.commons.lang.StringUtils.join(objArray17);
    java.lang.String str21=org.apache.commons.lang.StringUtils.join(objArray17);
    java.lang.String str22=org.apache.commons.lang.StringUtils.concatenate(objArray17);
    java.lang.String str24=org.apache.commons.lang.StringUtils.join(objArray17,"");
    org.junit.Assert.assertNotNull(intArray4);
    org.junit.Assert.assertNotNull(intArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertNotNull(objArray17);
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test052#459");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test052");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("A                                                HI!");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test053#467");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test053");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)65,(double)0L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test054#475");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test054");
    float float3=org.apache.commons.lang.math.NumberUtils.max(36.0f,(float)(byte)100,(float)31);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 100.0f+ "'",float3 == 100.0f);
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test055#483");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test055");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)100,(byte)-1,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test056#491");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test056");
    int int3=org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAI","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ",52);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test057#499");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test057");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test058#510");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test058");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("###                     aaaaaaaaa",97,10);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...aaaaaaa"+ "'",str3.equals("...aaaaaaa"));
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test059#518");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test059");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)108L,(float)7L,36.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 7.0f+ "'",float3 == 7.0f);
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test060#526");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test060");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("",0,"4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test061#534");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test061");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("   A ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   A "+ "'",str1.equals("   A "));
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test062#542");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test062");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("                         hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                         HI!"+ "'",str1.equals("                         HI!"));
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test063#550");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test063");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("aaaaaaaaai!","###                                                                                       aaaaaaaaa         ",0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test064#558");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test064");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test065#569");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test065");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("aaaaaaaaaa",27);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "        aaaaaaaaaa         "+ "'",str2.equals("        aaaaaaaaaa         "));
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test066#577");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test066");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("A ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test067#585");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test067");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("AAAAAAAAA","                                                                                                HI!","A########                          ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AAAAAAAAA"+ "'",str3.equals("AAAAAAAAA"));
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test068#593");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test068");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("             A               ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "             A               "+ "'",str1.equals("             A               "));
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test069#601");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test069");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("A ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test070#612");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test070");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("   A ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A"+ "'",str1.equals("A"));
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test071#620");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test071");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)-1,(byte)0,(byte)1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)1+ "'",byte3 == (byte)1);
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test072#628");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test072");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("...                          ...","                     4444444Hi!                     ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test073#636");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test073");
    double double3=org.apache.commons.lang.math.NumberUtils.max(97.0d,0.0d,(-1.0d));
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 97.0d+ "'",double3 == 97.0d);
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test074#644");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test074");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("   aaaaaaaaa                                        ",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   aaaaaaaaa                                        "+ "'",str2.equals("   aaaaaaaaa                                        "));
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test075#652");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test075");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Aaaaaaaaa ");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.stripAll(strArray1,"Hi!");
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "Aaaaaaaaa444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"+ "'",str5.equals("Aaaaaaaaa444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"));
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test076#664");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test076");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("4",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4"+ "'",str2.equals("4"));
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test077#672");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test077");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a                                                hi!                                                 "+ "'",str1.equals("a                                                hi!                                                 "));
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test078#680");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test078");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("###                                                                                       aaaaaaaaa         ",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                                                                                       aaaaaaaaa         "+ "'",str2.equals("###                                                                                       aaaaaaaaa         "));
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test079#688");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test079");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,"aaaaaaaaa                                    ");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test080#702");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test080");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)96,(float)27);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test081#710");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test081");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline(" AAAAAA...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " AAAAAA..."+ "'",str1.equals(" AAAAAA..."));
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test082#718");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test082");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline(" aaaaaa...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " aaaaaa..."+ "'",str1.equals(" aaaaaa..."));
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test083#726");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test083");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test084#734");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test084");
    int int2=org.apache.commons.lang.StringUtils.indexOf("           hi!            ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test085#742");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test085");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAA"));
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test086#750");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test086");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                                                                 ##a","...                          ...");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test087#758");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test087");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("                                  "," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                  "+ "'",str2.equals("                                  "));
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test088#766");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test088");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("4444444444444444444444444444444444                                4444444444444444444444444444444444",65);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444444444444444444444444444444                            ..."+ "'",str2.equals("4444444444444444444444444444444444                            ..."));
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test089#774");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test089");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("                                            !i aaaaaaaaa                                            ",41.0f);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 41.0f+ "'",float2 == 41.0f);
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test090#782");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test090");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("... !ih..");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih.."+ "'",str1.equals("... !ih.."));
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test091#790");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test091");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str2.equals("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test092#798");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test092");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("aAAAAAAAA                                       HI!","                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ",21);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"              ");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "aAAAAAAAA                                       HI!"+ "'",str5.equals("aAAAAAAAA                                       HI!"));
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test093#808");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test093");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("a                                                hi!                                                 ","Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test094#816");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test094");
    char[] charArray6=new char[]{' ',' '};
    int int7=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray6);
    int int8=org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaa",charArray6);
    int int9=org.apache.commons.lang.StringUtils.indexOfAnyBut("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!",charArray6);
    int int10=org.apache.commons.lang.StringUtils.indexOfAny("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!",charArray6);
    org.junit.Assert.assertNotNull(charArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ 0+ "'",int7 == 0);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ 0+ "'",int8 == 0);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ 0+ "'",int9 == 0);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ (-1)+ "'",int10 == (-1));
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test095#832");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test095");
    int int2=org.apache.commons.lang.StringUtils.countMatches("","#############################################################################");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test096#840");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test096");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("Aaaaaaaaa444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444",9,(int)(short)100);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444"+ "'",str3.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444"));
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test097#848");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test097");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)0L,(double)97.0f,(-1.0d));
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 97.0d+ "'",double3 == 97.0d);
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test098#856");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test098");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("...                                          ...","aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                                          ..."+ "'",str2.equals("...                                          ..."));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test099#864");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test099");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                          aaaaaaaaa i!",97,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test100#872");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test100");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)100,(short)1,(short)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)1+ "'",short3 == (short)1);
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test101#880");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test101");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test102#888");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test102");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","aaaaaaaaa                                       hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test103#896");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test103");
    double double3=org.apache.commons.lang.math.NumberUtils.min(31.0d,(double)3L,(double)7L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 3.0d+ "'",double3 == 3.0d);
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test104#904");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test104");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("      ...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test105#912");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test105");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("h#################...#################...#################...#################...#######");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test106#920");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test106");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("a",' ');
    int int4=org.apache.commons.lang.StringUtils.lastIndexOfAny("   A ",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ (-1)+ "'",int4 == (-1));
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test107#930");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test107");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("             ","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 90+ "'",int2 == 90);
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test108#938");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test108");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("aaaaaaaaa                                                                                        ","aaaaaaaaa");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray2,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4);
    java.lang.Class<?> wildcardClass6=strArray4.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "                                                                                        "+ "'",str5.equals("                                                                                        "));
    org.junit.Assert.assertNotNull(wildcardClass6);
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test109#952");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test109");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test110#963");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test110");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aAAAAAAAA                                       HI!","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test111#971");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test111");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"###                                                                                       aaaaaaaaa         ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test112#980");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test112");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa "+ "'",str1.equals(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa "));
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test113#988");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test113");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("4444444Hi!aaaaaaaaa                                                                                        ","                                           ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                           "+ "'",str2.equals("                                           "));
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test114#996");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test114");
    char[] charArray1=null;
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                         I!                         ",charArray1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test115#1005");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test115");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaa                          ","aaaaaaaaaaaaaaaaaaaaa",(int)(short)-1);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test116#1013");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test116");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("","##########################################                         i!                         ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test117#1021");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test117");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("a                                                hi!                                                 ",35,"                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "a                                                hi!                                                 "+ "'",str3.equals("a                                                hi!                                                 "));
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test118#1029");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test118");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("HHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HHHHHHHHHH"+ "'",str1.equals("HHHHHHHHHH"));
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test119#1037");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test119");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("                                          a!i ",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                          a!i "+ "'",str2.equals("                                          a!i "));
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test120#1045");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test120");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("           hi!            ",(int)(short)-1,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test121#1053");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test121");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ","Aaaaaaaaa4");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 95+ "'",int2 == 95);
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test122#1061");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test122");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("aa  Aaaaaaaaa","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test123#1069");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test123");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("##A##A#!ih",(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test124#1077");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test124");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("##########################################!i aaaaaaaaa###########################################",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "##########################################!i aaaaaaaaa###########################################"+ "'",str2.equals("##########################################!i aaaaaaaaa###########################################"));
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test125#1085");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test125");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("444444444444444444444444444444444444444444444          444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test126#1093");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test126");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test127#1101");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test127");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("...","#############################################################################          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "..."+ "'",str2.equals("..."));
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test128#1109");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test128");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str2.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test129#1117");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test129");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("                                                                                                 ##a","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 ##a"+ "'",str2.equals("                                                                                                 ##a"));
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test130#1125");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test130");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test131#1133");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test131");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("#########");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#########"+ "'",str1.equals("#########"));
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test132#1141");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test132");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!iH"+ "'",str1.equals("!iH"));
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test133#1149");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test133");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference(" aaaaaa","                         i!                         ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test134#1157");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test134");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("                     ","                                                                                     ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                     "+ "'",str2.equals("                     "));
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test135#1165");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test135");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)(byte)1,(long)(byte)1,(long)(short)10);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 10L+ "'",long3 == 10L);
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test136#1173");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test136");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ",0,4);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaa"+ "'",str3.equals("aaaa"));
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test137#1181");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test137");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("4444444444444444444444444444444444                            ...","                                              hi!",27,(int)'4');
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "444444444444444444444444444                                              hi!          ..."+ "'",str4.equals("444444444444444444444444444                                              hi!          ..."));
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test138#1189");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test138");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa",'a','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A###################A########"+ "'",str3.equals("A###################A########"));
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test139#1197");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test139");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("    !I       A         A         A         A         A         A         A         A         A         A","                         HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A         A         A         A         A         A         A         A         A         A"+ "'",str2.equals("A         A         A         A         A         A         A         A         A         A"));
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test140#1205");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test140");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("","                                                                                        ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test141#1213");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test141");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"          4444444444444444444444");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test142#1222");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test142");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("aaaaaaaaa                          ","a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test143#1230");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test143");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("   ",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test144#1238");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test144");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("!i aaaaaaaaa                                          ","Hi!   #######################################################################################             ######       A");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test145#1246");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test145");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("                                           ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test146#1254");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test146");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("###                                                                                       aaaaaaaaa         ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###      \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test147#1265");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test147");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                ","                     4444444Hi!                     ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                "+ "'",str2.equals("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                "));
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test148#1273");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test148");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test149#1281");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test149");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test150#1289");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test150");
    int int2=org.apache.commons.lang.StringUtils.indexOf("!i aaaaaaaaa                                          ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test151#1297");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test151");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("AAAAAAAAAAAAAAAAAAAA");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test152#1305");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test152");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("hi!A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test153#1316");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test153");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"+ "'",str1.equals("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test154#1324");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test154");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                              !ih                                               ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test155#1332");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test155");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAI","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 9+ "'",int2 == 9);
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test156#1340");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test156");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)0,(byte)100,(byte)-1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test157#1348");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test157");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"aaaaaaaaa i!            ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test158#1357");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test158");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaa                          ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test159#1365");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test159");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("    a     ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test160#1373");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test160");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("4444444hI!AAAAAAAAA                                                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4444444hI!AAAAAAAAA                                                                                         is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test161#1384");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test161");
    int[] intArray2=new int[]{' ',1};
    int int3=org.apache.commons.lang.math.NumberUtils.max(intArray2);
    int int4=org.apache.commons.lang.math.NumberUtils.max(intArray2);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 32+ "'",int3 == 32);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ 32+ "'",int4 == 32);
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test162#1396");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test162");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test163#1404");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test163");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("",24.0d);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 24.0d+ "'",double2 == 24.0d);
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test164#1412");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test164");
    int int3=org.apache.commons.lang.StringUtils.indexOf("H",'4',(int)(short)1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test165#1420");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test165");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("A!ih",41);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A!ih"+ "'",str2.equals("A!ih"));
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test166#1428");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test166");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,"...                                          ...",96,0);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test167#1437");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test167");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("          4444444444444444444444","                         hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test168#1445");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test168");
    long long3=org.apache.commons.lang.math.NumberUtils.max(0L,(long)90,(long)' ');
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 90L+ "'",long3 == 90L);
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test169#1453");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test169");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","... !ih...","                                              !ih                                               ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test170#1461");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test170");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test171#1469");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test171");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test172#1477");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test172");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("...                          ...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test173#1485");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test173");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test174#1493");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test174");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("Aaaaaaaaa444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test175#1504");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test175");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("",47,"aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa"));
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test176#1512");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test176");
    int[] intArray4=new int[]{100,1};
    int[] intArray11=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean12=org.apache.commons.lang.math.NumberUtils.equals(intArray4,intArray11);
    java.lang.String[] strArray16=org.apache.commons.lang.StringUtils.splitByWholeSeparator("","                                                                                                 ");
    java.lang.Object[] objArray17=new java.lang.Object[]{(byte)10,"aaaaaaaaa                                                                                        ",boolean12,"aaaaaaaaa ",strArray16};
    java.lang.String str19=org.apache.commons.lang.StringUtils.join(objArray17,"hi!");
    java.lang.String str21=org.apache.commons.lang.StringUtils.join(objArray17,'4');
    org.junit.Assert.assertNotNull(intArray4);
    org.junit.Assert.assertNotNull(intArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertNotNull(objArray17);
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test177#1530");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test177");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test178#1538");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test178");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("                             aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test179#1546");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test179");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                         HI!",134,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test180#1554");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test180");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("           4            ",36,(int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test181#1565");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test181");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("",26);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 26+ "'",int2 == 26);
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test182#1573");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test182");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaa"));
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test183#1581");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test183");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa",'a',88);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 80+ "'",int3 == 80);
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test184#1589");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test184");
    int int2=org.apache.commons.lang.StringUtils.indexOf("##########################################!i aaaaaaaaa###########################################","###                     aaaaaaaaai!   ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test185#1597");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test185");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("","HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test186#1605");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test186");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("A ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A "+ "'",str1.equals("A "));
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test187#1613");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test187");
    char[] charArray9=new char[]{' ',' '};
    int int10=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray9);
    int int11=org.apache.commons.lang.StringUtils.indexOfAny("hi!                                   A",charArray9);
    int int12=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray9);
    int int13=org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaa ",charArray9);
    java.lang.Class<?> wildcardClass14=charArray9.getClass();
    boolean boolean15=org.apache.commons.lang.StringUtils.containsOnly("##########################################!i aaaaaaaaa###########################################",charArray9);
    int int16=org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaa i!",charArray9);
    int int17=org.apache.commons.lang.StringUtils.indexOfAny("                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih",charArray9);
    org.junit.Assert.assertNotNull(charArray9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ 0+ "'",int10 == 0);
    org.junit.Assert.assertTrue("'" + int11 + "' != '"+ 3+ "'",int11 == 3);
    org.junit.Assert.assertTrue("'" + int12 + "' != '"+ (-1)+ "'",int12 == (-1));
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ 9+ "'",int13 == 9);
    org.junit.Assert.assertNotNull(wildcardClass14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '"+ 0+ "'",int16 == 0);
    org.junit.Assert.assertTrue("'" + int17 + "' != '"+ 0+ "'",int17 == 0);
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test188#1637");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test188");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center(" AAAAAA...",0,"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " AAAAAA..."+ "'",str3.equals(" AAAAAA..."));
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test189#1645");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test189");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","A...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test190#1653");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test190");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("hi!A",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!A"+ "'",str2.equals("hi!A"));
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test191#1661");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test191");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("",1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test192#1669");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test192");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"));
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test193#1677");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test193");
    int int3=org.apache.commons.lang.StringUtils.indexOf("    a     ",'a',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 4+ "'",int3 == 4);
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test194#1685");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test194");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444",93,(int)(short)10);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test195#1693");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test195");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa                                ",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test196#1701");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test196");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                                                                     ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test197#1709");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test197");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                                                 !ih                                                ","... !ih...aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                 !ih                                                "+ "'",str2.equals("                                                 !ih                                                "));
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test198#1717");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test198");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("hi!                         ...",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                         ..."+ "'",str2.equals("hi!                         ..."));
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test199#1725");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test199");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("        aaaaaaaaaa         ",36);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "        aaaaaaaaaa                  "+ "'",str2.equals("        aaaaaaaaaa                  "));
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test200#1733");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test200");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("             ",47,21);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test201#1741");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test201");
    int int3=org.apache.commons.lang.math.NumberUtils.min(9,(int)(short)1,(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 1+ "'",int3 == 1);
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test202#1749");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test202");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa ","",65);
    int int5=org.apache.commons.lang.StringUtils.indexOfAny("",strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ (-1)+ "'",int5 == (-1));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test203#1759");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test203");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test204#1770");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test204");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("##A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##A"+ "'",str1.equals("##A"));
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test205#1778");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test205");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("4                                                ",(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test206#1786");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test206");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("...                    A","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                    A"+ "'",str2.equals("...                    A"));
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test207#1794");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test207");
    int int2=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaai!","iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test208#1802");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test208");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)100,(short)10,(short)10);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test209#1810");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test209");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("                                                                                                 ","","AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                 "+ "'",str3.equals("                                                                                                 "));
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test210#1818");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test210");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("##########################################                         i!                         ","A!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test211#1826");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test211");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("aaaaaaaaa                                    ","..!ih..");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                    "+ "'",str2.equals("aaaaaaaaa                                    "));
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test212#1834");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test212");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test213#1842");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test213");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("...                                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                                          ..."+ "'",str1.equals("...                                          ..."));
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test214#1850");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test214");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOfAny("i!",strArray2);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"          ");
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,' ');
    java.lang.String str8=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray2);
    java.lang.String[] strArray9=org.apache.commons.lang.StringUtils.stripAll(strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "hi!"+ "'",str5.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ "hi!"+ "'",str7.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ "hi!"+ "'",str8.equals("hi!"));
    org.junit.Assert.assertNotNull(strArray9);
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test215#1868");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test215");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                                                                                ",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test216#1876");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test216");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)1,(byte)1,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test217#1884");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test217");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)0L,(float)80,(float)97);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 97.0f+ "'",float3 == 97.0f);
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test218#1892");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test218");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                            !i aaaaaaaaa                                            ",31,95);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...                                    !i aaaaaaaaa                                            "+ "'",str3.equals("...                                    !i aaaaaaaaa                                            "));
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test219#1900");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test219");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444","h");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test220#1908");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test220");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test221#1919");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test221");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("          4444444444444444444444",31);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          4444444444444444444444"+ "'",str2.equals("          4444444444444444444444"));
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test222#1927");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test222");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test223#1935");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test223");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("AAAAAAAAA ","a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test224#1943");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test224");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("i!",20);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 20+ "'",int2 == 20);
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test225#1951");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test225");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("A########                          ","                                                hi!                                                 ",100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test226#1959");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test226");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("","aa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test227#1967");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test227");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test228#1975");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test228");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray4);
    int int6=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa",strArray4);
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'a');
    java.lang.String str10=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'#');
    java.lang.String str14=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,' ',100,(int)' ');
    java.lang.String str15=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
    org.junit.Assert.assertTrue("'" + str10 + "' != '"+ ""+ "'",str10.equals(""));
    org.junit.Assert.assertTrue("'" + str14 + "' != '"+ ""+ "'",str14.equals(""));
    org.junit.Assert.assertTrue("'" + str15 + "' != '"+ ""+ "'",str15.equals(""));
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test229#1995");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test229");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                                                HI!",99);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                HI!"+ "'",str2.equals("                                                HI!"));
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test230#2003");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test230");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("aaaaaaaaa i!            ","Aaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test231#2011");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test231");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                                                                                 ##a");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test232#2019");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test232");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("... !ih..                                           ",97);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih..                                           "+ "'",str2.equals("... !ih..                                           "));
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test233#2027");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test233");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444",20,"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'",str3.equals("  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test234#2035");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test234");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("##Aaaaaaaaa",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a"+ "'",str2.equals("a"));
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test235#2043");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test235");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("                                                ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test236#2051");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test236");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                             hi!                                   A                             ","4444444Hi!aaaaaaaaa",(int)(byte)1);
    try {
      java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A",0,88);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test237#2064");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test237");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("                             aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                             aaaaaaaaa                                                                  "+ "'",str1.equals("                             aaaaaaaaa                                                                  "));
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test238#2072");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test238");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("Hi!",0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test239#2080");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test239");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test240#2088");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test240");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("a                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a                                                hi!"+ "'",str1.equals("a                                                hi!"));
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test241#2096");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test241");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("4444444hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test242#2104");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test242");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test243#2115");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test243");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int[] intArray24=new int[]{0,10,(short)-1,(byte)-1,94};
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(intArray17,intArray24);
    int[] intArray28=new int[]{100,1};
    int[] intArray35=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean36=org.apache.commons.lang.math.NumberUtils.equals(intArray28,intArray35);
    int int37=org.apache.commons.lang.math.NumberUtils.max(intArray35);
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(intArray17,intArray35);
    int[] intArray42=new int[]{'4',0,(byte)0};
    int[] intArray45=new int[]{100,1};
    int[] intArray52=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean53=org.apache.commons.lang.math.NumberUtils.equals(intArray45,intArray52);
    int[] intArray60=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(intArray52,intArray60);
    int int62=org.apache.commons.lang.math.NumberUtils.max(intArray60);
    boolean boolean63=org.apache.commons.lang.math.NumberUtils.equals(intArray42,intArray60);
    int int64=org.apache.commons.lang.math.NumberUtils.min(intArray60);
    int int65=org.apache.commons.lang.math.NumberUtils.min(intArray60);
    boolean boolean66=org.apache.commons.lang.math.NumberUtils.equals(intArray17,intArray60);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertNotNull(intArray24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertNotNull(intArray35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '"+ false+ "'",boolean36 == false);
    org.junit.Assert.assertTrue("'" + int37 + "' != '"+ 100+ "'",int37 == 100);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertNotNull(intArray42);
    org.junit.Assert.assertNotNull(intArray45);
    org.junit.Assert.assertNotNull(intArray52);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '"+ false+ "'",boolean53 == false);
    org.junit.Assert.assertNotNull(intArray60);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ false+ "'",boolean61 == false);
    org.junit.Assert.assertTrue("'" + int62 + "' != '"+ 100+ "'",int62 == 100);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '"+ false+ "'",boolean63 == false);
    org.junit.Assert.assertTrue("'" + int64 + "' != '"+ 1+ "'",int64 == 1);
    org.junit.Assert.assertTrue("'" + int65 + "' != '"+ 1+ "'",int65 == 1);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '"+ true+ "'",boolean66 == true);
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test244#2167");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test244");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("Hi!                                   A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!                                   A"+ "'",str1.equals("Hi!                                   A"));
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test245#2175");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test245");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("A ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 2+ "'",int2 == 2);
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test246#2183");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test246");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("...",(int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test247#2194");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test247");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)2,(float)(-1L));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test248#2202");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test248");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test249#2210");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test249");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("4444444hI!AAAAAAAAA                                                                                        ","##########################################                         i!                         ","a                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444hI AAAAAAAAA                                                                                        "+ "'",str3.equals("4444444hI AAAAAAAAA                                                                                        "));
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test250#2218");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test250");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaa i!",(int)(short)100);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 100+ "'",int2 == 100);
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test251#2226");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test251");
    long long3=org.apache.commons.lang.math.NumberUtils.min((-1L),(long)48,0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ (-1L)+ "'",long3 == (-1L));
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test252#2234");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test252");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ","                                                              ",100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test253#2242");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test253");
    int int2=org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai","   A ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test254#2250");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test254");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test255#2258");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test255");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("...                          ...",47);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "               ...                          ..."+ "'",str2.equals("               ...                          ..."));
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test256#2266");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test256");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("aa ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test257#2274");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test257");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip(" aaaaaa","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test258#2282");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test258");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"+ "'",str1.equals("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"));
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test259#2290");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test259");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)-1,(byte)0,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test260#2298");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test260");
    int int3=org.apache.commons.lang.StringUtils.indexOf("h#################...#################...#################...#################...#######",' ',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test261#2306");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test261");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ","                               ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                               "+ "'",str2.equals("                               "));
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test262#2314");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test262");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("444444444444444444444444444444444444444444444          444444444444444444444444444444444444","Hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444"+ "'",str2.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444"));
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test263#2322");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test263");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("...                    A","A...");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test264#2330");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test264");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("          #############################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test265#2338");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test265");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                              hi!","                 ","   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                              hi!"+ "'",str3.equals("                                              hi!"));
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test266#2346");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test266");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("##A##A#!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##a##a#!ih"+ "'",str1.equals("##a##a#!ih"));
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test267#2354");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test267");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp(".. !ih..                                           ","aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ".. !ih..                                           "+ "'",str2.equals(".. !ih..                                           "));
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test268#2362");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test268");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("Hi!   #######################################################################################       A");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test269#2370");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test269");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("... !ih...aaaaaaaaaaaaaaaaaaaa                                ","                                                ",20);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test270#2378");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test270");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("A ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A "+ "'",str1.equals("A "));
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test271#2386");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test271");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("4444444444444444444444444444444444                            ...",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444444444444444444444444444444..."+ "'",str2.equals("4444444444444444444444444444444444..."));
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test272#2394");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test272");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("                     4444444Hi!                     ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test273#2402");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test273");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!"," ");
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,' ');
    java.lang.Class<?> wildcardClass6=strArray3.getClass();
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("A",strArray3);
    java.lang.String str8=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "Hi!"+ "'",str5.equals("Hi!"));
    org.junit.Assert.assertNotNull(wildcardClass6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ "Hi!"+ "'",str8.equals("Hi!"));
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test274#2418");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test274");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test275#2429");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test275");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("A########                          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test276#2437");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test276");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",3);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test277#2445");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test277");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","###                     Aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test278#2453");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test278");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("4444444Hi!aaaaaaaa.. !ih..                                                                                                                                  ",(long)80);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 80L+ "'",long2 == 80L);
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test279#2461");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test279");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int[] intArray24=new int[]{0,10,(short)-1,(byte)-1,94};
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(intArray17,intArray24);
    int int26=org.apache.commons.lang.math.NumberUtils.min(intArray17);
    int int27=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    int int28=org.apache.commons.lang.math.NumberUtils.min(intArray17);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertNotNull(intArray24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertTrue("'" + int26 + "' != '"+ 1+ "'",int26 == 1);
    org.junit.Assert.assertTrue("'" + int27 + "' != '"+ 100+ "'",int27 == 100);
    org.junit.Assert.assertTrue("'" + int28 + "' != '"+ 1+ "'",int28 == 1);
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test280#2487");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test280");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("... !ih...");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test281#2495");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test281");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("#############################################################################          ",43,(int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test282#2506");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test282");
    long[] longArray4=new long[]{10L,35L,'#',1L};
    long long5=org.apache.commons.lang.math.NumberUtils.min(longArray4);
    long[] longArray7=new long[]{'#'};
    long[] longArray11=new long[]{97,(-1),' '};
    boolean boolean12=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray11);
    long long13=org.apache.commons.lang.math.NumberUtils.max(longArray7);
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(longArray4,longArray7);
    long long15=org.apache.commons.lang.math.NumberUtils.max(longArray4);
    org.junit.Assert.assertNotNull(longArray4);
    org.junit.Assert.assertTrue("'" + long5 + "' != '"+ 1L+ "'",long5 == 1L);
    org.junit.Assert.assertNotNull(longArray7);
    org.junit.Assert.assertNotNull(longArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + long13 + "' != '"+ 35L+ "'",long13 == 35L);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertTrue("'" + long15 + "' != '"+ 35L+ "'",long15 == 35L);
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test283#2528");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test283");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("4444444hI!AAAAAAAAA                                                                                        ",".. !ih..                                           ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444hI!AAAAAAAAA"+ "'",str2.equals("4444444hI!AAAAAAAAA"));
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test284#2536");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test284");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("","aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test285#2544");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test285");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("","");
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'a');
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ ""+ "'",str6.equals(""));
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test286#2556");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test286");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)87,(float)94,(float)10L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 94.0f+ "'",float3 == 94.0f);
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test287#2564");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test287");
    byte[] byteArray0=null;
    byte[] byteArray4=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray7=new byte[]{(byte)-1,(byte)-1};
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(byteArray4,byteArray7);
    boolean boolean9=org.apache.commons.lang.math.NumberUtils.equals(byteArray0,byteArray7);
    try {
      byte byte10=org.apache.commons.lang.math.NumberUtils.min(byteArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test288#2584");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test288");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                                                                                                 ##A",95);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                               "+ "'",str2.equals("                                                                                               "));
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test289#2592");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test289");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("... !ih..                                           ","...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                           ... !ih"+ "'",str2.equals("                                           ... !ih"));
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test290#2600");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test290");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("4","             ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test291#2608");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test291");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test292#2616");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test292");
    int int2=org.apache.commons.lang.StringUtils.countMatches("...aaaaaaa","A         A         A         A         A         A         A         A         A         A       I!    ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test293#2624");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test293");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("aaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test294#2632");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test294");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("a                                                hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test295#2640");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test295");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test296#2651");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test296");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 36+ "'",int2 == 36);
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test297#2659");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test297");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ",'4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test298#2667");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test298");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("4444444hI!AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test299#2675");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test299");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("##Aaaaaaaaa",'#','4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "44Aaaaaaaaa"+ "'",str3.equals("44Aaaaaaaaa"));
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test300#2683");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test300");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("","AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 134+ "'",int2 == 134);
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test301#2691");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test301");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("                                           ... !ih","Hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                           ... !ih"+ "'",str2.equals("                                           ... !ih"));
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test302#2699");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test302");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!"+ "'",str3.equals("aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!"));
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test303#2707");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test303");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("        aaaaaaaaaa                  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "        aaaaaaaaaa                  "+ "'",str1.equals("        aaaaaaaaaa                  "));
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test304#2715");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test304");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("        aaaaaaaaaa                  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaa"));
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test305#2723");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test305");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test306#2734");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test306");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("",34,0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test307#2745");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test307");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("                                          a!i ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                          a!i "+ "'",str1.equals("                                          a!i "));
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test308#2753");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test308");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("Aa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aa "+ "'",str1.equals("Aa "));
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test309#2761");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test309");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("... !ih...","Hi!                                   A",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test310#2769");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test310");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("aaaaaaaaa i!",(int)'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!"+ "'",str2.equals("aaaaaaaaa i!"));
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test311#2777");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test311");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("        aaaaaaaaaa                  ",0,(int)(short)10);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "        aa"+ "'",str3.equals("        aa"));
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test312#2785");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test312");
    float[] floatArray6=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray11=new float[]{10,(byte)1,1L,(byte)-1};
    float float12=org.apache.commons.lang.math.NumberUtils.max(floatArray11);
    boolean boolean13=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray11);
    float[] floatArray17=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float18=org.apache.commons.lang.math.NumberUtils.max(floatArray17);
    float[] floatArray20=new float[]{(byte)1};
    float float21=org.apache.commons.lang.math.NumberUtils.max(floatArray20);
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(floatArray17,floatArray20);
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(floatArray11,floatArray20);
    float[] floatArray27=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float28=org.apache.commons.lang.math.NumberUtils.max(floatArray27);
    float[] floatArray30=new float[]{(byte)1};
    float float31=org.apache.commons.lang.math.NumberUtils.max(floatArray30);
    boolean boolean32=org.apache.commons.lang.math.NumberUtils.equals(floatArray27,floatArray30);
    float float33=org.apache.commons.lang.math.NumberUtils.max(floatArray27);
    float[] floatArray34=null;
    boolean boolean35=org.apache.commons.lang.math.NumberUtils.equals(floatArray27,floatArray34);
    float float36=org.apache.commons.lang.math.NumberUtils.min(floatArray27);
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray27);
    float[] floatArray40=new float[]{48,4};
    float float41=org.apache.commons.lang.math.NumberUtils.max(floatArray40);
    boolean boolean42=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray40);
    float[] floatArray46=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float47=org.apache.commons.lang.math.NumberUtils.max(floatArray46);
    float[] floatArray49=new float[]{(byte)1};
    float float50=org.apache.commons.lang.math.NumberUtils.max(floatArray49);
    boolean boolean51=org.apache.commons.lang.math.NumberUtils.equals(floatArray46,floatArray49);
    boolean boolean52=org.apache.commons.lang.math.NumberUtils.equals(floatArray40,floatArray49);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertNotNull(floatArray11);
    org.junit.Assert.assertTrue("'" + float12 + "' != '"+ 10.0f+ "'",float12 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + float18 + "' != '"+ 100.0f+ "'",float18 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray20);
    org.junit.Assert.assertTrue("'" + float21 + "' != '"+ 1.0f+ "'",float21 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertNotNull(floatArray27);
    org.junit.Assert.assertTrue("'" + float28 + "' != '"+ 100.0f+ "'",float28 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray30);
    org.junit.Assert.assertTrue("'" + float31 + "' != '"+ 1.0f+ "'",float31 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '"+ false+ "'",boolean32 == false);
    org.junit.Assert.assertTrue("'" + float33 + "' != '"+ 100.0f+ "'",float33 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '"+ false+ "'",boolean35 == false);
    org.junit.Assert.assertTrue("'" + float36 + "' != '"+ (-1.0f)+ "'",float36 == (-1.0f));
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertNotNull(floatArray40);
    org.junit.Assert.assertTrue("'" + float41 + "' != '"+ 48.0f+ "'",float41 == 48.0f);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ false+ "'",boolean42 == false);
    org.junit.Assert.assertNotNull(floatArray46);
    org.junit.Assert.assertTrue("'" + float47 + "' != '"+ 100.0f+ "'",float47 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray49);
    org.junit.Assert.assertTrue("'" + float50 + "' != '"+ 1.0f+ "'",float50 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '"+ false+ "'",boolean51 == false);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '"+ false+ "'",boolean52 == false);
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test313#2848");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test313");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"+ "'",str1.equals("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"));
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test314#2856");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test314");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("###                     Aaaaaaaaa                                                                                        ","Hi!                                                                                             ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test315#2864");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test315");
    long long3=org.apache.commons.lang.math.NumberUtils.max(7L,31L,(long)41);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 41L+ "'",long3 == 41L);
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test316#2872");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test316");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("A!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A!ih"+ "'",str1.equals("A!ih"));
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test317#2880");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test317");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                                                                                   aaaaaaaaa ","HI!","         ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test318#2888");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test318");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("Aa hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!ih aA"+ "'",str1.equals("!ih aA"));
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test319#2896");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test319");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("a ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A "+ "'",str1.equals("A "));
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test320#2904");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test320");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("aaaa",65);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 65+ "'",int2 == 65);
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test321#2912");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test321");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444Hi!aaaaaaaaa                                                                                        "+ "'",str1.equals("4444444Hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test322#2920");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test322");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!",29,36);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AA                                  "+ "'",str3.equals("AA                                  "));
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test323#2928");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test323");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("..!ih..","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test324#2936");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test324");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int[] intArray19=null;
    boolean boolean20=org.apache.commons.lang.math.NumberUtils.equals(intArray17,intArray19);
    int int21=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '"+ false+ "'",boolean20 == false);
    org.junit.Assert.assertTrue("'" + int21 + "' != '"+ 100+ "'",int21 == 100);
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test325#2957");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test325");
    long[] longArray4=new long[]{10L,35L,'#',1L};
    long long5=org.apache.commons.lang.math.NumberUtils.min(longArray4);
    long long6=org.apache.commons.lang.math.NumberUtils.min(longArray4);
    long long7=org.apache.commons.lang.math.NumberUtils.min(longArray4);
    org.junit.Assert.assertNotNull(longArray4);
    org.junit.Assert.assertTrue("'" + long5 + "' != '"+ 1L+ "'",long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '"+ 1L+ "'",long6 == 1L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '"+ 1L+ "'",long7 == 1L);
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test326#2971");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test326");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("Aaaaaaaaa ",26,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaAaaaaaaaa aaaaaaaa"+ "'",str3.equals("aaaaaaaaAaaaaaaaa aaaaaaaa"));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test327#2979");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test327");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("#######################################################################################             ","#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test328#2987");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test328");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                   ");
    java.lang.String str2=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test329#2997");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test329");
    long long3=org.apache.commons.lang.math.NumberUtils.min(88L,90L,(long)97);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 88L+ "'",long3 == 88L);
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test330#3005");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test330");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("##Aaaaaaaaa","aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test331#3013");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test331");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa i!","                                                                                                 ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test332#3021");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test332");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("hi!                                   A","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test333#3029");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test333");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("hi!                                   A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HI!                                   a"+ "'",str1.equals("HI!                                   a"));
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test334#3037");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test334");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                        AAAAAAAAAAAAAAAAAAAA                                                        ",' ');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test335#3045");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test335");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("...                    A");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test336#3053");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test336");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("                                                                                                HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                HI!"+ "'",str1.equals("                                                                                                HI!"));
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test337#3061");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test337");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                HI!                                                 "+ "'",str1.equals("A                                                HI!                                                 "));
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test338#3069");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test338");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("Hi!                                                                                             ","                                       AAAAAAAAA                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test339#3077");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test339");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("aaaaaaaaa i!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa i!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test340#3088");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test340");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("                                       AAAAAAAAA                 ","aaaaaaaaa                                        ","aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                       AAAAAAAAA                 "+ "'",str3.equals("                                       AAAAAAAAA                 "));
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test341#3096");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test341");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",(int)(short)1,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test342#3104");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test342");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("... !ih...");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test343#3112");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test343");
    long long3=org.apache.commons.lang.math.NumberUtils.max(0L,(long)7,99L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 99L+ "'",long3 == 99L);
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test344#3120");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test344");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("Aa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test345() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test345#3128");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test345");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa"));
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test346#3136");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test346");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("!ih",26);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "           !ih            "+ "'",str2.equals("           !ih            "));
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test347#3144");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test347");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("","Hi!   #######################################################################################       A");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test348#3152");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test348");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("",' ',(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test349#3160");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test349");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("                                  ","                                           ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test350#3168");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test350");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test351#3176");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test351");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("a                                                hi!                                                 ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test352#3184");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test352");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                        AAAAAAAAAAAAAAAAAAAA                                                        ","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test353#3192");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test353");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("...                                    !i aaaaaaaaa                                            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                                    !i aaaaaaaaa                                            "+ "'",str1.equals("...                                    !i aaaaaaaaa                                            "));
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test354#3200");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test354");
    int int3=org.apache.commons.lang.StringUtils.indexOf("",'a',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test355#3208");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test355");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("","A...","4444444Hi!aaaaaaaa.. !ih..                                                                                                                                  ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test356#3216");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test356");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("                                                                                                 ",(double)(byte)1);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 1.0d+ "'",double2 == 1.0d);
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test357#3224");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test357");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA "+ "'",str1.equals("AAAAAAAAA "));
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test358#3232");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test358");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"," aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test359#3240");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test359");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test360#3248");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test360");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("                   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test361#3256");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test361");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                                                                     ","                                                                                                 a  a A                                                hi!                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test362#3264");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test362");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test363#3272");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test363");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("        aaaaaaaaaa         ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "        aaaaaaaaaa         "+ "'",str1.equals("        aaaaaaaaaa         "));
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test364#3280");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test364");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"aaaaaaaaai!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test365#3289");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test365");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)99,(double)10L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test366#3297");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test366");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("aa","###                     aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test367#3305");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test367");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("4");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 4+ "'",int1 == 4);
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test368#3313");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test368");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("!ih aA");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test369#3321");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test369");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)4,(double)99.0f);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test370#3329");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test370");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)90,94.0f,108.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 108.0f+ "'",float3 == 108.0f);
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test371#3337");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test371");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test372#3346");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test372");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test373#3354");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test373");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("","                                                                                                 a  a A                                                hi!                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 a  a A                                                hi!                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa"+ "'",str2.equals("                                                                                                 a  a A                                                hi!                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa"));
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test374#3362");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test374");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                                                                                       aaaaaaaaa ","        aaaaaaaaaa                  ","                                                                                     ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test375#3370");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test375");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test376#3378");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test376");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test377#3386");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test377");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","hi!A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test378#3394");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test378");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("              ",2);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "              "+ "'",str2.equals("              "));
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test379#3402");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test379");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test380#3413");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test380");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test381#3421");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test381");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("###                                                                                       aaaaaaaaa         ",97,"                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "###                                                                                       aaaaaaaaa         "+ "'",str3.equals("###                                                                                       aaaaaaaaa         "));
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test382#3429");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test382");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                        ","...aaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test383#3437");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test383");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaa","!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA",41);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test384#3445");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test384");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"+ "'",str1.equals("aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"));
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test385#3453");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test385");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                   ");
    int int4=org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                ",strArray3);
    java.lang.String str5=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    int int6=org.apache.commons.lang.StringUtils.indexOfAny("                                                                                        ",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ (-1)+ "'",int4 == (-1));
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ ""+ "'",str5.equals(""));
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test386#3467");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test386");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("Aaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa","...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test387#3475");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test387");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","aaaaaaaaa                                    ");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -12");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test388#3486");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test388");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("... !ih...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih..."+ "'",str1.equals("... !ih..."));
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test389#3494");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test389");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("##A##A#!ih",(double)93);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 93.0d+ "'",double2 == 93.0d);
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test390#3502");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test390");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("           hi!            ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test391#3510");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test391");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("##A##A#!ih");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test392#3518");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test392");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)10,(short)10);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test393#3526");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test393");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("Hi!                                   A",' ');
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray2,"4444444444444444444444444444444444                                4444444444444444444444444444444444");
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,' ',43,21);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test394#3538");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test394");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("Aa","A!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa"+ "'",str2.equals("Aa"));
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test395#3546");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test395");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("hi!A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!A\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test396#3557");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test396");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A","                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test397#3565");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test397");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test398#3573");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test398");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","                                                                                                HI!","!i aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str3.equals(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test399#3581");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test399");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("                                          aaaaaaaaa ","444444444444444444444444444                                              hi!          ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                          aaaaaaaaa "+ "'",str2.equals("                                          aaaaaaaaa "));
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test400#3589");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test400");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("Hi!                                   A",(int)'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!                                   A"+ "'",str2.equals("Hi!                                   A"));
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test401#3597");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test401");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                         HI!","##########################################!i aaaaaaaaa###########################################",87);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test402#3605");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test402");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test403#3616");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test403");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("                        AAAAAAAAAAAAAAAAAAAA                                                        i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        i!"+ "'",str1.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        i!"));
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test404#3624");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test404");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("... !ih...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test405#3632");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test405");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaAaaaaaaaa aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaAaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaAaaaaaaaaaaaaaaaa"));
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test406#3640");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test406");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                                                                                                 ","    a     ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test407#3648");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test407");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("Hi!   #######################################################################################       A",7);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!   #######################################################################################       A"+ "'",str2.equals("Hi!   #######################################################################################       A"));
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test408#3656");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test408");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("#######################################################################################             ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######################################################################################\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test409#3667");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test409");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test410#3675");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test410");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove(" aaaaaaaaa","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " aaaaaaaaa"+ "'",str2.equals(" aaaaaaaaa"));
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test411#3683");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test411");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("Aaaaaaaaa ","                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa "+ "'",str2.equals("Aaaaaaaaa "));
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test412#3691");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test412");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("HHHHHHHHHH","                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "HHHHHHHHHH"+ "'",str2.equals("HHHHHHHHHH"));
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test413#3699");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test413");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test414#3707");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test414");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("###                     Aaaaaaaaa                                                                                        ",(-1),'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "###                     Aaaaaaaaa                                                                                        "+ "'",str3.equals("###                     Aaaaaaaaa                                                                                        "));
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test415#3715");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test415");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,"                 ");
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5);
    java.lang.String[] strArray9=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
    org.junit.Assert.assertNotNull(strArray9);
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test416#3733");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test416");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("4444444444444444444444444444444444...","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444444444444444444444444444444..."+ "'",str2.equals("4444444444444444444444444444444444..."));
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test417#3741");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test417");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                          aaaaaaaaa i!",29,(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " "+ "'",str3.equals(" "));
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test418#3749");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test418");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                                  ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test419#3760");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test419");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("   A ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   A "+ "'",str1.equals("   A "));
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test420#3768");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test420");
    char[] charArray11=new char[]{' ',' '};
    int int12=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray11);
    int int13=org.apache.commons.lang.StringUtils.indexOfAny("hi!                                   A",charArray11);
    int int14=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray11);
    int int15=org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaa ",charArray11);
    int int16=org.apache.commons.lang.StringUtils.indexOfAny("a                                                HI!",charArray11);
    boolean boolean17=org.apache.commons.lang.StringUtils.containsNone("#######################################################################################",charArray11);
    int int18=org.apache.commons.lang.StringUtils.indexOfAnyBut("#############################################################################",charArray11);
    int int19=org.apache.commons.lang.StringUtils.indexOfAny("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",charArray11);
    int int20=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                4                                                ",charArray11);
    org.junit.Assert.assertNotNull(charArray11);
    org.junit.Assert.assertTrue("'" + int12 + "' != '"+ 0+ "'",int12 == 0);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ 3+ "'",int13 == 3);
    org.junit.Assert.assertTrue("'" + int14 + "' != '"+ (-1)+ "'",int14 == (-1));
    org.junit.Assert.assertTrue("'" + int15 + "' != '"+ 9+ "'",int15 == 9);
    org.junit.Assert.assertTrue("'" + int16 + "' != '"+ 1+ "'",int16 == 1);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ true+ "'",boolean17 == true);
    org.junit.Assert.assertTrue("'" + int18 + "' != '"+ 0+ "'",int18 == 0);
    org.junit.Assert.assertTrue("'" + int19 + "' != '"+ 9+ "'",int19 == 9);
    org.junit.Assert.assertTrue("'" + int20 + "' != '"+ 48+ "'",int20 == 48);
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test421#3794");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test421");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str1.equals("4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test422#3802");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test422");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test423#3810");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test423");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)155,(long)95,(long)(byte)100);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 155L+ "'",long3 == 155L);
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test424#3818");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test424");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("Hi!                                   A","###                     Aaaaaaaaa                                                                                        ","aaaaaaaaa i!",20);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Hi!                                   A"+ "'",str4.equals("Hi!                                   A"));
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test425#3826");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test425");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)'a',(double)48,(double)20.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 20.0d+ "'",double3 == 20.0d);
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test426#3834");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test426");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaaaaaaaaaaaaa","4444444444444444444444444444444444...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test427#3842");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test427");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("#######################################################################################","                                              hi!","aaaaaaaaa i!            ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#######################################################################################"+ "'",str3.equals("#######################################################################################"));
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test428#3850");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test428");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                         I!                         ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test429#3858");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test429");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAA","                             aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA"+ "'",str2.equals("AAAAAAAAAAAAAAAAAAAA"));
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test430#3866");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test430");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("#############################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test431#3874");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test431");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test432#3882");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test432");
    float[] floatArray1=new float[]{(byte)1};
    float float2=org.apache.commons.lang.math.NumberUtils.max(floatArray1);
    float[] floatArray6=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float7=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(floatArray1,floatArray6);
    float[] floatArray10=new float[]{(byte)1};
    float float11=org.apache.commons.lang.math.NumberUtils.max(floatArray10);
    float[] floatArray15=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float16=org.apache.commons.lang.math.NumberUtils.max(floatArray15);
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(floatArray10,floatArray15);
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(floatArray1,floatArray15);
    float[] floatArray20=new float[]{(byte)1};
    float float21=org.apache.commons.lang.math.NumberUtils.max(floatArray20);
    float[] floatArray25=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float26=org.apache.commons.lang.math.NumberUtils.max(floatArray25);
    boolean boolean27=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray25);
    float[] floatArray29=new float[]{(byte)1};
    float float30=org.apache.commons.lang.math.NumberUtils.max(floatArray29);
    float[] floatArray34=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float35=org.apache.commons.lang.math.NumberUtils.max(floatArray34);
    boolean boolean36=org.apache.commons.lang.math.NumberUtils.equals(floatArray29,floatArray34);
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray34);
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(floatArray1,floatArray34);
    float float39=org.apache.commons.lang.math.NumberUtils.max(floatArray1);
    float[] floatArray44=new float[]{10,(byte)1,1L,(byte)-1};
    float float45=org.apache.commons.lang.math.NumberUtils.max(floatArray44);
    float float46=org.apache.commons.lang.math.NumberUtils.max(floatArray44);
    boolean boolean47=org.apache.commons.lang.math.NumberUtils.equals(floatArray1,floatArray44);
    float[] floatArray51=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float52=org.apache.commons.lang.math.NumberUtils.max(floatArray51);
    float[] floatArray54=new float[]{(byte)1};
    float float55=org.apache.commons.lang.math.NumberUtils.max(floatArray54);
    boolean boolean56=org.apache.commons.lang.math.NumberUtils.equals(floatArray51,floatArray54);
    float float57=org.apache.commons.lang.math.NumberUtils.max(floatArray54);
    boolean boolean58=org.apache.commons.lang.math.NumberUtils.equals(floatArray1,floatArray54);
    org.junit.Assert.assertNotNull(floatArray1);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 1.0f+ "'",float2 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ 100.0f+ "'",float7 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertNotNull(floatArray10);
    org.junit.Assert.assertTrue("'" + float11 + "' != '"+ 1.0f+ "'",float11 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray15);
    org.junit.Assert.assertTrue("'" + float16 + "' != '"+ 100.0f+ "'",float16 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertNotNull(floatArray20);
    org.junit.Assert.assertTrue("'" + float21 + "' != '"+ 1.0f+ "'",float21 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray25);
    org.junit.Assert.assertTrue("'" + float26 + "' != '"+ 100.0f+ "'",float26 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '"+ false+ "'",boolean27 == false);
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertTrue("'" + float30 + "' != '"+ 1.0f+ "'",float30 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertTrue("'" + float35 + "' != '"+ 100.0f+ "'",float35 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '"+ false+ "'",boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertTrue("'" + float39 + "' != '"+ 1.0f+ "'",float39 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray44);
    org.junit.Assert.assertTrue("'" + float45 + "' != '"+ 10.0f+ "'",float45 == 10.0f);
    org.junit.Assert.assertTrue("'" + float46 + "' != '"+ 10.0f+ "'",float46 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '"+ false+ "'",boolean47 == false);
    org.junit.Assert.assertNotNull(floatArray51);
    org.junit.Assert.assertTrue("'" + float52 + "' != '"+ 100.0f+ "'",float52 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray54);
    org.junit.Assert.assertTrue("'" + float55 + "' != '"+ 1.0f+ "'",float55 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '"+ false+ "'",boolean56 == false);
    org.junit.Assert.assertTrue("'" + float57 + "' != '"+ 1.0f+ "'",float57 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '"+ true+ "'",boolean58 == true);
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test433#3958");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test433");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                        AAAAAAAAAAAAAAAAAAAA                                                        i!","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test434#3966");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test434");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast(" aaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " aaaaaa"+ "'",str1.equals(" aaaaaa"));
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test435#3974");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test435");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    double[] doubleArray11=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray12=new double[]{};
    boolean boolean13=org.apache.commons.lang.math.NumberUtils.equals(doubleArray11,doubleArray12);
    double[] doubleArray14=null;
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray12,doubleArray14);
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray14);
    try {
      double double17=org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test436#4002");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test436");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ","   #######################################################################################",34);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test437#4010");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test437");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test438#4018");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test438");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("aaaa");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test439#4026");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test439");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa","                 ","#############################################################################          ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test440#4034");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test440");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("#############################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test441#4042");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test441");
    float float3=org.apache.commons.lang.math.NumberUtils.max(31.0f,(float)96L,(float)134);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 134.0f+ "'",float3 == 134.0f);
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test442#4050");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test442");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int int19=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    int int20=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    int int21=org.apache.commons.lang.math.NumberUtils.min(intArray17);
    java.lang.Class<?> wildcardClass22=intArray17.getClass();
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + int19 + "' != '"+ 100+ "'",int19 == 100);
    org.junit.Assert.assertTrue("'" + int20 + "' != '"+ 100+ "'",int20 == 100);
    org.junit.Assert.assertTrue("'" + int21 + "' != '"+ 1+ "'",int21 == 1);
    org.junit.Assert.assertNotNull(wildcardClass22);
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test443#4074");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test443");
    int int3=org.apache.commons.lang.math.NumberUtils.min(104,65,95);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 65+ "'",int3 == 65);
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test444#4082");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test444");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("Hi!###################################A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test445#4093");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test445");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("Hi!###################################A",155,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444444444444444444444444444444444444444444444444444444Hi!###################################A4444444444444444444444444444444444444444444444444444444444"+ "'",str3.equals("4444444444444444444444444444444444444444444444444444444444Hi!###################################A4444444444444444444444444444444444444444444444444444444444"));
  }
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test446#4101");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test446");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("                                   ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test447#4109");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test447");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("......");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test448#4120");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test448");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " AAAAAAAAA"+ "'",str1.equals(" AAAAAAAAA"));
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test449#4128");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test449");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                              !ih                                               ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                               hi!                                              "+ "'",str1.equals("                                               hi!                                              "));
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test450#4136");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test450");
    int int2=org.apache.commons.lang.StringUtils.countMatches("444444444444444444444444444                                              hi!          ...","4444444Hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test451#4144");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test451");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA",7,"    !I       A         A         A         A         A         A         A         A         A         A");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"+ "'",str3.equals("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"));
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test452#4152");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test452");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh","... !ih...... !ih....##A##A#!ih");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test453#4160");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test453");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)(byte)1,0.0d);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test454#4168");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test454");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444..."+ "'",str2.equals("4444444..."));
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test455#4176");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test455");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("Aa hi!","AAAAAAAAAAAAAAAAAAAA");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test456#4184");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test456");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh","   ","AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test457#4192");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test457");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("4");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test458#4200");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test458");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("##########################################!i aaaaaaaaa###########################################","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test459#4208");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test459");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("   aaaaaaaaa                                        ",26,"##########################################                         i!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   aaaaaaaaa                                        "+ "'",str3.equals("   aaaaaaaaa                                        "));
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test460#4216");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test460");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)-1,(byte)100,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test461#4224");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test461");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("!iH");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!iH\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test462#4235");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test462");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("                                                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                "+ "'",str1.equals("                                                                                "));
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test463#4243");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test463");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test464#4251");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test464");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("#aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#aaaaaaaaa"+ "'",str1.equals("#aaaaaaaaa"));
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test465#4259");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test465");
    byte[] byteArray0=null;
    byte[] byteArray1=null;
    byte[] byteArray5=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray8=new byte[]{(byte)-1,(byte)-1};
    boolean boolean9=org.apache.commons.lang.math.NumberUtils.equals(byteArray5,byteArray8);
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(byteArray1,byteArray8);
    byte[] byteArray14=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray17=new byte[]{(byte)-1,(byte)-1};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(byteArray14,byteArray17);
    byte byte19=org.apache.commons.lang.math.NumberUtils.min(byteArray17);
    boolean boolean20=org.apache.commons.lang.math.NumberUtils.equals(byteArray8,byteArray17);
    byte[] byteArray21=null;
    byte[] byteArray25=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray28=new byte[]{(byte)-1,(byte)-1};
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(byteArray25,byteArray28);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(byteArray21,byteArray28);
    byte[] byteArray34=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray37=new byte[]{(byte)-1,(byte)-1};
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(byteArray34,byteArray37);
    byte byte39=org.apache.commons.lang.math.NumberUtils.min(byteArray37);
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(byteArray28,byteArray37);
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(byteArray8,byteArray28);
    byte byte42=org.apache.commons.lang.math.NumberUtils.max(byteArray8);
    byte[] byteArray46=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray49=new byte[]{(byte)-1,(byte)-1};
    boolean boolean50=org.apache.commons.lang.math.NumberUtils.equals(byteArray46,byteArray49);
    byte byte51=org.apache.commons.lang.math.NumberUtils.min(byteArray49);
    byte[] byteArray55=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray58=new byte[]{(byte)-1,(byte)-1};
    boolean boolean59=org.apache.commons.lang.math.NumberUtils.equals(byteArray55,byteArray58);
    byte byte60=org.apache.commons.lang.math.NumberUtils.min(byteArray58);
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(byteArray49,byteArray58);
    byte[] byteArray62=null;
    boolean boolean63=org.apache.commons.lang.math.NumberUtils.equals(byteArray58,byteArray62);
    byte byte64=org.apache.commons.lang.math.NumberUtils.min(byteArray58);
    byte byte65=org.apache.commons.lang.math.NumberUtils.max(byteArray58);
    boolean boolean66=org.apache.commons.lang.math.NumberUtils.equals(byteArray8,byteArray58);
    boolean boolean67=org.apache.commons.lang.math.NumberUtils.equals(byteArray0,byteArray58);
    org.junit.Assert.assertNotNull(byteArray5);
    org.junit.Assert.assertNotNull(byteArray8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(byteArray14);
    org.junit.Assert.assertNotNull(byteArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + byte19 + "' != '"+ (byte)-1+ "'",byte19 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '"+ true+ "'",boolean20 == true);
    org.junit.Assert.assertNotNull(byteArray25);
    org.junit.Assert.assertNotNull(byteArray28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ false+ "'",boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertNotNull(byteArray34);
    org.junit.Assert.assertNotNull(byteArray37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertTrue("'" + byte39 + "' != '"+ (byte)-1+ "'",byte39 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ true+ "'",boolean40 == true);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ true+ "'",boolean41 == true);
    org.junit.Assert.assertTrue("'" + byte42 + "' != '"+ (byte)-1+ "'",byte42 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray46);
    org.junit.Assert.assertNotNull(byteArray49);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '"+ false+ "'",boolean50 == false);
    org.junit.Assert.assertTrue("'" + byte51 + "' != '"+ (byte)-1+ "'",byte51 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray55);
    org.junit.Assert.assertNotNull(byteArray58);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '"+ false+ "'",boolean59 == false);
    org.junit.Assert.assertTrue("'" + byte60 + "' != '"+ (byte)-1+ "'",byte60 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ true+ "'",boolean61 == true);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '"+ false+ "'",boolean63 == false);
    org.junit.Assert.assertTrue("'" + byte64 + "' != '"+ (byte)-1+ "'",byte64 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte65 + "' != '"+ (byte)-1+ "'",byte65 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '"+ true+ "'",boolean66 == true);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '"+ false+ "'",boolean67 == false);
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test466#4337");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test466");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                                                   aaaaaaaaa ",' ');
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa"+ "'",str3.equals("aaaaaaaaa"));
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test467#4347");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test467");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","Aaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 9+ "'",int2 == 9);
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test468#4355");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test468");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test469#4363");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test469");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)(short)10,0,(int)(byte)100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test470#4371");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test470");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ","A         A         A         A         A         A         A         A         A         A       i!    ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test471#4379");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test471");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("4444444444444444444444444444444444                            ...");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test472#4387");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test472");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("###                     aaaaaaaaa                                                                                        ","                                                                                               ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                     aaaaaaaaa                                                                                        "+ "'",str2.equals("###                     aaaaaaaaa                                                                                        "));
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test473#4395");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test473");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("... !ih...... !ih....##A##A#!ih","44444444444444444444444         ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test474#4403");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test474");
    short[] shortArray2=new short[]{(byte)10,(byte)-1};
    short short3=org.apache.commons.lang.math.NumberUtils.max(shortArray2);
    short[] shortArray6=new short[]{(byte)1,(byte)1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(shortArray2,shortArray6);
    short[] shortArray10=new short[]{(byte)10,(byte)-1};
    short short11=org.apache.commons.lang.math.NumberUtils.max(shortArray10);
    short[] shortArray14=new short[]{(byte)1,(byte)1};
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(shortArray10,shortArray14);
    short short16=org.apache.commons.lang.math.NumberUtils.min(shortArray10);
    short short17=org.apache.commons.lang.math.NumberUtils.max(shortArray10);
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(shortArray2,shortArray10);
    short[] shortArray21=new short[]{(byte)10,(byte)-1};
    short short22=org.apache.commons.lang.math.NumberUtils.max(shortArray21);
    short[] shortArray25=new short[]{(byte)1,(byte)1};
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(shortArray21,shortArray25);
    short[] shortArray29=new short[]{(byte)10,(byte)-1};
    short short30=org.apache.commons.lang.math.NumberUtils.max(shortArray29);
    short[] shortArray33=new short[]{(byte)1,(byte)1};
    boolean boolean34=org.apache.commons.lang.math.NumberUtils.equals(shortArray29,shortArray33);
    short short35=org.apache.commons.lang.math.NumberUtils.min(shortArray29);
    short[] shortArray38=new short[]{(byte)10,(byte)-1};
    short short39=org.apache.commons.lang.math.NumberUtils.max(shortArray38);
    short[] shortArray42=new short[]{(byte)1,(byte)1};
    boolean boolean43=org.apache.commons.lang.math.NumberUtils.equals(shortArray38,shortArray42);
    short short44=org.apache.commons.lang.math.NumberUtils.max(shortArray38);
    boolean boolean45=org.apache.commons.lang.math.NumberUtils.equals(shortArray29,shortArray38);
    boolean boolean46=org.apache.commons.lang.math.NumberUtils.equals(shortArray25,shortArray38);
    boolean boolean47=org.apache.commons.lang.math.NumberUtils.equals(shortArray10,shortArray25);
    short[] shortArray50=new short[]{(byte)10,(byte)-1};
    short short51=org.apache.commons.lang.math.NumberUtils.max(shortArray50);
    short[] shortArray54=new short[]{(byte)1,(byte)1};
    boolean boolean55=org.apache.commons.lang.math.NumberUtils.equals(shortArray50,shortArray54);
    short short56=org.apache.commons.lang.math.NumberUtils.min(shortArray50);
    short[] shortArray59=new short[]{(byte)10,(byte)-1};
    short short60=org.apache.commons.lang.math.NumberUtils.max(shortArray59);
    short[] shortArray63=new short[]{(byte)1,(byte)1};
    boolean boolean64=org.apache.commons.lang.math.NumberUtils.equals(shortArray59,shortArray63);
    short short65=org.apache.commons.lang.math.NumberUtils.max(shortArray59);
    boolean boolean66=org.apache.commons.lang.math.NumberUtils.equals(shortArray50,shortArray59);
    short[] shortArray69=new short[]{(byte)10,(byte)-1};
    short short70=org.apache.commons.lang.math.NumberUtils.max(shortArray69);
    short[] shortArray73=new short[]{(byte)1,(byte)1};
    boolean boolean74=org.apache.commons.lang.math.NumberUtils.equals(shortArray69,shortArray73);
    short short75=org.apache.commons.lang.math.NumberUtils.min(shortArray69);
    short short76=org.apache.commons.lang.math.NumberUtils.max(shortArray69);
    boolean boolean77=org.apache.commons.lang.math.NumberUtils.equals(shortArray50,shortArray69);
    short short78=org.apache.commons.lang.math.NumberUtils.max(shortArray50);
    boolean boolean79=org.apache.commons.lang.math.NumberUtils.equals(shortArray10,shortArray50);
    short[] shortArray82=new short[]{(byte)10,(byte)-1};
    short short83=org.apache.commons.lang.math.NumberUtils.max(shortArray82);
    short[] shortArray86=new short[]{(byte)1,(byte)1};
    boolean boolean87=org.apache.commons.lang.math.NumberUtils.equals(shortArray82,shortArray86);
    short short88=org.apache.commons.lang.math.NumberUtils.min(shortArray82);
    short[] shortArray91=new short[]{(byte)10,(byte)-1};
    short short92=org.apache.commons.lang.math.NumberUtils.max(shortArray91);
    short[] shortArray95=new short[]{(byte)1,(byte)1};
    boolean boolean96=org.apache.commons.lang.math.NumberUtils.equals(shortArray91,shortArray95);
    short short97=org.apache.commons.lang.math.NumberUtils.max(shortArray91);
    boolean boolean98=org.apache.commons.lang.math.NumberUtils.equals(shortArray82,shortArray91);
    boolean boolean99=org.apache.commons.lang.math.NumberUtils.equals(shortArray50,shortArray82);
    org.junit.Assert.assertNotNull(shortArray2);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
    org.junit.Assert.assertNotNull(shortArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertNotNull(shortArray10);
    org.junit.Assert.assertTrue("'" + short11 + "' != '"+ (short)10+ "'",short11 == (short)10);
    org.junit.Assert.assertNotNull(shortArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + short16 + "' != '"+ (short)-1+ "'",short16 == (short)-1);
    org.junit.Assert.assertTrue("'" + short17 + "' != '"+ (short)10+ "'",short17 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ true+ "'",boolean18 == true);
    org.junit.Assert.assertNotNull(shortArray21);
    org.junit.Assert.assertTrue("'" + short22 + "' != '"+ (short)10+ "'",short22 == (short)10);
    org.junit.Assert.assertNotNull(shortArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertNotNull(shortArray29);
    org.junit.Assert.assertTrue("'" + short30 + "' != '"+ (short)10+ "'",short30 == (short)10);
    org.junit.Assert.assertNotNull(shortArray33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '"+ false+ "'",boolean34 == false);
    org.junit.Assert.assertTrue("'" + short35 + "' != '"+ (short)-1+ "'",short35 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray38);
    org.junit.Assert.assertTrue("'" + short39 + "' != '"+ (short)10+ "'",short39 == (short)10);
    org.junit.Assert.assertNotNull(shortArray42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '"+ false+ "'",boolean43 == false);
    org.junit.Assert.assertTrue("'" + short44 + "' != '"+ (short)10+ "'",short44 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '"+ true+ "'",boolean45 == true);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '"+ false+ "'",boolean46 == false);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '"+ false+ "'",boolean47 == false);
    org.junit.Assert.assertNotNull(shortArray50);
    org.junit.Assert.assertTrue("'" + short51 + "' != '"+ (short)10+ "'",short51 == (short)10);
    org.junit.Assert.assertNotNull(shortArray54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '"+ false+ "'",boolean55 == false);
    org.junit.Assert.assertTrue("'" + short56 + "' != '"+ (short)-1+ "'",short56 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray59);
    org.junit.Assert.assertTrue("'" + short60 + "' != '"+ (short)10+ "'",short60 == (short)10);
    org.junit.Assert.assertNotNull(shortArray63);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '"+ false+ "'",boolean64 == false);
    org.junit.Assert.assertTrue("'" + short65 + "' != '"+ (short)10+ "'",short65 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '"+ true+ "'",boolean66 == true);
    org.junit.Assert.assertNotNull(shortArray69);
    org.junit.Assert.assertTrue("'" + short70 + "' != '"+ (short)10+ "'",short70 == (short)10);
    org.junit.Assert.assertNotNull(shortArray73);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '"+ false+ "'",boolean74 == false);
    org.junit.Assert.assertTrue("'" + short75 + "' != '"+ (short)-1+ "'",short75 == (short)-1);
    org.junit.Assert.assertTrue("'" + short76 + "' != '"+ (short)10+ "'",short76 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '"+ true+ "'",boolean77 == true);
    org.junit.Assert.assertTrue("'" + short78 + "' != '"+ (short)10+ "'",short78 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '"+ true+ "'",boolean79 == true);
    org.junit.Assert.assertNotNull(shortArray82);
    org.junit.Assert.assertTrue("'" + short83 + "' != '"+ (short)10+ "'",short83 == (short)10);
    org.junit.Assert.assertNotNull(shortArray86);
    org.junit.Assert.assertTrue("'" + boolean87 + "' != '"+ false+ "'",boolean87 == false);
    org.junit.Assert.assertTrue("'" + short88 + "' != '"+ (short)-1+ "'",short88 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray91);
    org.junit.Assert.assertTrue("'" + short92 + "' != '"+ (short)10+ "'",short92 == (short)10);
    org.junit.Assert.assertNotNull(shortArray95);
    org.junit.Assert.assertTrue("'" + boolean96 + "' != '"+ false+ "'",boolean96 == false);
    org.junit.Assert.assertTrue("'" + short97 + "' != '"+ (short)10+ "'",short97 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean98 + "' != '"+ true+ "'",boolean98 == true);
    org.junit.Assert.assertTrue("'" + boolean99 + "' != '"+ true+ "'",boolean99 == true);
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test475#4529");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test475");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test476#4538");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test476");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("4444444Hi!aaaaaaaa.. !ih..                                                                                                                                  ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test477#4546");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test477");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("Hi!   #######################################################################################             ######       A",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!   #######################################################################################             ######       A"+ "'",str2.equals("Hi!   #######################################################################################             ######       A"));
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test478#4554");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test478");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("HHHHHHHHHH",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test479#4562");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test479");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)100,(short)0,(short)10);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test480#4570");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test480");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)10,(byte)-1,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test481#4578");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test481");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("##########################################!i aaaaaaaaa###########################################","aaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "##########################################!i aaaaaaaaa###########################################"+ "'",str2.equals("##########################################!i aaaaaaaaa###########################################"));
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test482#4586");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test482");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a"+ "'",str1.equals("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a"));
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test483#4594");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test483");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("",(float)2);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 2.0f+ "'",float2 == 2.0f);
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test484#4602");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test484");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("4444444444444444444444444444444444...","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test485#4610");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test485");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("","Hi!                                                                                             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!                                                                                             "+ "'",str2.equals("Hi!                                                                                             "));
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test486#4618");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test486");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("                                            !i aaaaaaaaa                                            ",(double)29);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 29.0d+ "'",double2 == 29.0d);
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test487#4626");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test487");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("                                                4                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                4                                                "+ "'",str1.equals("                                                4                                                "));
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test488#4634");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test488");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test489#4642");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test489");
    short[] shortArray5=new short[]{(byte)1,(short)1,(short)10,(byte)100,(short)-1};
    short short6=org.apache.commons.lang.math.NumberUtils.max(shortArray5);
    short short7=org.apache.commons.lang.math.NumberUtils.max(shortArray5);
    org.junit.Assert.assertNotNull(shortArray5);
    org.junit.Assert.assertTrue("'" + short6 + "' != '"+ (short)100+ "'",short6 == (short)100);
    org.junit.Assert.assertTrue("'" + short7 + "' != '"+ (short)100+ "'",short7 == (short)100);
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test490#4654");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test490");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                                                                                 ##a","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test491#4662");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test491");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("aAAAAAAAA                                       HI!",(int)(short)10,"!iH");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aAAAAAAAA                                       HI!"+ "'",str3.equals("aAAAAAAAA                                       HI!"));
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test492#4670");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test492");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("...                                    !i aaaaaaaaa                                            ",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                                    !i aaaaaaaaa                                            "+ "'",str2.equals("...                                    !i aaaaaaaaa                                            "));
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test493#4678");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test493");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test494#4686");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test494");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                         I!                         ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test495#4697");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test495");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)1,(byte)-1,(byte)10);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test496#4705");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test496");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("4444444444444444444444444444444444                            ...","   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test497#4713");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test497");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("...                    A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                    A"+ "'",str1.equals("...                    A"));
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test498#4721");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test498");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'4',(int)' ',9);
    java.lang.String str9=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
    org.junit.Assert.assertTrue("'" + str9 + "' != '"+ ""+ "'",str9.equals(""));
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test499#4735");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test499");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("#################################### aaaaaa","                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest6::test500#4743");
    if (debug)     System.out.format("%n%s%n","RegressionTest6.test500");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("        aa");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
}
